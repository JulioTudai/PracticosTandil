package parcialPiezas3D;

public class FiltroAnd  extends Filtro{

    private Filtro f1,f2;

    public FiltroAnd(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    public boolean cumple(Pieza3d p){
        return f1.cumple(p) && f2.cumple(p);
    }
}
