package TP11E6;

import java.util.ArrayList;

public class Figurita extends Coleccionable implements Comparable<Figurita>{
    protected String album;
    protected int id;
    protected double precio;

    public Figurita(String nombre, String album,int id,double precio){
        super(nombre);
        this.album=album;
        this.id=id;
        this.precio = precio;
    }

    public ArrayList<Figurita> buscar(Filtro f){
        ArrayList<Figurita> salida = new ArrayList<>();
        if(f.cumple(this)){
            salida.add(this);
        }
        return salida;
    }
    public int compareTo(Figurita f){
        double resultado = this.getPrecio() - f.getPrecio();
        if(resultado > 0){
            return 1;
        }
        else if(resultado < 0){
            return -1;
        }
        return this.getNombre().compareTo(f.getNombre());

    }


    //TODO GETS Y SETS
    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


}
