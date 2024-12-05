package TP11E6;

import java.util.ArrayList;

public class Restrictivas  extends ColeccionTematica{

    public Restrictivas (String nombre, int descuento){
        super(nombre,descuento);
    }

    public ArrayList<Figurita> buscar(Filtro f){
        return new ArrayList<>();

    }


}
