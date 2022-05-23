package com.example.esteticafinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class galeria extends AppCompatActivity {
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;
    private TabLayout t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria);

        viewPager=findViewById(R.id.pager);
        adapter=new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        t=findViewById(R.id.tabs);
        t.setupWithViewPager(viewPager);
    }
    public void prev (View view){
        Intent intent=new Intent(this,Home.class);
        startActivity(intent);
    }
}