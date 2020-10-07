package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<pokemon> pokemons = new ArrayList<>();


        pokemon c1 = new pokemon("balbsaur",R.drawable.bulbasaur,49,49,318);
        pokemon c2 = new pokemon("ivysaur",R.drawable.ivysaur,62,63,405);
        pokemon c3 = new pokemon("venusaur",R.drawable.venusaur,82,83,525);

        pokemons.add(c1);
        pokemons.add(c2);
        pokemons.add(c3);

        RecyclerView hi = findViewById(R.id.hi);
    }
}