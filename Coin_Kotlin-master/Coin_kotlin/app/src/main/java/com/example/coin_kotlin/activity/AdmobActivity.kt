package com.example.coin_kotlin.activity

import android.app.Application
import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.Window
import androidx.core.app.ActivityCompat
import androidx.databinding.DataBindingUtil
import com.example.coin_kotlin.R
import com.example.coin_kotlin.admob.AppOpenAdManager
import com.example.coin_kotlin.admob.MyApplication
import com.example.coin_kotlin.databinding.ActivityAdmobBinding
import com.google.android.gms.ads.FullScreenContentCallback
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.initialization.InitializationStatus
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener

class AdmobActivity : AppCompatActivity() {

    lateinit var binding: ActivityAdmobBinding
    var isAdShown = false
    var isAdDismissed = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setView()
    }

    fun setView() {
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

    fun loadResources() {
        val timer = object : CountDownTimer(1500L, 1000L) {
            override fun onTick(p0: Long) {}
            override fun onFinish() {
                if (!isAdShown)
                    launchMainActivity()
            }
        }
        timer.start()
    }

    fun launchMainActivity() {
        startActivity(Intent(this, Login::class.java))
        finish()
    }

}