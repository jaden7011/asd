package com.example.coin_kotlin.adapter

import android.annotation.SuppressLint
import android.app.Activity
import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.coin_kotlin.R
import com.example.coin_kotlin.data.Ticker
import com.example.coin_kotlin.utility.Coin_DiffUtil

class Coin_Adapter (
    val activity: Activity,
    val coins: ArrayList<Ticker>
): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    fun CoinDiffUtil(newCoins:ArrayList<Ticker>){
        Log.d("DIFF", "old size: ${coins.size} new size: ${newCoins.size}".trimIndent())

        val diffCallback:Coin_DiffUtil = Coin_DiffUtil(this.coins,newCoins)
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

//        holder.containerView.setOnClickListener {  }

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

        private val Name:TextView = itemView.findViewById(R.id.Name_T)
        private val Name_sub:TextView = itemView.findViewById(R.id.Name_sub_T)
        private val Rate:TextView = itemView.findViewById(R.id.fluctate_rate_T)
        private val Price:TextView = itemView.findViewById(R.id.Currency_price_T)
        private val Total:TextView = itemView.findViewById(R.id.total_T)

        @SuppressLint("SetTextI18n")
        fun bind(item: Ticker){

            Name.text = item.name
            Name_sub.text = item.sub_name
            Rate.text = item.fluctate_rate_24H
            Price.text = item.prev_closing_price
            Total.text = String.format("%d",(item.acc_trade_value_24H!!.toDouble()/1000000).toInt()) + "백만"

            if(item.fluctate_rate_24H?.toDouble()!! > 0.0){
                Rate.setTextColor(ContextCompat.getColor(view.context,R.color.colorAccent))
                Price.setTextColor(ContextCompat.getColor(view.context,R.color.colorAccent))
            }
            else if(item.fluctate_rate_24H?.toDouble()!! < 0.0){
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