package com.example.coin_gogogo.data;

import com.google.gson.annotations.SerializedName;

public class Ticker_Response {
    @SerializedName("data")
    public Ticker data;
    public String status;
}
