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
                val s = it.toUpperCase(Locale.ROOT)

                    if(s.length >= 2){
                        Log.d("search","search something")
                        liveData_tickerMap.disposable?.run {
                            this.dispose()
                        }

                        thread_all?.run{
                            this.isRunning = false
                            this.interrupt()
                            Log.d("search","find-all thread is interrupted?: "+this.isInterrupted)

                            thread_search = NetworkThread(s).apply {
                                this.start()
                            }
                        }

                        if(thread_all == null){
                            thread_search = NetworkThread(s).apply {
                                this.start()
                            }
                        }

                    }
                    else if(s.isEmpty()){
                        Log.d("search","no search")
                        liveData_tickerMap.disposable?.run {
                            this.dispose()
                        }

                        thread_search?.run{
                            this.isRunning = false
                            this.interrupt()
                            Log.d("search","search thread is interrupted?: "+this.isInterrupted)

                            thread_all = NetworkThread(s).apply {
                                this.start()
                            }
                        }

                        if(thread_search == null){
                            thread_all = NetworkThread(s).apply {
                                Log.d("search","search thread is empty")
                                this.start()
                            }
                        }
                    }
                    else{
                        Toast.makeText(this,"\"2글자 이상 입력해주세요.\"",Toast.LENGTH_SHORT).show()
                    }
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

//        list.sortedWith(Comparator { o1:Ticker, o2:Ticker ->
//            if (o1.acc_trade_value_24H?.toDouble()!! <= o2.acc_trade_value_24H?.toDouble()!!){
//                return@Comparator 1
//            }
//            else{
//                return@Comparator -1
//            }
//        })

        return list
    }

}