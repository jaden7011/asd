package com.example.coin_kotlin.viewmodel

import android.app.Activity
import android.os.Handler
import android.os.Looper
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.coin_kotlin.R
import com.example.coin_kotlin.activity.BoardActivity
import com.example.coin_kotlin.activity.MainActivity
import com.example.coin_kotlin.activity.PostActivity
import com.example.coin_kotlin.adapter.Post_Adapter
import com.example.coin_kotlin.data.Candle
import com.example.coin_kotlin.info.PostInfo
import com.example.coin_kotlin.model.Firebase
import com.example.coin_kotlin.model.Repository
import com.example.coin_kotlin.utility.MPchart
import com.example.coin_kotlin.utility.NetworkStatus
import com.example.coin_kotlin.utility.Utility
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.functions.Consumer
import io.reactivex.rxjava3.schedulers.Schedulers

class LiveData_Posts(val activity: Activity):ViewModel() {

    lateinit var adapter: Post_Adapter

    class Factory(val activity: Activity) : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return LiveData_Posts(activity) as T
        }
    }

    val posts: MutableLiveData<ArrayList<PostInfo?>> by lazy {
        MutableLiveData<ArrayList<PostInfo?>>()
    }

    fun onCreate(candles:ArrayList<Candle>){
        ArrayList<PostInfo?>().apply {
            this.add(null)
            adapter = Post_Adapter(activity,this,candles)
        }
        val utility = Utility(activity,(activity as BoardActivity).findViewById(R.id.Board_Recycler),adapter)
        utility.RecyclerInit("VERTICAL")
    }

    fun Get_Candle_Posts(coin:String){

        if (!NetworkStatus.isConnected(activity)){
            Log.e("main_network","network is disconnected")
            (activity as BoardActivity).run {
                Handler(Looper.getMainLooper()).postDelayed({ Toast("인터넷 연결이 되어있지 않습니다.") },0)
            }
            return
        }

       Repository.get_CandleList_Single(coin)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(Consumer {
                    Log.d("onSuccess", "onSuccess[size]: " + it.data.size)
                    val candles = ArrayList<Candle>()

                    for(x in it.data){
                        candles.add(Candle(
                                x[0],
                                x[1],
                                x[2],
                                x[3],
                                x[4],
                                x[5]
                        ))
                    }

                    MPchart((activity as BoardActivity).binding.priceChart).run {
                        this.Set_priceData(candles)
                        this.candleStickChart.moveViewToX(candles.size.toFloat())
                    }

                    Firebase.Get_Posts(coin, object : Firebase.Posts_Listener {
                        override fun Completed(a: ArrayList<PostInfo?>) {
                            Log.d("Posts","Posts size: "+a.size)
                            onCreate(candles)
                            val arr = ArrayList<PostInfo?>().apply {
//                                this.add(null)
                                this.addAll(a)
                            }
                            posts.value = arr
                        }
                    })
                })
    }

}