package com.example.cine.entities;

import com.google.gson.annotations.SerializedName;

public class Peliculas {
    @SerializedName("idPelicula")
    private int idPelicula;
    @SerializedName("titulo")
    private String titulo;
    @SerializedName("sinopsis")
    private String sinopsis;
    @SerializedName("categoria")
    private String categoria;
    @SerializedName("trailer")
    private String trailer;
    @SerializedName("edadRecomendada")
    private int edadRecomendada;
    @SerializedName("visualizaciones")
    private int visualizaciones;
    @SerializedName("valoracion")
    private double valoracion;
    @SerializedName("vecesValorada")
    private int vecesValorada;
    @SerializedName("duracion")
    private int duracion;

    @Override
    public String toString() {
        return "Peliculas{" +
                "idPelicula=" + idPelicula +
                ", titulo='" + titulo + '\'' +
                ", sinopsis='" + sinopsis + '\'' +
                ", categoria='" + categoria + '\'' +
                ", trailer='" + trailer + '\'' +
                ", edadRecomendada=" + edadRecomendada +
                ", visualizaciones=" + visualizaciones +
                ", valoracion=" + valoracion +
                ", vecesValorada=" + vecesValorada +
                ", duracion=" + duracion +
                '}';
    }
}
