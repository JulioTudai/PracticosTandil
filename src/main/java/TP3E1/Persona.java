package TP3E1;

public class Persona {
    private String nombre;
    private int dni;

    public Persona (String nombre, int dni){
        this.nombre = nombre;
        this.dni = dni;
    }
    public String llenarEncuesta(Encuesta enc1){
        return "Encuesta completa";
    }

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
}
