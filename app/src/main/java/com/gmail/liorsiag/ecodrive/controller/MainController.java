package com.gmail.liorsiag.ecodrive.controller;

import com.gmail.liorsiag.ecodrive.model.MainModel;
import com.gmail.liorsiag.ecodrive.view.MainActivity;

public class MainController {

    private MainActivity mView;
    private MainModel mModel;

    public MainController(MainActivity view){
        mView=view;
        mModel=new MainModel(this);

    }

    public void onDestroy() {
        mModel.onDestroy();
        mModel=null;
    }
}
