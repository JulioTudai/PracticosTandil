package TP5E3;

import java.util.ArrayList;

public class Pila {
    private ArrayList<String> pila;

    public Pila(){
        this.pila = new ArrayList<String>();
    }

    public void push(String f){
        if(!pila.contains(f)){
            pila.add(f);
        }
    }
    public String pop(){
        if(!pila.isEmpty()){
            return pila.remove(pila.size()-1);
        }
        return "pila vacia";
    }
    public String top(){
        if(!pila.isEmpty()){
            return pila.get(pila.size()-1);
        }
        return "pila vacia";
    }
    public Pila copy(){
        Pila pila2 = new Pila();
        pila2.pila = new ArrayList<>(this.pila);

        return pila2;
    }
    public Pila reverse(){
        Pila p3 = new Pila();
        for( int i = this.pila.size() -1 ; i > 0 ; i--){
            p3.push(this.pila.get(i));
        }
        return p3;
    }



}
