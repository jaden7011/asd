package com.example.coin_kotlin.activity

import android.os.Bundle
import android.os.Process
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.GravityCompat
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.coin_kotlin.R
import com.example.coin_kotlin.adapter.Coin_Adapter
import com.example.coin_kotlin.data.Ticker
import com.example.coin_kotlin.databinding.ActivityMainBinding
import com.example.coin_kotlin.model.PreferenceManager
import com.example.coin_kotlin.utility.Named.FAVORIT_LIST
import com.example.coin_kotlin.utility.Named.SETTING_FAVORIT
import com.example.coin_kotlin.utility.RxAndroidUtils
import com.example.coin_kotlin.utility.Utility
import com.example.coin_kotlin.viewmodel.MutableLiveData_TickerMap
import com.google.android.material.navigation.NavigationView
import com.google.firebase.auth.FirebaseAuth
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.functions.Consumer
import io.reactivex.rxjava3.schedulers.Schedulers
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity(),NavigationView.OnNavigationItemSelectedListener {

    val auth = FirebaseAuth.getInstance()
    private var backKeyPressedTime: Long = 0
    private lateinit var binding : ActivityMainBinding
    private lateinit var ET_Observable_Disposable: Disposable
    private lateinit var liveData_tickerMap:MutableLiveData_TickerMap
    private lateinit var adapter: Coin_Adapter
    private var thread_all:NetworkThread? = null
    private var thread_search:NetworkThread? = null

    override fun onRestart() { //다시 돌아왔을 경우 마지막에 사용하던 Thread를 다시 시작
        super.onRestart()
        Log.e("onRestart", "onRestart : " + binding.searchET.text.toString())
        Set_threads(binding.searchET.text.toString(),PreferenceManager.getBoolean(this, SETTING_FAVORIT))
    }

    override fun onPause() { //화면 밖으로 나갈 경우 모든 Thread 종료
        super.onPause()
        Log.e("onStop", "onStop")
        Interrupt_threads()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("onDestroy", "onDestroy")
        thread_search = null
        thread_all = null
        ET_Observable_Disposable.dispose() //single이고, VM에 있어서 굳이 필요한가 싶기도 함
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        liveData_tickerMap =
            ViewModelProvider(this, MutableLiveData_TickerMap.Factory(this))[MutableLiveData_TickerMap::class.java] //VM의 LiveData를 set하면서 Adapter를 Notify할 것입니다.
        setView()

        liveData_tickerMap.coins.observe(this, Observer {
            adapter.setData(Sort(it))
        })

        ET_Observable_Disposable = //RxAndroidUtil에서 검색창의 정보가 바뀔 때마다 자동으로 api를 가져올 것입니다.
            RxAndroidUtils.getEditTextObservable(binding.searchET)
                .debounce(700, TimeUnit.MILLISECONDS)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(Consumer {
                    Set_threads(it,PreferenceManager.getBoolean(this, SETTING_FAVORIT))
                })
    }

    private fun setView(){

        if(PreferenceManager.getBoolean(this, SETTING_FAVORIT)){
            binding.favoritBtn.background = ContextCompat.getDrawable(this,android.R.drawable.star_big_on)
        }else{
            binding.favoritBtn.background = ContextCompat.getDrawable(this,android.R.drawable.star_big_off)
        }

        binding.favoritBtn.setOnClickListener {
            if(PreferenceManager.getBoolean(this, SETTING_FAVORIT)){ //관심목록만 보기 설정이 되어있다면 -> 클릭시 -> 관심목록보기 제거
                PreferenceManager.setBoolean(this, SETTING_FAVORIT, false)
                binding.favoritBtn.background = ContextCompat.getDrawable(this,android.R.drawable.star_big_off)
                Set_threads(binding.searchET.text.toString(),false)
            }else{
                PreferenceManager.setBoolean(this, SETTING_FAVORIT, true)
                binding.favoritBtn.background = ContextCompat.getDrawable(this,android.R.drawable.star_big_on)
                Set_threads(binding.searchET.text.toString(),true)
            }
        }

        binding.drawerLayout.addDrawerListener(object : DrawerLayout.DrawerListener{
            override fun onDrawerSlide(drawerView: View, slideOffset: Float) {}
            override fun onDrawerOpened(drawerView: View) {
                if(auth.currentUser != null){ //로그인 상태라면 navi-drawer의 header에 이름과 email을 적자
                    val headerview = binding.navigationView.getHeaderView(0)
                    (headerview.findViewById<TextView>(R.id.name_T)).text = auth.currentUser?.displayName
                    (headerview.findViewById<TextView>(R.id.mail_T)).text = auth.currentUser?.email
                }else{
                    val headerview = binding.navigationView.getHeaderView(0)
                    (headerview.findViewById<TextView>(R.id.name_T)).text = "로그인이 필요합니다."
                    (headerview.findViewById<TextView>(R.id.mail_T)).text = "로그인이 필요합니다."
                }
            }
            override fun onDrawerClosed(drawerView: View) {}
            override fun onDrawerStateChanged(newState: Int) {}
        })

        binding.navigationView.setNavigationItemSelectedListener(this)

        binding.naviFbtn.setOnClickListener {
            binding.drawerLayout.openDrawer(GravityCompat.END)
        }

        adapter = Coin_Adapter(this,ArrayList())

        val utility = Utility(this, binding.CoinRecyclerView, adapter) //리사이클러뷰 적용하는 것
        utility.RecyclerInit("VERTICAL")
    }

    inner class NetworkThread( //Thread에 sleep을 주어서 딜레이를 주고 그 외엔 계속 돌립니다.
            private val search_ET: String,
            private val favoritSet:HashSet<String>?
    ):Thread() {

        var isRunning = true

        override fun run() {
            while (isRunning) {
                try {
                    Log.d("NetworkThread", "running")
                    liveData_tickerMap.Get_API(search_ET,favoritSet)
                    sleep(2000)
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
            }
        }

    }

    private fun Sort(arr: ArrayList<Ticker>):ArrayList<Ticker>{ // 가져온 data를 거래금액 순으로 정렬해줍니다.
        val list:ArrayList<Ticker> = ArrayList(arr)
        list.sortByDescending { it.acc_trade_value_24H.toDouble() }
        return list
    }

    fun Interrupt_threads(){ //Thread 중단

        thread_all = thread_all?.run{
            this.isRunning = false
            if(!this.isInterrupted)
                this.interrupt()

            null
        }

        thread_search = thread_search?.run{
            this.isRunning = false
            if(!this.isInterrupted)
                this.interrupt()

            null
        }
        Log.d("search", "thread_all thread is null? : " + thread_all?.run { "false" })
        Log.d("search", "thread_search thread is null? : " + thread_search?.run { "false" })
    }

    private fun Set_threads(search: String, isFavorit:Boolean) { //Thread 시작

        if(isFavorit){ //관심목록만 보길 원할 때
            runThread(search,PreferenceManager.getStringSet(this, FAVORIT_LIST) as HashSet<String>)
        }else{ //관심목록이 아닌 전체목록을 볼 때
            runThread(search,null)
        }
    }

    fun runThread(search: String,favoritSet: HashSet<String>?){
        if (search.length >= 2) {
            Log.d("search", "search something")
            Interrupt_threads()

            liveData_tickerMap.disposable?.run {
                this.dispose()
            }

            if (thread_all == null) {
                thread_search = NetworkThread(search,favoritSet).apply {
                    Log.d("search", "thread_search thread is starting: $search")
                    this.start()
                }
            }

        } else if (search.isEmpty()) {
            Log.d("search", "no search")
            Interrupt_threads()

            liveData_tickerMap.disposable?.run {
                this.dispose()
            }

            if (thread_search == null) {
                thread_all = NetworkThread(search,favoritSet).apply {
                    Log.d("search", "thread_all thread is starting")
                    this.start()
                }
            }
        } else {
            Toast.makeText(this, "\"2글자 이상 입력해주세요.\"", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            //todo drawer menu 만들자
            R.id.item_logout -> {
                Toast("cliked logout")
                if(auth.currentUser != null)
                    auth.signOut()
                else{
                    Toast("로그인이 되어있지 않습니다.")
                }
            }
        }
        binding.drawerLayout.closeDrawer(GravityCompat.END)
        return true
    }

    override fun onBackPressed() {
        if(binding.drawerLayout.isDrawerOpen(GravityCompat.END)){
            binding.drawerLayout.closeDrawer(GravityCompat.END)
            return
        }

        // 마지막으로 뒤로가기 버튼을 눌렀던 시간 저장
        if (System.currentTimeMillis() > backKeyPressedTime + 1500) {
            backKeyPressedTime = System.currentTimeMillis()
            Toast("\'뒤로\' 버튼을 한번 더 누르시면 종료됩니다.")
            return
        }
        if (System.currentTimeMillis() <= backKeyPressedTime + 1500) {
            //아래 3줄은 프로세스 종료
            moveTaskToBack(true)
            Process.killProcess(Process.myPid())
            System.exit(1)
        }
    }

    fun Toast(str: String) {
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }

}