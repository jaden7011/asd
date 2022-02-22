package com.example.coin_kotlin.infoactivity

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.coin_kotlin.R
import com.example.coin_kotlin.activity.Login
import com.example.coin_kotlin.databinding.ActivityInfoBinding
import com.example.coin_kotlin.info.User
import com.example.coin_kotlin.model.Repository
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.ktx.Firebase
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class InfoActivity : AppCompatActivity() {

    private val auth = FirebaseAuth.getInstance().currentUser
    lateinit var binding: ActivityInfoBinding
    lateinit var user: User

    override fun onResume() {
        super.onResume()
        getUser()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setView()
    }

    private fun setView() {
        getUser()
        binding = DataBindingUtil.setContentView(this, R.layout.activity_info)

        binding.changeNickT.setOnClickListener {
            startActivity(Intent(this, ChangeNicknameActivity::class.java).run {
                putExtra("user", user)
            })
        }

        binding.myPostT.setOnClickListener {

        }

        binding.withdraw.setOnClickListener {
            withdrawDialog()
        }
    }

    private fun withdrawDialog() {
        val dialog = AlertDialog.Builder(this, android.R.style.Theme_DeviceDefault_Dialog)

        dialog.setMessage("회원탈퇴를 하시겠습니까?\n\n\'사용자의 정보\'와 \'결제내역\'이 모두 삭제됩니다. \n또한,\'작성글\'과 \'댓글\'의 내용은 남아있게 됩니다.")
            .setPositiveButton("탈퇴") { _, _ ->
                withdraw()
            }
            .setNeutralButton("아니오") { _, _ ->
            }
            .show()
    }

    fun withdraw() {
        val user = FirebaseAuth.getInstance().currentUser!!
        val id = user.uid
        val opt = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).build()
        val client = GoogleSignIn.getClient(this, opt)

        user.delete().addOnCompleteListener {
            if (it.isSuccessful) {
                client.signOut().addOnCompleteListener {
                    Repository.delUser(id).enqueue(object : Callback<User> {
                        override fun onResponse(call: Call<User>, response: Response<User>) {
                            if (response.isSuccessful) {
                                response.body()?.msg?.let { it1 ->
                                    Toast(it1)
                                    loginActivity()
                                }
                            }
                        }

                        override fun onFailure(call: Call<User>, t: Throwable) {
                            Log.e("InfoActi", "fail withdraw:" + t.message)
                        }

                    })
                }
            } else {
                Toast("실패")
            }
        }
    }

    private fun getUser() {
        auth?.run {
            Repository.getUser(uid).enqueue(object : Callback<User> {
                override fun onResponse(call: Call<User>, response: Response<User>) {
                    if (response.isSuccessful && response.body() != null) {
                        user = response.body()!!
                        binding.user = user
                    }
                }

                override fun onFailure(call: Call<User>, t: Throwable) {
                    Log.e("infoActivity", "onFailure user")
                }
            })
        }
    }

    fun loginActivity() {
        startActivity(Intent(this, Login::class.java).run {
            addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        })
    }

    fun Toast(str: String) {
        android.widget.Toast.makeText(this, str, android.widget.Toast.LENGTH_SHORT).show();
    }
}