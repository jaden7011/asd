package com.example.coin_gogogo.model;

import android.app.Activity;
import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.coin_gogogo.Retrofit.Repository;
import com.example.coin_gogogo.adapter.Coin_Adapter;
import com.example.coin_gogogo.data.Ticker;
import com.example.coin_gogogo.data.Ticker_Response;
import com.example.coin_gogogo.databinding.ActivityMainBinding;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class MutableLiveData_TickerMap extends ViewModel {

    public Single<Ticker_Response> observable = Repository.getInstance().get_Ticker("ALL");
    public Disposable disposable;
    private MutableLiveData<Map<String, Ticker>> coins;
    private MutableLiveData_TickerMap liveData_tickerMap = this;
    private Activity activity;
    private ActivityMainBinding binding;
    private Coin_Adapter adapter;

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public ActivityMainBinding getBinding() {
        return binding;
    }

    public void setBinding(ActivityMainBinding binding) {
        this.binding = binding;
    }

    public Coin_Adapter getAdapter() {
        return adapter;
    }

    public void setAdapter(Coin_Adapter adapter) {
        this.adapter = adapter;
    }

    public MutableLiveData<Map<String, Ticker>> get(){
        if(coins == null){
            coins = new MutableLiveData<>();
        }
        return coins;
    }

    public void Get_API(String search_str){

        disposable = observable
//                .delay(10, TimeUnit.SECONDS)
//                .repeat()
                .retryWhen(errors -> {
                    AtomicInteger counter = new AtomicInteger();
                    return errors
                            .takeWhile(e -> counter.getAndIncrement() != 1000)
                            .flatMap(e -> {
                                System.out.println("delay retry by " + counter.get() + " second(s)");
                                return Flowable.timer(counter.get(), TimeUnit.SECONDS);
                            });
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
//                .doOnComplete(new Action() {
//                    @Override
//                    public void run() throws Throwable {
//                    }
//                })
                .subscribe(new Consumer<Ticker_Response>() {
                    @Override
                    public void accept(Ticker_Response result) throws Throwable {

                        Map<String,Ticker> map = new HashMap<>();

                        if(coins.getValue() != null)
                            Log.d("accept", "coins.getValue().size(): " + coins.getValue().size()+"");

                        int cnt = 0;

                        for (Map.Entry<String, Object> entry : result.data.entrySet()) {

                            Log.d("Get_API cnt: ", cnt + "");
                            if (cnt == 30)
                                break;
                            else
                                cnt++;

                            String name = entry.getKey();
                            Object obj = entry.getValue();

                            if (!name.equals("date")) { //데이터 마지막에 껴있는 date 항목 제외
                                if( (search_str.length() >= 2 && name.contains(search_str)) || search_str.length() == 0) {
                                    if(search_str.length()>=2)
                                        Log.d("Get_API,search_str", "search_str: " + search_str.length());

                                    //gson으로 object -> json -> class로 변경
                                    Gson gson = new Gson();
                                    String json = gson.toJson(obj);
                                    Ticker ticker = gson.fromJson(json, Ticker.class);
                                    ticker.setName(name);
                                    ticker.setSub_name(name); //todo 한글이름도 추가해줘야함

                                    map.put(name,ticker);
                                }
                            }
                        }
                        Log.d("Get_API,coins", "map.size(): " + map.size()+"");
                        coins.setValue(map);
                    }
                });
    }

    public void search(String str){

        Map<String,Ticker> map = this.coins.getValue();
        Map<String,Ticker> searched = new HashMap<>();

        if(map != null){
            for(Map.Entry<String,Ticker> entry: map.entrySet()){
                String name = entry.getKey();
                Ticker ticker = entry.getValue();

                if(name.contains(str))
                    searched.put(name,ticker);
            }
            coins.setValue(map);
        }else{
            Log.d("livedata_ticker"," NO searched ");
        }

    }

    public void add(String key_name,Ticker val_ticker){

        Map<String, Ticker> map = this.get().getValue();

        if(map == null){
            map = new HashMap<>();
            map.put(key_name,val_ticker);
            coins.setValue(map);
        }else{
            map.put(key_name,val_ticker);
            coins.setValue(map);
        }
    }

    public void remove(String key_name){

        Map<String, Ticker> map = this.get().getValue();

        if(map == null){
            map = new HashMap<>();
            map.remove(key_name);
            coins.setValue(map);
        }else{
            map.remove(key_name);
            coins.setValue(map);
        }
    }

    public void clear(){
        coins.setValue(new HashMap<>());
    }

    public ArrayList<Ticker> to_SortedArray(Map<String,Ticker> map){

        ArrayList<Ticker> list = new ArrayList<>(map.values());

        Log.d("Show_Recycler","size : "+list.size());

        list.sort(new Comparator<Ticker>() {
            @Override
            public int compare(Ticker o1, Ticker o2) {
                if(Double.parseDouble(o1.acc_trade_value_24H) <= Double.parseDouble(o2.acc_trade_value_24H))
                    return 1;
                else return -1;
            }
        });

        return list;
    }

}
