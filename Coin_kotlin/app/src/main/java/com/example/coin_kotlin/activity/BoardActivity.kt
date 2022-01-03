package com.example.coin_kotlin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.coin_kotlin.R
import com.example.coin_kotlin.databinding.ActivityBoardBinding

class BoardActivity : AppCompatActivity() {

    private lateinit var binding:ActivityBoardBinding
    private val coin_name:String? by lazy {
        val bundle = intent.extras
        bundle?.getString("name")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_board)

    }
}