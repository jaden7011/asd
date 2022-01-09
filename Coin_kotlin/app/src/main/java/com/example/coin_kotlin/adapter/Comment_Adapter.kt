package com.example.coin_kotlin.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.coin_kotlin.R
import com.example.coin_kotlin.info.CommentInfo
import com.example.coin_kotlin.info.PostInfo
import com.example.coin_kotlin.utility.CommentInfo_DiffUtil

class Comment_Adapter(
    val activity: Activity,
    val postInfo: PostInfo,
    val comments: ArrayList<CommentInfo>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    fun CommentInfo_DiffUtil(NewPost:PostInfo){

        val diffCalback = CommentInfo_DiffUtil(this.postInfo,NewPost)
        val diffRes = DiffUtil.calculateDiff(diffCalback)

        this.comments.clear()
        this.comments.addAll(NewPost.comments)

        diffRes.dispatchUpdatesTo(this)
    }

    inner class CommentHolder(val view:View) : RecyclerView.ViewHolder(view) {

        val contentT:TextView = itemView.findViewById(R.id.comment_commentT)
        val dateT:TextView = itemView.findViewById(R.id.date_commentT)
        val nicknameT:TextView = itemView.findViewById(R.id.nickname_commentT)
        val goodnum:TextView = itemView.findViewById(R.id.goodNum_commentT)
        val option_btn:ImageButton = itemView.findViewById(R.id.opt_comment)
        val commentbody_good:ImageButton = itemView.findViewById(R.id.good_btn_Frame)
        val goodNum_Layout:LinearLayout = itemView.findViewById(R.id.comment_GoodLayout)

        fun bind(item:CommentInfo){
            contentT.text = item.contents
            dateT.text = item.dateFormate_for_layout
            nicknameT.text = item.publisher
            goodnum.text = item.good.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return CommentHolder(
            LayoutInflater.from(parent.context)
            .inflate(R.layout.item_comments,parent,false))
    }

    override fun getItemCount(): Int {
        return comments.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if(holder is CommentHolder){
            holder.bind(comments[position])
        }
    }
}