package ParcialResiduos;

public class FiltroNot extends Filtro{
    Filtro f1;

    public FiltroNot(Filtro f1){
        this.f1=f1;
    }

    public boolean cumple(ElementoReciclable p){
        return !f1.cumple(p);
    }
}
