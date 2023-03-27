package com.example.cine.list_peliculas.model;


import android.telecom.Call;

import com.example.cine.entities.Peliculas;
import com.example.cine.entities.PeliculasRespuesta;
import com.example.cine.list_peliculas.ListPeliculasContract;
import com.example.cine.utils.Api;
import com.example.cine.utils.peliculasApi;

public class ListPeliculasModel implements ListPeliculasContract.Model  {
    @Override
    public void listPeliculasWS(Peliculas peliculas, OnLstPeliculasListener onLstPeliculasListener) {
        Api apiService = peliculasApi.getPeliculasApi()
                .create(Api.class);
        //Call<PeliculasRespuesta> call = apiService.g
    }
}
