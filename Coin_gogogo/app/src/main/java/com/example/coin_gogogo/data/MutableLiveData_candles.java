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

    //todo 여기에 viewmodel 역할을 넣고, 이후에 BoardActivity가서 rxjava onnext에서 변수(코인시세정보리스트)가 적용될 수 있게 변수를 라이브데이터로 묶어서 사용해보자.

}
