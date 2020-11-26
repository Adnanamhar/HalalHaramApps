package com.example.halalharam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityDetailPekerjaanharam extends AppCompatActivity {

    public TextView tvDetailJobHalal;
    public ImageView imgPekerjaanHaram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pekerjaanharam);

        tvDetailJobHalal = findViewById(R.id.txt_detail_haram_job);
        HaramJob extra = getIntent().getParcelableExtra("objek");
        tvDetailJobHalal.setText(extra.getDetail());

        imgPekerjaanHaram = findViewById(R.id.img_detail_haram_job);
        imgPekerjaanHaram.setImageResource(extra.getPhoto());
    }
}
