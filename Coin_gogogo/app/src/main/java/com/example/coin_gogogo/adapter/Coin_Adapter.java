package com.example.coin_gogogo.adapter;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.coin_gogogo.R;
import com.example.coin_gogogo.activity.BoardActivity;
import com.example.coin_gogogo.data.Coin_Info;
import com.example.coin_gogogo.utility.Coin_DiffUtil;

import java.util.ArrayList;

import static com.example.coin_gogogo.utility.Named.POSTHODER_TO_POSTACTIVITY;

public class Coin_Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    private final Activity activity;
    private ArrayList<Coin_Info> coins;
    private LinearLayoutManager mLinearLayoutManager;

    public void setLinearLayoutManager(LinearLayoutManager linearLayoutManager){
        this.mLinearLayoutManager=linearLayoutManager;
    }

    public void CoinDiffUtil(ArrayList<Coin_Info> newCoins) {
        Log.d("DIFF","old size: "+this.coins.size()+ "\nnew size: "+newCoins.size());
        final Coin_DiffUtil diffCallback = new Coin_DiffUtil(this.coins, newCoins);
        final DiffUtil.DiffResult diffResult = DiffUtil.calculateDiff(diffCallback);
//        final Coin_Adpater coin_adpater = this;

//        Log.d("DIFF","size: "+coins.size());
        coins.clear();
        coins.addAll(newCoins);
        diffResult.dispatchUpdatesTo(this);

//        new Handler().post(new Runnable() { // 디프유틸이 스크롤리스너에 의해서 boardfrag에서 백그라운드로 작동하니까 내부 동작도 이렇게 해주자.
//            @Override
//            public void run() {
//                Log.d("DIFF","after size: "+newCoins.size());
//                coins.clear();
//                coins.addAll(newCoins);
//                diffResult.dispatchUpdatesTo(coin_adpater);
//            }
//        });
    }

    public Coin_Adapter(Activity activity,ArrayList<Coin_Info> coins) {
        this.activity = activity;
        this.coins = coins;
    }

    //holder
    public static class Coin_Holder extends RecyclerView.ViewHolder { //홀더에 담고싶은 그릇(이미지뷰)를 정함
        TextView Name;
        TextView Name_sub;
        TextView Rate;
        TextView Price;
        TextView Total;
        ConstraintLayout layout;

        public Coin_Holder(@NonNull View itemView) {
            super(itemView);
            layout = itemView.findViewById(R.id.Layout);
            Name = itemView.findViewById(R.id.Name_T);
            Name_sub = itemView.findViewById(R.id.Name_sub_T);
            Rate = itemView.findViewById(R.id.fluctate_rate_T );
            Price = itemView.findViewById(R.id.Currency_price_T );
            Total = itemView.findViewById(R.id.total_T);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  =  LayoutInflater.from(parent.getContext()).inflate(R.layout.coin_items,parent,false);
        Coin_Holder coin_holder = new Coin_Holder(view);

        //창 클릭시 차트 및 종토방으로 이동
        coin_holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //todo 종토방 및 차트 등등
                Intent intent = new Intent(activity, BoardActivity.class);
                intent.putExtra("name", coin_holder.Name.getText());
                activity.startActivityForResult(intent, POSTHODER_TO_POSTACTIVITY);
            }
        });
        return coin_holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Coin_Holder coin_holder = (Coin_Holder)holder;

        Coin_Info coin = coins.get(position);
        String total = String.format("%d",(int)(Double.parseDouble(coin.Total)/1000000)) + "백만";

        if(Double.parseDouble(coin.Price) > Double.parseDouble(coin.Pre_Price)){ //양봉
            coin_holder.Price.setTextColor(Color.BLUE);

            coin_holder.Name.setText(coin.Name);
            coin_holder.Name_sub.setText(coin.Name_sub);
            coin_holder.Price.setText(coin.Price);
            coin_holder.Total.setText(total);
        }
        else if(Double.parseDouble(coin.Price) < Double.parseDouble(coin.Pre_Price)){ //음봉
            coin_holder.Price.setTextColor(Color.RED);

            coin_holder.Name.setText(coin.Name);
            coin_holder.Name_sub.setText(coin.Name_sub);
            coin_holder.Price.setText(coin.Price);
            coin_holder.Total.setText(total);

        }else{ //동률
            coin_holder.Price.setTextColor(Color.BLACK);

            coin_holder.Name.setText(coin.Name);
            coin_holder.Name_sub.setText(coin.Name_sub);
            coin_holder.Price.setText(coin.Price);
            coin_holder.Total.setText(total);
        }

        if (Double.parseDouble(coin.Rate) > 0){
            coin_holder.Rate.setTextColor(Color.RED);
            coin_holder.Rate.setText(coin.Rate+"%");
        }
        else if(Double.parseDouble(coin.Rate) < 0){
            coin_holder.Rate.setTextColor(Color.BLUE);
            coin_holder.Rate.setText(coin.Rate+"%");
        }
        else{
            coin_holder.Rate.setTextColor(Color.BLACK);
            coin_holder.Rate.setText(coin.Rate+"%");
        }
    }

    @Override
    public int getItemCount() {
        return coins.size();
    }

}
