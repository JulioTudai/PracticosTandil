package parcialPiezas3D;

import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class Pieza3d {
    private String nombre;
    private String descripcion;
    private static int precioXgramo;
    private static int precioXseg;

    public Pieza3d (String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public abstract double getCantPla();
    public abstract int getTiempo();
    public abstract ArrayList<Pieza> buscar(Filtro f);
    public abstract ArrayList<String> getColores();
    public abstract int getCantSimple();
    public abstract Pieza getMenorPla();


    public double getCosto(){
        return (this.getCantPla()*precioXgramo) + (this.getTiempo() *precioXseg);
    }

    //TODO GET Y SET

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Pieza3d{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
