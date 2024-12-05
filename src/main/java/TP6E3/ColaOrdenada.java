package TP6E3;
import java.util.ArrayList;
public class ColaOrdenada {
    private ArrayList<ObjetoOrdenable> elementos;

    public ColaOrdenada(){
        this.elementos = new ArrayList<>();
    }

    public void insertarElemento(ObjetoOrdenable o1){
        int i = 0;
        while(i < elementos.size() && elementos.get(i).primero(o1)){
            i++;
        }
        this.elementos.add(i,o1);
    }

    public boolean vacia(){
        return this.elementos.isEmpty();
    }
    public ObjetoOrdenable siguiente (){
        return this.elementos.remove(0);
    }
}
