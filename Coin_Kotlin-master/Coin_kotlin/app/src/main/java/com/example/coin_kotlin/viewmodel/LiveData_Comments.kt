package com.example.coin_kotlin.viewmodel

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
import com.example.coin_kotlin.info.Comment
import com.example.coin_kotlin.info.CommentList
import com.example.coin_kotlin.info.Post
import com.example.coin_kotlin.model.Repository
import com.example.coin_kotlin.utility.Named.Time_to_String
import com.example.coin_kotlin.utility.NetworkStatus
import com.example.coin_kotlin.utility.Utility
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LiveData_Comments (
    val activity: PostActivity
): ViewModel(){

    lateinit var adapter : Comment_Adapter

    class Factory(val activity: PostActivity) : ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return LiveData_Comments(activity) as T
        }
    }

    val comments: MutableLiveData<ArrayList<Comment>> by lazy {
        MutableLiveData<ArrayList<Comment>>()
    }

    fun onCreate(){
        adapter = Comment_Adapter(activity,ArrayList())
        val utility = Utility(activity,activity.findViewById(R.id.commentRecycler),adapter)
        utility.RecyclerInit("VERTICAL")
    }

    fun getPost(postid:String){

        if (!NetworkStatus.isConnected(activity)){
            Log.e("main_network","network is disconnected")
            (activity as PostActivity).run {
                Handler(Looper.getMainLooper()).postDelayed({ Toast("인터넷 연결이 되어있지 않습니다.") },0)
            }
            return
        }

        loadingvisible(true)

        //todo 새로고침 했을 때 게시판 최신정보를 가져옴 + 댓글도 가져와야함
        Repository.getPost(postid).enqueue(object : Callback<Post>{
            override fun onResponse(call: Call<Post>, response: Response<Post>) {
                if(response.isSuccessful && response.body() != null){
                    val post = response.body()
                    post?.dateFormate_for_layout = Time_to_String(post!!.createdat)
                    activity.binding.post = post
                    getComment(postid)
                    loadingvisible(false)
                }
            }
            override fun onFailure(call: Call<Post>, t: Throwable) {
                Log.e("LiveData_Comments","onFailure: " + t.message)
                loadingvisible(false)
            }
        })

//        Firebase.Get_Post(post.coin,post.docid,object : Firebase.Post_Listener{
//            override fun Completed(a: PostInfo?) {
//                comments.value = a
//                (activity as PostActivity).binding.postLoadingview.loaderLyaout.visibility = View.GONE
//            }
//        })
    }

    fun addComment(
            postid: String,
            commentid: String,
            content: String,
            nickname: String
    ){

        //todo 로직진행속도가 빠르면 loadview가 너무 빨리 꺼져서 깜박이는 것처럼 보이는게 거슬림 -> 없애도 ㄱㅊ을 듯?
        loadingvisible(true)
        //todo 댓글을 썼을 때 -> db에 집어넣고 새로운 댓글리스트를 가져와야하는 것이 한 묶음
        Repository.writeComment(postid, commentid, content, nickname).enqueue(object : Callback<Comment>{
            override fun onResponse(call: Call<Comment>, response: Response<Comment>) {
                if(response.isSuccessful){
                    Log.e("addComment","onResponse: " + response.body()?.msg)
                    getPost(postid)
                    loadingvisible(false)
                    activity.textclear()
                }
            }
            override fun onFailure(call: Call<Comment>, t: Throwable) {
                Log.e("addComment","onFailure: " + t.message)
                activity.textclear()
                loadingvisible(false)
            }

        })
//        Firebase.Comment(post.coin,post.docid,comment,object : Firebase.Post_Listener{
//            override fun Completed(a: PostInfo?) {
//                comments.value = a
//                (activity as PostActivity).binding.postLoadingview.loaderLyaout.visibility = View.GONE
//            }
//        })
    }

    fun getComment(postid:String){
        Repository.getCommentList(postid).enqueue(object : Callback<CommentList>{
            override fun onResponse(call: Call<CommentList>, response: Response<CommentList>) {
                if(response.isSuccessful && response.body() != null){
                    for(comment in response.body()!!.commentlist)
                        comment.dateFormate_for_layout = Time_to_String(comment.createdat)

                        comments.value = response.body()!!.commentlist
                }
            }
            override fun onFailure(call: Call<CommentList>, t: Throwable) {
                Log.e("getComment","onFailure: " + t.message)
            }
        })
    }

    fun loadingvisible(visibiltity:Boolean){
        if(visibiltity)
            (activity as PostActivity).binding.postLoadingview.loaderLyaout.visibility = View.VISIBLE
        else
            (activity as PostActivity).binding.postLoadingview.loaderLyaout.visibility = View.GONE
    }

}