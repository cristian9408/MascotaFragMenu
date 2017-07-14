package mx.com.cristian.fragmascota.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


import mx.com.cristian.fragmascota.R;
import mx.com.cristian.fragmascota.adapter.MascotaAdaptador;
import mx.com.cristian.fragmascota.pojo.Mascota;

public class RecyclerViewFragment extends Fragment {
    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_recyclerview,container,false);


        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);


        listaMascotas.setLayoutManager(llm);
        inicializarListaContactos();
        inicializarAdaptador();



        return v;
    }


    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas,getActivity());
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaContactos(){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.mascota_1,"Tatis",0));
        mascotas.add(new Mascota(R.drawable.mascota_2,"Draciel",0));
        mascotas.add(new Mascota(R.drawable.mascota_3,"Dranzer",0));
        mascotas.add(new Mascota(R.drawable.mascota_4,"Tommy",0));
        mascotas.add(new Mascota(R.drawable.mascota_5,"Mickey",0));
    }
}
