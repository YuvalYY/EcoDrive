package com.gmail.liorsiag.ecodrive.view;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.gmail.liorsiag.ecodrive.R;
import com.gmail.liorsiag.ecodrive.controller.MainController;

public class MainActivity extends AppCompatActivity {

    MainController mController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mController=new MainController(this);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        mController.onDestroy();
        mController=null;
        super.onDestroy();
    }
}
