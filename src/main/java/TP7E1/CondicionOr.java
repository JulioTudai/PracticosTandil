package TP7E1;

public class CondicionOr extends Condicion{
    private Condicion c1;
    private Condicion c2;

    public CondicionOr ( Condicion c1, Condicion c2){
        this.c1 = c1;
        this.c2 = c2;
    }

    public boolean cumple(ProductoQuimico p){
        return c1.cumple(p) || c2.cumple(p);
    }
}
