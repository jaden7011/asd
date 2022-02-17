package com.example.coin_kotlin.viewmodel

import android.os.Handler
import android.os.Looper
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.coin_kotlin.R
import com.example.coin_kotlin.activity.BoardActivity
import com.example.coin_kotlin.adapter.Post_Adapter
import com.example.coin_kotlin.data.Candle
import com.example.coin_kotlin.info.Post
import com.example.coin_kotlin.info.PostList
import com.example.coin_kotlin.model.Repository
import com.example.coin_kotlin.utility.MPchart
import com.example.coin_kotlin.utility.Named
import com.example.coin_kotlin.utility.Named.Time_to_String
import com.example.coin_kotlin.utility.NetworkStatus
import com.example.coin_kotlin.utility.Utility
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.functions.Consumer
import io.reactivex.rxjava3.schedulers.Schedulers
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class LiveData_Posts(val activity: BoardActivity):ViewModel() {

    lateinit var adapter: Post_Adapter

    class Factory(val activity: BoardActivity) : ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return LiveData_Posts(activity) as T
        }
    }

    val posts: MutableLiveData<ArrayList<Post>> by lazy {
        MutableLiveData<ArrayList<Post>>()
    }

    fun onCreate(){
        adapter = Post_Adapter(activity,ArrayList())
        val utility = Utility(activity,(activity).findViewById(R.id.Board_Recycler),adapter)
        utility.RecyclerInit("VERTICAL")

//        Repository.get_CoinImage(activity.coin_name)
//                .enqueue(object : Callback<ResponseBody> {
//                    override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
//                    }
//
//                    override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {
//                        val res = response.body()?.byteStream()
//                        Log.e("asd", res.toString())
//                        Handler(Looper.getMainLooper()).postDelayed({
//                            val bitmap = BitmapFactory.decodeStream(res)
//                            activity.Toolbar(BitmapDrawable(activity.applicationContext.resources,bitmap))
//                        },0)
//                    }
//                })
    }

    fun Get_Candle_Posts(coin:String){

        if (!NetworkStatus.isConnected(activity)){
            Log.e("main_network","network is disconnected")
            (activity as BoardActivity).run {
                Handler(Looper.getMainLooper()).postDelayed({ Toast("인터넷 연결이 되어있지 않습니다.") },0)
            }
            return
        }

        onCreate()

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

                MPchart((activity).binding.priceChart).run {
                    this.Set_priceData(candles)
                    this.candleStickChart.moveViewToX(candles.size.toFloat())
                }

                Repository.getPostList(coin).enqueue(object : Callback<PostList>{
                    override fun onResponse(call: Call<PostList>, response: Response<PostList>) {
                        if(response.isSuccessful && response.body() != null) {
                            for(post in response.body()!!.postList){
                                post.dateFormate_for_layout = Time_to_String(post.createdat)
                            }
                            posts.value = response.body()!!.postList
                        }
                        else{
                            Log.e("getPostList onResponse","size: "+response.body()?.postList?.size)
                        }
                    }
                    override fun onFailure(call: Call<PostList>, t: Throwable) {
                        Log.e("getPostList onfail","err: "+t.message)
                    }

                })
            })
    }
}
