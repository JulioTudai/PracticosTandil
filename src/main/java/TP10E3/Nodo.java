package TP10E3;

import java.util.ArrayList;

public class Nodo {
    private final int  MAXTAM = 2;
    private int numeroNodo;
    private ArrayList<Nodo> nodos;

    public Nodo(int numeroNodo){
        this.numeroNodo =numeroNodo;
        this.nodos = new ArrayList<>();
    }
   /* public void addNodo(Nodo nuevoNodo) {//TODO  ESTE ES EL CHOTO DE GTP
        // Si el nodo actual tiene espacio (menos de 2 nodos hijos), lo agregamos
        if (this.nodos.size() < this.getMAXTAM()) {
            this.nodos.add(nuevoNodo);
        } else {
            // Si el nodo no tiene espacio, preguntamos recursivamente a los hijos
            for (Nodo hijo : this.nodos) {
                if (hijo.nodos.size() < hijo.getMAXTAM()) {
                    hijo.addNodo(nuevoNodo); // Llamada recursiva
                    return; // Nodo agregado, salimos del método
                }
            }
            // Si ninguno de los hijos inmediatos tiene espacio, seguimos buscando recursivamente
            for (Nodo hijo : this.nodos) {
                hijo.addNodo(nuevoNodo); // Recursión en el siguiente nivel
                return; // Nodo agregado, salimos del método
            }
        }
    }

    */

   public void addNodo(Nodo n1){ // todo este es el otro que intente yo
        if(this.numeroNodo != n1.getNumeroNodo() && !contieneNodo(n1)) {
            this.agregarEnJerarquia(n1);
           /* if(buscarLugar() == null){
                for (Nodo n : nodos){
                    n.buscarLugar();
                }
            }
            Nodo agregar = buscarLugar();
            agregar.nodos.add(n1);*/
        }


   }

    /*public Nodo buscarLugar() {
        boolean agregado = false;
        int contador = 0;
        if (this.nodos.size() < MAXTAM) {
            return this;
        }
        else {
            for (int i = 0; i < MAXTAM; i++) {
                if (this.nodos.get(i).nodos.size() < MAXTAM && !agregado) {
                   return this.nodos.get(i);

                }
            }

        }
        return null;
    }

     */
    public void agregarEnJerarquia(Nodo n1){
       boolean agregado = false;
        int contador = 0;
        if(this.nodos.size()<MAXTAM){
            this.nodos.add(n1);
            agregado = true;
        }
        else if(!agregado) {
            for(int i =0 ; i < MAXTAM; i++){
                if(this.nodos.get(i).nodos.size() < MAXTAM && !agregado) {
                    this.nodos.get(i).nodos.add(n1);
                    agregado=true;
                }
            }
            if(!agregado){
                for(Nodo n: nodos){
                   if(!agregado) {
                       n.agregarEnJerarquia(n1);
                       agregado = true;
                   }
                }
            }
        }


    }



    public boolean contieneNodo(Nodo n1){
        for(Nodo n:nodos){
            if(n.numeroNodo == n1.getNumeroNodo()){
                return true;
            }
            if(n.getNodos().size()>0){
                n.contieneNodo(n1);
            }
        }
        return false;
    }

    public int getMAXTAM() {
        return MAXTAM;
    }

    public int getNumeroNodo() {
        return numeroNodo;
    }

    public void setNumeroNodo(int numeroNodo) {
        this.numeroNodo = numeroNodo;
    }
    public ArrayList<Nodo> getNodos(){
        return new ArrayList<>(nodos);
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "numeroNodo=" + numeroNodo +
                ", nodos=" + nodos +
                '}';
    }
}


