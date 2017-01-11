package com.example.oscar.exemplelistview;

/**
 * Created by Oscar on 16/12/2016.
 */

public class Titular {

    private String titulo;
    private String subtitulo;
    private String imagen;

    public Titular(String tit, String sub, String img){

        titulo = tit;
        subtitulo = sub;
        imagen = img;
    }

    public String getTitulo(){
        return titulo;
    }
    public String getSubtitulo(){
        return subtitulo;
    }
    public  String getImagen(){
        return imagen;
    }
}
