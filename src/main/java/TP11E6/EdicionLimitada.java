package TP11E6;

public class EdicionLimitada extends Figurita{
    private int cantidadEjemplres;

    public EdicionLimitada(String nombre, String album, int id, double precio, int cantEjem){
        super(nombre,album,id,precio);
        this.cantidadEjemplres = cantEjem;
    }

    public double getPrecio(CalculadorPrecio p){
        return  p.calcular(this);
    }


    //TODO GETS Y SETS
    public int getCantidadEjemplres() {
        return cantidadEjemplres;
    }

    public void setCantidadEjemplres(int cantidadEjemplres) {
        this.cantidadEjemplres = cantidadEjemplres;
    }
}
