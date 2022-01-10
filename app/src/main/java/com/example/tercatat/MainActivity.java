package com.example.tercatat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvBarang;
    private ArrayList<Barang> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvBarang = findViewById(R.id.img_barang);
        rvBarang.setHasFixedSize(true);

        list.addAll(DataBarang.getListdata());
        showRecyclerList();
    }
    private void  showRecyclerList(){
        rvBarang.setLayoutManager(new LinearLayoutManager(this));
        ListAdapterBarang listAdapterBarang = new ListAdapterBarang(list);
        rvBarang.setAdapter(listAdapterBarang);
    }
}