package com.example.coin_kotlin.model

import android.app.Activity
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.coin_kotlin.adapter.Coin_Adapter
import com.example.coin_kotlin.data.Ticker
import com.example.coin_kotlin.data.Ticker_Response
import com.example.coin_kotlin.databinding.ActivityMainBinding
import com.example.coin_kotlin.retrofit.Repository
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.disposables.Disposable

class MutableLiveData_TickerMap(
    var observable: Single<Ticker_Response> = Repository.get_Ticker("ALL"),
    private val coins: MutableLiveData<Map<String, Ticker>>,
    private val liveData_tickerMap: MutableLiveData_TickerMap,
    private val activity: Activity,
    private val binding: ActivityMainBinding,
    private val adapter: Coin_Adapter
):ViewModel(){
    lateinit var disposable: Disposable

}