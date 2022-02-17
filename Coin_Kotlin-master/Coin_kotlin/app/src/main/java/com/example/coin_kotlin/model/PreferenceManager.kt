package com.example.coin_kotlin.model

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences

object PreferenceManager {

    private const val PREFERENCES_NAME = "Setting"

    private fun getPreferences(context: Context):SharedPreferences{
        return context.getSharedPreferences(PREFERENCES_NAME,Context.MODE_PRIVATE)
    }

    @SuppressLint("CommitPrefEdits")
    fun setString(context: Context, key:String, value:String){
        getPreferences(context).edit().putString(key,value).apply()
    }

    fun setStringSet(context: Context,key: String,value: String){
        val set = getPreferences(context).getStringSet(key,HashSet<String>())
        set?.add(value)
        getPreferences(context).edit().putStringSet(key,set).apply()
    }

    @SuppressLint("CommitPrefEdits")
    fun setBoolean(context: Context, key:String, value:Boolean){
        getPreferences(context).edit().putBoolean(key,value).apply()
    }

    @SuppressLint("CommitPrefEdits")
    fun setInt(context: Context, key:String, value:Int){
        getPreferences(context).edit().putInt(key,value).apply()
    }

    fun getString(context: Context, key:String): String? {
        return getPreferences(context).getString(key,"")
    }

    fun getStringSet(context: Context, key: String): Set<String>? {
        return getPreferences(context).getStringSet(key,HashSet<String>())
    }

    fun getBoolean(context: Context, key:String): Boolean {
        return getPreferences(context).getBoolean(key,false)
    }

    fun getInt(context: Context, key:String): Int {
        return getPreferences(context).getInt(key,-1)
    }

    fun removeSetElement(context: Context,key:String,value:String){
        val set = getPreferences(context).getStringSet(key,HashSet<String>())
        set?.remove(value)
        getPreferences(context).edit().putStringSet(key,set).apply()
    }

    fun removeKey(context: Context,key:String){
        getPreferences(context).edit().remove(key).apply()
    }

    fun clear(context: Context){
        getPreferences(context).edit().clear().apply()
    }
}