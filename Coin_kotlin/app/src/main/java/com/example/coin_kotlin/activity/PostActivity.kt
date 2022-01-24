package com.example.coin_kotlin.activity

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.inputmethod.InputMethodManager
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
            textclear()
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
        val actionbar  = supportActionBar
        actionbar?.run {
            setDisplayShowCustomEnabled(true)
            setDisplayShowTitleEnabled(false)
            setDisplayHomeAsUpEnabled(false)
            setHomeButtonEnabled(false)
        }
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

    fun textclear(){
        binding.AddCommentT.text.clear()
        binding.passCommentET.text.clear()
        binding.publisherCommentET.text.clear()

        (this.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager)
            .hideSoftInputFromWindow(binding.AddCommentT.windowToken,0)
    }

    fun Toast(str: String) {
        android.widget.Toast.makeText(this, str, android.widget.Toast.LENGTH_SHORT).show();
    }

}