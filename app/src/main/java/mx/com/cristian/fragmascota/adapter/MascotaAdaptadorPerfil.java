package mx.com.cristian.fragmascota.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import mx.com.cristian.fragmascota.R;
import mx.com.cristian.fragmascota.pojo.Mascota;


public class MascotaAdaptadorPerfil extends RecyclerView.Adapter<MascotaAdaptadorPerfil.MascotaViewHolder> {

    ArrayList<Mascota> mascotas;
    Activity activity;


    public MascotaAdaptadorPerfil(ArrayList<Mascota> mascotas, Activity activity) {
        this.mascotas = mascotas;
        this.activity = activity;
    }

    // Inflar el layout  y la pasara el viewHolder para que obtenga los views
    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota_perfil,parent,false);
        return new MascotaViewHolder(view);
    }
    // Asocia cada elemento de la lista con cada view
    @Override
    public void onBindViewHolder(final MascotaViewHolder holder, final int position) {
        Mascota mascota = mascotas.get(position);
        holder.tvPuntuacion.setText(""+mascota.getPuntuacion());
    }
    // catidad de elementos que contiene la lista
    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgFoto;
        private TextView tvPuntuacion;


        public MascotaViewHolder(View itemView) {
            super(itemView);

            tvPuntuacion = (TextView) itemView.findViewById(R.id.tvPuntuacion);
            imgFoto = (ImageView) itemView.findViewById(R.id.imgFoto);

        }
    }

}