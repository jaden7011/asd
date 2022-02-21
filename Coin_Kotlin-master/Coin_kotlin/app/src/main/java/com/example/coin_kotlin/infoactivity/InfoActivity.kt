package com.example.coin_kotlin.infoactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.coin_kotlin.R
import com.example.coin_kotlin.databinding.ActivityInfoBinding
import com.example.coin_kotlin.info.User
import com.example.coin_kotlin.model.Repository
import com.google.firebase.auth.FirebaseAuth
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class InfoActivity : AppCompatActivity() {

    private val auth = FirebaseAuth.getInstance().currentUser
    lateinit var binding:ActivityInfoBinding
    lateinit var user:User

    override fun onResume() {
        super.onResume()
        getUser()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setView()
    }

    fun setView(){
        getUser()
        binding = DataBindingUtil.setContentView(this,R.layout.activity_info)

        binding.changeNickT.setOnClickListener {
            startActivity(Intent(this,ChangeNicknameActivity::class.java).run {
                putExtra("user",user) })
        }

        binding.myPostT.setOnClickListener {

        }
    }

    fun getUser(){
        auth?.run {
            Repository.getUser(uid).enqueue(object : Callback<User>{
                override fun onResponse(call: Call<User>, response: Response<User>) {
                    if(response.isSuccessful && response.body() != null){
                        user = response.body()!!
                        binding.user = user
                    }
                }
                override fun onFailure(call: Call<User>, t: Throwable) {
                    Log.e("infoActivity","onFailure user")
                }
            })
        }
    }

    fun Toast(str: String) {
        android.widget.Toast.makeText(this, str, android.widget.Toast.LENGTH_SHORT).show();
    }
}