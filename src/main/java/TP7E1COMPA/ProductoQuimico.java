package TP7E1COMPA;

import java.util.ArrayList;

public class ProductoQuimico {
    private String nombre;
    private ArrayList<Cultivo> cultivosNoRecomendados;
    private ArrayList<String> estadosPatologicos;

    public ProductoQuimico(String nombre) {
        this.nombre = nombre;
        this.cultivosNoRecomendados = new ArrayList<Cultivo>();
        this.estadosPatologicos = new ArrayList<String>();
    }

    public ArrayList<Cultivo> getCultivosNoRecomendados() {
        return new ArrayList<Cultivo>(this.cultivosNoRecomendados);
    }

    public ArrayList<String> getEstadosPatologicos() {
        return new ArrayList<String>(this.estadosPatologicos);
    }

    public int getSizeCultivos() {
        return this.cultivosNoRecomendados.size();
    }

    public void addCultivoNoRecomendado(Cultivo cult) {
        if (!this.cultivosNoRecomendados.contains(cult)) {
            this.cultivosNoRecomendados.add(cult);
        }
    }

    public boolean puedeTratarEnfermedad(Enfermedad enf) {
        return this.estadosPatologicos.containsAll(enf.getEstadosPatologicos());
    }

    public void removeCultivoNoRecomendado(Cultivo cult) {
        if (!this.cultivosNoRecomendados.contains(cult)) {
            this.cultivosNoRecomendados.remove(cult);
        }
    }

    public void addEstadoPatologico(String estado) {
        if (!this.estadosPatologicos.contains(estado)) {
            this.estadosPatologicos.add(estado);
        }
    }

    public void removeEstadoPatologico(String estado) {
        if (this.estadosPatologicos.contains(estado)) {
            this.estadosPatologicos.remove(estado);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public boolean equals(Object o1){
        if (o1 instanceof ProductoQuimico) {
            ProductoQuimico pq = (ProductoQuimico) o1;
            return pq.getNombre().equals(this.getNombre());
        }
        return false;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
