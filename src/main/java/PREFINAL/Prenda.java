package PREFINAL;

import PREFINAL.Condicion.Condicion;

import java.util.ArrayList;

public class Prenda extends Elemento{

    private Condicion condicion;
    private ArrayList<String> materiales;
    private String color;

    public Prenda(String nombre, double talle, Condicion condicion, String color){
        super.setNombre(nombre);
        super.setTalle(talle);
        this.condicion=condicion;
        this.color=color;
        this.materiales=new ArrayList<>();
    }

    public String getColor(){ return this.color; }
    public void setColor(String color){ this.color=color; }
    public boolean checkColor(String color){ return this.materiales.contains(color); }

    @Override
    public ArrayList<String> getMateriales(){
        return new ArrayList<>(materiales);
    }

    @Override
    public Elemento getCopia(Duende duende){
        if (this.seAdapta(duende)){
            return new Prenda(this.getNombre(),this.getTalle(),this.condicion,this.getColor());
        }
        return null;
    }

    @Override
    public ArrayList<Prenda> buscar(Duende duende){
        ArrayList<Prenda> salida= new ArrayList<>();
        if (this.seAdapta(duende)){
            salida.add(this);
        }
        return salida;
    }

    public boolean seAdapta(Duende duende){
        return this.condicion.cumple(duende);
    }


}
