package com.example.coin_kotlin.activity

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.ActionBar
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.coin_kotlin.R
import com.example.coin_kotlin.data.Ticker
import com.example.coin_kotlin.databinding.ActivityAlarmBinding
import com.example.coin_kotlin.info.Alarm
import com.example.coin_kotlin.model.PreferenceManager
import com.example.coin_kotlin.model.Repository
import com.example.coin_kotlin.viewmodel.LiveData_Alarms
import com.example.coin_kotlin.viewmodel.LiveData_Posts
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.functions.Consumer
import io.reactivex.rxjava3.schedulers.Schedulers
import java.math.BigDecimal

class AlarmActivity : AppCompatActivity() {

    lateinit var binding: ActivityAlarmBinding
    private lateinit var toolbar: Toolbar
    val coin_name: String by lazy {
        intent.extras?.getString("coin_name")!!
    }
    val id: String by lazy {
        intent.extras?.getString("id")!!
    }
    private val TAG = "Alarm Act"
    private val activity = this
    lateinit var liveDate_alarm: LiveData_Alarms

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setView()
    }

    @SuppressLint("SetTextI18n", "NotifyDataSetChanged")
    fun setView() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_alarm)
        Toolbar()
        getTicker()

        liveDate_alarm =
            ViewModelProvider(this, LiveData_Alarms.Factory(this))[LiveData_Alarms::class.java]
        liveDate_alarm.run {
            onCreate()
            getAlarms(id,coin_name)
        }
        liveDate_alarm.alarms.observe(this, Observer {
            liveDate_alarm.adapter.alarms = it
            liveDate_alarm.adapter.notifyDataSetChanged()
        })

        binding.upBtn.setOnClickListener {
            var price = binding.alarmPriceET.text.toString().toDouble()
            price += price * 0.03
            binding.alarmPriceET.setText(String.format("%.2f", price))
        }

        binding.downBtn.setOnClickListener {
            var price = binding.alarmPriceET.text.toString().toDouble()
            price -= price * 0.03
            binding.alarmPriceET.setText(String.format("%.2f", price))
        }

        binding.addBtn.setOnClickListener {
            val price = binding.alarmPriceET.text.toString()
            val token = PreferenceManager.getString(this,"fcmToken")
            liveDate_alarm.addAlarm(price,id,coin_name,token!!)
        }

        binding.resetBtn.setOnClickListener {
            getTicker()
            liveDate_alarm.getAlarms(id,coin_name)
        }
    }

    @SuppressLint("SetTextI18n")
    fun getTicker() {
        Repository.get_Ticker(coin_name)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .doOnError {
                Log.e(TAG, "" + it.message)
            }
            .subscribe(Consumer {
                if (it.data.isNotEmpty()) {
                    val closing_price = it.data["closing_price"]
                    val rate_24H = it.data["fluctate_rate_24H"]

                    Log.e(TAG, "${it.data["closing_price"]}")

                    binding.priceT.run {
                        text = closing_price.toString()
                        if (rate_24H.toString().toDouble() < 0) {
                            setTextColor(ContextCompat.getColor(activity, R.color.darger_blue))
                        } else
                            setTextColor(ContextCompat.getColor(activity, R.color.colorAccent))
                    }
                    binding.rateT.run {
                        text = rate_24H.toString() + "%"

                        if (rate_24H.toString().toDouble() < 0) {
                            setTextColor(ContextCompat.getColor(activity, R.color.darger_blue))
                        } else
                            setTextColor(ContextCompat.getColor(activity, R.color.colorAccent))
                    }
                    binding.alarmPriceET.setText(closing_price.toString())
                }
            })
    }

    fun Toolbar() {
        toolbar = findViewById(R.id.toolbar_alarm)
        setSupportActionBar(toolbar)
        val actionBar: ActionBar? = supportActionBar
        actionBar?.run {
            setDisplayShowCustomEnabled(true)
            setDisplayShowTitleEnabled(false)
            setDisplayHomeAsUpEnabled(false)
            setHomeButtonEnabled(false)
        }

        toolbar.title = "알림설정"
        toolbar.titleMarginStart = 3
        toolbar.setTitleTextColor(Color.WHITE)
    }

    fun Toast(str: String) {
        android.widget.Toast.makeText(this, str, android.widget.Toast.LENGTH_SHORT).show();
    }
}
