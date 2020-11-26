package com.example.halalharam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ActivityListHalalJob extends AppCompatActivity {
    private RecyclerView rvPekerjaan;
    private ArrayList<HalalJob> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_halal_job);

        rvPekerjaan = findViewById(R.id.list_halal_job);
        rvPekerjaan.setHasFixedSize(true);

        list.addAll(DataHalalJob.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvPekerjaan.setLayoutManager(new LinearLayoutManager(this));
        ListHalalJob listPekerjaanAdapter = new ListHalalJob(list);
        rvPekerjaan.setAdapter(listPekerjaanAdapter);
    }
}
