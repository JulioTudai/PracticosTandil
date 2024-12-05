package PREFINAL;

import java.util.ArrayList;

public class Conjunto extends Elemento{

    private ArrayList<Elemento> elementos;

    public Conjunto(String nombre, double talle){
        super.setNombre(nombre);
        super.setTalle(talle);
        this.elementos=new ArrayList<>();
    }

    @Override
    public ArrayList<String> getMateriales(){
        ArrayList<String> salida = new ArrayList<>();
        for(Elemento ele:elementos){
            ArrayList<String> materiales=ele.getMateriales();
            for (String material: materiales){
                if (!salida.contains(material)){
                    salida.add(material);
                }
            }
        }
        return salida;
    }

    @Override
    public double getTalle(){
        return super.getTalle();
    }

    @Override
    public Elemento getCopia(Duende duende){
        Conjunto copia=new Conjunto(super.getNombre(),super.getTalle());
        for (Elemento ele: elementos){
            Elemento copia2=ele.getCopia(duende);
            if (copia2!=null){
                copia.addElemento(copia2);
            }
        }
        return copia.estaVacio() ? null : copia;
    }

    @Override
    public ArrayList<Prenda> buscar(Duende duende){
        ArrayList<Prenda> salida = new ArrayList<>();
        for (Elemento ele:this.elementos){
            ArrayList<Prenda> prendas= ele.buscar(duende);
            for (Prenda prenda: prendas){
                salida.add(prenda);
            }
        }
        return salida;
    }

    public void addElemento(Elemento ele){
        if (!elementos.contains(ele) && this.getTalle()==ele.getTalle()){
            this.elementos.add(ele);
        }
    }

    public boolean estaVacio(){
        return this.elementos.isEmpty();
    }

}
