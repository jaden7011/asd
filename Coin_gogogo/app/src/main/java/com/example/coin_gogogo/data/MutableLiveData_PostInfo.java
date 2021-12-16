package com.example.coin_gogogo.data;

import androidx.lifecycle.ViewModel;

import com.example.coin_gogogo.info.PostInfo;

public class MutableLiveData_PostInfo extends ViewModel {

    androidx.lifecycle.MutableLiveData<PostInfo> post;

    public androidx.lifecycle.MutableLiveData<PostInfo> get(){
        if(post == null){
            post = new androidx.lifecycle.MutableLiveData<>();
        }
        return post;
    }
}
