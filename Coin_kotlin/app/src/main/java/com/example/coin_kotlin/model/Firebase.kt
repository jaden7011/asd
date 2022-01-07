package com.example.coin_kotlin.model

import com.example.coin_kotlin.info.PostInfo
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

object Firebase{

    val db = FirebaseFirestore.getInstance()

    interface Posts_Listener {
        fun Completed(a:ArrayList<PostInfo>?)
    }

    interface Post_Listener {
        fun Completed(a:PostInfo?)
    }

    interface Upload_Listener {
        fun Completed(t: Any?)
    }

    fun Get_Post(coin:String,dockey:String,listener:Post_Listener){

        db.collection(coin)
                .document(dockey)
                .get().addOnSuccessListener {
                    listener.Completed(it.toObject(PostInfo::class.java))
                }
    }

    fun Get_Posts(coin:String,listener: Posts_Listener){
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

    fun Upload(postInfo: PostInfo,listener: Upload_Listener){

        val doc = db.collection(postInfo.coin).document()
        postInfo.docid = doc.id

        db.collection(postInfo.coin)
                .document(postInfo.docid)
                .set(postInfo)
                .addOnCompleteListener {
                    listener.Completed(null)
                }
    }

}