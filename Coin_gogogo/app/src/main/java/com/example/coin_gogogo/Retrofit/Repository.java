package com.example.coin_gogogo.Retrofit;

import com.example.coin_gogogo.data.Candle_List;
import com.example.coin_gogogo.data.Ticker_Response;
import com.example.coin_gogogo.data.Transaction_List_Response;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

public class Repository {

    private static Repository instance;

    private Repository() {
    }

    // 싱클턴으로 사용
    public static Repository getInstance() {
        if (instance == null)
            instance = new Repository();
        return instance;
    }

    public Observable<Ticker_Response> get_Ticker_obs(String paht){
        return RetrofitFactory
                .createRetrofit("https://api.bithumb.com/")
                .create(ExampleService.class)
                .TICKER_OBS(paht);
    }

    public Observable<Transaction_List_Response> get_Transaction_obs(String path, int count){
        return RetrofitFactory
                .createRetrofit("https://api.bithumb.com/")
                .create(ExampleService.class)
                .TRANSACTION_LIST_OBS(path,count);
    }


    public Single<Ticker_Response> get_Ticker(String paht){
        return RetrofitFactory
                .createRetrofit("https://api.bithumb.com/")
                .create(ExampleService.class)
                .TICKER_SINGLE(paht);
    }

    public Single<Transaction_List_Response> get_Transaction_Single(String path, int count){
        return RetrofitFactory
                .createRetrofit("https://api.bithumb.com/")
                .create(ExampleService.class)
                .TRANSACTION_LIST_SINGLE(path,count);
    }

    public Single<Candle_List> get_CandleList_Single(String path){
        return RetrofitFactory
                .createRetrofit("https://api.bithumb.com/")
                .create(ExampleService.class)
                .CANDLE_LIST_SINGLE(path);
    }

}
