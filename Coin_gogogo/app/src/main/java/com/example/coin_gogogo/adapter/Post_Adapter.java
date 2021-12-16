package com.example.coin_gogogo.adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.coin_gogogo.R;
import com.example.coin_gogogo.activity.PostActivity;
import com.example.coin_gogogo.data.Candle;
import com.example.coin_gogogo.info.PostInfo;
import com.example.coin_gogogo.utility.MPchart;
import com.example.coin_gogogo.utility.PostInfo_DiffUtil;
import com.github.mikephil.charting.charts.CandleStickChart;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import static com.example.coin_gogogo.utility.Named.CHART_VIEWTYPE;
import static com.example.coin_gogogo.utility.Named.HOUR;
import static com.example.coin_gogogo.utility.Named.MIN;
import static com.example.coin_gogogo.utility.Named.POSTING_VIEWTYPE;
import static com.example.coin_gogogo.utility.Named.SEC;

public class Post_Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    private final Activity activity;
    private final ArrayList<PostInfo> posts;
    private final ArrayList<Candle> candles;

    public void PostDiffUtil(ArrayList<PostInfo> new_posts) {
        Log.d("DIFF","old size: "+this.posts.size()+ "\nnew size: "+new_posts.size());

        final PostInfo_DiffUtil diffCallback = new PostInfo_DiffUtil(this.posts, new_posts);
        final DiffUtil.DiffResult diffResult = DiffUtil.calculateDiff(diffCallback);

        posts.clear();
        posts.addAll(new_posts);
        diffResult.dispatchUpdatesTo(this);
    }

    public Post_Adapter(Activity activity,ArrayList<PostInfo> posts,ArrayList<Candle> candles) {
        this.activity = activity;
        this.posts = posts;
        this.candles = candles;
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
//            Log.d("Post_Holder","Post_Holder: ");
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
        CandleStickChart chart;
        public Chart_Holder(@NonNull View itemView, ArrayList<Candle> candles) {
            super(itemView);
//            Log.d("Chart_Holder","Chart_Holder: ");
            chart = itemView.findViewById(R.id.candlestick_chart);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        if(viewType == CHART_VIEWTYPE){
//            Log.d("ViewHolder","Viewtype: "+"CHART_VIEWTYPE");
            View view  =  LayoutInflater.from(parent.getContext()).inflate(R.layout.mpchart_items,parent,false);
            return new Chart_Holder(view,candles);
        }

        if(viewType == POSTING_VIEWTYPE){
//            Log.d("ViewHolder","Viewtype: "+"POSTING_VIEWTYPE");
            View view  =  LayoutInflater.from(parent.getContext()).inflate(R.layout.item_post,parent,false);
            Post_Adapter.Post_Holder post_holder = new Post_Adapter.Post_Holder(view);

            //창 클릭시 게시글로 이동
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //todo 종토방 및 차트 등등
                    Intent intent = new Intent(activity, PostActivity.class);
                    activity.startActivity(intent);
                }
            });
            return post_holder;
        }
        else return null;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        if(holder instanceof Chart_Holder){
            Log.d("onBindViewHolder","Viewtype: "+candles.size());

            MPchart mpchart = new MPchart(((Chart_Holder) holder).chart);
            mpchart.Init_Chart();
            mpchart.Set_priceData(candles);
        }

        if(holder instanceof Post_Holder){
            PostInfo postInfo = posts.get(position);
            postInfo.setHow_Long(Time_to_String(postInfo.getCreatedAt(), new Date()));

            ((Post_Holder) holder).titleT.setText(postInfo.getTitle());
            ((Post_Holder) holder).contentT.setText(postInfo.getContents());
            ((Post_Holder) holder).dateT.setText(postInfo.getHow_Long());
            ((Post_Holder) holder).goodNum.setText(postInfo.getGood() + "");
            ((Post_Holder) holder).commentNum.setText(postInfo.getComment() + "");
            ((Post_Holder) holder).nicknameT.setText(postInfo.getPublisher());
        }

    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    @Override
    public int getItemViewType(int position) {
//        Log.d("getItemViewType","Viewtype: "+position+", "+posts.get(position));
        return posts.get(position) == null ? CHART_VIEWTYPE : POSTING_VIEWTYPE;
    }

    @SuppressLint("SimpleDateFormat")
    public static String Time_to_String(Date postdate, Date nowDate){

        long ctime = nowDate.getTime();
        long regTime = postdate.getTime();

        long diffTime =  Math.abs(ctime - regTime)/ 1000;
        String msg = null;

        if (diffTime < SEC) {
            msg = "방금 전";
        } else if ((diffTime /= SEC) < MIN) {
            msg = diffTime + "분 전";
        } else if ((diffTime /= MIN) < HOUR) {
            msg = new SimpleDateFormat("HH:mm").format(postdate);
//        } else if ((diffTime /= TIME_MAXIMUM.HOUR) < TIME_MAXIMUM.DAY) {
//            msg = (diffTime) + "일 전";
//        } else if ((diffTime /= TIME_MAXIMUM.DAY) < TIME_MAXIMUM.MONTH) {
//            msg = (diffTime) + "달 전";
        } else {
            msg = new SimpleDateFormat("yyyy년MM월dd일").format(postdate);
        }
        return msg;
    }
}