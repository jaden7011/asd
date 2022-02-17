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
import com.example.coin_kotlin.info.Comment
import com.example.coin_kotlin.utility.CommentInfo_DiffUtil
import com.example.coin_kotlin.utility.Named
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class Comment_Adapter(
    val activity: Activity,
    val comments: ArrayList<Comment>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    fun CommentDiffUtil(NewCommentList:ArrayList<Comment>){

        val diffCalback = CommentInfo_DiffUtil(comments,NewCommentList)
        val diffRes = DiffUtil.calculateDiff(diffCalback)

        this.comments.clear()
        this.comments.addAll(NewCommentList)

        diffRes.dispatchUpdatesTo(this)
    }

    inner class CommentHolder(val view:View) : RecyclerView.ViewHolder(view) {

        val contentT:TextView = itemView.findViewById(R.id.comment_commentT)
        val dateT:TextView = itemView.findViewById(R.id.date_commentT)
        val nicknameT:TextView = itemView.findViewById(R.id.nickname_commentT)
        val goodnum:TextView = itemView.findViewById(R.id.goodNum_commentT)
        val option_btn:ImageButton = itemView.findViewById(R.id.opt_comment)
        val goodNum_Layout:LinearLayout = itemView.findViewById(R.id.comment_GoodLayout)

        fun bind(item:Comment){
            contentT.text = item.content
            dateT.text = formatTimeString(item.createdat,Date())
            nicknameT.text = item.nickname
            goodnum.text = item.love.toString()
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

    companion object {
        fun formatTimeString(postdate: Date, nowDate: Date): String? {
            val ctime = nowDate.time
            val regTime = postdate.time
            var diffTime = (ctime - regTime) / 1000
            var msg: String? = null
            if (diffTime < Named.SEC) {
                msg = "방금 전"
            } else if (Named.SEC.let({ diffTime /= it; diffTime }) < Named.MIN) {
                msg = diffTime.toString() + "분 전"
            } else if (Named.MIN.let({ diffTime /= it; diffTime }) < Named.HOUR) {
                msg = SimpleDateFormat("HH:mm").format(postdate)
                //        } else if ((diffTime /= TIME_MAXIMUM.HOUR) < TIME_MAXIMUM.DAY) {
//            msg = (diffTime) + "일 전";
//        } else if ((diffTime /= TIME_MAXIMUM.DAY) < TIME_MAXIMUM.MONTH) {
//            msg = (diffTime) + "달 전";
            } else {
                msg = SimpleDateFormat("MM월dd일").format(postdate)
            }
            return msg
        }
    }
}