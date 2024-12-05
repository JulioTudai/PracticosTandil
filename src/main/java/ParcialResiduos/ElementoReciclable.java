package ParcialResiduos;

import java.util.ArrayList;

public abstract class ElementoReciclable {
    protected String nombre;

    public ElementoReciclable( String nombre){
        this.nombre = nombre;
    }
    public abstract double getVolumen();
    public abstract double getPeso();
    public abstract boolean poseePalabraClave(String palabra);
    //public abstract boolean buscar(Filtro f);
    public abstract int cantFrenadas();
    public abstract ArrayList<Pedido> buscar(Filtro f);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
