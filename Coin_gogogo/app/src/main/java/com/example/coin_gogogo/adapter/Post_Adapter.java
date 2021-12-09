package com.example.coin_gogogo.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.coin_gogogo.R;
import com.example.coin_gogogo.info.PostInfo;

import java.util.ArrayList;

public class Post_Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    private final Activity activity;
    private final ArrayList<PostInfo> posts;

    public Post_Adapter(Activity activity,ArrayList<PostInfo> posts) {
        this.activity = activity;
        this.posts = posts;
    }

    //holder
    public static class Post_Holder extends RecyclerView.ViewHolder { //홀더에 담고싶은 그릇(이미지뷰)를 정함

        public Post_Holder(@NonNull View itemView) {
            super(itemView);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
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

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}