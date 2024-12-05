package TP6E3;

public class Barco extends ObjetoOrdenable {
    private String nombre;
    private int capacidad;

    public Barco (String nombre, int capacidad){
        this.nombre = nombre;
        this.capacidad = capacidad;
    }
    public boolean primero (ObjetoOrdenable b1){
        return this.capacidad > ((Barco)b1).getCapacidad();
    }

    public String cargarse(Camion c1){
        return "Se esta cargando el camion " + c1.getNombre();

    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
