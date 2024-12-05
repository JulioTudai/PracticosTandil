package parcialPiezas3D;

public class FiltroMenosPla extends Filtro{
    private int pla;

    public FiltroMenosPla(int pla) {
        this.pla = pla;
    }

    public boolean cumple(Pieza3d p){
        return p.getCantPla() < pla;
    }

}
