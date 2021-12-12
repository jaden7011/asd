package com.example.coin_gogogo.data;

import com.google.gson.annotations.SerializedName;

public class Transaction {

    //    거래 체결 시간 타임 스탬프
//    (YYYY-MM-DD HH:MM:SS)
    @SerializedName("transaction_date")
    public String transaction_date;
    @SerializedName("price")
    public String price; //Currency 거래가
    //    거래 유형
//    bid : 매수 ask : 매도
    @SerializedName("type")
    public String type;

    public Transaction(){}

    public Transaction(String transaction_date, String price, String type) {
        this.transaction_date = transaction_date;
        this.price = price;
        this.type = type;
    }
}
