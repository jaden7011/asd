package com.example.coin_kotlin.model

import com.example.coin_kotlin.data.Candle_List
import com.example.coin_kotlin.data.Ticker_Response
import com.example.coin_kotlin.info.*
import io.reactivex.rxjava3.core.Single
import okhttp3.ResponseBody
import retrofit2.Call

object Repository {

    val ec2_URL = "http://ec2-15-165-159-175.ap-northeast-2.compute.amazonaws.com:3000"
//    val ec2_URL = "http://localhost:3000"

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

    fun setUser(id: String,
                nickname: String,
                mail: String): Call<User> {
        return RetrofitFactory
                .createRetrofit(ec2_URL)
                .create(Service::class.java)
                .setUser(id,nickname,mail)
    }

    fun getUser(id: String): Call<User> {
        return RetrofitFactory
                .createRetrofit(ec2_URL)
                .create(Service::class.java)
                .getUser(id)
    }

    fun updateNick(
        id:String,
        nickname:String
    ):Call<User>{
        return RetrofitFactory
            .createRetrofit(ec2_URL)
            .create(Service::class.java)
            .updateNick(id,nickname)
    }

    fun writePost(postid: String,
                  title: String,
                  content: String,
                  nickname: String,
                  id: String,
                  coin: String
    ): Call<Post> {
        return RetrofitFactory
                .createRetrofit(ec2_URL)
                .create(Service::class.java)
                .writePost(postid,title, content, nickname, id, coin)
    }

    fun getPostList(coin: String
    ): Call<PostList> {
        return RetrofitFactory
                .createRetrofit(ec2_URL)
                .create(Service::class.java)
                .getPostList(coin)
    }

    fun getPost(postid: String
    ): Call<Post> {
        return RetrofitFactory
            .createRetrofit(ec2_URL)
            .create(Service::class.java)
            .getpost(postid)
    }

    fun searchPostList(
            coin: String,
            keyword: String,
    ): Call<PostList> {
        return RetrofitFactory
                .createRetrofit(ec2_URL)
                .create(Service::class.java)
                .searchPostList(coin, keyword)
    }

    fun myPostList(id: String,
    ): Call<PostList> {
        return RetrofitFactory
                .createRetrofit(ec2_URL)
                .create(Service::class.java)
                .myPostList(id)
    }

    fun deletePost(
        postid:String
    ): Call<Post> {
        return RetrofitFactory
            .createRetrofit(ec2_URL)
            .create(Service::class.java)
            .deletePost(postid)
    }

    fun getCommentList(
        postid:String
    ): Call<CommentList> {
        return RetrofitFactory
            .createRetrofit(ec2_URL)
            .create(Service::class.java)
            .getCommentList(postid)
    }

    fun writeComment(
        postid: String,
        commentid: String,
        content: String,
        nickname: String,
        id:String
    ): Call<Comment> {
        return RetrofitFactory
            .createRetrofit(ec2_URL)
            .create(Service::class.java)
            .writeComment(postid, commentid, content, nickname,id)
    }

    fun plove(
        postid:String,
        id:String
    ): Call<Post> {
        return RetrofitFactory
            .createRetrofit(ec2_URL)
            .create(Service::class.java)
            .plove(postid, id)
    }

    fun clove(
        commentid: String,
        postid:String,
        id:String
    ): Call<Post> {
        return RetrofitFactory
            .createRetrofit(ec2_URL)
            .create(Service::class.java)
            .clove(commentid, postid, id)
    }

}