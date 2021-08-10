package com.example.androidcodingexam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.androidcodingexam.AsyncTasks.AsyncTaskListProducts;

public class Home extends AppCompatActivity {
    RecyclerView productsRecycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        productsRecycler = findViewById(R.id.productsRecycler);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        productsRecycler.setLayoutManager(gridLayoutManager);
    }

    @Override
    protected void onResume() {
        super.onResume();
        new AsyncTaskListProducts(this,productsRecycler).execute();
    }
}