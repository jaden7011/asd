package com.example.coin_kotlin.info

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

@Parcelize
data class PostInfo(
        val coin:String,
        val title:String,
        val publisher:String,
        val content:String,
        var docid:String,
        val createdAt:Date,
        val good:Int,
        val comment:Int,
        val good_user:HashMap<String,Int>,
        val comments:ArrayList<CommentInfo>,
        var DateFormate_for_layout:String,
        var How_Long:String,
        val password:String
):Parcelable