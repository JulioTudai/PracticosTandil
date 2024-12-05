package PREFINAL;

import java.util.ArrayList;

public abstract class Elemento {

    private String nombre;
    private double talle;

    public void setNombre(String nombre){ this.nombre=nombre; }
    public String getNombre(){ return this.nombre; }

    public void setTalle(double talle){ this.talle=talle; }
    public double getTalle(){ return this.talle; }


    @Override
    public boolean equals(Object o){
        try{
            Elemento ele=(Elemento)o;
            return this.getNombre().equalsIgnoreCase(ele.getNombre());
        }catch (Exception e){
            return false;
        }
    }

    public abstract ArrayList<String> getMateriales();
    public abstract ArrayList<Prenda> buscar(Duende duende);
    public abstract Elemento getCopia(Duende duende);


}
