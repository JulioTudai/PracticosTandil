package arbolBinario;

import java.util.ArrayList;

public class Nodo implements AccionEjecutable {
    private int numeroNodo;
    private ArrayList<Nodo> nodos;
    private final int MAXTAM = 2;

    public Nodo(int numeroNodo){
        this.numeroNodo = numeroNodo;
        this.nodos = new ArrayList<>();
    }
  /*  public void addNodo(Nodo nuevoNodo) { // TODO ESTE ES EL  CHOTO DE GTP
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

    public void addNodo(Nodo n){
        if(nodos.isEmpty()){
            nodos.add(n);
        }
        else if (!contieneNodo(n)  && this.numeroNodo != n.numeroNodo) {

            agregarEnJerarquia(n);
        }
    }

    public boolean contieneNodo(Nodo n1){
        for (Nodo n:nodos){
            if (n.numeroNodo == n1.numeroNodo){
                return true;
            }
            if(!n.nodos.isEmpty()){
                n.contieneNodo(n1);
            }
        }
        return false;
    }
    public void agregarEnJerarquia(Nodo n1){
        boolean agregado = false;
        if(nodos.size() < MAXTAM ){
            nodos.add(n1);
            System.out.println("Nodo agregado al nodo con número: " + this.numeroNodo);
            agregado=true;
        }
        else{
            for (Nodo n: nodos){
                    if(!n.contieneNodo(n1) && !agregado){
                    n.agregarEnJerarquia(n1);
                    agregado=true;
                    }

            }
        }
    }

    public void ejecutarNodo(Nodo n){

    }

    public int getNumeroNodo() {
        return numeroNodo;
    }

    public int getMAXTAM() {
        return MAXTAM;
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "numeroNodo=" + numeroNodo +
                ", nodos=" + nodos +
                '}';
    }
}
