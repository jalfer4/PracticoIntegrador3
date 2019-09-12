package com.programacionparadispositivosmoviles.practicointegrador3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Inmueble> lista= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargarDatos();
        generarListView();
    }

    public void generarListView(){
        final ArrayAdapter<Inmueble> adapter = new ListaAdapter(this, R.layout.item, lista, getLayoutInflater());
        final ListView lv= findViewById(R.id.milista);
        lv.setAdapter(adapter);





    }

    public void cargarDatos(){

        lista.add(new Inmueble(R.drawable.casa1,"Dominicos puntatanos 1000",5000000));
        lista.add(new Inmueble(R.drawable.casa2,"Barrancas coloradas", 6000000));
        lista.add(new Inmueble(R.drawable.casa3,"Bario San Luis 2", 5000000));
        lista.add(new Inmueble(R.drawable.casa4, "San Francisco 100", 7000000));
    }

}
