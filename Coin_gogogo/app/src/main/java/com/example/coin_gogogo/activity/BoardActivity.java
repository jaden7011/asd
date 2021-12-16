package com.example.coin_gogogo.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.android.volley.RequestQueue;
import com.example.coin_gogogo.R;
import com.example.coin_gogogo.Retrofit.Repository;
import com.example.coin_gogogo.adapter.Post_Adapter;
import com.example.coin_gogogo.data.Candle;
import com.example.coin_gogogo.data.Candle_List;
import com.example.coin_gogogo.data.MutableLiveData_candles;
import com.example.coin_gogogo.databinding.ActivityBoardBinding;
import com.example.coin_gogogo.info.PostInfo;
import com.example.coin_gogogo.model.Firebase_Model;
import com.example.coin_gogogo.utility.Utility;

import java.util.ArrayList;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.schedulers.Schedulers;

import static com.example.coin_gogogo.utility.Named.DELETE_RESULT;
import static com.example.coin_gogogo.utility.Named.WRITE_RESULT;

public class BoardActivity extends AppCompatActivity {

    ActivityBoardBinding binding;
    private Toolbar toolbar;
    private ActionBar actionBar;
    private String coin;
    private RequestQueue requestQueue;
    private Utility utility;
    private Post_Adapter post_adapter;
    private MutableLiveData_candles liveData_candles;


    @Override
    protected void onResume() {
        super.onResume();
        Log.d("onResume","onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("onRestart","onRestart");
        Get_Post();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("onDestroy","onDestroy");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_board);

        liveData_candles = new ViewModelProvider(this)
                .get(MutableLiveData_candles.class);

        liveData_candles.get().observe(this, new Observer<ArrayList<Candle>>() {
            @Override
            public void onChanged(ArrayList<Candle> candles) {
                Show_Recycler(candles);
            }
        });
//
//        if (requestQueue == null)
//            requestQueue = Volley.newRequestQueue(getApplicationContext());

        Bundle bundle = getIntent().getExtras();
        coin = bundle.getString("coin");
        Log.d("Start BoardActivity","coin: "+ coin);

        setToolbar();
//        Get_Candlestick(coin);
        Get_API(coin);
    }

    public void Get_Post(){
        binding.boardLoadingview.loaderLyaout.setVisibility(View.VISIBLE);

        ArrayList<PostInfo> posts_new = new ArrayList<>();
        posts_new.add(null);

        Firebase_Model.getInstance().Request_Posts(coin, new Firebase_Model.Listener_Request_Posts() {
            @Override
            public void onComplete(ArrayList<PostInfo> newPosts) {
                binding.boardLoadingview.loaderLyaout.setVisibility(View.GONE);
                posts_new.addAll(newPosts);
                post_adapter.PostDiffUtil(posts_new);
                binding.BoardRecycler.smoothScrollToPosition(0);
            }
            @Override
            public void onFail() {
                binding.boardLoadingview.loaderLyaout.setVisibility(View.GONE);
            }
        });
    }

