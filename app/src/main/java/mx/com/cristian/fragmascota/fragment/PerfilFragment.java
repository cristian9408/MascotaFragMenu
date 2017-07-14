package mx.com.cristian.fragmascota.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


import mx.com.cristian.fragmascota.R;
import mx.com.cristian.fragmascota.adapter.MascotaAdaptadorPerfil;
import mx.com.cristian.fragmascota.pojo.Mascota;

public class PerfilFragment extends Fragment {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_perfil,container,false);

        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotasPerfil);



        GridLayoutManager glm = new GridLayoutManager(getActivity(),3);
        glm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(glm);
        inicializarListaContactos();
        inicializarAdaptador();
        return v;
    }


    public void inicializarAdaptador(){
        MascotaAdaptadorPerfil adaptador = new MascotaAdaptadorPerfil(mascotas,getActivity());
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaContactos(){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.mascota_1,"Draciel",1));
        mascotas.add(new Mascota(R.drawable.mascota_2,"Coraje",1));
        mascotas.add(new Mascota(R.drawable.mascota_3,"Tommy",4));
        mascotas.add(new Mascota(R.drawable.mascota_4,"Dranzer",5));
        mascotas.add(new Mascota(R.drawable.mascota_5,"Tatis",4));

    }
}
