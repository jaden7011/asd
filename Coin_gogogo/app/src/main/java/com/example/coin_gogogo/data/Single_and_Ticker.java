package com.example.coin_gogogo.data;

import io.reactivex.rxjava3.core.Single;

public class Single_and_Ticker {

    public Single<Transaction_List_Response> transaction_list_responseSingle;
    public Ticker ticker;

    public Single_and_Ticker(Single<Transaction_List_Response> transaction_list_responseSingle, Ticker ticker) {
        this.transaction_list_responseSingle = transaction_list_responseSingle;
        this.ticker = ticker;
    }
}
