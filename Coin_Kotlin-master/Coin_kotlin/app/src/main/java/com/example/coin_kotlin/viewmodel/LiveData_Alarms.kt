package com.example.coin_kotlin.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.coin_kotlin.R
import com.example.coin_kotlin.activity.AlarmActivity
import com.example.coin_kotlin.adapter.AlarmAdapter
import com.example.coin_kotlin.adapter.CommentAdapter
import com.example.coin_kotlin.info.Alarm
import com.example.coin_kotlin.info.Comment
import com.example.coin_kotlin.utility.Utility
import com.google.firebase.auth.FirebaseAuth

class LiveData_Alarms(
    val activity: AlarmActivity
) : ViewModel() {
    lateinit var adapter: AlarmAdapter
    private val TAG = "LiveData_Alarms"

    class Factory(val activity: AlarmActivity) : ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return LiveData_Alarms(activity) as T
        }
    }

    val alarms: MutableLiveData<ArrayList<Alarm>> by lazy {
        MutableLiveData<ArrayList<Alarm>>()
    }

    fun onCreate() {
        adapter = AlarmAdapter(activity, ArrayList<Alarm>())
        val utility = Utility(activity, activity.findViewById(R.id.commentRecycler), adapter)
        utility.RecyclerInit("VERTICAL")
    }

    fun addAlarm(){

    }

    fun getAlarms(){

    }

    fun delAlarm(){

    }
}