package TP7E1;

public class CondicionAnd extends Condicion{

    private Condicion c1;
    private Condicion c2;

    public CondicionAnd(Condicion c1, Condicion c2){
        this.c1 = c1;
        this.c2 =c2;
    }
    public boolean cumple(ProductoQuimico p1){
        return c1.cumple(p1) && c2.cumple(p1);
    }
}
