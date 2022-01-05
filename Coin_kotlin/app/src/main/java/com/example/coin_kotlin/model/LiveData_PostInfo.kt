package com.example.coin_kotlin.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.coin_kotlin.data.Ticker
import com.example.coin_kotlin.info.PostInfo

class LiveData_PostInfo:ViewModel() {

    val posts: MutableLiveData<PostInfo> by lazy {
        MutableLiveData<PostInfo>()
    }


}