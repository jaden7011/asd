package com.example.coin_kotlin.adapter

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.coin_kotlin.R
import com.example.coin_kotlin.activity.BoardActivity
import com.example.coin_kotlin.activity.MainActivity
import com.example.coin_kotlin.data.NameMap
import com.example.coin_kotlin.data.Ticker
import com.example.coin_kotlin.utility.Coin_DiffUtil

class Coin_Adapter (
    val activity: Activity,
    val coins: ArrayList<Ticker>
): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    fun CoinDiffUtil(newCoins:ArrayList<Ticker>){
        Log.d("DIFF", "old size: ${coins.size} new size: ${newCoins.size}".trimIndent())

        val diffCallback = Coin_DiffUtil(this.coins,newCoins)
        val diffResult:DiffUtil.DiffResult = DiffUtil.calculateDiff(diffCallback)

        coins.clear()
        coins.addAll(newCoins)
        diffResult.dispatchUpdatesTo(this)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
            : RecyclerView.ViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.coin_items,parent,false)

        val holder = Coin_ViewHolder(view)

        holder.View_Layout.setOnClickListener {
                Log.e("holder","clicked: "+holder.Name.text.toString())
                val intent = Intent(activity,BoardActivity::class.java)
                        .apply { putExtra("coin_name",holder.Name_sub.text.toString()) }
                activity.startActivity(intent)
        }
        return holder
    }

    override fun getItemCount()
            : Int {
        return coins.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as Coin_ViewHolder).bind(coins[position])
    }

    inner class Coin_ViewHolder(val view: View) : RecyclerView.ViewHolder(view){

        val Name:TextView = itemView.findViewById(R.id.Name_T)
        val Name_sub:TextView = itemView.findViewById(R.id.Name_sub_T)
        val Rate:TextView = itemView.findViewById(R.id.fluctate_rate_T)
        val Price:TextView = itemView.findViewById(R.id.Currency_price_T)
        val Total:TextView = itemView.findViewById(R.id.total_T)
        val View_Layout:ConstraintLayout = itemView.findViewById(R.id.Layout)

        @SuppressLint("SetTextI18n")
        fun bind(item: Ticker){

            Name.text = NameMap.Name_map.getOrDefault(item.name!!,item.name!!)
            Name_sub.text = item.sub_name
            Rate.text = item.fluctate_rate_24H + "%"
            Price.text = item.prev_closing_price
            Total.text = String.format("%d",(item.acc_trade_value_24H!!.toDouble()/1000000).toInt()) + "백만"

            if(item.fluctate_rate_24H!!.toDouble() > 0.0){
                Rate.setTextColor(ContextCompat.getColor(view.context,R.color.colorAccent))
                Price.setTextColor(ContextCompat.getColor(view.context,R.color.colorAccent))
            }
            else if(item.fluctate_rate_24H.toDouble() < 0.0){
                Rate.setTextColor(ContextCompat.getColor(view.context,R.color.midi_blue))
                Price.setTextColor(ContextCompat.getColor(view.context,R.color.midi_blue))
            }
            else{
                Rate.setTextColor(ContextCompat.getColor(view.context,R.color.black))
                Price.setTextColor(ContextCompat.getColor(view.context,R.color.black))
            }
        }

    }
}