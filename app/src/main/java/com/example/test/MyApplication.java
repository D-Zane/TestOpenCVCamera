package com.example.test;

import android.app.Application;

import org.opencv.android.OpenCVLoader;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Инициализация OpenCV
        OpenCVLoader.initDebug();
    }
}