    public void setToolbar () {
        toolbar = findViewById(R.id.toolbar_board);
        setSupportActionBar(toolbar);
        actionBar = getSupportActionBar();
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);//기본 제목을 없애줍니다.
        actionBar.setDisplayHomeAsUpEnabled(true);
        toolbar.setTitle(coin);
    }

    private void Get_API(String coin){
        Repository.getInstance().get_CandleList_Single(coin)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<Candle_List>() {
                    @Override
                    public void onSubscribe(@io.reactivex.rxjava3.annotations.NonNull Disposable d) {}
                    @Override
                    public void onSuccess(@io.reactivex.rxjava3.annotations.NonNull Candle_List candle_list) {
                        Log.d("onSuccess","onSuccess[size]: "+candle_list.data.size());
//                        Log.d("onSuccess","onSuccess[0]: "+candle_list.data.get(0).get(0));
//                        Log.d("onSuccess","onSuccess[1]: "+candle_list.data.get(0).get(1));
//                        Log.d("onSuccess","onSuccess[2]: "+candle_list.data.get(0).get(2));
//                        Log.d("onSuccess","onSuccess[3]: "+candle_list.data.get(0).get(3));
//                        Log.d("onSuccess","onSuccess[4]: "+candle_list.data.get(0).get(4));
//                        Log.d("onSuccess","onSuccess[5]: "+candle_list.data.get(0).get(5));

                        ArrayList<Candle> candles = new ArrayList<>();

                        for(int y = 0; y<candle_list.data.size(); y++){
                            ArrayList<String> candle_data = candle_list.data.get(y);
                                candles.add(new Candle(
                                        candle_data.get(0),
                                        candle_data.get(1),
                                        candle_data.get(2),
                                        candle_data.get(3),
                                        candle_data.get(4),
                                        candle_data.get(5)));
//                                Log.d("onSuccess","onSuccess[0]: "+candle_list.data.get(x).get(0));
//                                Log.d("onSuccess","onSuccess[1]: "+candle_list.data.get(x).get(1));
//                                Log.d("onSuccess","onSuccess[2]: "+candle_list.data.get(x).get(2));
//                                Log.d("onSuccess","onSuccess[3]: "+candle_list.data.get(x).get(3));
//                                Log.d("onSuccess","onSuccess[4]: "+candle_list.data.get(x).get(4));
//                                Log.d("onSuccess","onSuccess[5]: "+candle_list.data.get(x).get(5));
                            }
                        Log.d("onSuccess","candles: "+candles.size());
                        liveData_candles.get().setValue(candles);
                    }
                    @Override
                    public void onError(@io.reactivex.rxjava3.annotations.NonNull Throwable e) {
                        Log.d("onError","onError: "+e.getMessage());
                    }
                });
    }

    private void Show_Recycler(ArrayList<Candle> candles){
        Log.d("Show_Recycler","candles size: "+candles.size());

        ArrayList<PostInfo> postInfos = new ArrayList<>();
        postInfos.add(null);

        post_adapter = new Post_Adapter(this,postInfos,candles);
        utility = new Utility(this,binding.BoardRecycler,post_adapter);
        utility.RecyclerInit("VERTICAL");

        Get_Post();
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.toolbar_main_write_post_btn:{
                Activity(WriteActivity.class, coin);
                break;
            }
            case R.id.toolbar_main_search:{
//                if(myAccount != null)
//                    Activity(SearchActivity.class,myAccount.getLocation());
                break;
            }
            case R.id.toolbar_main_reset:{
                item.setEnabled(false);
                Get_Post();

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        item.setEnabled(true);
                    }
                }, 1500); //딜레이 타임 조절
                break;
            }
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) { //커스텀툴바의 메뉴를 적용해주기
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.toolbar_menu, menu);
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == WRITE_RESULT) { //글쓰기 리턴값
            Log.d("From WriteActivity","requestCode: "+requestCode);
            //todo 새로고침
        }

        if (resultCode == DELETE_RESULT) { //글삭제 리턴값
            //todo 새로고침
            Log.d("From PostActivity","requestCode: "+requestCode);
        }
    }
    public void Activity(Class c){
        Intent intent = new Intent(this,c);
        startActivityForResult(intent,1);
    }

    public void Activity(Class c,String coin){
        Intent intent = new Intent(this,c);
        intent.putExtra("coin",coin);
        startActivityForResult(intent,1);
    }
}

//    private void Get_Candlestick(String CoinNm){
//
//        String url = "https://api.bithumb.com/public/candlestick/"+CoinNm+"_KRW/24h";
//
//        StringRequest stringRequest = new StringRequest(Request.Method.GET,url,
//                new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
//                        Log.d("onResponse_Candlestick","onResponse 진입");
//                        ArrayList<Candle> candles = Candle_Response(response);
//                        Show_Recycler(candles);
//                    }
//                }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                Log.d("onErrorResponse","에러남: "+error);
//            }
//        }){
//            @Override
//            protected Map<String, String> getParams() throws AuthFailureError {
//                Map<String,String> params = new HashMap<String,String>();
//                return params;
//            }
//        };
//        stringRequest.setShouldCache(false);
//        requestQueue.add(stringRequest);
//    }
//
//    private ArrayList<Candle> Candle_Response(String response){
//        Gson gson = new Gson();
//        Candle_List dataList = gson.fromJson(response, Candle_List.class);
//
//        //상태값이 성공일 때 -> 데이터 뿌려줄 예정
//        if(dataList.status.equals("0000")){
//            Log.d("Response","R: success");
//            ArrayList<Candle> candles = new ArrayList<>();
//
//            for(int x=0; x<dataList.data.size();x++) {
//                Candle candle = String_to_candle(dataList.data.get(x).toString());
//                candles.add(candle);
//            }
//            return candles;
//        }else{
//            Log.d("Candle_Response","R: error");
//            return null;
//        }
//    }
//public Candle String_to_candle(String str){
//        str = str.replace("[","");
//        str = str.replace("]","");
////        Log.d("str_to_candle",str);
//
//        Candle candle = new Candle();
//        StringTokenizer stk = new StringTokenizer(str,",");
//        BigDecimal b2 = new BigDecimal(Double.parseDouble(stk.nextToken())); //이렇게 하면 지수표기 안붙음
//
////        Log.d("str_to_candle",b2.toString());
////
////        Long createdAt = Long.parseLong(b2.toString());
////        float open = Float.parseFloat(stk.nextToken());
////        float close = Float.parseFloat(stk.nextToken());
////        float high = Float.parseFloat(stk.nextToken());
////        float low = Float.parseFloat(stk.nextToken());
////        float bids = Float.parseFloat(stk.nextToken());
//
////        Log.d("str_to_candle","creat: "+createdAt+"\nhigh: "+high+"\nlow: "+low+"\nopen: "+open+"\nclose: "+close);
//
//        candle.createdAt = b2.toString();
//        candle.open = stk.nextToken();
//        candle.close = stk.nextToken();
//        candle.high = stk.nextToken();
//        candle.low = stk.nextToken();
//        candle.bids = stk.nextToken();
//
//        return candle;
//    }