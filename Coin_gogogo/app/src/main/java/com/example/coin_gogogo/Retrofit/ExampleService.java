package com.example.coin_gogogo.Retrofit;

import com.example.coin_gogogo.data.Ticker;
import com.example.coin_gogogo.data.Transaction_List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ExampleService {

    @GET("public/ticker/{path}_KRW")
    Call<Ticker> tickerInfo(@Path("path") String path);

    @GET("public/transaction_history/{path}_KRW")
    Call<Transaction_List> transactionInfo(@Path("path") String path,
                                           @Query("count") Integer count); // ?count={count}를 나타냄 -> 원하는 리스트 갯수요청

}
