package com.example.halalharam;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityDetailPekerjaanHalal extends AppCompatActivity {
    public TextView tvDetailJobHalal;
    public ImageView imgPekerjaanHalal;

    @Override
    protected void onCreate(@NonNull Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pekerjaan_halal);

        tvDetailJobHalal = findViewById(R.id.txt_detail_halal_job);
        HalalJob extra = getIntent().getParcelableExtra("objek");
        tvDetailJobHalal.setText(extra.getDetail());

        imgPekerjaanHalal = findViewById(R.id.img_detail_halal_job);
        imgPekerjaanHalal.setImageResource(extra.getPhoto());
    }


}