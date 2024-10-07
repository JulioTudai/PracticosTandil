package TP5E7;

public abstract class Empleado {
    private String nombre;
    private int dni;
    private double sueldoFijo;

    public Empleado (String n,int dni,double s){
        this.nombre = n;
        this.dni = dni;
        this.sueldoFijo = s;
    }

    public abstract double getSueldo();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getSueldoFijo() {
        return sueldoFijo;
    }

    public void setSueldoFijo(double sueldoFijo) {
        this.sueldoFijo = sueldoFijo;
    }
}
