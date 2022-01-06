package com.example.coin_kotlin.model

import com.example.coin_kotlin.info.PostInfo
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query
import com.google.firebase.firestore.QueryDocumentSnapshot
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

object Firebase{

    val db = FirebaseFirestore.getInstance()

    interface F_listener {
        fun Completed()
        fun Completed(a:ArrayList<PostInfo>?)
        fun Completed(a:PostInfo?)
    }

    fun Get_Post(coin:String,dockey:String,listener:F_listener){

        db.collection(coin)
                .document(dockey)
                .get().addOnSuccessListener {
                    listener.Completed(it.toObject(PostInfo::class.java))
                }
    }

    fun Get_Posts(coin:String,listener:F_listener){

        val newPosts = ArrayList<PostInfo>()

        db.collection(coin)
                .orderBy("createdAt",Query.Direction.DESCENDING).whereLessThan("createdAt",Date())
                .get()
                .addOnCompleteListener {
                    if (it.isSuccessful){
                        for(doc in it.result!!){
                            val postInfo = doc.toObject(PostInfo::class.java)
                            postInfo.DateFormate_for_layout = SimpleDateFormat("yyyy/MM/dd hh:mm", Locale.getDefault()).format(postInfo.createdAt)
                            newPosts.add(postInfo)
                        }
                        listener.Completed(newPosts)
                    }
                }
    }

    fun Upload(postInfo: PostInfo,listener: F_listener){

        val doc = db.collection(postInfo.coin).document()
        postInfo.docid = doc.id

        db.collection(postInfo.coin)
                .document(postInfo.docid)
                .set(postInfo)
                .addOnCompleteListener {
                    listener.Completed()
                }
    }

}