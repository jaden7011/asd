package com.example.coin_kotlin.model

import com.example.coin_kotlin.data.Candle_List
import com.example.coin_kotlin.data.Ticker_Response
import io.reactivex.rxjava3.core.Single
import okhttp3.ResponseBody
import retrofit2.Call

object Repository {

    fun get_CandleList_Single(path:String) : Single<Candle_List>{
        return RetrofitFactory
            .createRetrofit("https://api.bithumb.com/")
            .create(Service::class.java)
            .CANDLE_LIST_SINGLE(path)
    }

    fun get_Ticker(path: String): Single<Ticker_Response>{
        return RetrofitFactory
            .createRetrofit("https://api.bithumb.com/")
            .create(Service::class.java)
            .TICKER_SINGLE(path)
    }

    fun get_CoinImage(coin_name:String) : Call<ResponseBody>{
        return RetrofitFactory
                .createRetrofit("https://cryptoicon-api.vercel.app/")
                .create(Service::class.java)
                .downloadImage(coin_name)
    }

}