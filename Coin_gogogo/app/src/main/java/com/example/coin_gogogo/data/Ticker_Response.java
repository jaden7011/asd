package com.example.coin_gogogo.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class Ticker_Response {

    @SerializedName("data")
    @Expose
    public Map<String,Object> data;

//    "data":{

//    "BTC":
//    {"opening_price":"59766000",
//    "closing_price":"59055000",
//    "min_price":"57200000",
//    "max_price":"59766000",
//    "units_traded":"2018.06060237",
//    "acc_trade_value":"118092995878.8973",
//    "prev_closing_price":"59768000",
//    "units_traded_24H":"2245.11692404"},
//
//    "ETH":{}

    @SerializedName("status")
    public String status;
}
