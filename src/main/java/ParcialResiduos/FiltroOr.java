package ParcialResiduos;

public class FiltroOr extends  Filtro{
    Filtro f1,f2;
    public FiltroOr(Filtro f1, Filtro f2){
        this.f1=f1;
        this.f2=f2;
    }

    public boolean cumple(ElementoReciclable p){
        return f1.cumple(p) ||  f2.cumple(p);
    }
}

