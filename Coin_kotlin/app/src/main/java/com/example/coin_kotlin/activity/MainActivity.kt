package com.example.coin_kotlin.activity

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.coin_kotlin.R
import com.example.coin_kotlin.adapter.Coin_Adapter
import com.example.coin_kotlin.data.Ticker
import com.example.coin_kotlin.databinding.ActivityMainBinding
import com.example.coin_kotlin.utility.NetworkStatus
import com.example.coin_kotlin.viewmodel.MutableLiveData_TickerMap
import com.example.coin_kotlin.utility.RxAndroidUtils
import com.example.coin_kotlin.utility.Utility
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.functions.Consumer
import io.reactivex.rxjava3.schedulers.Schedulers
import java.util.concurrent.TimeUnit
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    private var backKeyPressedTime: Long = 0
    private lateinit var binding : ActivityMainBinding
    private lateinit var ET_Observable_Disposable: Disposable
    private lateinit var liveData_tickerMap:MutableLiveData_TickerMap
    private lateinit var adapter: Coin_Adapter
    private var thread_all:NetworkThread? = null
    private var thread_search:NetworkThread? = null

    override fun onRestart() { //다시 돌아왔을 경우 마지막에 사용하던 Thread를 다시 시작
        super.onRestart()
        Log.e("onRestart","onRestart : "+ binding.searchET.text.toString())
        Set_threads(binding.searchET.text.toString())
    }

    override fun onPause() { //화면 밖으로 나갈 경우 모든 Thread 종료
        super.onPause()
        Log.e("onStop","onStop")
        Interrupt_threads()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("onDestroy","onDestroy")
        thread_search = null
        thread_all = null
        ET_Observable_Disposable.dispose() //single이고, VM에 있어서 굳이 필요한가 싶기도 함
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        adapter = Coin_Adapter(this,ArrayList<Ticker>())

        val utility = Utility(this,binding.CoinRecyclerView,adapter) //리사이클러뷰 적용하는 것
        utility.RecyclerInit("VERTICAL")

        liveData_tickerMap = ViewModelProvider(this,MutableLiveData_TickerMap.Factory(this)).get(MutableLiveData_TickerMap::class.java) //VM의 LiveData를 set하면서 Adapter를 Notify할 것입니다.
        liveData_tickerMap.coins.observe(this, Observer {
            adapter.CoinDiffUtil(Sort(it))
        })

        ET_Observable_Disposable = //RxAndroidUtil에서 검색창의 정보가 바뀔 때마다 자동으로 api를 가져올 것입니다.
            RxAndroidUtils.getEditTextObservable(binding.searchET)
                .debounce(700,TimeUnit.MILLISECONDS)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(Consumer {
                    Set_threads(it)
                })
    }

    inner class NetworkThread( //Thread에 sleep을 주어서 딜레이를 주고 그 외엔 계속 돌립니다.
        private val search_ET: String
    ):Thread() {

        var isRunning = true

        override fun run() {
            while (isRunning) {
                try {
                    Log.d("NetworkThread", "running")
                    liveData_tickerMap.Get_API(search_ET)
                    sleep(2000)
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
            }
        }

    }

    private fun Sort(arr: ArrayList<Ticker>):ArrayList<Ticker>{ // 가져온 data를 거래금액 순으로 정렬해줍니다.

        val list:ArrayList<Ticker> = ArrayList(arr)
        list.sortByDescending { it.acc_trade_value_24H!!.toDouble() }

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
        Log.d("search","thread_all thread is null? : " + thread_all?.run { "false" })
        Log.d("search","thread_search thread is null? : " + thread_search?.run { "false" })
    }

    private fun Set_threads(Search:String) { //Thread 시작

            if (Search.length >= 2) {
                Log.d("search", "search something")
                Interrupt_threads()

                liveData_tickerMap.disposable?.run {
                    this.dispose()
                }

                if (thread_all == null) {
                    thread_search = NetworkThread(Search).apply {
                        Log.d("search", "thread_search thread is starting: $Search")
                        this.start()
                    }
                }

            } else if (Search.isEmpty()) {
                Log.d("search", "no search")
                Interrupt_threads()

                liveData_tickerMap.disposable?.run {
                    this.dispose()
                }

                if (thread_search == null) {
                    thread_all = NetworkThread(Search).apply {
                        Log.d("search", "thread_all thread is starting")
                        this.start()
                    }
                }
            } else {
                Toast.makeText(this, "\"2글자 이상 입력해주세요.\"", Toast.LENGTH_SHORT).show()
            }
    }

    override fun onBackPressed() {
        // 마지막으로 뒤로가기 버튼을 눌렀던 시간 저장
        if (System.currentTimeMillis() > backKeyPressedTime + 1500) {
            backKeyPressedTime = System.currentTimeMillis()
            Toast("\'뒤로\' 버튼을 한번 더 누르시면 종료됩니다.")
            return
        }
        if (System.currentTimeMillis() <= backKeyPressedTime + 1500) {
            //아래 3줄은 프로세스 종료
            finish()
        }
    }

    fun Toast(str: String) {
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }

}