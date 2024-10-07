package TP7E2;

import java.util.Locale;

public class FiltroNombreTitulo extends Filtro{

    private String nombreTitulo;

    public FiltroNombreTitulo(String nombreTitulo) {
        this.nombreTitulo = nombreTitulo;
    }

    public boolean cumple(Pelicula p){
        return p.getTitulo().contains(nombreTitulo);
    }
}
