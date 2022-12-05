package com.breno.listapersonagens;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.internal.ContextUtils;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<PersoItem> persos;
    MainAdapter mainAdapter;
    MainViewModel mainViewModel;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        // TODO get activity n funciona - pq?
        mainViewModel = new ViewModelProvider(ContextUtils.getActivity().get(MainViewModel.class));
        //List<PersoItem> personagens = MyViewHolder.class.pe

        mainAdapter = new MainAdapter(MainActivity.this, persos);
        RecyclerView rvMain = findViewById(R.id.rvMain);
        rvMain.setAdapter(mainAdapter);
        rvMain.setLayoutManager(layoutManager);
    }

    public void navegarPersoInfo(int id){
        Intent i = new Intent(MainActivity.this, InfoActivity.class);
        i.putExtra("id", id);
        startActivity(i);
    }
}