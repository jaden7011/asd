package com.example.coin_kotlin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import com.example.coin_kotlin.R
import com.example.coin_kotlin.databinding.ActivityPostBinding
import com.example.coin_kotlin.info.PostInfo

class PostActivity : AppCompatActivity() {

    private lateinit var binding:ActivityPostBinding
    private val post: PostInfo by lazy {
        val bundle = intent.extras
        bundle?.getParcelable<PostInfo>("post")!!
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPostBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.postInfo = post
        Toolbar()

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

            }
        }
        return super.onOptionsItemSelected(item)
    }
}