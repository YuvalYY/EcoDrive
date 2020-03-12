package com.gmail.liorsiag.ecodrive.controller;

import android.content.Intent;
import android.util.Log;

import com.gmail.liorsiag.ecodrive.model.MainModel;
import com.gmail.liorsiag.ecodrive.view.MainActivity;
import com.gmail.liorsiag.ecodrive.view.PrefsActivity;

public class MainController {

    private final static String TAG="MainController";

    private MainActivity mView;
    private MainModel mModel;

    public MainController(MainActivity view){
        mView=view;
        mModel=new MainModel(this);

    }

    public void onDestroy() {
        Log.d(TAG, "onDestroy: Called");
        mModel.onDestroy();
        mModel=null;
    }

    public void startPrefs() {
        Intent intent = new Intent(mView, PrefsActivity.class);
        mView.startActivity(intent);
    }
}
