package ParcialResiduos;

import java.util.ArrayList;

public class Sector extends ElementoReciclable {
    private ArrayList<ElementoReciclable> elementos;

    public Sector (String nombre){
        super(nombre);
        this.elementos = new ArrayList<>();
    }
    public void addElemento(ElementoReciclable e){
        if(!this.elementos.contains(e) && e!=null){
            this.elementos.add(e);
        }
    }

    public ArrayList<Pedido> buscar(Filtro f){
        ArrayList<Pedido> salida = new ArrayList<>();
        for (int i =0;i< elementos.size(); i++){
            salida.addAll(this.elementos.get(i).buscar(f));
        }
        return salida;
    }
    public int cantFrenadas(){
        int suma =0;
        for (ElementoReciclable e : elementos){
            suma += e.cantFrenadas();
        }
        return suma;
    }

    @Override
    public double getVolumen() {
        double suma=0;
        for(int i = 0;i<this.elementos.size();i++){
            suma += this.elementos.get(i).getVolumen();
        }
        return suma;
    }

    @Override
    public double getPeso() {
        double suma=0;
        for (ElementoReciclable e : elementos){
            suma += e.getPeso();
        }
        return suma;
    }

    @Override
    public boolean poseePalabraClave(String palabra) {
        boolean encontro = false;
        for(int i =0; i<elementos.size();i++){
           if(this.elementos.get(i).poseePalabraClave(palabra)){
               return true;
           }
        }
        return false;
    }
    public boolean equals(Object o){
        try{
            Sector p = (Sector) o;
            if(this.nombre.equals(p.getNombre())){
                return true;
            }
        }
        catch(Exception e){
            return false;
        }
        return false;

    }

    public ArrayList<ElementoReciclable> getElementos(){
        return new ArrayList<>(elementos);
    }


}
