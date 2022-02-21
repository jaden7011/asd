package com.example.coin_kotlin.infoactivity

import android.app.Activity
import android.content.Context
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.Window
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import com.example.coin_kotlin.R
import com.example.coin_kotlin.databinding.ActivityChangeNicknameBinding

class ChangeNicknameActivity : Activity() {

    lateinit var binding: ActivityChangeNicknameBinding
    val nickname by lazy { intent.extras?.getString("nickname") }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setView()
    }

    fun setView() {
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED;
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_change_nickname)

        binding.myNickT.run {
            text = nickname
            requestFocus()
        }

        binding.ChangeNickBtn.setOnClickListener {
            val nick = binding.changeNickET.text.toString()
        }

        binding.CancelChangeNickBtn.setOnClickListener {
            finish()
        }
    }
}