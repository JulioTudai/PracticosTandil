package TP11E6;

public class FiltroPrecioMenor  extends Filtro{
    private double precio;

    public FiltroPrecioMenor(double precio) {
        this.precio = precio;
    }

    public boolean cumple(Figurita f){
        return f.getPrecio() < precio;
    }

}
