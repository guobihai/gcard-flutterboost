package com.gcard.flutterboost.app;

import android.app.Application;

import com.gcard.flutterboost.init.FlutterEngineInit;


public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FlutterEngineInit.init(this);
    }
}
