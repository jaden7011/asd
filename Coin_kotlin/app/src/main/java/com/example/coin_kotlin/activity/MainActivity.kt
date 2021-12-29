package com.example.coin_kotlin.activity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.coin_kotlin.R
import com.example.coin_kotlin.data.Candle
import com.example.coin_kotlin.databinding.ActivityMainBinding
import io.reactivex.rxjava3.disposables.Disposable

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding;
    private lateinit var ET_Observable_Disposable: Disposable;
    private lateinit var liveData_tickerMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    internal class NetworkThread private constructor(private val search_ET: String) :
        Thread() {
        private val isRunning = true
        override fun run() {
            while (isRunning) {
                try {
                    Log.d("NetworkThread", "running")
                    liveData_tickerMap.Get_API(search_ET)
                    sleep(5000)
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
            }
        }

    }

}