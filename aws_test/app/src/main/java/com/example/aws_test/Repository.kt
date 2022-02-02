package com.example.aws_test

import retrofit2.Call

object Repository {

//    val BASE_URL = "http://ec2-54-152-88-36.compute-1.amazonaws.com:3000"
    val test_URL = "http://localhost:3000"

    fun save_User(id:String,nick:String,pass:String) : Call<User>{
        return Factory
            .createRetrofit(test_URL)
            .create(Service::class.java)
            .saveUser(id,nick,pass)
    }
}