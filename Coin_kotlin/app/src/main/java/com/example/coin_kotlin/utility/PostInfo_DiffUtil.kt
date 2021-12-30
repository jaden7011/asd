package com.example.coin_kotlin.utility

import androidx.recyclerview.widget.DiffUtil
import com.example.coin_kotlin.info.PostInfo
import com.example.coin_kotlin.utility.Named.HOUR
import com.example.coin_kotlin.utility.Named.MIN
import com.example.coin_kotlin.utility.Named.SEC
import java.text.SimpleDateFormat
import java.util.*

class PostInfo_DiffUtil(
    val oldPosts: ArrayList<PostInfo>,
    val newPosts: ArrayList<PostInfo>
) :
    DiffUtil.Callback() {

    override fun getOldListSize(): Int {
        return oldPosts.size
    }

    override fun getNewListSize(): Int {
        return newPosts.size
    }

    override fun areItemsTheSame(
        oldItemPosition: Int,
        newItemPosition: Int
    ): Boolean {
        val oldpost: PostInfo = oldPosts[oldItemPosition]
        val newpost: PostInfo = newPosts[newItemPosition]

        return if (oldpost == null || newpost == null) { //리사이클러뷰의 다운스크롤을 위해 넣은 로딩홀더를 다른 아이템취급하기 위함임
            //            Log.d("무슨일ㄹㅇ리이ㅣ", "old: " + oldItemPosition);
            //            Log.d("무슨일ㄹㅇ리이ㅣ", "new: " + newItemPosition);
            true
        } else oldpost.docid.equals(newpost.docid)
    }

    override fun areContentsTheSame(
        oldItemPosition: Int,
        newItemPosition: Int
    ): Boolean { //item이 같아도 수정된다면 내용이 다르다는 것을 인식시켜줘야 내용이 바뀜
        val oldpost: PostInfo = oldPosts[oldItemPosition]
        val newpost: PostInfo = newPosts[newItemPosition]
        if (oldpost == null || newpost == null) { //리사이클러뷰의 다운스크롤을 위해 넣은 로딩홀더를 다른 아이템취급하기 위함임
//            Log.d("무슨일ㄹㅇ리이ㅣ", "old: " + oldItemPosition);
//            Log.d("무슨일ㄹㅇ리이ㅣ", "new: " + newItemPosition);
            return true
        }

//        Log.d("같나","old: "+ oldpost.getGood()+" oldid: "+oldpost.getDocid()+" new: "+ newpost.getGood()+" newid: "+newpost.getDocid());
        return if (oldpost.How_Long != null && newpost.How_Long == null) { //새로 받아온 배열이 기존의 시간과 차이가 있을 때 표기(방금전,3분전)를 다르게 하기 위해서
            val date = Date()
            newpost.How_Long = (
                formatTimeString(
                    newpost.createdAt,
                    date
                )
            )
            oldpost.docid
                .equals(newpost.docid) && oldpost.good == newpost.good && oldpost.comment == newpost.comment && oldpost.How_Long
                .equals(newpost.How_Long)
        } else oldpost.docid
            .equals(newpost.docid) && oldpost.good == newpost.good && oldpost.comment == newpost.comment
    }

    override fun getChangePayload(oldItemPosition: Int, newItemPosition: Int): Any? {
        //Implement method if you're going to use ItemAnimator
        return super.getChangePayload(oldItemPosition, newItemPosition)
    }

    companion object {
        fun formatTimeString(postdate: Date, nowDate: Date): String {

            val ctime = nowDate.time
            val regTime = postdate.time
            var diffTime = (ctime - regTime) / 1000
            lateinit var msg: String

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
}