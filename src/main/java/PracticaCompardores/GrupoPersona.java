package PracticaCompardores;

import TP11E6.Coleccionable;

import java.util.ArrayList;
import java.util.Collections;

public class GrupoPersona extends Establecimiento {
    private ArrayList<Establecimiento> personas;

    public GrupoPersona(ArrayList<Establecimiento> personas) {
        this.personas = new ArrayList<>();
    }

    public ArrayList<Persona> buscar(Filtro f){
        ArrayList<Persona> salida = new ArrayList<>();
        for (Establecimiento e: personas){
            salida.addAll(e.buscar(f));
        }
        Collections.sort(salida);
        return salida;
    }

    public ArrayList<Establecimiento> getPersonas() {
        return new ArrayList<>(personas);
    }

    public void addPersona(Establecimiento p){
        personas.add(p);
    }

    /*public ArrayList<Persona> getOrdenNatural(){
        Collections.sort(personas);
        return personas;
    }

     */
}
