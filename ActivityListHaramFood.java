package com.example.halalharam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class ActivityListHaramFood extends AppCompatActivity {
    private RecyclerView rvMakananHaram;
    private ArrayList<HaramFood> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_haram_food);

        rvMakananHaram = findViewById(R.id.list_haram_food);
        rvMakananHaram.setHasFixedSize(true);

        list.addAll(DataHaramFood.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvMakananHaram.setLayoutManager(new LinearLayoutManager(this));
        ListHaramFood listMakananAdapter = new ListHaramFood(list);
        rvMakananHaram.setAdapter(listMakananAdapter);
    }
}
