package com.example.coin_gogogo.data;

import com.google.gson.annotations.SerializedName;

public class Ticker {
//
//    @SerializedName(value = "")
//    public String order_currency;
    @SerializedName("prev_closing_price")
    public String prev_closing_price; //전일 종가
    @SerializedName("acc_trade_value_24H")
    public String acc_trade_value_24H; //최근 24시간 거래금액
    @SerializedName("fluctate_rate_24H")
    public String fluctate_rate_24H; //최근 24시간 변동률

    public Ticker(){}

    public Ticker(String prev_closing_price, String acc_trade_value_24H, String fluctate_rate_24H) {
        this.prev_closing_price = prev_closing_price;
        this.acc_trade_value_24H = acc_trade_value_24H;
        this.fluctate_rate_24H = fluctate_rate_24H;
    }

    public String getAcc_trade_value_24H() {
        return acc_trade_value_24H;
    }

    public void setAcc_trade_value_24H(String acc_trade_value_24H) {
        this.acc_trade_value_24H = acc_trade_value_24H;
    }

    public String getFluctate_rate_24H() {
        return fluctate_rate_24H;
    }

    public void setFluctate_rate_24H(String fluctate_rate_24H) {
        this.fluctate_rate_24H = fluctate_rate_24H;
    }

//    public String getOrder_currency() {
//        return order_currency;
//    }
//
//    public void setOrder_currency(String order_currency) {
//        this.order_currency = order_currency;
//    }

    public String getPrev_closing_price() {
        return prev_closing_price;
    }

    public void setPrev_closing_price(String prev_closing_price) {
        this.prev_closing_price = prev_closing_price;
    }
}
