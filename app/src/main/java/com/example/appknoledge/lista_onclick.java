package com.example.appknoledge;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class lista_onclick extends ListActivity {

    //v2
    /*
    String nombre, apellidos;
    int logo;

    public lista_onclick(String nombre, String apellidos, int logo) {
        super();
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.logo = logo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_onclick);
        //version 1 con solo 1 nombre

        String[] listado = new String[]{"Alex", "Juanma", "Felix", "Juanjo"};
        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, listado);
        ListView listView = findViewById(android.R.id.list);
        listView.setAdapter(adapter);


        //v2 con cosas y fotos
       /* ArrayList listas=new ArrayList<>();
        listas.add(new lista_onclick("Alex","Dumitrache",R.drawable.img_cv));
        listas.add(new lista_onclick("Juanma","Parche",R.drawable.la_camara));
        listas.add(new lista_onclick("Kike","Lorien",R.drawable.asterixenhispania));
        listas.add(new lista_onclick("Felix","Mapache",R.drawable.asterixjolimpicos));
        listas.add(new lista_onclick("Juanjo","Dumitrache",R.drawable.la_piedra));
        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, listas);
        ListView listView = findViewById(android.R.id.list);
        listView.setAdapter(adapter);*/
    }


    @Override
    protected void onListItemClick(ListView listView, View view, int posicion, long id) {
        super.onListItemClick(listView, view, posicion, id);
        String texto = listView.getItemAtPosition(posicion).toString();
        Toast.makeText(lista_onclick.this, texto, Toast.LENGTH_SHORT).show();
    }


}
