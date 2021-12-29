package com.example.coin_gogogo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.coin_gogogo.R;
import com.example.coin_gogogo.adapter.Coin_Adapter;
import com.example.coin_gogogo.data.Ticker;
import com.example.coin_gogogo.databinding.ActivityMainBinding;
import com.example.coin_gogogo.model.MutableLiveData_TickerMap;
import com.example.coin_gogogo.utility.RxAndroidUtils;
import com.example.coin_gogogo.utility.Utility;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    private Activity activity = this;
    private Coin_Adapter coin_adpater;
    private Disposable ET_Observable_Disposable;
    private MutableLiveData_TickerMap liveData_tickerMap;
    private NetworkThread thread_all;
    private NetworkThread thread_search;

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ET_Observable_Disposable.dispose();
        if (liveData_tickerMap.disposable != null)
            liveData_tickerMap.disposable.dispose();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        coin_adpater = new Coin_Adapter(this, new ArrayList<Ticker>());
        Utility utility = new Utility(this, binding.CoinRecyclerView, coin_adpater);
        utility.RecyclerInit("VERTICAL");

        liveData_tickerMap = new ViewModelProvider(this).get(MutableLiveData_TickerMap.class);
        liveData_tickerMap.setActivity(this);
        liveData_tickerMap.setAdapter(coin_adpater);
        liveData_tickerMap.setBinding(binding);
        liveData_tickerMap.get().observe(this, new Observer<Map<String, Ticker>>() {
            @Override
            public void onChanged(Map<String, Ticker> stringTickerMap) {
                coin_adpater.CoinDiffUtil(liveData_tickerMap.to_SortedArray(stringTickerMap));
            }
        });

