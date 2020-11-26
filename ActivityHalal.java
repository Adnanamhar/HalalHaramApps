package com.example.halalharam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityHalal extends AppCompatActivity {

    Button btnHaditsHalal, btnHalalFood, btnHalalJob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halal);

        btnHaditsHalal= findViewById(R.id.btnHadistHalal);
        btnHaditsHalal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityHalal.this, ActivityHaditsHalal.class);
                startActivity(intent);
            }
        });

        btnHalalFood = findViewById(R.id.btnHalalFood);
        btnHalalFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityHalal.this, ActivityListHalalFood.class);
                startActivity(intent);
            }
        });

        btnHalalJob = findViewById(R.id.btnHalalJob);
        btnHalalJob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityHalal.this, ActivityListHalalJob.class);
                startActivity(intent);
            }
        });
    }
}
