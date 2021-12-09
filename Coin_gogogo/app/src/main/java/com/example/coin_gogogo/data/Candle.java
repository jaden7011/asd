package com.example.coin_gogogo.data;

public class Candle {
    public Long createdAt;
    public Float open;
    public Float close;
    public Float high;
    public Float low;
    public Float bids;

    public Float getBids() {
        return bids;
    }

    public void setBids(Float bids) {
        this.bids = bids;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Float getOpen() {
        return open;
    }

    public void setOpen(Float open) {
        this.open = open;
    }

    public Float getClose() {
        return close;
    }

    public void setClose(Float close) {
        this.close = close;
    }

    public Float getHigh() {
        return high;
    }

    public void setHigh(Float high) {
        this.high = high;
    }

    public Float getLow() {
        return low;
    }

    public void setLow(Float low) {
        this.low = low;
    }
}
