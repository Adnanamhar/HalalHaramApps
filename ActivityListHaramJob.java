package com.example.halalharam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ActivityListHaramJob extends AppCompatActivity {
    private RecyclerView rvPekerjaanHaram;
    private ArrayList<HaramJob> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_haram_job);

        rvPekerjaanHaram = findViewById(R.id.list_haram_job);
        rvPekerjaanHaram.setHasFixedSize(true);

        list.addAll(DataHaramJob.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvPekerjaanHaram.setLayoutManager(new LinearLayoutManager(this));
        ListHaramJob listPekerjaanAdapter = new ListHaramJob(list);
        rvPekerjaanHaram.setAdapter(listPekerjaanAdapter);
    }
}
