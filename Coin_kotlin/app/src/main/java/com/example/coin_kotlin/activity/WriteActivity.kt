package com.example.coin_kotlin.activity

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.coin_kotlin.R
import com.example.coin_kotlin.databinding.ActivityWriteBinding
import com.example.coin_kotlin.info.CommentInfo
import com.example.coin_kotlin.info.PostInfo
import com.example.coin_kotlin.model.Firebase
import com.google.firebase.firestore.FirebaseFirestore
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
        Firebase.Upload(PostInfo(
            coin_name,
            binding.titleEdit.text.toString(),
            binding.publisherET.text.toString(),
            binding.contentEdit.text.toString(),
            FirebaseFirestore.getInstance().collection(coin_name).document().id,
            Date(),
            0, 0,
            HashMap<String, Int>(),
            ArrayList<CommentInfo>(),
            null,
            null,
            binding.passET.text.toString()
        ), object : Firebase.Upload_Listener {
            override fun Completed(t: Any?) {
                binding.writeLoadingview.loaderLyaout.visibility = View.GONE
                finish()
            }
        })
    }

    override fun onBackPressed() {
        // 마지막으로 뒤로가기 버튼을 눌렀던 시간 저장

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