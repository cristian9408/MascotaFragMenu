package mx.com.cristian.fragmascota;

/**
 * Created by DIEGO on 14/07/2017.
 */


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import mx.com.cristian.fragmascota.adapter.MascotaAdaptador;
import mx.com.cristian.fragmascota.pojo.Mascota;

import java.util.ArrayList;

public class MascotasFavoritas extends AppCompatActivity {
    ArrayList<Mascota> mascotas;

    private RecyclerView listaMascotasFavoritas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_favoritas);


        listaMascotasFavoritas = (RecyclerView) findViewById(R.id.rvMascotasFavoritas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);



        listaMascotasFavoritas.setLayoutManager(llm);
        inicializarListaContactos();
        inicializarAdaptador();
    }


    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas,this);
        listaMascotasFavoritas.setAdapter(adaptador);
    }

    public void inicializarListaContactos(){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.mascota_1,"Juan",0));
        mascotas.add(new Mascota(R.drawable.mascota_2,"Perez",0));
        mascotas.add(new Mascota(R.drawable.mascota_3,"Pawan",0));
        mascotas.add(new Mascota(R.drawable.mascota_4,"Pedro",0));
        mascotas.add(new Mascota(R.drawable.mascota_5,"Luis",0));
    }
}