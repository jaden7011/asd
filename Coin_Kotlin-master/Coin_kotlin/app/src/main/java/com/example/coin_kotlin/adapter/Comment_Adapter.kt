package com.example.coin_kotlin.adapter

import android.app.Activity
import android.graphics.Typeface
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.coin_kotlin.R
import com.example.coin_kotlin.info.Comment
import com.example.coin_kotlin.utility.CommentInfo_DiffUtil
import com.example.coin_kotlin.utility.Named
import com.google.firebase.auth.FirebaseAuth
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class Comment_Adapter(
    val activity: Activity,
    private val comments: ArrayList<Comment>,
    val goodListener: GoodListener
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val auth = FirebaseAuth.getInstance().currentUser

    interface GoodListener{
        fun pressed(comment:Comment)
    }

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
        val goodNumLayout:LinearLayout = itemView.findViewById(R.id.comment_GoodLayout)
        val goodNum:TextView = itemView.findViewById(R.id.goodNum_commentT)
        val option_btn:ImageButton = itemView.findViewById(R.id.commentOptBtn)
        val good_btn:ImageButton = itemView.findViewById(R.id.goodCommentBtn)

        fun bind(item:Comment){
            contentT.text = item.content
            dateT.text = formatTimeString(item.createdat,Date())

            if(item.love > 0){
                goodNumLayout.visibility = View.VISIBLE
                goodNum.text = item.love.toString()
            }else{
                goodNumLayout.visibility = View.GONE
                goodNum.text = "0"
            }

            if(auth != null){
                nicknameT.run{
                    text = "글쓴이"
                    setTextColor(ContextCompat.getColor(activity, R.color.maincolor))
                    setTypeface(null, Typeface.BOLD_ITALIC)
                }
            }else{
                nicknameT.text = item.nickname
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_comments,parent,false)
        val holder = CommentHolder(view)

        holder.run {
            good_btn.setOnClickListener {
                goodListener.pressed(comments[holder.absoluteAdapterPosition])
            }

            option_btn.setOnClickListener {

            }
        }

        return holder
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