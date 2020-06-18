package com.example.news.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.news.R;
import com.example.news.adapter.NewsAdapter;
import com.example.news.items.News;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private NewsAdapter newsAdapter;
    private ArrayList <News> news;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recycleView);
        recyclerView.hasFixedSize();

        newsAdapter = new NewsAdapter(news,this);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(newsAdapter);

    }
}