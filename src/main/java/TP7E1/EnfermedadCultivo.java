package TP7E1;
/*
-String Nombre
-Arreglo String : estadoPatologicos

+get y set normales y modificados
*/

import java.util.ArrayList;

public class EnfermedadCultivo {

    private String nombre;
    private ArrayList<String> estadosPatologicos;

    public EnfermedadCultivo(String nombre){
        this.nombre = nombre;
        this.estadosPatologicos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getEstadosPatologicos(){
        return new ArrayList<String>(estadosPatologicos);
    }
    public void setEstadosPatologicos(String patologia){
        if (patologia != null && !estadosPatologicos.contains(patologia)){
            this.estadosPatologicos.add(patologia);
        }
    }
    public boolean equals(Object o1){
        if(o1 instanceof EnfermedadCultivo){
            EnfermedadCultivo e1 = (EnfermedadCultivo) o1;
           return this.getNombre().equals(e1.getNombre());
        }
        return false;
    }
}
