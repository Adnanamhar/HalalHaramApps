package com.example.halalharam;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityDetailMakananHalal extends AppCompatActivity {
    public TextView tvDetailHalal;
    public ImageView imgMakananHalal;

    @Override
    protected void onCreate(@NonNull Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__detail_makanan_halal);

        tvDetailHalal = findViewById(R.id.txt_detail_makanan_halal);
        HalalFood extra = getIntent().getParcelableExtra("objek");
        tvDetailHalal.setText(extra.getDetail());

        imgMakananHalal = findViewById(R.id.img_detail_makanan_halal);
        imgMakananHalal.setImageResource(extra.getPhoto());
    }


}
