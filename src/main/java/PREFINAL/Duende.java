package PREFINAL;


import java.util.ArrayList;

public class Duende {

    private String nombre;
    private ArrayList<String> colores;
    private double altura;
    private double talle;
    private String profesion;

    public Duende(String nombre, double altura, double talle, String profesion){
        this.nombre=nombre;
        this.altura=altura;
        this.talle=talle;
        this.profesion=profesion;
        this.colores=new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    public double getTalle() { return talle; }
    public void setTalle(double calzado) { this.talle = calzado; }

    public String getProfesion() { return profesion; }
    public void setProfesion(String profesion) { this.profesion = profesion; }

    public boolean checkColor(String color){
        return this.colores.contains(color);
    }

    public void addColor(String color){
        if(!checkColor(color)){
            this.colores.add(color);
        }
    }

    public void removeColor(String color){
        this.colores.remove(color);
    }




}
