package com.example.coin_gogogo.Retrofit;

import com.example.coin_gogogo.data.Result;
import com.example.coin_gogogo.data.Transaction;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ExampleService {

    @GET("public/ticker/{path}_KRW")
    Call<Result> tickerInfo(@Path("path") String path);

    @GET("transaction_history/{path}_KRW")
    Call<Transaction> transactionInfo(@Path("path") String path);

}
