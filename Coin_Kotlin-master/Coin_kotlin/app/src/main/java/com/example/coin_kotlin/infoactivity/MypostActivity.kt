package com.example.coin_kotlin.infoactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.coin_kotlin.R
import com.example.coin_kotlin.databinding.ActivityChangeNicknameBinding
import com.example.coin_kotlin.databinding.ActivityMypostBinding
import com.example.coin_kotlin.info.User
import com.example.coin_kotlin.viewmodel.LiveData_Posts
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdSize
import com.google.android.gms.ads.MobileAds

class MypostActivity : AppCompatActivity() {

    lateinit var binding: ActivityMypostBinding
    val user by lazy { intent.extras?.getParcelable<User>("user") }
    lateinit var livedataPosts: LiveData_Posts

    override fun onRestart() {
        super.onRestart()
        livedataPosts.myPost(user!!.id)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setView()
    }

    fun setView(){
        binding = DataBindingUtil.setContentView(this,R.layout.activity_mypost)
        MobileAds.initialize(this)
        binding.ads.run {
//            adSize = AdSize.BANNER
//            adUnitId = "ca-app-pub-3940256099942544/6300978111"
            loadAd(AdRequest.Builder().build())
        }
        toolbar()

        livedataPosts =
            ViewModelProvider(this, LiveData_Posts.Factory(this))[LiveData_Posts::class.java]
        livedataPosts.posts.observe(this, Observer {
            livedataPosts.adapter.PostDiffUtil(it)
        })
        livedataPosts.run{
            onCreate()
            myPost(user!!.id)
        }
    }

    fun toolbar() {
        setSupportActionBar(findViewById(R.id.toolbar_mypost))
        val actionbar = supportActionBar
        actionbar?.run {
            setDisplayShowCustomEnabled(true)
            setDisplayShowTitleEnabled(false)
            setDisplayHomeAsUpEnabled(false)
            setHomeButtonEnabled(false)
        }
    }
}