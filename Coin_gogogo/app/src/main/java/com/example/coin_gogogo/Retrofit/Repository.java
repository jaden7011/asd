package com.example.coin_gogogo.Retrofit;

import android.util.Log;

import com.example.coin_gogogo.data.Coin_Info;
import com.example.coin_gogogo.data.Coin_Map;
import com.example.coin_gogogo.data.Ticker;
import com.example.coin_gogogo.data.Transaction_List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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

    public Call<Ticker> get_ticker(String path) {
        return RetrofitFactory
                .createRetrofit("https://api.bithumb.com/")
                .create(ExampleService.class)
                .tickerInfo(path);
    }

    public Call<Transaction_List> get_transaction(String path, int count) {
        return RetrofitFactory
                .createRetrofit("https://api.bithumb.com/") // Retrofit객체 반환
                .create(ExampleService.class)
                .transactionInfo(path, count);
    }

    public Coin_Info gT(String path, int count) {

        final Coin_Info[] coin_info = {null};

        RetrofitFactory
                .createRetrofit("https://api.bithumb.com/")
                .create(ExampleService.class)
                .tickerInfo(path)
                .enqueue(new Callback<Ticker>() {
                    @Override
                    public void onResponse(Call<Ticker> call, Response<Ticker> response1) {
                        RetrofitFactory
                                .createRetrofit("https://api.bithumb.com/") // Retrofit객체 반환
                                .create(ExampleService.class)
                                .transactionInfo(path, count)
                                .enqueue(new Callback<Transaction_List>() {
                                    @Override
                                    public void onResponse(Call<Transaction_List> call, Response<Transaction_List> response2) {
                                        Ticker ticker = response1.body();
                                        Transaction_List transactions = response2.body();

                                        Coin_Map coin_map = new Coin_Map();

                                        coin_info[0] = new Coin_Info(
                                                coin_map.getCoin_names().get(path),
                                                path,
                                                transactions.data.get(0).price,
                                                ticker.prev_closing_price,
                                                ticker.fluctate_rate_24H,
                                                ticker.acc_trade_value_24H);

                                        Log.d("retrofit2",ticker.getTicker().fluctate_rate_24H);
                                        Log.d("retrofit2",ticker.getTicker().prev_closing_price);
                                        Log.d("retrofit2",transactions.data.get(0).price);
                                        Log.d("retrofit2",transactions.data.get(0).transaction_date);
                                        Log.d("retrofit2","갯수: "+transactions.data.size());
                                    }
                                    @Override
                                    public void onFailure(Call<Transaction_List> call, Throwable t) {
                                        Log.d("retrofit2","f transac");
                                    }
                                });
                    }
                    @Override
                    public void onFailure(Call<Ticker> call, Throwable t) {
                        Log.d("retrofit2","f ticker");
                    }
                });

        return coin_info[0];
    }
}
