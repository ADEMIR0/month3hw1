package com.example.hw1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.hw1.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Model> list = new ArrayList<>();
        list.add(new Model("dog", "+996507044044"));
        list.add(new Model("bee", "+996502044044"));
        list.add(new Model("fly", "+996501044044"));
        Adapter adapter = new Adapter(list, this);
        RecyclerView recyclerView = findViewById(R.id.rv_contacts);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}