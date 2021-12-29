package com.example.coin_gogogo.utility;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;

import com.example.coin_gogogo.data.Ticker;

import java.util.ArrayList;

public class Coin_DiffUtil extends DiffUtil.Callback{

    private final ArrayList<Ticker> oldcoins;
    private final ArrayList<Ticker> newcoins;

    public Coin_DiffUtil(ArrayList<Ticker> oldcoins, ArrayList<Ticker> newcoins) {
        this.oldcoins = oldcoins;
        this.newcoins = newcoins;
    }

    @Override
    public int getOldListSize() {
        return oldcoins.size();
    }

    @Override
    public int getNewListSize() {
        return newcoins.size();
    }

    @Override
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        final Ticker oldcoin = oldcoins.get(oldItemPosition);
        final Ticker newcoin = newcoins.get(newItemPosition);

//        if(oldcoin == null || newcoin ==null) { //리사이클러뷰의 다운스크롤을 위해 넣은 로딩홀더를 다른 아이템취급하기 위함임
////            Log.d("무슨일ㄹㅇ리이ㅣ", "old: " + oldItemPosition);
////            Log.d("무슨일ㄹㅇ리이ㅣ", "new: " + newItemPosition);
//            return false;
//        }

        return oldcoin.getName().equals(newcoin.getName());
    }

    @Override
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) { //item이 같아도 수정된다면 내용이 다르다는 것을 인식시켜줘야 내용이 바뀜
        final Ticker oldcoin = oldcoins.get(oldItemPosition);
        final Ticker newcoin = newcoins.get(newItemPosition);
//
//        if(oldcoin == null || newcoin ==null) { //리사이클러뷰의 다운스크롤을 위해 넣은 로딩홀더를 다른 아이템취급하기 위함임
////            Log.d("무슨일ㄹㅇ리이ㅣ", "old: " + oldItemPosition);
////            Log.d("무슨일ㄹㅇ리이ㅣ", "new: " + newItemPosition);
//            return false;
//        }else{
//        Log.d("areContentsTheSame", "return: " + (oldcoin.prev_closing_price.equals(newcoin.prev_closing_price) && oldcoin.fluctate_rate_24H.equals(newcoin.fluctate_rate_24H)
//                && oldcoin.acc_trade_value_24H.equals(newcoin.acc_trade_value_24H)) );
        return oldcoin.prev_closing_price.equals(newcoin.prev_closing_price) && oldcoin.fluctate_rate_24H.equals(newcoin.fluctate_rate_24H) && oldcoin.acc_trade_value_24H.equals(newcoin.acc_trade_value_24H);
//        }
    }

    @Nullable
    @Override
    public Object getChangePayload(int oldItemPosition,int newItemPosition) {
        //Implement method if you're going to use ItemAnimator
        return super.getChangePayload(oldItemPosition, newItemPosition);
    }

}
