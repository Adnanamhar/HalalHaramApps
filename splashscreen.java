package com.example.halalharam;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class splashscreen extends AppCompatActivity {
    private long ms = 0;
    private long splashTime = 2000;
    private boolean splashActive = true;
    private boolean paused = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

        setContentView(R.layout.splashscreen);

        Thread mythread = new Thread(){
            public void run(){
                try {
                    while (splashActive && ms < splashTime){
                        if (!paused)
                            ms = ms + 100;
                        sleep(100);
                    }
                }catch (Exception e){
                }finally {
                    Intent intent = new Intent(splashscreen.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };
        mythread.start();

    }
}
