package com.example.coin_kotlin.adapter

import android.app.Activity
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.coin_kotlin.R
import com.example.coin_kotlin.activity.PostActivity
import com.example.coin_kotlin.data.Candle
import com.example.coin_kotlin.info.Post
import com.example.coin_kotlin.utility.MPchart
import com.example.coin_kotlin.utility.Named.CHART_VIEWTYPE
import com.example.coin_kotlin.utility.Named.HOUR
import com.example.coin_kotlin.utility.Named.MIN
import com.example.coin_kotlin.utility.Named.POSTACTIVITY
import com.example.coin_kotlin.utility.Named.POSTING_VIEWTYPE
import com.example.coin_kotlin.utility.Named.SEC
import com.example.coin_kotlin.utility.PostInfo_DiffUtil
import com.github.mikephil.charting.charts.CandleStickChart
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class Post_Adapter(
        val activity: Activity,
        val posts:ArrayList<Post>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    fun PostDiffUtil(newposts:ArrayList<Post>){
        Log.d("DIFF", "old size: ${posts.size} new size: ${newposts.size}".trimIndent())

        val diffCallback = PostInfo_DiffUtil(this.posts,newposts)
        val diffResult: DiffUtil.DiffResult = DiffUtil.calculateDiff(diffCallback)

        posts.clear()
        posts.addAll(newposts)
        diffResult.dispatchUpdatesTo(this)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_post,parent,false)
        val holder = Post_Holder(view)

        view.setOnClickListener {
            activity.startActivityForResult(Intent(activity,PostActivity::class.java).apply {
                this.putExtra("post",posts[holder.absoluteAdapterPosition])
            }, POSTACTIVITY)
        }

        return holder
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if(holder is Post_Holder)
            holder.bind(posts[position]!!)
    }

    override fun getItemCount(): Int {
        return posts.size
    }

    inner class Post_Holder(view: View) : RecyclerView.ViewHolder(view) {

        val title:TextView = itemView.findViewById(R.id.titleT)
        val content:TextView = itemView.findViewById(R.id.contentT)
        val dateT:TextView = itemView.findViewById(R.id.dateT)
        val goodNum:TextView = itemView.findViewById(R.id.goodNum_postItem)
        val commentNum:TextView = itemView.findViewById(R.id.commentNum_postItem)
        val imageView:ImageView = itemView.findViewById(R.id.postImage)
        val nicknameT:TextView = itemView.findViewById(R.id.nicknameT)

        fun bind(item:Post){
            title.text = item.title
            content.text = item.content
            dateT.text = Time_to_String(item.createdat!!)
            goodNum.text = item.love.toString()
            commentNum.text = item.commentNum.toString()
            nicknameT.text = item.nickname
        }
    }

//    inner class Chart_Holder(view : View) : RecyclerView.ViewHolder(view){
//
//        val chart:CandleStickChart = itemView.findViewById(R.id.candlestick_chart)
//
//        fun bind(item:ArrayList<Candle>){
//            MPchart(chart).run {
////                this.Init_Chart()
//                this.Set_priceData(item)
//                chart.moveViewToX(item.size.toFloat())
//                Log.e("zxczxc","zxczxc"+item.size.toFloat())
//            }
//        }
//    }

    fun Time_to_String(postdate: Date): String{

        val ctime = Date().time
        val regtime = postdate.time
        val difftime = Math.abs(ctime-regtime)/1000

        val msg: () -> String = {
            if(difftime < SEC)
                 "방금 전"
            else if ((difftime / SEC) < MIN)
                 (difftime/SEC).toString() + "분 전"
            else if((difftime / MIN) < HOUR)
                SimpleDateFormat("HH:mm").format(postdate)
            else
                SimpleDateFormat("yyyy년MM월dd일").format(postdate)
        }

        return msg()
    }

}

