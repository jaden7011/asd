package com.example.coin_kotlin.activity

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.coin_kotlin.databinding.ActivityWriteBinding
import com.example.coin_kotlin.info.Post
import com.example.coin_kotlin.model.Repository
import com.google.firebase.auth.FirebaseAuth
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*

class WriteActivity : AppCompatActivity() {

    private var backKeyPressedTime: Long = 0
    private val coin_name: String by lazy {
        intent.extras?.getString("coin_name")!!
    }
    private lateinit var binding: ActivityWriteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWriteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.writeToolbar.postBtn.setOnClickListener {
            binding.writeLoadingview.loaderLyaout.visibility = View.VISIBLE
            upload()
        }
    }

    fun upload() {
        val user = FirebaseAuth.getInstance().currentUser!!
        val id = user.uid
        val postid = Date().time.toString() + id
        val title = binding.titleEdit.text.toString()
        val content = binding.contentEdit.text.toString()

        Repository.writePost(postid,title,content,user.displayName!!,id,coin_name)
                .enqueue(object : Callback<Post> {
                    override fun onResponse(call: Call<Post>, response: Response<Post>) {
                        if(response.body()!!.result){
                            Toast(response.body()!!.msg)
                            finish()
                        }
                    }
                    override fun onFailure(call: Call<Post>, t: Throwable) {
                        Log.e("writePost","err: " + t.message)
                        binding.writeLoadingview.loaderLyaout.visibility = View.GONE
                    }
                })
    }

    override fun onBackPressed() {
        // 마지막으로 뒤로가기 버튼을 눌렀던 시간 저장
        if (System.currentTimeMillis() > backKeyPressedTime + 1500) {
            backKeyPressedTime = System.currentTimeMillis()
            Toast("\'뒤로\' 버튼을 한번 더 누르시면 \'글쓰기\'가 종료됩니다.")
            return
        }
        if (System.currentTimeMillis() <= backKeyPressedTime + 1500) {
            //아래 3줄은 프로세스 종료
            finish()
        }
    }

    fun Toast(str: String) {
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }
}