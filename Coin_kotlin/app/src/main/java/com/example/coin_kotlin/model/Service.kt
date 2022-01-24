package com.example.coin_kotlin.model

import com.example.coin_kotlin.data.Candle_List
import com.example.coin_kotlin.data.Ticker_Response
import com.example.coin_kotlin.data.Transaction_List_Response
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Single
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.http.Streaming

interface Service {

    @GET("public/transaction_history/{path}_KRW")
    fun TRANSACTION_LIST_SINGLE(
        @Path("path") path: String,
        @Query("count") count: Int
    ): Single<Transaction_List_Response> // ?count={count}를 나타냄 -> 원하는 리스트 갯수요청


    @GET("public/transaction_history/{path}_KRW")
    fun TRANSACTION_LIST_OBS(
        @Path("path") path: String,
        @Query("count") count: Int
    ): Observable<Transaction_List_Response> // ?count={count}를 나타냄 -> 원하는 리스트 갯수요청


    @GET("public/ticker/{path}_KRW")
    fun TICKER_SINGLE(
        @Path("path") path: String
    ): Single<Ticker_Response>

    @GET("public/ticker/{path}_KRW")
    fun TICKER_OBS(
        @Path("path") path: String
    ): Observable<Ticker_Response>

    @GET("public/candlestick/{path}_KRW/24h")
    fun CANDLE_LIST_SINGLE(
        @Path("path") path: String
    ): Single<Candle_List>

    @GET("api/icon/{coin_name}")
    @Streaming
    fun downloadImage(
            @Path("coin_name") coin_name:String
    ): Call<ResponseBody>

}