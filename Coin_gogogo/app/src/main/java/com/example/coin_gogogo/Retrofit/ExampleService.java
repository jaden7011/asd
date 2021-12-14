package com.example.coin_gogogo.Retrofit;

import com.example.coin_gogogo.data.Ticker_Response;
import com.example.coin_gogogo.data.Transaction_List_Response;

import io.reactivex.rxjava3.core.Single;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ExampleService {

    @GET("public/ticker/{path}_KRW")
    Call<Ticker_Response> tickerInfo(@Path("path") String path);

    @GET("public/transaction_history/{path}_KRW")
    Call<Transaction_List_Response> transactionInfo(@Path("path") String path,
                                                    @Query("count") Integer count); // ?count={count}를 나타냄 -> 원하는 리스트 갯수요청

    @GET("public/transaction_history/{path}_KRW")
    io.reactivex.rxjava3.core.Single<Transaction_List_Response> TRANSACTION_LIST_SINGLE(@Path("path") String path,
                                                                                        @Query("count") Integer count); // ?count={count}를 나타냄 -> 원하는 리스트 갯수요청

    @GET("public/ticker/{path}_KRW")
    Single<Ticker_Response> TICKER_SINGLE(@Path("path") String path);

}
