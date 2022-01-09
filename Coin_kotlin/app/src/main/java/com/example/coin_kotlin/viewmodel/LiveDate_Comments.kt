package com.example.coin_kotlin.viewmodel

import android.app.Activity
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.coin_kotlin.R
import com.example.coin_kotlin.activity.PostActivity
import com.example.coin_kotlin.adapter.Comment_Adapter
import com.example.coin_kotlin.info.CommentInfo
import com.example.coin_kotlin.info.PostInfo
import com.example.coin_kotlin.model.Firebase
import com.example.coin_kotlin.utility.Utility

class LiveDate_Comments (
    val activity: Activity,
    val post:PostInfo
): ViewModel(){

    lateinit var adapter : Comment_Adapter

    class Factory(val activity: Activity,val post:PostInfo) : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return LiveDate_Comments(activity,post) as T
        }
    }

    val comments: MutableLiveData<ArrayList<CommentInfo>> by lazy {
        MutableLiveData<ArrayList<CommentInfo>>()
    }

    fun onCreate(){
        if(activity is PostActivity){
            adapter = Comment_Adapter(activity,post,post.comments)
            val utility = Utility(activity,activity.findViewById(R.id.commentRecycler),adapter)
            utility.RecyclerInit("VERTICAL")
        }
    }

    fun Get_Post(){

        Firebase.Get_Post(post.coin,post.docid,object : Firebase.Post_Listener{
            override fun Completed(a: PostInfo?) {
                TODO("Not yet implemented")
            }

        })
    }

    fun Comment(comment:CommentInfo){
    }

}