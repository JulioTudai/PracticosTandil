package ParcialResiduos;

public class FiltroPalabraClave extends Filtro{

    private String s;
    public FiltroPalabraClave(String s){
        this.s=s;
    }

    public boolean cumple(ElementoReciclable e){
        return e.poseePalabraClave(this.s);
    }
}
