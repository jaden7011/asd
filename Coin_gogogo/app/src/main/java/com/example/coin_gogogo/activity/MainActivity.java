package com.example.coin_gogogo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.coin_gogogo.R;
import com.example.coin_gogogo.Retrofit.Repository;
import com.example.coin_gogogo.adapter.Coin_Adapter;
import com.example.coin_gogogo.data.Coin_Info;
import com.example.coin_gogogo.data.Coin_Map;
import com.example.coin_gogogo.data.Ticker;
import com.example.coin_gogogo.data.Ticker_Response;
import com.example.coin_gogogo.data.Transaction;
import com.example.coin_gogogo.data.Transaction_List_Response;
import com.example.coin_gogogo.databinding.ActivityMainBinding;
import com.example.coin_gogogo.utility.RxAndroidUtils;
import com.example.coin_gogogo.utility.Utility;
import com.google.gson.Gson;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    private RequestQueue requestQueue;
    private ArrayList<Coin_Info> coins = new ArrayList<>();
    private final Coin_Map coin_map = new Coin_Map();
    private final Map<String,String> Coin_Map = coin_map.getCoin_names();
    private Map<String,Coin_Info> coin_Info_map = coin_map.getCoins_map();
    private Coin_Adapter coin_adpater;
    private boolean isRunning=true;
    private final Activity activity = this;
    private Disposable ET_Observable_Disposable;

    private Set<Coin_Info> coin_infos = new HashSet<>();

    public interface Listener_Complete_Get_Transaction {
        void onComplete(Transaction transaction);
    }

    public interface Listener_Complete_Get_Ticker {
        void onComplete(Ticker ticker);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ET_Observable_Disposable.dispose();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        if (requestQueue == null)
            requestQueue = Volley.newRequestQueue(getApplicationContext());

        coin_adpater = new Coin_Adapter(this,new ArrayList<Coin_Info>());
        Utility utility = new Utility(activity,binding.CoinRecyclerView,coin_adpater);
        utility.RecyclerInit("VERTICAL");

//        binding.btn.setOnClickListener(new View.OnClickListener() {
//            @Override엘
//            public void onClick(View v) {
//                String c_name = binding.tv.getText().toString().toUpperCase();
//                if(Coin_Map.containsKey(c_name))
//                    Get_Candlestick(binding.tv.getText().toString().toUpperCase());
//                else
//                    Toast("서비스하지 않는 코인입니다.");
//            }
//        });
////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Observable<String> editTextObservable =
                RxAndroidUtils.getInstance().getEditTextObservable(binding.searchET);

        ET_Observable_Disposable = editTextObservable
                .debounce(500, TimeUnit.MILLISECONDS)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(s->{
                    Log.d(RxAndroidUtils.getInstance().getTAG(),s);
                    if(s.length() >= 2) {
                        Toast("님 이제 retrofit + rxjava로 api 가져와보세요");
                    }
                });
///////////////////////////////////////////////////////////////////////////////////////////////////////////////

//        NetworkThread thread= new NetworkThread();
//        isRunning=true;
//        thread.start();

//        Repository.getInstance().get_ticker("BTC").enqueue(new Callback<Ticker>() {
//            @Override
//            public void onResponse(Call<Ticker> call, retrofit2.Response<Ticker> response) {
//                Ticker result = response.body();
//                Log.d("retrofit2",result.getTicker().fluctate_rate_24H);
//                Log.d("retrofit2",result.getTicker().prev_closing_price);
//            }
//            @Override
//            public void onFailure(Call<Ticker> call, Throwable t) {
//                Log.d("retrofit2","f ticker");
//            }
//        });
//
//        Repository.getInstance().get_transaction("BTC",1).enqueue(new Callback<Transaction_List>() {
//            @Override
//            public void onResponse(Call<Transaction_List> call, retrofit2.Response<Transaction_List> response) {
//                Transaction_List result = response.body();
//                Log.d("retrofit2",result.data.get(0).price);
//                Log.d("retrofit2",result.data.get(0).transaction_date);
//                Log.d("retrofit2","갯수: "+result.data.size());
//            }
//            @Override
//            public void onFailure(Call<Transaction_List> call, Throwable t) {
//                Log.d("retrofit2","f transac");
//            }
//        });

//       Observable<Coin_Info> observable = Observable
//               .fromIterable(coin_infos)
//               .subscribeOn(Schedulers.io())
//               .observeOn(AndroidSchedulers.mainThread());
//
//               observable.subscribe(new io.reactivex.rxjava3.core.Observer<Coin_Info>() {
//                   @Override
//                   public void onSubscribe(@NonNull Disposable d) {
//                       Log.d("onSubscribe","name: ");
//                       Get_API();
////                coin_infos.add(new Coin_Info("1","a","24","24","24","24"));
////                coin_infos.add(new Coin_Info("2","a","24","24","24","24"));
////                coin_infos.add(new Coin_Info("3","a","24","24","24","24"));
////                coin_infos.add(new Coin_Info("4","a","24","24","24","24"));
////                coin_infos.add(new Coin_Info("5","a","24","24","24","24"));
//                   }
//
//                   @Override
//                   public void onNext(@NonNull Coin_Info coin_info) {
//                       Log.d("observable","name: "+coin_info.Name);
//                       binding.searchET.setText(coin_info.Name);
//                       Toast(coin_info.Name);
//                   }
//
//                   @Override
//                   public void onError(@NonNull Throwable e) {
//
//                   }
//
//                   @Override
//                   public void onComplete() {
//
//                   }
//               });


//        Set<String> set = new HashSet<>();
//
//        Observable<String> observable1 = Observable
//                .fromIterable(set)
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread());
//
//        observable1
//                .subscribe(new Observer<String>() {
//            @Override
//            public void onSubscribe(@NonNull Disposable d) {
//                set.add("1");
//                set.add("2");
//                set.add("3");
//                set.add("4");
//            }
//
//            @Override
//            public void onNext(@NonNull String s) {
//                Log.d("observable","name: "+s);
//            }
//
//            @Override
//            public void onError(@NonNull Throwable e) {
//
//            }
//
//            @Override
//            public void onComplete() {
//
//            }
//        });

        Get_API();
    }

    public void Get_API(){

        for(Map.Entry<String,String> entry : Coin_Map.entrySet()) {
            String Key_sub = entry.getKey(); //ex) BTC
            String Val_fullname = entry.getValue(); //ex) 비트코인

            Repository.getInstance().get_Transzction_Single(Key_sub,1)
                    .subscribeOn(io.reactivex.rxjava3.schedulers.Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new SingleObserver<Transaction_List_Response>() {
                        @Override
                        public void onSubscribe(@NonNull Disposable d) {}
                        @Override
                        public void onSuccess(@NonNull Transaction_List_Response transactions) {
                            Repository.getInstance().get_Ticker_Single(Key_sub)
                                    .subscribeOn(io.reactivex.rxjava3.schedulers.Schedulers.io())
                                    .observeOn(AndroidSchedulers.mainThread())
                                    .subscribe(new SingleObserver<Ticker_Response>() {
                                        @Override
                                        public void onSubscribe(@NonNull Disposable d) {}
                                        @Override
                                        public void onSuccess(@NonNull Ticker_Response ticker) {
                                            coin_infos.add(new Coin_Info(
                                                    Val_fullname,
                                                    Key_sub,
                                                    transactions.data.get(0).price,
                                                    ticker.data.prev_closing_price,
                                                    ticker.data.fluctate_rate_24H,
                                                    ticker.data.acc_trade_value_24H
                                            ));

                                            Log.d("retrofit2x","prev_closing_price: "+ticker.data.prev_closing_price);
                                            Log.d("retrofit2x","fluctate_rate_24H: "+ticker.data.fluctate_rate_24H);
                                            Log.d("retrofit2x","acc_trade_value_24H: "+ticker.data.acc_trade_value_24H);
                                            Log.d("retrofit2x","transactions price: "+transactions.data.get(0).price);

                                            if (coin_infos.size() == 36){
                                                Log.d("retrofit2x","결과물: "+coin_infos.size());
                                                Show_Recycler();
                                            }else
                                                Log.d("retrofit2","결과물: "+coin_infos.size());
                                        }
                                        @Override
                                        public void onError(@NonNull Throwable e) {}
                                    });
                        }
                        @Override
                        public void onError(@NonNull Throwable e) {}
                    });
        }
    }

    public void Show_Recycler(){
        if(coin_infos.size() != 36)
            return;
        coins.addAll(coin_infos);

        Log.d("Show_Recycler","size : "+coins.size());

        coins.sort(new Comparator<Coin_Info>() {
            @Override
            public int compare(Coin_Info o1, Coin_Info o2) {
                Log.d("Show_Recycler","o1 : "+o1.Total+"\no2 : "+o2.Total);
                if(Double.parseDouble(o1.Total) <= Double.parseDouble(o2.Total))
                    return 1;
                else return -1;
            }
        });

        coin_adpater.CoinDiffUtil(new ArrayList<>(coins));
        coins.clear();
    }


    private void Get_Ticker(String CoinNm,Listener_Complete_Get_Ticker listener){

        final String CoinName = CoinNm;
        String url = "https://api.bithumb.com/public/ticker/"+CoinNm+"_KRW";

        StringRequest stringRequest = new StringRequest(Request.Method.GET,url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
//                        Log.d("onResponse_Ticker","onResponse 진입");
                        listener.onComplete(Ticker_Respose(response));
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("onErrorResponse","에러남: "+error);
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> params = new HashMap<String,String>();
                return params;
            }
        };

        stringRequest.setShouldCache(false);
        requestQueue.add(stringRequest);
    }

    private void Get_Transaction(String CoinNm,Listener_Complete_Get_Transaction listener){

        final String CoinName = CoinNm;
        String url = "https://api.bithumb.com/public/transaction_history/"+CoinNm+"_KRW";

        StringRequest stringRequest = new StringRequest(Request.Method.GET,url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
//                        Log.d("onResponse_Transaction","onResponse 진입");
                        listener.onComplete(Transaction_history_Respose(response));
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("onErrorResponse","에러남: "+error);
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> params = new HashMap<String,String>();
                return params;
            }
        };

        stringRequest.setShouldCache(false);
        requestQueue.add(stringRequest);
    }

    private Transaction Transaction_history_Respose(String response){
        Gson gson = new Gson();
        Transaction_List_Response dataList = gson.fromJson(response, Transaction_List_Response.class);

        //상태값이 성공일 때 -> 데이터 뿌려줄 예정
        if(dataList.status.equals("0000")){
//            Log.d("Transaction_history_Respose","size: "+dataList.data.size());
            ArrayList<Transaction> transactions = new ArrayList<>();
            for(int x=0; x<dataList.data.size();x++){
                transactions.add(new Transaction(dataList.data.get(x).transaction_date,dataList.data.get(x).price,dataList.data.get(x).type));
            }

            //뒤로 갈수록 최신임을 확인
//            Log.d("Transaction_history_Respose","first: "+transactions.get(0).transaction_date+"\nlast: "+transactions.get(transactions.size()-1).transaction_date);
            return transactions.get(transactions.size()-1);
        }else
            return null;
    }

    private Ticker Ticker_Respose(String response){
        Gson gson = new Gson();
        Ticker_Response dataList = gson.fromJson(response, Ticker_Response.class);

        //상태값이 성공일 때 -> 데이터 뿌려줄 예정
        if(dataList.status.equals("0000")){
            Ticker ticker = new Ticker(dataList.data.prev_closing_price,dataList.data.acc_trade_value_24H,dataList.data.fluctate_rate_24H);
//            Log.d("Ticker_Respose","val: "+dataList.data.acc_trade_value_24H+"close: "+dataList.data.prev_closing_price+"rate: "+dataList.data.fluctate_rate_24H);
            return ticker;
        }else
            return null;
    }

    public String toDouble(Double num){ //코인 갯수를 소수점으로
        DecimalFormat df = null;

        if(num >= 100 && num <= 999.9)
            df = new DecimalFormat("000.0");
        else if(num >= 10 && num <= 99.99)
            df = new DecimalFormat("00.00");
        else if(num >= 1 && num <= 9.9999)
            df = new DecimalFormat("0.000");
        else if(num<1)
            df = new DecimalFormat("0.0000");
        else
            df = new DecimalFormat("###,###,###");

        return df.format(num);
    }

    public void Toast(String str){
        Toast.makeText(this,str,Toast.LENGTH_SHORT).show(); }

}