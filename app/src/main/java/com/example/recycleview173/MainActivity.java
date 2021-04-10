package com.example.recycleview173;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvDinas;
    private ArrayList<Dinas> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvDinas = findViewById(R.id.rv_dinas);
        rvDinas.setHasFixedSize(true);

        list.addAll(DataDinas.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvDinas.setLayoutManager(new LinearLayoutManager(this));
        DinasAdapter dinasAdapter = new DinasAdapter(list);
        rvDinas.setAdapter(dinasAdapter);
    }
}