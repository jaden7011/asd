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
import com.example.coin_gogogo.adapter.Coin_Adapter;
import com.example.coin_gogogo.data.Coin_Info;
import com.example.coin_gogogo.data.Coin_Map;
import com.example.coin_gogogo.data.Ticker;
import com.example.coin_gogogo.data.Ticker_List;
import com.example.coin_gogogo.data.Transaction;
import com.example.coin_gogogo.data.Transaction_List;
import com.example.coin_gogogo.databinding.ActivityMainBinding;
import com.example.coin_gogogo.utility.RxAndroidUtils;
import com.example.coin_gogogo.utility.Utility;
import com.google.gson.Gson;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    private RequestQueue requestQueue;
    private ArrayList<Coin_Info> coins = new ArrayList<>();
    private final Coin_Map coin_map = new Coin_Map();
    private final Map<String,String> Coin_Map = coin_map.getCoin_names();
    private Map<String,Coin_Info> coin_Info_map = coin_map.getCoins_map();;
    private ArrayList<Coin_Info> res_coins  = new ArrayList<>();
    private Coin_Adapter coin_adpater;
    private boolean isRunning=true;
    private final Activity activity = this;
    private Disposable ET_Observable_Disposable;

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

        NetworkThread thread= new NetworkThread();
        isRunning=true;
        thread.start();
    }

    class NetworkThread extends Thread{
        @Override
        public void run() {
            while(isRunning) {
                try {
                    for(Map.Entry<String,String> entry : Coin_Map.entrySet()){
                        String Key_sub = entry.getKey(); //ex) BTC
                        String Val_fullname = entry.getValue(); //ex) 비트코인

                        Get_Transaction(Key_sub, new Listener_Complete_Get_Transaction() {
                            @Override
                            public void onComplete(Transaction transaction) { //현재가 먼저 찾고
                                Get_Ticker(Key_sub, new Listener_Complete_Get_Ticker() {
                                    @Override
                                    public void onComplete(Ticker ticker) { //변동률 찾고
                                        coin_Info_map.put(Key_sub,new Coin_Info(Val_fullname,Key_sub,transaction.price,ticker.prev_closing_price,ticker.fluctate_rate_24H,ticker.acc_trade_value_24H));

                                        if(coin_Info_map.size() == 36)
                                            runOnUiThread(new Runnable() {
                                                @Override
                                                public void run() {
//                                                Log.d("runOnUIThread","original size: "+Coin_Map.keySet().size()+"\nres size: "+coin_Info_map.size());
                                                    Show_Recycler();
                                                }
                                            });
                                    }
                                });
                            }
                        });
                    }
                    Thread.sleep(5000);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void Show_Recycler(){
        if(coin_Info_map.size() != 36)
            return;

//        Log.d("Show_Recycler","size : "+coin_Info_map.size());
        isRunning = false;
        coins.clear();
        for(Map.Entry<String,Coin_Info> entry : coin_Info_map.entrySet()){
//            Log.d("Show_Recycler","name : "+entry.getValue().Name+"\nprice: "+entry.getValue().Price);
            coins.add(entry.getValue());
        }
        Log.d("Show_Recycler","size : "+coins.size());
        coin_adpater.CoinDiffUtil(new ArrayList<>(coins));
//        coin_adpater.notifyDataSetChanged();
        coin_Info_map.clear();
        isRunning = true;
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
        Transaction_List dataList = gson.fromJson(response, Transaction_List.class);

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
        Ticker_List dataList = gson.fromJson(response, Ticker_List.class);

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