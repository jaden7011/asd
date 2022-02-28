package com.example.coin_kotlin.activity

import android.app.Application
import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.view.Window
import androidx.core.app.ActivityCompat
import androidx.databinding.DataBindingUtil
import com.example.coin_kotlin.R
import com.example.coin_kotlin.admob.AppOpenAdManager
import com.example.coin_kotlin.admob.MyApplication
import com.example.coin_kotlin.databinding.ActivityAdmobBinding
import com.example.coin_kotlin.model.PreferenceManager
import com.google.android.gms.ads.FullScreenContentCallback
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.initialization.InitializationStatus
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.messaging.FirebaseMessaging

class AdmobActivity : AppCompatActivity() {

    lateinit var binding: ActivityAdmobBinding
    var isAdShown = false
    var isAdDismissed = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getFcm()
    }

    private fun setView() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_admob)
        (application as MyApplication).getAdManager()
//            .showAdIfAvailable()
            .showAdIfAvailable(object : FullScreenContentCallback() {
            override fun onAdDismissedFullScreenContent() {
                isAdDismissed = true
                launchMainActivity()
            }
            override fun onAdShowedFullScreenContent() {
                isAdShown = true
            }
        })
        loadResources()
    }

    private fun loadResources() {
        val timer = object : CountDownTimer(1500L, 1000L) {
            override fun onTick(p0: Long) {}
            override fun onFinish() {
                if (!isAdShown)
                    launchMainActivity()
            }
        }
        timer.start()
    }

    private fun getFcm(){
        FirebaseMessaging.getInstance().token.addOnCompleteListener(OnCompleteListener { task ->
            if (!task.isSuccessful) {
                return@OnCompleteListener
            }

            // Get new FCM registration token
            val token = task.result
            Log.e("getFcm","token: $token")
            saveToken(token)
            setView()
        })
    }

    private fun saveToken(newToken: String){
        val originToken = PreferenceManager.getString(this,"fcmToken")

        if(originToken != newToken)
            PreferenceManager.setString(this,"fcmToken",newToken)
    }

    fun launchMainActivity() {
        startActivity(Intent(this, Login::class.java))
        finish()
    }

}