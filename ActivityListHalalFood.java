package com.example.halalharam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;

public class ActivityListHalalFood extends AppCompatActivity {
    private RecyclerView rvMakananHalal;
    private ArrayList<HalalFood> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_halal_food);

        rvMakananHalal = findViewById(R.id.list_halal_food);
        rvMakananHalal.setHasFixedSize(true);

        list.addAll(DataHalalFood.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvMakananHalal.setLayoutManager(new LinearLayoutManager(this));
        ListHalalFood listMakananAdapter = new ListHalalFood(list);
        rvMakananHalal.setAdapter(listMakananAdapter);
    }
}

