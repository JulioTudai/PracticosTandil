package TP7E1;

public class CondicionPorCultivo {
    private Cultivo c1;



    public CondicionPorCultivo (Cultivo c1){
         this.c1 = c1;
    }

    public boolean cumple(ProductoQuimico p){
        return c1.sirveProducto3(p);
    }
}
