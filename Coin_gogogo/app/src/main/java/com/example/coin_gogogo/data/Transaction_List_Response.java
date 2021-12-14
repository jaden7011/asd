package com.example.coin_gogogo.data;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Transaction_List_Response {
    @SerializedName("data")
    public ArrayList<Transaction> data;
    public String status;
}
