package com.example.coin_kotlin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.coin_kotlin.R
import com.example.coin_kotlin.databinding.ActivitySearchBinding
import com.example.coin_kotlin.info.Post
import com.example.coin_kotlin.model.PreferenceManager
import com.example.coin_kotlin.utility.Named
import com.example.coin_kotlin.utility.RxAndroidUtils
import com.example.coin_kotlin.viewmodel.LiveData_Posts
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.functions.Consumer
import io.reactivex.rxjava3.schedulers.Schedulers
import java.util.concurrent.TimeUnit

class SearchActivity : AppCompatActivity() {

    lateinit var binding: ActivitySearchBinding
    lateinit var livedataPostinfo: LiveData_Posts
    val coin_name: String by lazy {
        intent.extras?.getString("coin_name")!!
    }

    override fun onRestart() {
        super.onRestart()
        livedataPostinfo.searchPostList(coin_name,binding.searchET.text.toString())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setView()

        RxAndroidUtils.getEditTextObservable(binding.searchET)
            .debounce(700, TimeUnit.MILLISECONDS)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(Consumer {
                if (it.isNotEmpty())
                    livedataPostinfo.searchPostList(coin_name, it)
            })
    }

    fun setView() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_search)
        livedataPostinfo =
            ViewModelProvider(this, LiveData_Posts.Factory(this))[LiveData_Posts::class.java]
        livedataPostinfo.onCreate() //recyclerview adapter init
        livedataPostinfo.posts.observe(this, Observer {
            livedataPostinfo.adapter.PostDiffUtil(it)
        })
    }

    fun Toast(str: String) {
        android.widget.Toast.makeText(this, str, android.widget.Toast.LENGTH_SHORT).show();
    }
}