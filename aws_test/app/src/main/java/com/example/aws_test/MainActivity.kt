package com.example.aws_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.aws_test.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.btn.setOnClickListener {
            val id = binding.idET.text.toString()
            val nick = binding.nickET.text.toString()
            val pass = binding.passET.text.toString()

            Repository.save_User(id,nick,pass).enqueue(object : Callback<User>{
                override fun onResponse(call: Call<User>, response: Response<User>) {
                    if(response.isSuccessful && response.body() != null){
                        Toast("success")
                    }
                }

                override fun onFailure(call: Call<User>, t: Throwable) {
                    Toast("onFailure")
                }
            })
        }
    }

    fun Toast(str:String){
        Toast.makeText(this,str,Toast.LENGTH_SHORT).show()
    }
}