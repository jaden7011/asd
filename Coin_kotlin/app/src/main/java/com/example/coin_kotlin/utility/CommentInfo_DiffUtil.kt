package com.example.coin_kotlin.utility

import android.util.Log
import androidx.recyclerview.widget.DiffUtil
import com.example.coin_kotlin.utility.Named.HOUR
import com.example.coin_kotlin.utility.Named.MIN
import com.example.coin_kotlin.utility.Named.SEC
import java.text.SimpleDateFormat
import java.util.*


class CommentInfo_DiffUtil(OldPost: PostInfo, NewPost: PostInfo) : DiffUtil.Callback() {
    private val OldComments: ArrayList<CommentInfo>
    private val NewComments: ArrayList<CommentInfo>
    private val OldPost: PostInfo
    private val NewPost: PostInfo

    override fun getOldListSize(): Int {
        return OldComments.size
    }

    override fun getNewListSize(): Int {
        return NewComments.size
    }

    override fun areItemsTheSame(
        oldItemPosition: Int,
        newItemPosition: Int
    ): Boolean {
        val oldpost: CommentInfo = OldComments[oldItemPosition]
        val newpost: CommentInfo = NewComments[newItemPosition]
        return oldpost.getKey().equals(newpost.getKey())
    }

    override fun areContentsTheSame(
        oldItemPosition: Int,
        newItemPosition: Int
    ): Boolean { //item이 같아도 수정된다면 내용이 다르다는 것을 인식시켜줘야 내용이 바뀜
        val oldpost: CommentInfo = OldComments[oldItemPosition]
        val newpost: CommentInfo = NewComments[newItemPosition]
        return (oldpost.getContents().equals(newpost.getContents()) && oldpost.getPublisher()
            .equals(newpost.getPublisher())
                && oldpost.getGood() === newpost.getGood())
    }

    override fun getChangePayload(oldItemPosition: Int, newItemPosition: Int): Any? {
        //Implement method if you're going to use ItemAnimator
        return super.getChangePayload(oldItemPosition, newItemPosition)
    }

    companion object {
        fun formatTimeString(postdate: Date, nowDate: Date): String? {
            val ctime = nowDate.time
            val regTime = postdate.time
            var diffTime = (ctime - regTime) / 1000
            var msg: String? = null
            if (diffTime < SEC) {
                msg = "방금 전"
            } else if (SEC.let({ diffTime /= it; diffTime }) < MIN) {
                msg = diffTime.toString() + "분 전"
            } else if (MIN.let({ diffTime /= it; diffTime }) < HOUR) {
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

    init {
        this.OldPost = OldPost
        this.NewPost = NewPost
        OldComments = this.OldPost.getComments()
        NewComments = this.NewPost.getComments()
        Log.d(
            "같z나zxc",
            "old: " + OldPost.hashCode().toString() + " new: " + NewPost.hashCode()
        )
    }
}