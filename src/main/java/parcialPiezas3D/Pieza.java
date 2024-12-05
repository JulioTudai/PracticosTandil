package parcialPiezas3D;

import java.util.ArrayList;

public class Pieza extends Pieza3d  implements Comparable<Pieza>{
    private double cantPla;
    private int tiempo;
    private String color;


    public Pieza(String nombre,String descripcion,int cantPla,int t,String c){
        super(nombre,descripcion);
        this.cantPla = cantPla;
        this.tiempo=t;
        this.color=c;
    }
    public int compareTo(Pieza p){
        return Double.compare(this.cantPla,p.getCantPla());
    }
    public int getCantSimple(){
        return 1;
    }
    public Pieza getMenorPla(){
        return  this;
    }
    public ArrayList<Pieza> buscar(Filtro f){
        ArrayList<Pieza> salida = new ArrayList<>();
        if(f.cumple(this)){
            salida.add(this);
        }
        return salida;
    }
    public ArrayList<String> getColores(){
        ArrayList<String>  colores = new ArrayList<>();
        colores.add(this.color);
        return colores;
    }

    public boolean equals(Object o){
        try{
            Pieza p = (Pieza)o;
            if(this.getNombre().equals(p.getNombre())){
                return true;
            }
        }
        catch(Exception e){
            return false;
        }
        return false;
    }

    //TODO GET Y SET

    @Override
    public double getCantPla() {
        return cantPla;
    }

    /*public double setCantPla(double cantPla) {
        this.cantPla = cantPla;
    }

     */

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pieza{" +
                "cantPla=" + cantPla +
                ", tiempo=" + tiempo +
                ", color='" + color + '\'' +
                '}';
    }
}
