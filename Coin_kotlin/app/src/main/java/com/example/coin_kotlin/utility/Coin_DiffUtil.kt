package com.example.coin_kotlin.utility

import android.util.Log
import androidx.recyclerview.widget.DiffUtil
import com.example.coin_kotlin.data.Ticker
import com.example.coin_kotlin.utility.Named.PRICE_CHANGED_PAYLOAD
import com.example.coin_kotlin.utility.Named.RATE_CHANGED_PAYLOAD
import java.util.*

class Coin_DiffUtil(
    val oldcoins: ArrayList<Ticker>,
    val newcoins: ArrayList<Ticker>
): DiffUtil.Callback() {

    override fun getOldListSize(): Int {
        return oldcoins.size
    }

    override fun getNewListSize(): Int {
        return newcoins.size
    }

    override fun areItemsTheSame(
        oldItemPosition: Int,
        newItemPosition: Int
    ): Boolean {
        val oldcoin = oldcoins[oldItemPosition]
        val newcoin = newcoins[newItemPosition]

//        if(!oldcoin.name.equals(newcoin.name))
//            Log.e("areItemsTheSame","name: "+ newcoin.name.equals(oldcoin.name)+ " , " +oldcoin.name+ " , " +newcoin.name)

        return oldcoin.name.equals(newcoin.name)
//        return true
    }

    override fun areContentsTheSame(
        oldItemPosition: Int,
        newItemPosition: Int
    ): Boolean { //item이 같아도 수정된다면 내용이 다르다는 것을 인식시켜줘야 내용이 바뀜
        val oldcoin = oldcoins[oldItemPosition]
        val newcoin = newcoins[newItemPosition]

//        Log.e("areContentsTheSame","tqtq: "+ newcoin.name.equals(oldcoin.name)+ " , " +oldcoin.closing_price+ " , " +newcoin.closing_price)

//        if(oldcoin.name.equals(newcoin.name))
//            if(!oldcoin.closing_price.equals(newcoin.closing_price))
//                if(oldcoin.fluctate_rate_24H.equals(newcoin.fluctate_rate_24H)) {
////                    Log.e("areContentsTheSame", "price: " + newcoin.name.equals(oldcoin.name) + " , " + oldcoin.closing_price + " , " + newcoin.closing_price)
////                    this.getChangePayload(oldItemPosition,newItemPosition)
//                }

        return oldcoin.closing_price.equals(newcoin.closing_price)
                && oldcoin.fluctate_rate_24H.equals(newcoin.fluctate_rate_24H)
                && oldcoin.acc_trade_value_24H.equals(newcoin.acc_trade_value_24H)

//        return false
    }

//    override fun getChangePayload(oldItemPosition: Int, newItemPosition: Int): Any? {
//
//        val oldcoin = oldcoins[oldItemPosition]
//        val newcoin = newcoins[newItemPosition]
//
//        Log.e("getChangePayload","name: "+ newcoin.name.equals(oldcoin.name)+
//                " , price: " +oldcoin.closing_price.equals(newcoin.closing_price)+
//                " , rate: " +oldcoin.fluctate_rate_24H.equals(newcoin.fluctate_rate_24H))
//
//        Log.e("getChangePayload","price: "+ newcoin.name.equals(oldcoin.name)+ " , " +oldcoin.closing_price+ " , " +newcoin.closing_price)
////
//        if(oldcoin.name.equals(newcoin.name))
//            if(!oldcoin.closing_price.equals(newcoin.closing_price)){
//                if(oldcoin.fluctate_rate_24H.equals(newcoin.fluctate_rate_24H))
//                    Log.e("getChangePayload","price: "+oldcoin.closing_price+ " , " +newcoin.closing_price)
//            }
//
//        return if(oldcoin.name.equals(newcoin.name)) {
//            if (!oldcoin.closing_price.equals(newcoin.closing_price)) {
//                Log.e("getChangePayload", "price_bool: " + oldcoin.closing_price + " , " + newcoin.closing_price)
//                PRICE_CHANGED_PAYLOAD
//            } else if (!oldcoin.fluctate_rate_24H.equals(newcoin.fluctate_rate_24H)) {
//                Log.e("getChangePayload", "price_bool: " + oldcoin.fluctate_rate_24H + " , " + newcoin.fluctate_rate_24H + " , " + oldcoin.name + " , " + newcoin.name)
//                RATE_CHANGED_PAYLOAD
//            }
//            else null
//        }
//        else null
//    }
}