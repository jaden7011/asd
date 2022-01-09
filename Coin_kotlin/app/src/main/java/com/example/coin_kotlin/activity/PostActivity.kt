package com.example.coin_kotlin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.coin_kotlin.R
import com.example.coin_kotlin.databinding.ActivityPostBinding
import com.example.coin_kotlin.info.CommentInfo
import com.example.coin_kotlin.info.PostInfo
import com.example.coin_kotlin.viewmodel.LiveData_Comments
import java.util.*

class PostActivity : AppCompatActivity() {

    lateinit var binding:ActivityPostBinding
    private val post: PostInfo by lazy {
        intent.extras?.getParcelable<PostInfo>("post")!!
    }
    private lateinit var livedataComment:LiveData_Comments

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPostBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.postInfo = post
        Toolbar()
        livedataComment = ViewModelProvider(this,LiveData_Comments.Factory(this,post)).get(LiveData_Comments::class.java)
        livedataComment.onCreate()
        livedataComment.comments.observe(this, Observer {
            livedataComment.adapter.CommentInfo_DiffUtil(it)
        })

        binding.AddCommentBtn.setOnClickListener {
            if(binding.AddCommentT.text.isNotEmpty() && binding.passCommentET.text.isNotEmpty() && binding.publisherCommentET.text.isNotEmpty()){
                livedataComment.Comment(CommentInfo(
                    binding.AddCommentT.text.toString(),
                    binding.publisherCommentET.text.toString(),
                    Date(),
                    0,
                    HashMap<String,Int>(),
                    null,
                    null,
                    binding.passCommentET.text.toString(),
                    Date().toString() + binding.passCommentET.text.toString()
                ))
            }
        }
    }

    fun Toolbar(){
        setSupportActionBar(findViewById(R.id.toolbar_post))
        val actionbar  = supportActionBar!!
        actionbar.setDisplayShowCustomEnabled(true)
        actionbar.setDisplayShowTitleEnabled(false)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.mypost_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.delete -> {
                //todo delete
            }

            R.id.autonew -> {
                item.setEnabled(false)
                livedataComment.Get_Post()
            }

            R.id.back_btn -> {
                onBackPressed()
            }
        }
        return super.onOptionsItemSelected(item)
    }

}