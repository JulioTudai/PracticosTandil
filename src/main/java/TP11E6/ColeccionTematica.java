package TP11E6;

import java.util.ArrayList;

import java.util.Collections;

public class ColeccionTematica extends Coleccionable{
    protected ArrayList<Coleccionable> coleccionables;
    private int descuento;

    public ColeccionTematica(String nombre,int ds) {
        super(nombre);
        this.descuento=ds;
        this.coleccionables = new ArrayList<>();
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

    public ArrayList<Figurita> buscar(Filtro f){
        ArrayList<Figurita> salida = new ArrayList<>();
        for (Coleccionable c : coleccionables){
            salida.addAll(c.buscar(f));
        }
        Collections.sort(salida);
        return salida;
    }

    public double getPrecio(){
        int suma =0;
        for(Coleccionable c : coleccionables){
            suma += c.getPrecio();
        }
        return suma * (double) (descuento/100);
    }


    //Todo gets y sets
    public void setColeccionables(Coleccionable c){
        if(!coleccionables.contains(c)){
            coleccionables.add(c);
        }
    }

    public ArrayList<Coleccionable> getColeccionables(){
        return new ArrayList<>(coleccionables);
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
}
