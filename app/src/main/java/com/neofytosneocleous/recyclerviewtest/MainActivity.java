package com.neofytosneocleous.recyclerviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rv_animals = findViewById(R.id.rv_animals);

//        set the alignment to vertical
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        AnimalsAdapter adapter = new AnimalsAdapter(this, Utils.getAnimals());

        rv_animals.setLayoutManager(layoutManager);
        rv_animals.setAdapter(adapter);

    }
}
