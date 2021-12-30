package com.example.coin_kotlin.info

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.util.*
import kotlin.collections.HashMap

@Parcelize
data class CommentInfo(
        val contents:String,
        val publisher:String,
        val createdAt:Date,
        val good:Int,
        val good_user:HashMap<String,Int>,
        val DateFormate_for_layout:String,
        val How_Long:String,
        val password:String,
        val key:String
):Parcelable