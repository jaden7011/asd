package com.example.coin_kotlin.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.coin_kotlin.R
import com.example.coin_kotlin.databinding.ActivityLoginBinding
import com.example.coin_kotlin.info.User
import com.example.coin_kotlin.model.Repository
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.GoogleAuthProvider
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Login : AppCompatActivity() {

    companion object {
        private const val TAG = "LoginActivity"
        private const val RC_SIGN_IN = 9001
    }

    val auth = FirebaseAuth.getInstance()
    lateinit var binding:ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)

        setView()
    }

    @SuppressLint("SetTextI18n")
    private fun setView(){
//        (binding.loginBtn.getChildAt(0) as TextView).text = "Google 로그인"
        binding.loginBtn.setOnClickListener {
            Log.e("onclick login","")
            signIn()
        }

        binding.outBtn.setOnClickListener {
//            logout()
            startActivity()
        }
    }

    private fun signIn() {
        // Configure Google Sign In
        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken("900857055162-5110niio0f1b612kc0bgrlt34tdpg7c4.apps.googleusercontent.com")
                .requestEmail()
                .build()

        val signInIntent = GoogleSignIn.getClient(this, gso).signInIntent
        startActivityForResult(signInIntent, RC_SIGN_IN)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        // Result returned from launching the Intent from GoogleSignInApi.getSignInIntent(...);
        if (requestCode == RC_SIGN_IN) {
            val task = GoogleSignIn.getSignedInAccountFromIntent(data)
            try {
                // Google Sign In was successful, authenticate with Firebase
                val account = task.getResult(ApiException::class.java)!!
                Log.e(TAG, "firebaseAuthWithGoogle success:" + account.id)
                firebaseAuthWithGoogle(account.idToken!!)
            } catch (e: ApiException) {
                // Google Sign In failed, update UI appropriately
                Log.e(TAG, "Google sign in failed: " + e.message)
                Toast("로그인에 실패했습니다.")
            }
        }
    }

    private fun firebaseAuthWithGoogle(idToken: String) {
        val credential = GoogleAuthProvider.getCredential(idToken, null)
        auth.signInWithCredential(credential)
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        Log.e(TAG, "signInWithCredential: success")
                        val user = auth.currentUser
                        val uid = user?.uid ?: "non_uid"
                        val nickname = user?.displayName ?: "non_name"
                        val mail = user?.email ?: "non_email"

                        var tag = ""
                        for(i in 0..1)
                            tag += uid[i]

                        setUser(uid, "$nickname (#$tag)", mail)
                    } else {
                        Log.e(TAG, "signInWithCredential: failure: " + task.result)
                    }
                }
    }

    override fun onStart() {
        super.onStart()
        auth.uid?.let { Repository.getUser(it).enqueue(object : Callback<User>{
            override fun onResponse(call: Call<User>, response: Response<User>) {
                if(response.isSuccessful && response.body() != null){
                    if(response.body()!!.result){
                        startActivity()
                    }
                }
            }
            override fun onFailure(call: Call<User>, t: Throwable) {
                Log.e(TAG, "onStart in failed: " + t.message)
                Toast("로그인에 실패했습니다.")
            }

        }) }
    }

    private fun logout(){
        val opt = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).build()
        val client = GoogleSignIn.getClient(this, opt)
        client.signOut()
    }

    private fun startActivity(){
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        startActivity(Intent(this, MainActivity::class.java))
    }

    fun setUser(
             id:String,
             nickname:String,
             mail:String
    ){
        Repository.getUser(id).enqueue(object : Callback<User>{
            override fun onResponse(call: Call<User>, response: Response<User>) {
                if(response.isSuccessful && response.body() != null){
                    Toast(response.body()?.msg?:"non_msg")
                    if(response.body()!!.result){ //이미 가입된 정보가 있는 경우 그냥 패쓰
                        startActivity()
                    }else{// 처음이라면 db에 정보 입력
                        Repository.setUser(id,nickname,mail).enqueue(object : Callback<User> {
                            override fun onResponse(call: Call<User>, response: Response<User>) {
                                if(response.isSuccessful && response.body() != null){
                                    if(response.body()!!.result){
                                        Toast("success")
                                        startActivity()
                                    }else{
                                        Toast("로그인에 실패하였습니다.")
                                    }
                                }
                            }
                            override fun onFailure(call: Call<User>, t: Throwable) {
                                Log.e("onFailure","onFailure: "+t.message)
                                Toast("onFailure")
                            }
                        })
                    }
                }
            }
            override fun onFailure(call: Call<User>, t: Throwable) {
                Log.e("onFailure","onFailure: "+t.message)
            }
        })
    }

    fun Toast(str: String) {
        android.widget.Toast.makeText(this, str, android.widget.Toast.LENGTH_SHORT).show();
    }

}