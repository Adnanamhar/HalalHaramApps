package com.example.halalharam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityHaram extends AppCompatActivity {
    Button btnHaditsHaram, btnHaramFood, btnHaramJob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haram);

        btnHaditsHaram= findViewById(R.id.btnHadistHaram);
        btnHaditsHaram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityHaram.this, ActivityHaditsHaram.class);
                startActivity(intent);
            }
        });

        btnHaramFood = findViewById(R.id.btnHaramFood);
        btnHaramFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityHaram.this, ActivityListHaramFood.class);
                startActivity(intent);
            }
        });

        btnHaramJob = findViewById(R.id.btnHaramJob);
        btnHaramJob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityHaram.this, ActivityListHaramJob.class);
                startActivity(intent);
            }
        });
    }
}
