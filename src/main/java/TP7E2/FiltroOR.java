package TP7E2;

public class FiltroOR extends Filtro{

    private Filtro f1;
    private Filtro f2;

    public FiltroOR(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    public boolean cumple(Pelicula p){
        return f1.cumple(p) || f2.cumple(p);
    }
}
