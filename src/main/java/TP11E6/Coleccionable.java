package TP11E6;

import java.util.ArrayList;

public abstract class Coleccionable{
    private String nombre;
    public Coleccionable (String nombre){
        this.nombre = nombre;
    }
    public abstract double getPrecio();
    public abstract ArrayList<Figurita> buscar(Filtro f);




    //TODO GETS Y SETS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}

