package com.example.cine.list_peliculas.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.cine.R;
import com.example.cine.entities.Peliculas;
import com.example.cine.list_peliculas.ListPeliculasContract;
import com.example.cine.list_peliculas.presenter.ListPeliculasPresenter;

import java.util.ArrayList;
import java.util.List;

public class ListPeliculasActivity extends AppCompatActivity implements ListPeliculasContract.View {

    private ListPeliculasPresenter listPeliculasPresenter;
    private ListPeliculasAdapter listPeliculasAdapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_peliculas);

        initComponents();
        initPresenter();
        initData();
    }

    private void initComponents(){
        listPeliculasAdapter = new ListPeliculasAdapter(this);
        recyclerView = findViewById(R.id.listaPeliculas);
        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 1));
        recyclerView.setAdapter(listPeliculasAdapter);
    }
    private void initPresenter(){
        listPeliculasPresenter = new ListPeliculasPresenter(this);
    }

    private void initData(){
        listPeliculasPresenter.listPeliculas(null);
    }

    @Override
    public void successListPeliculas(List<Peliculas> listPeliculas) {
        listPeliculasAdapter.addPeliculas(listPeliculas);
    }

    @Override
    public void failureListPeliculas(String err) {
        Toast.makeText(getApplicationContext(), err, Toast.LENGTH_SHORT).show();
    }
}