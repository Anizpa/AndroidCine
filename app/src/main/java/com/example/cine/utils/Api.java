package com.example.cine.utils;


import com.example.cine.entities.PeliculasRespuesta;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {

    @GET("Peliculas/FINDALL")
    Call<PeliculasRespuesta> getPeliculasList(
            @Query("titulo") String titulo,
            @Query("categoria") String categoria,
            @Query("edadRecomendada") String edadRecomendada,
            @Query("valoracion") int valoracion,
            @Query("limite") int limite,
            @Query("id") int id
            );

}
