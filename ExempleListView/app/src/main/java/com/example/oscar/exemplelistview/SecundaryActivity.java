package com.example.oscar.exemplelistview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class SecundaryActivity extends AppCompatActivity {

    private Titular[] datos = new Titular[]{
            new Titular("Element 1", "subelement 1", "luigi"),
            new Titular("Element 2", "subelement 2", "yoshi"),
            new Titular("Element 3", "subelement 3", "luigi"),
            new Titular("Element 4", "subelement 4", "yoshi"),
            new Titular("Element 5", "subelement 5", "luigi"),
            new Titular("Element 6", "subelement 6", "yoshi")
    };

    int[] imatges ={
            R.drawable.luigi, R.drawable.yoshi
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundary);


        ListView lstElements = (ListView)findViewById(R.id.lstElements2);
        AdaptadorTitulares adaptador = new AdaptadorTitulares(this, datos);

        lstElements.setAdapter(adaptador);

        lstElements.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Titular entry = (Titular) parent.getAdapter().getItem(position);
                Context context = getApplicationContext();
                CharSequence text = entry.getTitulo();
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });


    }

}

class AdaptadorTitulares extends ArrayAdapter<Titular>{

    Titular[] datos;
    public AdaptadorTitulares(Context context,Titular[] datos){
        //Crida al xml activity_secundary que conté el listview
        super(context, R.layout.activity_secundary, datos);
        this.datos=datos;
    }

    public View getView(int position, View convertView, ViewGroup parent){

        LayoutInflater inflater = LayoutInflater.from(getContext());
        //Crida al xml listcomplex, que conté els elements que es carregarán en cada un dels elements
        //de la listview que el crida
        View vista = inflater.inflate(R.layout.listcomplex, null);

        TextView txtTitulo = (TextView)vista.findViewById(R.id.txtTitulo);
        TextView txtSubTitulo = (TextView)vista.findViewById(R.id.txtSubTitulo);


        txtTitulo.setText(datos[position].getTitulo());
        txtSubTitulo.setText(datos[position].getSubtitulo());

        ImageView imatge = (ImageView)vista.findViewById(R.id.imageView);
        switch (datos[position].getImagen())
        {
            case "luigi":
                imatge.setImageDrawable(getContext().getResources().getDrawable(R.drawable.luigi));
                break;
            case "yoshi":
                imatge.setImageDrawable(getContext().getResources().getDrawable(R.drawable.yoshi));
                break;
            default:
        }


        return(vista);
    }

}
