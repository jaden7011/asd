package com.example.coin_kotlin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.widget.Toolbar
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.coin_kotlin.R
import com.example.coin_kotlin.adapter.Post_Adapter
import com.example.coin_kotlin.databinding.ActivityBoardBinding
import com.example.coin_kotlin.viewmodel.LiveData_Posts

class BoardActivity : AppCompatActivity() {

    private lateinit var binding:ActivityBoardBinding
    private val coin_name:String? by lazy {
        val bundle = intent.extras
        bundle?.getString("name")
    }
    private val toolbar: Toolbar = findViewById(R.id.toolbar_board)
    private lateinit var livedataPostinfo: LiveData_Posts

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_board)
        Toolbar()
        livedataPostinfo = ViewModelProvider(this,LiveData_Posts.Factory(this)).get(LiveData_Posts::class.java)
        livedataPostinfo.posts.observe(this, Observer {
            livedataPostinfo.adapter
            //todo
        })

    }

    fun Toolbar(){
        setSupportActionBar(toolbar)
        val actionBar: ActionBar? = supportActionBar
        actionBar?.setDisplayShowCustomEnabled(true)
        actionBar?.setDisplayShowTitleEnabled(false)
        actionBar?.setDisplayHomeAsUpEnabled(true)
        toolbar.setTitle(coin_name)
    }
}