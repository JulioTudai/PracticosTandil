package ParcialResiduos;

public class FiltroPeso extends Filtro{
    private double peso;

    public FiltroPeso(double peso){
        this.peso=peso;
    }

    public boolean cumple(ElementoReciclable p){
        return p.getPeso() <= peso;
    }
}
