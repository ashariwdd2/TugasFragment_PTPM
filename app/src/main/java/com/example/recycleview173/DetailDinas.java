package com.example.recycleview173;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailDinas extends AppCompatActivity {
    ImageView dtlogo;
    TextView dtnama, dtdeskripsi;

    String namadinas;
    String desdinas;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_dinas);

        dtlogo = findViewById(R.id.logo_detail);
        dtnama = findViewById(R.id.nama_detail);
        dtdeskripsi = findViewById(R.id.deskripsi_detail);

        namadinas = getIntent().getStringExtra("namadinas");
        desdinas = getIntent().getStringExtra("desdinas");

        dtnama.setText(namadinas);
        dtdeskripsi.setText(desdinas);
        Glide.with(this).load(getIntent().getIntExtra("logodinas", 0)).into(dtlogo);
    }
}
