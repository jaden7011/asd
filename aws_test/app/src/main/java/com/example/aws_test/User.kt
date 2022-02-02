package com.example.aws_test

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("id") @Expose
    val id: String,

    @SerializedName("nickname")
    val nick: String?,

    @SerializedName("password")
    val password: String?
)
