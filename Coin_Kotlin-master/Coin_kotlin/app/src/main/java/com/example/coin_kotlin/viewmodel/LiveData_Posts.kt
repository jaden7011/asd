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
import com.example.coin_kotlin.activity.SearchActivity
import com.example.coin_kotlin.adapter.PostAdapter
import com.example.coin_kotlin.data.Candle
import com.example.coin_kotlin.info.Post
import com.example.coin_kotlin.info.PostList
import com.example.coin_kotlin.infoactivity.MypostActivity
import com.example.coin_kotlin.model.Repository
import com.example.coin_kotlin.utility.MPchart
import com.example.coin_kotlin.utility.Named.Time_to_String
import com.example.coin_kotlin.utility.NetworkStatus
import com.example.coin_kotlin.utility.Utility
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.functions.Consumer
import io.reactivex.rxjava3.schedulers.Schedulers
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlin.collections.ArrayList

class LiveData_Posts(val activity: Activity):ViewModel() {

    lateinit var adapter: PostAdapter

    class Factory(val activity: Activity) : ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return LiveData_Posts(activity) as T
        }
    }

    val posts: MutableLiveData<ArrayList<Post>> by lazy {
        MutableLiveData<ArrayList<Post>>()
    }

    fun onCreate(){

        when(activity){
            is BoardActivity -> {
                adapter = PostAdapter(activity,ArrayList())
                val utility = Utility(activity,activity.binding.BoardRecycler,adapter)
                utility.RecyclerInit("VERTICAL")
            }

            is SearchActivity -> {
                adapter = PostAdapter(activity,ArrayList())
                val utility = Utility(activity,activity.binding.searchRecyclerView,adapter)
                utility.RecyclerInit("VERTICAL")
            }

            is MypostActivity -> {
                adapter = PostAdapter(activity,ArrayList())
                val utility = Utility(activity,activity.binding.mypostRecyclerView,adapter)
                utility.RecyclerInit("VERTICAL")
            }
        }

    }

    fun Get_Candle_Posts(coin:String){

        checkNetWork()
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

                MPchart((activity as BoardActivity).binding.priceChart).run {
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

    fun searchPostList(
        coin: String,
        keyword: String
    ){
        checkNetWork()
        Repository.searchPostList(coin,keyword).enqueue(object : Callback<PostList>{
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
    }

    fun myPost(id:String){
        checkNetWork()

        Repository.myPostList(id).enqueue(object : Callback<PostList>{
            override fun onResponse(call: Call<PostList>, response: Response<PostList>) {
                if(response.isSuccessful && response.body() != null){
                    for(post in response.body()!!.postList){
                        post.dateFormate_for_layout = Time_to_String(post.createdat)
                    }
                    posts.value = response.body()!!.postList
                }
            }
            override fun onFailure(call: Call<PostList>, t: Throwable) {
                Log.e("myPost onfail","err: "+t.message)
            }
        })
    }

    fun checkNetWork(){
        if (!NetworkStatus.isConnected(activity)){
            Log.e("main_network","network is disconnected")
            when(activity){
                is BoardActivity ->{
                    Handler(Looper.getMainLooper()).postDelayed({
                        activity.Toast("인터넷 연결이 되어있지 않습니다.") },0)
                }

                is SearchActivity ->{
                    Handler(Looper.getMainLooper()).postDelayed({
                        activity.Toast("인터넷 연결이 되어있지 않습니다.") },0)
                }
            }
            return
        }
    }
}
