package com.example.aws_test

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface Service {
    @FormUrlEncoded
    @POST("/user/join")
    fun saveUser(
        @Field("id") Id: String,
        @Field("nickname") userPassword: String,
        @Field("password") password: String
    ): Call<User>

}