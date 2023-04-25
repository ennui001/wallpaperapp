package com.tashi.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //activity call after few seconds
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
               //after delay execute this
                Intent iHome = new Intent(splash.this, MainActivity.class);
                startActivity(iHome);
                //to avoid getting back in stack
                finish();
            }
        },3000);//millisec
    }
}