package com.example.coin_kotlin.activity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.inputmethod.InputMethodManager
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.coin_kotlin.R
import com.example.coin_kotlin.databinding.ActivityPostBinding
import com.example.coin_kotlin.info.Post
import com.example.coin_kotlin.model.Repository
import com.example.coin_kotlin.utility.Named.CHANGED
import com.example.coin_kotlin.utility.Named.DELETE
import com.example.coin_kotlin.viewmodel.LiveData_Comments
import com.google.firebase.auth.FirebaseAuth
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*

class PostActivity : AppCompatActivity() {

    private val auth = FirebaseAuth.getInstance().currentUser
    lateinit var binding: ActivityPostBinding
    private val post: Post by lazy {
        intent.extras?.getParcelable<Post>("post")!!
    }
    private lateinit var livedataComment: LiveData_Comments

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPostBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setView(this)

        binding.AddCommentBtn.setOnClickListener {

            auth?.run {
                val content = binding.AddCommentT.text.toString()
                val commentid = post.postid + Date().time

                if (content.isNotEmpty()) {
                    livedataComment.addComment(auth.uid,post.postid, commentid, content)
                }else{
                    Toast("내용을 적어주세요.")
                }
            }
        }

        binding.goodBtnFrame.setOnClickListener {
            if (!auth?.uid.isNullOrEmpty())
                livedataComment.love(post.postid, FirebaseAuth.getInstance().uid!!, 1)
            else {
                Toast("로그인 후에 이용가능합니다..")
            }
        }
    }

    fun setView(activity: PostActivity) {
        val user = FirebaseAuth.getInstance().currentUser

        if (user == null) {
            binding.AddCommentBtn.isEnabled = false
            binding.AddCommentT.run {
                isEnabled = false
                background = ContextCompat.getDrawable(activity, R.drawable.corner_dark)
                setHintTextColor(ContextCompat.getColor(activity, R.color.white))
                setHint(" 로그인이 필요합니다.")
            }
        }

        Toolbar()
        binding.post = post

        livedataComment =
            ViewModelProvider(this, LiveData_Comments.Factory(this))[LiveData_Comments::class.java]
        livedataComment.run {
            onCreate()
            getComment(post.postid)
            livedataComment.comments.observe(activity, Observer {
                livedataComment.adapter.CommentDiffUtil(it)
                textclear()
            })
        }
    }

    fun Toolbar() {
        setSupportActionBar(findViewById(R.id.toolbar_post))
        val actionbar = supportActionBar
        actionbar?.run {
            setDisplayShowCustomEnabled(true)
            setDisplayShowTitleEnabled(false)
            setDisplayHomeAsUpEnabled(false)
            setHomeButtonEnabled(false)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        if (auth != null)
            menuInflater.inflate(R.menu.mypost_menu, menu)
        else
            menuInflater.inflate(R.menu.otherspost_menu, menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.delete -> {
                Repository.deletePost(post.postid).enqueue(object : Callback<Post> {
                    override fun onResponse(call: Call<Post>, response: Response<Post>) {
                        if (response.body() != null)
                            Toast(response.body()!!.msg)
                        setResult(DELETE)
                        finish()
                    }

                    override fun onFailure(call: Call<Post>, t: Throwable) {
                        Log.e("delete post", "err: " + t.message)
                    }

                })
            }

            R.id.autonew -> {
                item.isEnabled = false

                livedataComment.getPost(post.postid)

                Handler(Looper.getMainLooper()).postDelayed({
                    item.isEnabled = true
                }, 1000)

            }
        }
        return super.onOptionsItemSelected(item)
    }

    fun textclear() {
        binding.AddCommentT.text.clear()

        (this.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager)
            .hideSoftInputFromWindow(binding.AddCommentT.windowToken, 0)
    }

    override fun onBackPressed() {
        setResult(CHANGED, Intent().run {
            putExtra("postid", post.postid)
        })
        finish()
    }

    fun Toast(str: String) {
        android.widget.Toast.makeText(this, str, android.widget.Toast.LENGTH_SHORT).show();
    }

}