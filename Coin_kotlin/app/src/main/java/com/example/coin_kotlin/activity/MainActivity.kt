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
import com.example.coin_kotlin.data.Candle
import com.example.coin_kotlin.data.Ticker
import com.example.coin_kotlin.databinding.ActivityMainBinding
import com.example.coin_kotlin.model.MutableLiveData_TickerMap
import com.example.coin_kotlin.utility.RxAndroidUtils
import com.example.coin_kotlin.utility.Utility
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.functions.Consumer
import io.reactivex.rxjava3.schedulers.Schedulers
import java.util.*
import java.util.concurrent.TimeUnit
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var ET_Observable_Disposable: Disposable
    private lateinit var liveData_tickerMap:MutableLiveData_TickerMap
    private lateinit var adapter: Coin_Adapter
    private var thread_all:NetworkThread? = null
    private var thread_search:NetworkThread? = null


    override fun onRestart() {
        super.onRestart()
        Log.e("onRestart","onRestart : "+ binding.searchET.text.toString())
        Set_threads(binding.searchET.text.toString())
    }

    override fun onStop() {
        super.onStop()
        Log.e("onStop","onStop")
        Interrupt_threads()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        adapter = Coin_Adapter(this,ArrayList<Ticker>())
        val utility = Utility(this,binding.CoinRecyclerView,adapter)
        utility.RecyclerInit("VERTICAL")

        liveData_tickerMap = ViewModelProvider(this).get(MutableLiveData_TickerMap::class.java)
        liveData_tickerMap.coins.observe(this, Observer {
            adapter.CoinDiffUtil(Sort(it))
        })

        ET_Observable_Disposable =
            RxAndroidUtils.getEditTextObservable(binding.searchET)
                .debounce(700,TimeUnit.MILLISECONDS)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(Consumer {
                    Set_threads(it)
                })
    }

    inner class NetworkThread(
        private val search_ET: String
    ):Thread() {

        var isRunning = true

        override fun run() {
            while (isRunning) {
                try {
                    Log.d("NetworkThread", "running")
                    liveData_tickerMap.Get_API(search_ET)
                    sleep(5000)
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
            }
        }

    }

    private fun Sort(map: Map<String,Ticker>):ArrayList<Ticker>{

        val list:ArrayList<Ticker> = ArrayList(map.values)
        list.sortByDescending { it.acc_trade_value_24H!!.toDouble() }

        return list
    }

    private fun Interrupt_threads(){

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

    private fun Set_threads(Search:String){
        if(Search.length >= 2){
            Log.d("search","search something")
            Interrupt_threads()

            liveData_tickerMap.disposable?.run {
                this.dispose()
            }

            if(thread_all == null){
                thread_search = NetworkThread(Search).apply {
                    Log.d("search", "thread_search thread is starting: $Search")
                    this.start()
                }
            }

        }
        else if(Search.isEmpty()){
            Log.d("search","no search")
            Interrupt_threads()

            liveData_tickerMap.disposable?.run {
                this.dispose()
            }

            if(thread_search == null){
                thread_all = NetworkThread(Search).apply {
                    Log.d("search","thread_all thread is starting")
                    this.start()
                }
            }
        }
        else{
            Toast.makeText(this,"\"2글자 이상 입력해주세요.\"",Toast.LENGTH_SHORT).show()
        }
    }

}