package com.example.coin_gogogo.data;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Candle_List {
    @SerializedName("data")
    public ArrayList<ArrayList<String>> data;
    @SerializedName("status")
    public String status;
}
