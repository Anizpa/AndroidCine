package com.example.cine.list_peliculas.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.cine.R;
import com.example.cine.entities.Peliculas;
import com.example.cine.list_peliculas.ListPeliculasContract;

import java.util.ArrayList;

public class ListPeliculasActivity extends AppCompatActivity implements ListPeliculasContract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_peliculas);
    }

    @Override
    public void successListPeliculas(ArrayList<Peliculas> listPeliculas) {

    }

    @Override
    public void failureListPeliculas(String err) {

    }
}