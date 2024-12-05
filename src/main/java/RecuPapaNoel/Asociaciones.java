package RecuPapaNoel;

import java.util.ArrayList;

public abstract class Asociaciones extends Plantel {
    protected ArrayList<Plantel> elementos;

    public Asociaciones(){
        this.elementos = new ArrayList<>();
    }

    public void addElemento(Plantel e){
        elementos.add(e);
    }

    public ArrayList<String> getHabilidades(){
        ArrayList<String> salida = new ArrayList<>();
        for(Plantel e :elementos){
            ArrayList<String> provisorio = e.getHabilidades();
            for (String s: provisorio){
                if(!salida.contains(s)){
                    salida.add(s);
                }
            }
        }
        return salida;
    }
    public int getCantDuendes(Condicion c){
        int suma =0;
        for (Plantel p:elementos){
            suma += p.getCantDuendes(c);
        }
        return suma;
    }
    public Plantel copia(){
        Asociaciones copia = crearAsociacion();
        for(Plantel p : elementos){
            copia.addElemento(p.copia());
        }
        return copia;
    }
    public abstract Asociaciones crearAsociacion();


}
