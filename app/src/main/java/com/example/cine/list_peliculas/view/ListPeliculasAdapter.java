package com.example.cine.list_peliculas.view;

import android.content.Context;
import android.service.autofill.Dataset;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cine.R;
import com.example.cine.entities.Peliculas;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class ListPeliculasAdapter extends RecyclerView.Adapter<ListPeliculasAdapter.ViewHolder> {

    private List<Peliculas> peliculas;
    private Context context;

    public ListPeliculasAdapter(Context context) {
        this.context = context;
        peliculas = new ArrayList<>();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_pelicula, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.setItem(this.peliculas.get(position));
        /*Peliculas pelicula = peliculas.get(position);
        holder.nombre.setText(pelicula.getTitulo());
        holder.categoria.setText(pelicula.getCategoria());
        holder.valoracion.setText(Double.toString(pelicula.getValoracion()));
        Picasso.get().load(pelicula.getImagen()).into(holder.foto);*/


    }

    @Override
    public int getItemCount() {
        return peliculas.size();
    }

    public void addPeliculas(List<Peliculas> listPeliculas){
        peliculas.addAll(listPeliculas);
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView foto;
        private TextView nombre;
        private TextView categoria;
        private TextView valoracion;


        public ViewHolder(View itemView) {
            super(itemView);

            /*foto = itemView.findViewById(R.id.imagenPeli);
            nombre = itemView.findViewById(R.id.nombrePeli);
            categoria = itemView.findViewById(R.id.categoria);
            valoracion = itemView.findViewById(R.id.valoracion);*/

        }

        public void setItem(Peliculas pelicula) {
            foto = itemView.findViewById(R.id.imagenPeli);
            nombre = itemView.findViewById(R.id.nombrePeli);
            categoria = itemView.findViewById(R.id.categoria);
            valoracion = itemView.findViewById(R.id.valoracion);

            nombre.setText(pelicula.getTitulo());
            categoria.setText(pelicula.getCategoria());
            valoracion.setText(Double.toString(pelicula.getValoracion()));
            System.out.println(pelicula.getImagen());
            Picasso.get().load(pelicula.getImagen()).into(this.foto);
        }
    }
}
