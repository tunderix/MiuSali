package com.example.ioni.miusali;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.Button;

import java.util.Date;

public class AddTrainingSessionActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_session);


    }

    //Preparations
    private void prepareTimeButton(){
        Button timeButton = findViewById(R.id.btn_time);

        timeButton.setText("9:00");

        timeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickTime();
            }
        });

    }

    private void prepareDateButton(){
        Button dateButton = findViewById(R.id.btn_date);

        dateButton.setText();

        dateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickDate();
            }
        });
    }

    private void prepareReadyButton(){
        Button readyButton = findViewById(R.id.btn_ready);
        readyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onReady();
            }
        });
    }


    protected void onReady(){
        onBackPressed();
    }

    protected void onClickDate(){}
    protected void onClickTime(){}
}
