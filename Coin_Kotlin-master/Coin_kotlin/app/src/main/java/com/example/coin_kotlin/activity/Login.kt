package com.example.coin_kotlin.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.coin_kotlin.R
import com.example.coin_kotlin.databinding.ActivityLoginBinding
import com.example.coin_kotlin.model.PreferenceManager
import com.example.coin_kotlin.model.Repository
import com.example.coin_kotlin.utility.NetworkStatus
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.GoogleAuthProvider
import kotlinx.coroutines.*

class Login : AppCompatActivity() {

    companion object {
        private const val TAG = "LoginActivity"
        private const val RC_SIGN_IN = 9001
    }

    val auth = FirebaseAuth.getInstance()
    lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        setView()
    }

    @SuppressLint("SetTextI18n")
    private fun setView() {
//        (binding.loginBtn.getChildAt(0) as TextView).text = "Google 로그인"
        binding.loginBtn.setOnClickListener {
            Log.e("onclick login", "")
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
                    for (i in 0..1)
                        tag += uid[i]
                    PreferenceManager.setString(this,"id",uid)
                    getSetUser(uid, "$nickname (#$tag)", mail)
                } else {
                    Log.e(TAG, "signInWithCredential: failure: " + task.result)
                }
            }
    }

    override fun onStart() {
        super.onStart()
        //todo 자동로그인 시에도 토큰 확인하자
        auth.currentUser?.let {
            getSetUser(it.uid,it.displayName?:"익명",it.email?:"이메일없음")
        }
    }

    private fun logout() {
        val opt = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).build()
        val client = GoogleSignIn.getClient(this, opt)
        client.signOut()
    }

    private fun startActivity() {
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }

    fun getSetUser(
        id: String,
        nickname: String,
        mail: String
    ) {
        checkNetWork()

        CoroutineScope(Dispatchers.Main).launch {
            try {
                val user = Repository.getUser(id)
                val token = getToken()
                val dbToken = user.token
                val result = user.result
                Log.e(TAG,"userToken: $dbToken , preferToken: $token")

                if(result){//이미 가입된 정보가 있는 경우
                    if(dbToken != token) { //다른 기기로 접속해서 아이디는 있으나 토큰이 새로 들어온 경우 토큰이 다를 때
                        Log.e(TAG,"token different")
                        val apply = Repository.updateToken(id,token)
                        Toast(apply.msg)
                        startActivity()
                    }else{
                        Log.e(TAG,"token same")
                        startActivity()
                    }
                }else{
                    Log.e(TAG,"first login")
                    val apply = Repository.setUser(id, nickname, mail, token)
                    Toast(apply.msg)
                    startActivity()
                }
            }catch (e:Exception){
                Log.e(TAG, "onStart in failed: " + e.message)
                Toast("로그인에 실패했습니다.")
            }
        }
    }

    fun getToken(): String{
        val token = PreferenceManager.getString(this,"fcmToken")
        return if(token.isNullOrEmpty())
            ""
        else{
            token
        }
    }

    fun Toast(str: String) {
        android.widget.Toast.makeText(this, str, android.widget.Toast.LENGTH_SHORT).show();
    }

    fun checkNetWork() {
        if (!NetworkStatus.isConnected(this)) {
            Log.e("main_network", "network is disconnected")
            this.run {
                Handler(Looper.getMainLooper()).postDelayed({ Toast("인터넷 연결이 되어있지 않습니다.") }, 0)
            }
            return
        }
    }

}