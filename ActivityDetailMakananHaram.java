package com.example.halalharam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityDetailMakananHaram extends AppCompatActivity {
    public TextView tvDetailHaram;
    public ImageView imgMakananHaram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_makanan_haram);


        tvDetailHaram = findViewById(R.id.txt_detail_makanan_haram);
        HaramFood extra = getIntent().getParcelableExtra("objek");
        tvDetailHaram.setText(extra.getDetailHaram());

        imgMakananHaram = findViewById(R.id.img_detail_makanan_haram);
        imgMakananHaram.setImageResource(extra.getPhotoHaram());
    }
}
