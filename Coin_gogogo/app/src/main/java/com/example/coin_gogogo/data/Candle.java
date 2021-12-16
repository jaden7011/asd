package com.example.coin_gogogo.data;

public class Candle {
    public String createdAt;
    public String open;
    public String close;
    public String high;
    public String low;
    public String bids;

    public Candle(){};

    public Candle(String createdAt, String open, String close, String high, String low, String bids) {
        this.createdAt = createdAt;
        this.open = open;
        this.close = close;
        this.high = high;
        this.low = low;
        this.bids = bids;
    }
}
