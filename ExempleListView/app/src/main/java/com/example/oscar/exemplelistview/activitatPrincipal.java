package com.example.oscar.exemplelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class activitatPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitat_principal);

        //Declarem la Listview
        ListView lstElements = (ListView)findViewById(R.id.lstElements);

        //Creem un array, que és el que proporcionarà la informació a la nostre listView
        //(Els valors de l'array es passen al listView a través de l'ArrayAdapter)
        final String[] dades = new String[]{"Element1", "Element2", "Element3", "Element4"};

        //Creem l'ArrayAdapter que s'encarrega d'agafar els elements de la String i passarla a la listView
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, dades);

        lstElements.setAdapter(adaptador);

    }
}
