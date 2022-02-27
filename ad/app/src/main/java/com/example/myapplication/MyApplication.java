package com.example.myapplication;

import android.app.Application;

import com.google.android.gms.ads.MobileAds;

public class MyApplication extends Application {

    private AppOpenAdManager appOpenAdManager;

    @Override
    public void onCreate() {
        super.onCreate();

        MobileAds.initialize(this);

        appOpenAdManager = new AppOpenAdManager
                .Builder(this, AppOpenAdManager.TEST_AD_UNIT_ID)
                .build();
    }

    public AppOpenAdManager getAppOpenAdManager() {
        return this.appOpenAdManager;
    }

}
