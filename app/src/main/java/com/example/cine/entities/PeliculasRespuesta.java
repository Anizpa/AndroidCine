package com.example.cine.entities;

import java.util.ArrayList;

public class PeliculasRespuesta {
    private ArrayList<Peliculas> peliculasList;

    public ArrayList<Peliculas> getPeliculasList(){
        return peliculasList;
    }

    public void setPeliculasList(ArrayList<Peliculas> peliculasList) {
        this.peliculasList = peliculasList;
    }
}
