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
import com.example.coin_kotlin.adapter.CommentAdapter
import com.example.coin_kotlin.info.Comment
import com.example.coin_kotlin.info.CommentList
import com.example.coin_kotlin.info.Post
import com.example.coin_kotlin.info.User
import com.example.coin_kotlin.model.Repository
import com.example.coin_kotlin.utility.Named.Time_to_String
import com.example.coin_kotlin.utility.NetworkStatus
import com.example.coin_kotlin.utility.Utility
import com.google.firebase.auth.FirebaseAuth
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LiveData_Comments(
    val activity: PostActivity
) : ViewModel() {

    lateinit var adapter: CommentAdapter

    class Factory(val activity: PostActivity) : ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return LiveData_Comments(activity) as T
        }
    }

    val comments: MutableLiveData<ArrayList<Comment>> by lazy {
        MutableLiveData<ArrayList<Comment>>()
    }

    fun onCreate() {
        adapter = CommentAdapter(activity, activity.post ,ArrayList(),object : CommentAdapter.GoodListener{
            override fun pressed(comment: Comment) {
                val uid = FirebaseAuth.getInstance().currentUser?.uid
                if(uid != null){
                    commentLove(comment.commentid,comment.postid,uid)
                }else{
                    Toast("실패하였습니다.")
                }
            }
        })
        val utility = Utility(activity, activity.findViewById(R.id.commentRecycler), adapter)
        utility.RecyclerInit("VERTICAL")
    }

    fun getPost(postid: String) {
        checkNetWork()
        loadingvisible(true)

        Repository.getPost(postid).enqueue(object : Callback<Post> {
            override fun onResponse(call: Call<Post>, response: Response<Post>) {
                if (response.isSuccessful && response.body() != null) {
                    val issuccess = response.body()?.issuccess!!
                    val msg = response.body()?.msg!!
                    if(issuccess){
                        val post = response.body()
                        post?.dateFormate_for_layout = Time_to_String(post!!.createdat)
                        activity.binding.post = post
                        getComment(postid)
                        loadingvisible(false)
                    }else{
                        Toast(msg)
                        activity.finish()
                        loadingvisible(false)
                    }

                }
            }

            override fun onFailure(call: Call<Post>, t: Throwable) {
                Log.e("LiveData_Comments", "onFailure: " + t.message)
                loadingvisible(false)
            }
        })
    }

    fun addComment(
        uid: String,
        postid: String,
        commentid: String,
        content: String
    ) {
        checkNetWork()
        loadingvisible(true)

        Repository.getUser(uid).enqueue(object : Callback<User> {// 닉네임 db에서 가져오고,
            override fun onResponse(call: Call<User>, response: Response<User>) {
                if (response.isSuccessful && response.body() != null) {
                    val user = response.body()!!

                    // 댓글을 썼을 때 -> db에 집어넣고 새로운 댓글리스트를 가져와야하는 것이 한 묶음
                    Repository.writeComment(postid, commentid, content, user.nickname,uid)
                        .enqueue(object : Callback<Comment> {
                            override fun onResponse(call: Call<Comment>, response: Response<Comment>) {
                                if (response.isSuccessful) {
                                    Log.e("addComment", "onResponse: " + response.body()?.msg)
                                    getPost(postid)
                                    loadingvisible(false)
                                    activity.textclear()
                                }
                            }
                            override fun onFailure(call: Call<Comment>, t: Throwable) {
                                Log.e("addComment", "onFailure: " + t.message)
                                activity.textclear()
                                loadingvisible(false)
                            }
                        })
                }
            }

            override fun onFailure(call: Call<User>, t: Throwable) {
                Log.e("infoActivity", "onFailure user")
            }
        })
    }

    fun getComment(postid: String) {
        checkNetWork()
        Repository.getCommentList(postid).enqueue(object : Callback<CommentList> {
            override fun onResponse(call: Call<CommentList>, response: Response<CommentList>) {
                if (response.isSuccessful && response.body() != null) {
                    for (comment in response.body()!!.commentlist)
                        comment.dateFormate_for_layout = Time_to_String(comment.createdat)
                    comments.value = response.body()!!.commentlist
                }
            }

            override fun onFailure(call: Call<CommentList>, t: Throwable) {
                Log.e("getComment", "onFailure: " + t.message)
            }
        })
    }

    fun commentLove(commentid: String, postid: String, id:String){
        checkNetWork()
        Repository.clove(commentid, postid, id).enqueue(object :Callback<Post>{
            override fun onResponse(call: Call<Post>, response: Response<Post>) {
                if (response.isSuccessful && response.body() != null) {
                    val msg = response.body()?.msg
                    if (!msg.isNullOrEmpty()) {
                        Toast(msg)
                        getPost(postid)
                    }
                }
            }
            override fun onFailure(call: Call<Post>, t: Throwable) {
                Log.e("clove onfailure", "err: " + t.message)
            }
        })
    }

    fun postLove(postid: String,id: String){
        checkNetWork()
        Repository.plove(postid,id).enqueue(object :Callback<Post>{
            override fun onResponse(call: Call<Post>, response: Response<Post>) {
                if (response.isSuccessful && response.body() != null) {
                    val msg = response.body()?.msg
                    if (!msg.isNullOrEmpty()) {
                        Toast(msg)
                        getPost(postid)
                    }
                }
            }
            override fun onFailure(call: Call<Post>, t: Throwable) {
                Log.e("plove onfailure", "err: " + t.message)
            }

        })
    }

    fun delPost(postid: String){
        Repository.deletePost(postid).enqueue(object : Callback<Post> {
            override fun onResponse(call: Call<Post>, response: Response<Post>) {
                if (response.body() != null)
                    Toast(response.body()!!.msg)
                activity.finish()
            }

            override fun onFailure(call: Call<Post>, t: Throwable) {
                Log.e("delete post", "err: " + t.message)
            }

        })
    }

    fun delComment(comment: Comment){
        Repository.deleteComment(comment.commentid,comment.postid).enqueue(object : Callback<Comment>{
            override fun onResponse(call: Call<Comment>, response: Response<Comment>) {
                if (response.isSuccessful && response.body() != null){
                    Toast(response.body()!!.msg)
                    getPost(comment.postid)
                }
            }
            override fun onFailure(call: Call<Comment>, t: Throwable) {
                Log.e("delComment","fail: " + t.message)
            }

        })
    }

    fun loadingvisible(visibiltity: Boolean) {
        if (visibiltity)
            (activity as PostActivity).binding.postLoadingview.loaderLyaout.visibility =
                View.VISIBLE
        else
            (activity as PostActivity).binding.postLoadingview.loaderLyaout.visibility = View.GONE
    }

    fun checkNetWork() {
        if (!NetworkStatus.isConnected(activity)) {
            Log.e("main_network", "network is disconnected")
            (activity as PostActivity).run {
                Handler(Looper.getMainLooper()).postDelayed({ Toast("인터넷 연결이 되어있지 않습니다.") }, 0)
            }
            return
        }
    }

    fun Toast(str: String) {
        android.widget.Toast.makeText(activity, str, android.widget.Toast.LENGTH_SHORT).show();
    }

}