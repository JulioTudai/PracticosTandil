package PracticaCompardores;

public class FiltroPrecio extends Filtro{
    private double precio;

    public FiltroPrecio(double precio) {
        this.precio = precio;
    }

    public boolean cumple(Persona p){
        return p.getPrecio() < precio;
    }
}
