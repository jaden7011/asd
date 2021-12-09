package com.example.coin_gogogo.utility;

import android.app.Activity;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;

import com.example.coin_gogogo.adapter.Coin_Adapter;

public class Utility {
    private Activity activity;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter<RecyclerView.ViewHolder> adapter;

    public Utility(Activity activity, RecyclerView recyclerView, RecyclerView.Adapter<RecyclerView.ViewHolder> adapter) {
        this.activity = activity;
        this.recyclerView = recyclerView;
        this.adapter = adapter;
    }

    public void RecyclerInit(String orientation) {

        LinearLayoutManager layoutManager = new LinearLayoutManager(activity);

        if (orientation.equals("VERTICAL")) {
            layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
            recyclerView.setLayoutManager(layoutManager);
        } else if (orientation.equals("HORIZEN")) {
            layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
            recyclerView.setLayoutManager(layoutManager);
        } else if (orientation.equals("GRID")) {
            GridLayoutManager gridLayoutManager = new GridLayoutManager(activity, 3);
            recyclerView.setLayoutManager(gridLayoutManager);
        }

        layoutManager.setItemPrefetchEnabled(true); //렌더링 퍼포먼스 향상
//        postAdapter.setHasStableIds(true); 이걸쓰면 게시물 시간이 재사용되서 리셋이 안되는 이슈가 발생
//        postAdapter.setStateRestorationPolicy(RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY); //스크롤 저장하는건데 필요없어짐

        if (adapter instanceof Coin_Adapter) {
            ((Coin_Adapter) adapter).setLinearLayoutManager(layoutManager);
//            ((Coin_Adpater) adapter).setRecyclerView(recyclerView);
        }

        recyclerView.setAdapter(adapter);

        RecyclerView.ItemAnimator animator = recyclerView.getItemAnimator();
        if (animator instanceof SimpleItemAnimator) {
            ((SimpleItemAnimator) animator).setSupportsChangeAnimations(false);
        }

//        if(activity.isDestroyed()){
//            adapter = null;
//            recyclerView = null;
//        }

    }
}
