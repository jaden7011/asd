package com.example.coin_kotlin.utility

import androidx.recyclerview.widget.DiffUtil
import com.example.coin_kotlin.data.Ticker
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

//        if(oldcoin == null || newcoin ==null) { //리사이클러뷰의 다운스크롤을 위해 넣은 로딩홀더를 다른 아이템취급하기 위함임
////            Log.d("무슨일ㄹㅇ리이ㅣ", "old: " + oldItemPosition);
////            Log.d("무슨일ㄹㅇ리이ㅣ", "new: " + newItemPosition);
//            return false;
//        }
        return oldcoin.name.equals(newcoin.name)
    }

    override fun areContentsTheSame(
        oldItemPosition: Int,
        newItemPosition: Int
    ): Boolean { //item이 같아도 수정된다면 내용이 다르다는 것을 인식시켜줘야 내용이 바뀜
        val oldcoin: Ticker = oldcoins[oldItemPosition]
        val newcoin: Ticker = newcoins[newItemPosition]

        return oldcoin.closing_price.equals(newcoin.closing_price)
                && oldcoin.fluctate_rate_24H.equals(newcoin.fluctate_rate_24H)
                && oldcoin.acc_trade_value_24H.equals(newcoin.acc_trade_value_24H)
    }

    override fun getChangePayload(oldItemPosition: Int, newItemPosition: Int): Any? {
        //Implement method if you're going to use ItemAnimator
        return newcoins[newItemPosition].closing_price
    }
}