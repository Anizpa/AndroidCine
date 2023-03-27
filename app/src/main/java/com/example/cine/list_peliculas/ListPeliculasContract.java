package com.example.cine.list_peliculas;

import com.example.cine.entities.Peliculas;

import java.util.ArrayList;

public interface ListPeliculasContract {
    public interface View {
        void successListPeliculas(ArrayList<Peliculas> listPeliculas);

        void failureListPeliculas(String err);
    }

    public interface Model {
        interface OnLstPeliculasListener {
            void onSuccess(ArrayList<Peliculas> listPeliculas);

            void onFailure(String err);
        }

        void listPeliculasWS(Peliculas peliculas,
                           OnLstPeliculasListener onLstPeliculasListener);
    }

    public interface Presenter {
        //Caso de uso
        void listPeliculas(Peliculas peliculas);
    }
}
