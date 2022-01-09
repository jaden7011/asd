package com.example.coin_kotlin.info

import android.os.Parcelable
import com.google.firebase.firestore.IgnoreExtraProperties
import com.google.firebase.firestore.PropertyName
import kotlinx.android.parcel.Parcelize
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

@IgnoreExtraProperties
@Parcelize
data class PostInfo(
        @PropertyName("coin") val coin:String,
        @PropertyName("title") val title:String,
        @PropertyName("publisher")  val publisher:String,
        @PropertyName("content")  val content:String,
        @PropertyName("docid")  var docid:String,
        @PropertyName("createdAt")  val createdAt:Date?,
        @PropertyName("good")  val good:Int,
        @PropertyName("comment")  var comment:Int,
        @PropertyName("good_user") val good_user:HashMap<String,Int>,
        @PropertyName("comments") var comments:ArrayList<CommentInfo>,
        @PropertyName("dateFormate_for_layout") var dateFormate_for_layout:String?,
        @PropertyName("how_Long") var how_Long:String?,
        @PropertyName("password")  val password:String
):Parcelable{
        constructor()
                : this("","","","","",null,
        0,0,HashMap<String,Int>(),ArrayList<CommentInfo>(),null,null,"")
}