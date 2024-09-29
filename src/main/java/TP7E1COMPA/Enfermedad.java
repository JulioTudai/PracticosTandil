package TP7E1COMPA;

import java.util.ArrayList;

public class Enfermedad {
    private String nombre;
    private ArrayList<String> estadosPatologicos;
    
    public Enfermedad(String nombre) {
        this.nombre = nombre;
        this.estadosPatologicos = new ArrayList<String>();
    }
    public ArrayList<String> getEstadosPatologicos(){
        return new ArrayList<String>(this.estadosPatologicos);
    }
    public void addEstadoPatologico(String estado){
        if (!this.estadosPatologicos.contains(estado)) {
            this.estadosPatologicos.add(estado);
        }
    }
    public void removeEstadoPatologico(String estado){
        if (this.estadosPatologicos.contains(estado)) {
            this.estadosPatologicos.remove(estado);
        }
    }
    public boolean equals(Object o1){
        if (o1 instanceof Enfermedad) {
            Enfermedad enf = (Enfermedad) o1;
            return enf.getNombre().equals(this.getNombre());
        }
        return false;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
