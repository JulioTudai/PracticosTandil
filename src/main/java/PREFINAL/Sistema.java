package PREFINAL;

import java.util.ArrayList;

public class Sistema {

    private ArrayList<Elemento> elementos;

    public void addElemento(Elemento ele){
        if (!elementos.contains(ele)){
            elementos.add(ele);
        }
    }

    public ArrayList<Elemento> getCopia(Duende duende){
        ArrayList<Elemento> copiaSalida=new ArrayList<>();
        for (Elemento ele:elementos){
            Elemento copia=ele.getCopia(duende);
            if (copia!=null){
                copiaSalida.add(copia);
            }
        }
        return copiaSalida;
    }

    public ArrayList<Prenda> buscar(Duende duende){
        ArrayList<Prenda> salida=new ArrayList<>();
        for (Elemento ele:elementos){
            salida.addAll(ele.buscar(duende));
        }
        return salida;
    }

}