//////////////////////////////////////////////////////////////////////////////////////////////////////////// rxjava debounce로 자동검색 -> 버튼이 필요 x
        Observable<String> editTextObservable =
                RxAndroidUtils.getInstance().getEditTextObservable(binding.searchET);

        ET_Observable_Disposable = editTextObservable
                .debounce(700, TimeUnit.MILLISECONDS)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(s -> {
                    s = s.toUpperCase();
                    Log.d("editTextObservable_Main", s);

                    if (s.length() >= 2) {
                        if (liveData_tickerMap.disposable != null) //전체를 찾던 거 dispose
                            liveData_tickerMap.disposable.dispose();

                        if(thread_all != null && thread_all.isRunning){ //전체검색 후 검색
                            thread_all.isRunning=false;
                            thread_all.interrupt();
                            thread_search = new NetworkThread(s);
                            thread_search.start();
                        }else if(thread_search != null && thread_search.isRunning){ //검색하고 또 검색할 때 쓰레드 중복방지
                            thread_search.isRunning=false;
                            thread_search = new NetworkThread(s);
                            thread_search.start();
                        }
                    } else if (s.length() == 0) {
                        if (liveData_tickerMap.disposable != null) // 일부를 찾던 거 dispose
                            liveData_tickerMap.disposable.dispose();

                        if(thread_search != null && thread_search.isRunning){
                            thread_search.isRunning=false;
                            thread_search.interrupt();
                            thread_all = new NetworkThread(s);
                            thread_all.start();
                        }else{
                            thread_all = new NetworkThread(s);
                            thread_all.start();
                        }
                    } else {
                        Toast("2글자 이상 입력해주세요.");
                    }
                });

    }

    class NetworkThread extends Thread {

        private String search_ET;
        private boolean isRunning = true;
//        private MutableLiveData_TickerMap liveData_tickerMap;

        private NetworkThread(String search_ET) {
            this.search_ET = search_ET;
        }
//
//        public static NetworkThread getInstance() {
//            return LazyHolder.INSTANCE;
//        }
//
//        private static class LazyHolder extends NetworkThread {
//            private static final NetworkThread INSTANCE = new NetworkThread();
//        }

        @Override
        public void run() {
            while (isRunning) {
                try {
                    Log.d("NetworkThread", "running");
                    liveData_tickerMap.Get_API(search_ET);
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

//        public String getSearch_ET() {
//            return search_ET;
//        }
//
        public void setSearch_ET(String search_ET) {
            this.search_ET = search_ET;
        }
//
//        public boolean isRunning() {
//            return isRunning;
//        }
//
        public void setRunning(boolean running) {
            isRunning = running;
        }
//
//        public MutableLiveData_TickerMap getLiveData_tickerMap() {
//            return liveData_tickerMap;
//        }
//
//        public void setLiveData_tickerMap(MutableLiveData_TickerMap liveData_tickerMap) {
//            this.liveData_tickerMap = liveData_tickerMap;
//        }
    }

    public String toDouble(Double num) { //코인 갯수를 소수점으로
        DecimalFormat df = null;

        if (num >= 100 && num <= 999.9)
            df = new DecimalFormat("000.0");
        else if (num >= 10 && num <= 99.99)
            df = new DecimalFormat("00.00");
        else if (num >= 1 && num <= 9.9999)
            df = new DecimalFormat("0.000");
        else if (num < 1)
            df = new DecimalFormat("0.0000");
        else
            df = new DecimalFormat("###,###,###");

        return df.format(num);
    }

    public void Toast(String str) {
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }
}

//
//    private void Get_Ticker(String CoinNm,Listener_Complete_Get_Ticker listener){
//
//        final String CoinName = CoinNm;
//        String url = "https://api.bithumb.com/public/ticker/"+CoinNm+"_KRW";
//
//        StringRequest stringRequest = new StringRequest(Request.Method.GET,url,
//                new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
////                        Log.d("onResponse_Ticker","onResponse 진입");
//                        listener.onComplete(Ticker_Respose(response));
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
//
//        stringRequest.setShouldCache(false);
//        requestQueue.add(stringRequest);
//    }
//
//    private void Get_Transaction(String CoinNm,Listener_Complete_Get_Transaction listener){
//
//        final String CoinName = CoinNm;
//        String url = "https://api.bithumb.com/public/transaction_history/"+CoinNm+"_KRW";
//
//        StringRequest stringRequest = new StringRequest(Request.Method.GET,url,
//                new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
////                        Log.d("onResponse_Transaction","onResponse 진입");
//                        listener.onComplete(Transaction_history_Respose(response));
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
//
//        stringRequest.setShouldCache(false);
//        requestQueue.add(stringRequest);
//    }
//
//    private Transaction Transaction_history_Respose(String response){
//        Gson gson = new Gson();
//        Transaction_List_Response dataList = gson.fromJson(response, Transaction_List_Response.class);
//
//        //상태값이 성공일 때 -> 데이터 뿌려줄 예정
//        if(dataList.status.equals("0000")){
////            Log.d("Transaction_history_Respose","size: "+dataList.data.size());
//            ArrayList<Transaction> transactions = new ArrayList<>();
//            for(int x=0; x<dataList.data.size();x++){
//                transactions.add(new Transaction(dataList.data.get(x).transaction_date,dataList.data.get(x).price,dataList.data.get(x).type));
//            }
//
//            //뒤로 갈수록 최신임을 확인
////            Log.d("Transaction_history_Respose","first: "+transactions.get(0).transaction_date+"\nlast: "+transactions.get(transactions.size()-1).transaction_date);
//            return transactions.get(transactions.size()-1);
//        }else
//            return null;
//    }

//    private Ticker Ticker_Respose(String response){
//        Gson gson = new Gson();
//        Ticker_Response dataList = gson.fromJson(response, Ticker_Response.class);
//
//        //상태값이 성공일 때 -> 데이터 뿌려줄 예정
//        if(dataList.status.equals("0000")){
//            Ticker ticker = new Ticker(dataList.data.prev_closing_price,dataList.data.acc_trade_value_24H,dataList.data.fluctate_rate_24H);
////            Log.d("Ticker_Respose","val: "+dataList.data.acc_trade_value_24H+"close: "+dataList.data.prev_closing_price+"rate: "+dataList.data.fluctate_rate_24H);
//            return ticker;
//        }else
//            return null;
//    }