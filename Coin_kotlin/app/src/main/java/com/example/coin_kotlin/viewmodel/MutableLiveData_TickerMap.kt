package com.example.coin_kotlin.viewmodel

import android.app.Activity
import android.os.Handler
import android.os.Looper
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.coin_kotlin.activity.MainActivity
import com.example.coin_kotlin.data.Ticker
import com.example.coin_kotlin.data.Ticker_Response
import com.example.coin_kotlin.model.Repository
import com.example.coin_kotlin.utility.NetworkStatus
import com.google.gson.Gson
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Flowable
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.functions.Consumer
import io.reactivex.rxjava3.schedulers.Schedulers
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicInteger

class MutableLiveData_TickerMap(val activity: MainActivity):ViewModel(){

    class Factory(val activity: MainActivity) : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return MutableLiveData_TickerMap(activity) as T
        }
    }

    var disposable: Disposable? = null

    val coins: MutableLiveData<Map<String, Ticker>> by lazy {
        MutableLiveData<Map<String, Ticker>>()
    }
    val observable: Single<Ticker_Response> = Repository.get_Ticker("ALL")

    fun Get_API(search_str:String){

        if (!NetworkStatus.isConnected(activity)){
            Log.e("main_network","network is disconnected")
            (activity as MainActivity).run {
                Handler(Looper.getMainLooper()).postDelayed(object : Runnable {
                    override fun run() {
                        Toast("인터넷 연결이 되어있지 않습니다.")
                    }
                },0)
                Interrupt_threads()
            }
            return
        }

        disposable = observable
            .retryWhen{ e:Flowable<Throwable> -> //에러시에 1초단위로 100번까지 재시도
                val counter = AtomicInteger()
                return@retryWhen e
                    .takeWhile{e->counter.getAndIncrement() != 100}
                    .flatMap { e->
                        return@flatMap Flowable.timer(
                            counter.get().toLong(),
                            TimeUnit.SECONDS
                        )
                    }
            }
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe(Consumer {

                val map = HashMap<String,Ticker>()
                var cnt = 0

//                coins.value?.run {
//                    Log.d("accept", "coins.getValue().size(): " + this.size)
//                }
                Log.d("accept", "search_str: $search_str")
                Log.d("accept", "data.size: "+it.data.size)

                for(entry in it.data){

//                    if(cnt==183)
//                        break
//                    else
//                        cnt++

                    val name = entry.key!!
                    val obj = entry.value!!

                    if(name != "date"){ //api 마지막에 껴있는 불필요한 정보 date 제외
                        if( (search_str.length >= 2 && name.contains(search_str,ignoreCase = true))
                            || search_str.isEmpty()){

                            val gson = Gson()
                            val json = gson.toJson(obj)
                            val ticker = gson.fromJson(json,Ticker::class.java)
                            ticker.name = name
                            ticker.sub_name = name

//                            if(name.equals("ETH"))
//                                Log.e("coin","val :" + ticker.closing_price)

                            map[name] = ticker
                        }
                    }
                }
                Log.d("accept", "data.size(): " + map.size)
                coins.value = map
            })
    }
}