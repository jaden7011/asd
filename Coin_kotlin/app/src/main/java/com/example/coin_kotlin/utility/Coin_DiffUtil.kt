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
        val oldcoin: Ticker = oldcoins[oldItemPosition]
        val newcoin: Ticker = newcoins[newItemPosition]

        if(!oldcoin.name.equals(newcoin.name))
            Log.e("areItemsTheSame","name: "+ newcoin.name.equals(oldcoin.name)+ " , " +oldcoin.name+ " , " +newcoin.name)

        return oldcoin.name.equals(newcoin.name)
    }

    override fun areContentsTheSame(
        oldItemPosition: Int,
        newItemPosition: Int
    ): Boolean { //item이 같아도 수정된다면 내용이 다르다는 것을 인식시켜줘야 내용이 바뀜
        val oldcoin: Ticker = oldcoins[oldItemPosition]
        val newcoin: Ticker = newcoins[newItemPosition]

//        Log.e("areContentsTheSame","tqtq: "+ newcoin.name.equals(oldcoin.name)+ " , " +oldcoin.closing_price+ " , " +newcoin.closing_price)

//        if( !oldcoin.closing_price.equals(newcoin.closing_price)
//                && oldcoin.fluctate_rate_24H.equals(newcoin.fluctate_rate_24H))
//            Log.e("areContentsTheSame","tqtq: "+ newcoin.name.equals(oldcoin.name)+ " , " +oldcoin.closing_price+ " , " +newcoin.closing_price)

//        return oldcoin.closing_price.equals(newcoin.closing_price)
//                && oldcoin.fluctate_rate_24H.equals(newcoin.fluctate_rate_24H)
//                && oldcoin.acc_trade_value_24H.equals(newcoin.acc_trade_value_24H)

        return false
    }


        override fun getChangePayload(oldItemPosition: Int, newItemPosition: Int): Any? {

            //todo 설명이랑 다르게 itemsame이건 뭐건 멋대로 들어오고 안에서 처리해줘야함 -> 이름은 같고 내용이 다른경우를 찾아야하는데 항상 contents와 item이 true로 들어옴 ,,

        val oldcoin: Ticker = oldcoins[oldItemPosition]
        val newcoin: Ticker = newcoins[newItemPosition]

            Log.e("getChangePayload","name: "+ newcoin.name.equals(oldcoin.name)+ " , " +oldcoin.closing_price+ " , " +newcoin.closing_price)

//            if( !oldcoin.closing_price.equals(newcoin.closing_price)
//                    && oldcoin.fluctate_rate_24H.equals(newcoin.fluctate_rate_24H))
//                Log.e("getChangePayload","tqtq: "+ newcoin.name.equals(oldcoin.name)+ " , " +oldcoin.closing_price+ " , " +newcoin.closing_price)

        if(!(oldcoin.closing_price==(newcoin.closing_price))) {
//            Log.e("coindiffuti","price_bool: "+oldcoin.closing_price + " , " + newcoin.closing_price)
            return PRICE_CHANGED_PAYLOAD
        }
        else if(!(oldcoin.fluctate_rate_24H==(newcoin.fluctate_rate_24H))) {
//            Log.e("coindiffuti","price_bool: "+oldcoin.fluctate_rate_24H + " , " + newcoin.fluctate_rate_24H+ " , " +oldcoin.name+ " , " +newcoin.name)
            return RATE_CHANGED_PAYLOAD
        }
        else return null
    }
}