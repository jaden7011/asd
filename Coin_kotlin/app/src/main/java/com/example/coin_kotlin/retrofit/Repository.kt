package com.example.coin_kotlin.retrofit

import com.example.coin_kotlin.data.Candle_List
import com.example.coin_kotlin.data.Ticker_Response
import io.reactivex.rxjava3.core.Single

object Repository {

    fun get_CandleList_Single(path:String) : Single<Candle_List>?{
        return RetrofitFactory
            .createRetrofit("https://api.bithumb.com/")
            ?.create(Service::class.java)
            ?.CANDLE_LIST_SINGLE(path)
    }

    fun get_Ticker(path: String): Single<Ticker_Response>?{
        return RetrofitFactory
            .createRetrofit("https://api.bithumb.com/")
            ?.create(Service::class.java)
            ?.TICKER_SINGLE(path)
    }

}