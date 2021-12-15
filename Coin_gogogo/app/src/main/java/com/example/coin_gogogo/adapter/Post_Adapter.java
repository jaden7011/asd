package com.example.coin_gogogo.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.coin_gogogo.R;
import com.example.coin_gogogo.info.PostInfo;
import com.github.mikephil.charting.charts.CandleStickChart;

import java.util.ArrayList;

import static com.example.coin_gogogo.utility.Named.CHART_VIEWTYPE;
import static com.example.coin_gogogo.utility.Named.POSTING_VIEWTYPE;

public class Post_Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    private final Activity activity;
    private final ArrayList<PostInfo> posts;

    public Post_Adapter(Activity activity,ArrayList<PostInfo> posts) {
        this.activity = activity;
        this.posts = posts;
    }

    //holder
    public static class Post_Holder extends RecyclerView.ViewHolder { //홀더에 담고싶은 그릇(이미지뷰)를 정함

        TextView titleT ;
        TextView contentT ;
        TextView dateT ;
        TextView goodNum;
        TextView commentNum;
        ImageView imageView;
        TextView nicknameT;

        public Post_Holder(@NonNull View itemView) {
            super(itemView);

            nicknameT = itemView.findViewById(R.id.nicknameT);
            titleT = itemView.findViewById(R.id.titleT);
            contentT = itemView.findViewById(R.id.contentT);
            dateT = itemView.findViewById(R.id.dateT);
            goodNum = itemView.findViewById(R.id.goodNum_postItem);
            commentNum = itemView.findViewById(R.id.commentNum_postItem);
            imageView = itemView.findViewById(R.id.postImage);
        }
    }

    public static class Chart_Holder extends RecyclerView.ViewHolder { //홀더에 담고싶은 그릇(이미지뷰)를 정함
        CandleStickChart cahrt;
        public Chart_Holder(@NonNull View itemView) {
            super(itemView);
            cahrt = itemView.findViewById(R.id.candlrstick_chart);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        if(viewType == CHART_VIEWTYPE){
            View view  =  LayoutInflater.from(parent.getContext()).inflate(R.layout.mpchart_items,parent,false);
            return new Chart_Holder(view);
        }

        if(viewType == POSTING_VIEWTYPE){
            View view  =  LayoutInflater.from(parent.getContext()).inflate(R.layout.coin_items,parent,false);
            Coin_Adapter.Coin_Holder coin_holder = new Coin_Adapter.Coin_Holder(view);

            //창 클릭시 게시글로 이동
            coin_holder.layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //todo 종토방 및 차트 등등
                }
            });
            return coin_holder;
        }
        else return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    @Override
    public int getItemViewType(int position) {
        return posts.get(position) == null ? CHART_VIEWTYPE : POSTING_VIEWTYPE;
    }
}