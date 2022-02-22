package com.example.coin_kotlin.model

import com.example.coin_kotlin.data.Candle_List
import com.example.coin_kotlin.data.Ticker_Response
import com.example.coin_kotlin.data.Transaction_List_Response
import com.example.coin_kotlin.info.*
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Single
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.*
import java.sql.Date

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

    //이 아래로는 mysql db
    @FormUrlEncoded
    @POST("/user/join")
    fun setUser(
            @Field("id") Id: String,
            @Field("nickname") nickname: String,
            @Field("mail") mail: String
    ): Call<User>

    @FormUrlEncoded
    @POST("/user/info")
    fun getUser(
            @Field("id") Id: String
    ): Call<User>

    @FormUrlEncoded
    @POST("/user/update")
    fun updateNick(
            @Field("id") Id: String,
            @Field("nickname") nickname: String
    ): Call<User>

    @FormUrlEncoded
    @POST("/post/write")
    fun writePost(
            @Field("postid") postid: String,
            @Field("title") title: String,
            @Field("content") content: String,
            @Field("nickname") nickname: String,
            @Field("id") id: String,
            @Field("coin") coin: String
    ): Call<Post>

    @FormUrlEncoded
    @POST("/post/getlist")
    fun getPostList(
            @Field("coin") coin: String,
    ): Call<PostList>

    @FormUrlEncoded
    @POST("/post/search")
    fun searchPostList(
            @Field("coin") coin: String,
            @Field("keyword") keyword: String,
    ): Call<PostList>

    @FormUrlEncoded
    @POST("/post/mypost")
    fun myPostList(
            @Field("id") id: String
    ): Call<PostList>

    @FormUrlEncoded
    @POST("/post")
    fun getpost(
        @Field("postid") postid: String
    ): Call<Post>

    @FormUrlEncoded
    @POST("/post/delete")
    fun deletePost(
            @Field("postid") postid: String
    ): Call<Post>

    @FormUrlEncoded
    @POST("/comment/getlist")
    fun getCommentList( //postid로 해당 게시글의 comment를 전부 가져옴
            @Field("postid") postid: String
    ): Call<CommentList>

    @FormUrlEncoded
    @POST("/comment/write")
    fun writeComment( //postid로 해당 게시글의 comment를 전부 가져옴
            @Field("postid") postid: String,
            @Field("commentid") commentid: String,
            @Field("content") content: String,
            @Field("nickname") nickname: String,
            @Field("id") id:String
    ): Call<Comment>

    @FormUrlEncoded
    @POST("/post/love")
    fun plove(
        @Field("postid") postid: String,
        @Field("id") id: String,
    ): Call<Post>

    @FormUrlEncoded
    @POST("/comment/love")
    fun clove(
        @Field("commentid") commentid: String,
        @Field("postid") postid: String,
        @Field("id") id: String
    ): Call<Post>


}