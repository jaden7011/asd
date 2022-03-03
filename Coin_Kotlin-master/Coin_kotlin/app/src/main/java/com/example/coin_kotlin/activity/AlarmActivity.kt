package com.example.coin_kotlin.activity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import com.example.coin_kotlin.R
import com.example.coin_kotlin.data.Ticker
import com.example.coin_kotlin.databinding.ActivityAlarmBinding
import com.example.coin_kotlin.info.Alarm
import com.example.coin_kotlin.model.Repository
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.functions.Consumer
import io.reactivex.rxjava3.schedulers.Schedulers
import java.math.BigDecimal

class AlarmActivity : AppCompatActivity() {

    lateinit var binding: ActivityAlarmBinding
    val coin_name: String by lazy {
        intent.extras?.getString("coin_name")!!
    }
    private val TAG = "Alarm Act"
    private val activity = this
    var alarms = ArrayList<Alarm>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setView()
    }

    @SuppressLint("SetTextI18n")
    fun setView() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_alarm)

        getTicker()

        binding.upBtn.setOnClickListener {
            var price = binding.alarmPriceET.text.toString().toDouble()
            price += price*0.03
            binding.alarmPriceET.setText(String.format("%.2f",price))
        }

        binding.downBtn.setOnClickListener {
            var price = binding.alarmPriceET.text.toString().toDouble()
            price -= price*0.03
            binding.alarmPriceET.setText(String.format("%.2f",price))
        }

        binding.addBtn.setOnClickListener {

        }

        binding.resetBtn.setOnClickListener {
            getTicker()
        }

    }

    @SuppressLint("SetTextI18n")
    fun getTicker(){

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
                        if(rate_24H.toString().toDouble() < 0){
                            setTextColor(ContextCompat.getColor(activity,R.color.darger_blue))
                        }else
                            setTextColor(ContextCompat.getColor(activity,R.color.colorAccent))
                    }
                    binding.rateT.run {
                        text = rate_24H.toString()+"%"

                        if(rate_24H.toString().toDouble() < 0){
                            setTextColor(ContextCompat.getColor(activity,R.color.darger_blue))
                        }else
                            setTextColor(ContextCompat.getColor(activity,R.color.colorAccent))
                    }
                    binding.alarmPriceET.setText(closing_price.toString())
                }
            })
    }
}