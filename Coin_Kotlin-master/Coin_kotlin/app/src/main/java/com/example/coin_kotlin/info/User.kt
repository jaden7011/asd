package com.example.coin_kotlin.info

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class User(
        @SerializedName("id") @Expose
        val id:String,
        @SerializedName("nickname") @Expose
        val nickname:String,
        @SerializedName("mail") @Expose
        val mail:String,
        @SerializedName("msg") @Expose
        val msg:String,
        @SerializedName("result") @Expose
        val result:Boolean
)
