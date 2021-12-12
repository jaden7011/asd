package com.example.coin_gogogo.Retrofit;

import com.example.coin_gogogo.data.Result;
import com.example.coin_gogogo.data.Transaction;

import retrofit2.Call;

public class Repository {

    private static Repository instance;

    private Repository() {
    }
    // 싱클턴으로 사용
    public static Repository getInstance(){
        if(instance == null)
            instance = new Repository();
        return instance;
    }

    public Call<Result> get_ticker(String path) {
        return RetrofitFactory
                .createRetrofit("https://api.bithumb.com/")
                .create(ExampleService.class)
                .tickerInfo(path);
    }

    public Call<Transaction> get_transaction(String path) {
        return RetrofitFactory
                .createRetrofit("https://api.bithumb.com/") // Retrofit객체 반환
                .create(ExampleService.class)
                .transactionInfo(path);
    }

}
