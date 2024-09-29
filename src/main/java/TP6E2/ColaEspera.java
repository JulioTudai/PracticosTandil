package TP6E2;

import java.util.ArrayList;

public class ColaEspera {

    private ArrayList<Computadora> computadorasEnEspera;
    private ArrayList<Tarea> tareasPendientes;

    public ColaEspera (){
        this.computadorasEnEspera = new ArrayList<>();
        this.tareasPendientes = new ArrayList<>();
    }

    public void add(Computadora c1){
        if(!this.computadorasEnEspera.isEmpty()){
            if(c1 != null  && !this.computadorasEnEspera.contains(c1)){
                agregarOrdenado(c1);
            }
        }
        this.computadorasEnEspera.add(c1);

    }
    public void agregarOrdenado(Computadora c1){
        int i = 0;
        while(i < this.computadorasEnEspera.size() && this.computadorasEnEspera.get(i).soyMayor(c1)) {
            i++;
        }
        this.computadorasEnEspera.add(i,c1);
    }

    public void add(Tarea t1){
        if(!this.tareasPendientes.isEmpty())
            if (t1 != null && !this.tareasPendientes.contains(t1)) {
                addOrdenado(t1);
            }
        this.tareasPendientes.add(t1);
    }
    public void addOrdenado(Tarea t1){
        int i = 0;
        while(i < this.tareasPendientes.size() && !this.tareasPendientes.get(i).soyMayor(t1)){
            i++;
        }
        this.tareasPendientes.add(i,t1);
    }


    public void mostrarComputadoras() {
        for (Computadora c : computadorasEnEspera) {
            System.out.println(c);
        }
    }
}
