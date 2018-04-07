package com.example.bruce.reloj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickListener (View v){
        Intent alarmClient = new Intent(Intent.ACTION_VIEW);
        alarmClient.setClassName("com.android.deskclock","com.android.deskclock.AlarmClock");
    }
}
