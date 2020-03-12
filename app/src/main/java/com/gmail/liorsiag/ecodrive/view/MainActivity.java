package com.gmail.liorsiag.ecodrive.view;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;

import com.gmail.liorsiag.ecodrive.R;
import com.gmail.liorsiag.ecodrive.controller.MainController;

public class MainActivity extends AppCompatActivity {

    private final static String TAG="MainActivity";

    MainController mController;
    TextView mTextGps,mTextObd;
    Button mBtnStart, mBtnSettings,mBtnConnectObd;
    EditText mEdittRouteName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: Called");
        super.onCreate(savedInstanceState);
        mController=new MainController(this);
        setContentView(R.layout.activity_main);
        initVats();
        registerListeners();
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "onStart: Called");
        super.onStart();
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop: Called");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy: Called");
        mController.onDestroy();
        mController=null;
        super.onDestroy();
    }

    private void initVats(){
        mTextGps=findViewById(R.id.text_gps);
        mTextObd=findViewById(R.id.text_obd);
        mBtnSettings=findViewById(R.id.btn_settings);
        mBtnStart=findViewById(R.id.btn_start);
        mBtnConnectObd=findViewById(R.id.btn_connect_obd);
        mEdittRouteName=findViewById(R.id.editt_route_name);
    }


    private void registerListeners() {
        mBtnStart.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                //call start drive
            }
        });

        mBtnSettings.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                mController.startPrefs();
            }
        });

        mBtnConnectObd.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                //connect/disconnect obd
            }
        });
    }

    public void setGpsText(String value){
        mTextGps.setText(value);
    }

    public void setObdText(String value){
        mTextObd.setText(value);
    }

    public void setRouteName(String value){
        mEdittRouteName.setText(value);
    }

    public void setConnectObdBtnText(String value){
        mBtnConnectObd.setText(value);
    }

    public String getRouteName(){
        return mEdittRouteName.getText().toString();
    }
}
