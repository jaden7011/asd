package com.example.coin_kotlin.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.coin_kotlin.data.Candle
import com.example.coin_kotlin.info.PostInfo
import com.example.coin_kotlin.model.Firebase
import com.example.coin_kotlin.model.Repository
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.functions.Consumer
import io.reactivex.rxjava3.schedulers.Schedulers

class LiveData_PostInfo:ViewModel() {

    val posts: MutableLiveData<PostInfo> by lazy {
        MutableLiveData<PostInfo>()
    }

    fun Get_Candle_Posts(coin:String){

       Repository.get_CandleList_Single(coin)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(Consumer {
                    val candles = ArrayList<Candle>()

                    for(x in it.data){
                        candles.add(Candle(
                                it.data[0],
                                it.data[1],
                                it.data[2],
                                it.data[3],
                                it.data[4],
                                it.data[5]
                        ))
                    }

                })
    }

}