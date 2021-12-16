package com.example.coin_gogogo.data;

import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class MutableLiveData_candles extends ViewModel {

    androidx.lifecycle.MutableLiveData<ArrayList<Candle>> candles;

    public androidx.lifecycle.MutableLiveData<ArrayList<Candle>> get(){
        if(candles == null){
            candles = new androidx.lifecycle.MutableLiveData<>();
        }
        return candles;
    }

}
