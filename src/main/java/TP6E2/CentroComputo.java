package TP6E2;

import java.util.ArrayList;

public class CentroComputo {
    private ArrayList<Computadora> computadorasDisponibles;
    private ArrayList<ColaEspera> colaEspera;

    public CentroComputo (){
        this.computadorasDisponibles = new ArrayList<>();
        this.colaEspera = new ArrayList<>();
    }

    public void add(Computadora c1){
        int i = 0;
        if(c1.getDisponible()){
            if(!this.computadorasDisponibles.isEmpty()) {
                while (i < this.computadorasDisponibles.size() && this.computadorasDisponibles.get(i).soyMayor(c1)) {
                    i++;
                }
                this.computadorasDisponibles.add(i,c1);
            }
            this.computadorasDisponibles.add(c1);
        }

        //todo aca se me trabo el coco agregando a la lista de cola de espera porque no es una computadora disponible
        //todo agrego un todo para ver que onda el git
    }
}
