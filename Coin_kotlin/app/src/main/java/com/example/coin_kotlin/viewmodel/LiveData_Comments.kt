package com.example.coin_kotlin.viewmodel

import android.app.Activity
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.coin_kotlin.R
import com.example.coin_kotlin.activity.PostActivity
import com.example.coin_kotlin.adapter.Comment_Adapter
import com.example.coin_kotlin.info.CommentInfo
import com.example.coin_kotlin.info.PostInfo
import com.example.coin_kotlin.model.Firebase
import com.example.coin_kotlin.utility.NetworkStatus
import com.example.coin_kotlin.utility.Utility

class LiveData_Comments (
    val activity: Activity,
    val post:PostInfo
): ViewModel(){

    lateinit var adapter : Comment_Adapter

    class Factory(val activity: Activity,val post:PostInfo) : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return LiveData_Comments(activity,post) as T
        }
    }

    val comments: MutableLiveData<PostInfo> by lazy {
        MutableLiveData<PostInfo>()
    }

    fun onCreate(){
        if(activity is PostActivity){
            adapter = Comment_Adapter(activity,post,post.comments)
            val utility = Utility(activity,activity.findViewById(R.id.commentRecycler),adapter)
            utility.RecyclerInit("VERTICAL")
        }
    }

    fun Get_Post(){

        if (!NetworkStatus.isConnected(activity)){
            Log.e("main_network","network is disconnected")
            (activity as PostActivity).run {
                Handler(Looper.getMainLooper()).postDelayed({ Toast("인터넷 연결이 되어있지 않습니다.") },0)
            }
            return
        }

        (activity as PostActivity).binding.postLoadingview.loaderLyaout.visibility = View.VISIBLE

        Firebase.Get_Post(post.coin,post.docid,object : Firebase.Post_Listener{
            override fun Completed(a: PostInfo?) {
                comments.value = a
                (activity as PostActivity).binding.postLoadingview.loaderLyaout.visibility = View.GONE
            }
        })
    }

    fun Comment(comment:CommentInfo){

        (activity as PostActivity).binding.postLoadingview.loaderLyaout.visibility = View.VISIBLE

        Firebase.Comment(post.coin,post.docid,comment,object : Firebase.Post_Listener{
            override fun Completed(a: PostInfo?) {
                comments.value = a
                (activity as PostActivity).binding.postLoadingview.loaderLyaout.visibility = View.GONE
            }
        })
    }

}