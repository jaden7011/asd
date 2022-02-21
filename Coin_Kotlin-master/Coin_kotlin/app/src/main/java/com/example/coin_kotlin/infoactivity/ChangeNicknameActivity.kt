package com.example.coin_kotlin.infoactivity

import android.app.Activity
import android.content.Context
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.Window
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.coin_kotlin.R
import com.example.coin_kotlin.databinding.ActivityChangeNicknameBinding
import com.example.coin_kotlin.info.User
import com.example.coin_kotlin.model.Repository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ChangeNicknameActivity : Activity() {

    lateinit var binding: ActivityChangeNicknameBinding
    val user by lazy { intent.extras?.getParcelable<User>("user") }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setView()
    }

    fun setView() {
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED;
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_change_nickname)

        binding.myNickT.run {
            text = user?.nickname
            requestFocus()
        }

        binding.ChangeNickBtn.setOnClickListener {
            if (user != null && user?.id != null) {
                var tag = ""
                for(i in 0..1){
                    tag+=user!!.id[i]
                }

                val nick = binding.changeNickET.text.toString() + " (#" + tag + ")"

                Repository.updateNick(user!!.id, nick).enqueue(object : Callback<User> {
                    override fun onResponse(call: Call<User>, response: Response<User>) {
                        if (response.isSuccessful && response.body() != null) {
                            Toast("변경되었습니다.")
                            finish()
                        }
                    }
                    override fun onFailure(call: Call<User>, t: Throwable) {
                        Toast("실패하였습니다.")
                    }
                })
            } else {
                Toast("회원정보가 확인되지 않습니다.")
            }
        }

        binding.CancelChangeNickBtn.setOnClickListener {
            finish()
        }
    }

    fun Toast(str: String) {
        android.widget.Toast.makeText(this, str, android.widget.Toast.LENGTH_SHORT).show();
    }
}