package TP6E3;

import java.time.LocalDate;

public class Camion extends ObjetoOrdenable {
    private String nombre;
    private LocalDate fechaCarga;

    public Camion(String nombre, LocalDate fechaCarga){
        this.nombre = nombre;
        this.fechaCarga = fechaCarga;
    }

    public  boolean  primero(ObjetoOrdenable c1){

        return this.fechaCarga.isBefore(((Camion) c1).getFechaCarga());
    }

    public LocalDate getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(LocalDate fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
