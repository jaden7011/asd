package com.example.coin_gogogo.activity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.coin_gogogo.R;
import com.example.coin_gogogo.Retrofit.Repository;
import com.example.coin_gogogo.adapter.Coin_Adapter;
import com.example.coin_gogogo.data.Coin_Info;
import com.example.coin_gogogo.data.Ticker;
import com.example.coin_gogogo.data.Ticker_Response;
import com.example.coin_gogogo.data.Transaction_List_Response;
import com.example.coin_gogogo.databinding.ActivityMainBinding;
import com.example.coin_gogogo.utility.RxAndroidUtils;
import com.example.coin_gogogo.utility.Utility;
import com.google.gson.Gson;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    private ArrayList<Coin_Info> coins = new ArrayList<>();
    private Coin_Adapter coin_adpater;
    private Disposable ET_Observable_Disposable;
    private HashMap<String,Coin_Info> coin_infos = new HashMap<>();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ET_Observable_Disposable.dispose();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        coin_adpater = new Coin_Adapter(this,new ArrayList<Coin_Info>());
        Utility utility = new Utility(this,binding.CoinRecyclerView,coin_adpater);
        utility.RecyclerInit("VERTICAL");

//////////////////////////////////////////////////////////////////////////////////////////////////////////// rxjava debounce로 자동검색 -> 버튼이 필요 x
        Observable<String> editTextObservable =
                RxAndroidUtils.getInstance().getEditTextObservable(binding.searchET);

        ET_Observable_Disposable = editTextObservable
                .debounce(500, TimeUnit.MILLISECONDS)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(s->{
                    s = s.toUpperCase();
                    Log.d(RxAndroidUtils.getInstance().getTAG(),s);

                    if(s.length() >= 2) {
                        HashMap<String,Coin_Info> searched = Search(s);
                        Log.d("Search","size:" + searched.size());

                        if (searched != null && searched.size() != 0){
                            Toast("검색되었습니다.");
                            Show_Recycler(searched);
                        }else{
                            Toast("검색결과가 없습니다.");
                        }
                    }else if(s.length() == 0){
                        Get_API();
                    }
                });
///////////////////////////////////////////////////////////////////////////////////////////////////////////////

//        Observable<Coin_Info> observable = Observable
//                .fromIterable(coins)
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread());
//
//        observable.subscribe(new io.reactivex.rxjava3.core.Observer<Coin_Info>() {
//            @Override
//            public void onSubscribe(@NonNull Disposable d) {
//                Log.d("onSubscribe","name: ");
////                       Get_API();
////                coin_infos.add(new Coin_Info("1","a","24","24","24","24"));
////                coin_infos.add(new Coin_Info("2","a","24","24","24","24"));
////                coin_infos.add(new Coin_Info("3","a","24","24","24","24"));
////                coin_infos.add(new Coin_Info("4","a","24","24","24","24"));
////                coin_infos.add(new Coin_Info("5","a","24","24","24","24"));
//            }
//
//            @Override
//            public void onNext(@NonNull Coin_Info coin_info) {
//                Log.d("observable","name: "+coin_info.Name);
//                Toast(coin_info.Name);
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

        //todo 몇 개만 찾아서 띄우고 대화방으로 -> 검색기능은 repeate이 없으면 쉬움 -? repeate이 있다면 중간에 transaction에서 필터링 해줘야함

    }

    public void Get_API(){

       Repository.getInstance().get_Ticker("ALL")
               .subscribeOn(Schedulers.io())
//               .observeOn(AndroidSchedulers.mainThread())
               .retry()
               .doOnError(Throwable::printStackTrace)
               .subscribe(new Consumer<Ticker_Response>() {
                   @Override
                   public void accept(Ticker_Response result) throws Throwable {
                       Log.d("Get_API onNext: ", result.data.size() - 1 + "");
                       int cnt = 0;

                       for (Map.Entry<String,Object> entry : result.data.entrySet()) {
                           Log.d("Get_API cnt: ", cnt + "");
                           if(cnt == 30)
                               break;
                           else
                               cnt++;

                           String name = entry.getKey();
                           Object obj = entry.getValue();

                           if (!name.equals("date")) { //데이터 마지막에 껴있는 date 항목 제외
                               //gson으로 object -> json -> class로 변경
                               Gson gson = new Gson();
                               String json = gson.toJson(obj);
                               Ticker ticker = gson.fromJson(json, Ticker.class);

                               Repository.getInstance().get_Transaction_Single(name, 1)
                                       .subscribeOn(Schedulers.io())
                                       .observeOn(AndroidSchedulers.mainThread())
                                       .doOnError(Throwable::printStackTrace)
                                       .subscribe(new Consumer<Transaction_List_Response>() {
                                           @Override
                                           public void accept(Transaction_List_Response transaction_list_response) throws Throwable {

                                               coin_infos.put(name,new Coin_Info(
                                                       name,
                                                       name,
                                                       transaction_list_response.data.get(0).price,
                                                       ticker.prev_closing_price,
                                                       ticker.fluctate_rate_24H,
                                                       ticker.acc_trade_value_24H
                                               ));
                                               Log.d("Get_API coin_infos: ", coin_infos.size() + "");
//                                               if (coin_infos.size() == result.data.size() - 1)
                                               if(coin_infos.size() == 30)
                                               {
                                                   Log.d("Get_API size: ", result.data.size() - 1 + "");
                                                   Show_Recycler(coin_infos);
                                               }
                                           }
                                       });
//                               Log.d("Get_APIx", obj + "");
//                               Log.d("Get_API", ticker.prev_closing_price + "");
                           }
                       }
                   }
               });
    }

    public void Show_Recycler(HashMap<String,Coin_Info> param_coin_set){
        coins.addAll(param_coin_set.values());

        Log.d("Show_Recycler","size : "+coins.size());

        coins.sort(new Comparator<Coin_Info>() {
            @Override
            public int compare(Coin_Info o1, Coin_Info o2) {
                if(Double.parseDouble(o1.Total) <= Double.parseDouble(o2.Total))
                    return 1;
                else return -1;
            }
        });

        coin_adpater.CoinDiffUtil(new ArrayList<>(coins));
        coins.clear();
    }

    public HashMap<String,Coin_Info> Search(String keyword){

        HashMap<String,Coin_Info> searched = new HashMap<>();

        for(Map.Entry<String,Coin_Info> entry : coin_infos.entrySet()){
            if(entry.getKey().contains(keyword)){
                searched.put(entry.getKey(),entry.getValue());
            }
        }

        return searched;
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