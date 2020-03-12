package com.gmail.liorsiag.ecodrive.model;

import com.gmail.liorsiag.ecodrive.controller.MainController;

public class MainModel {
    private MainController mController;

    public MainModel(MainController controller){
        mController=controller;
    }

    public void onDestroy() {
        mController=null;
    }
}
