package ParcialResiduos;

public class FiltroVolumenMenor extends Filtro{
    private double volumen;

    public FiltroVolumenMenor(double e){
        this.volumen=e;
    }

    public boolean cumple(ElementoReciclable p){
        return p.getVolumen()<this.volumen;
    }
}
