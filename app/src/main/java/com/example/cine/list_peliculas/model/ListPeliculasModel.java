package com.example.cine.list_peliculas.model;


import com.example.cine.entities.Peliculas;
import com.example.cine.entities.PeliculasRespuesta;
import com.example.cine.list_peliculas.ListPeliculasContract;
import com.example.cine.utils.Api;
import com.example.cine.utils.peliculasApi;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListPeliculasModel implements ListPeliculasContract.Model  {

    private Gson gson = new Gson();

    @Override
    public void listPeliculasWS(Peliculas peliculas, OnLstPeliculasListener onLstPeliculasListener) {
        getPeliculasService(onLstPeliculasListener);
    }
    private void getPeliculasService(final OnLstPeliculasListener onLstPeliculasListener){
        Api apiPeliculas = peliculasApi.getPeliculasApi().create(Api.class);

        Call<List<Peliculas>> peliculasRespuestaCall = apiPeliculas
                .getPeliculasList(null, null, null, 0,100,0, null);
        peliculasRespuestaCall.enqueue(new Callback<List<Peliculas>>() {
            @Override
            public void onResponse(Call<List<Peliculas>> call,
                                   Response<List<Peliculas>> response) {
                //PeliculasRespuesta peliculasRespuesta = response.body();
                List<Peliculas> peliculasList = response.body();
                onLstPeliculasListener.onSuccess(peliculasList);
            }

            @Override
            public void onFailure(Call<List<Peliculas>> call, Throwable t) {
                onLstPeliculasListener.onFailure("Error en la peticion " + t);
            }
        });
    }
}
