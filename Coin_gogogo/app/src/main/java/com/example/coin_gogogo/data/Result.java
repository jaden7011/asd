package com.example.coin_gogogo.data;

import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("data")
    private Ticker ticker;

    @SerializedName("Transaction")
    private Transaction transaction;


    public Ticker getTicker(){
        return ticker;
    }

    public void setTicker(Ticker ticker) {
        this.ticker = ticker;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

}
