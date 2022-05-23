package com.example.esteticafinal;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class mapas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapas);
        Fragment mapfragment= new MapFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,mapfragment).commit();
    }
}