package PracticaCompardores;

import java.util.ArrayList;
//una persona naturalemten se compara por su nombre y por su edad


public class Persona  extends Establecimiento implements Comparable<Persona> {
    private String nombre,Apellido;
    private int edad, orden;
    private double precio;
    private ArrayList<String> apodos;

    public Persona(String nombre, String apellido, int edad, int orden, double precio) {
        this.nombre = nombre;
        this.Apellido = apellido;
        this.edad = edad;
        this.orden = orden;
        this.precio = precio;
        this.apodos = new ArrayList<>();

    }

    public ArrayList<Persona> buscar(Filtro f){
        ArrayList<Persona> salida = new ArrayList<>();
        if(f.cumple(this)){
            salida.add(this);
        }
        return salida;
    }


    public int compareTo(Persona p){
        int resultado = Double.compare(this.precio,p.getPrecio());
        if(resultado == 0){
            return this.edad - p.getEdad();
        }
        return resultado;
    }

    //TODO GETRS Y SETERS

    public void AddApodos(String a){
        apodos.add(a);
    }
    public  ArrayList<String> getApodos(){
        return new ArrayList<>(apodos);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", edad=" + edad +
                ", orden=" + orden +
                ", precio=" + precio +
                ", apodos=" + apodos +
                '}';
    }
}
