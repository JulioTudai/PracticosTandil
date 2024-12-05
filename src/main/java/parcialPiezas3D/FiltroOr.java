package parcialPiezas3D;

public class FiltroOr extends Filtro{
    private Filtro f1,f2;

    public FiltroOr(Filtro f2, Filtro f1) {
        this.f2 = f2;
        this.f1 = f1;
    }

    public boolean cumple(Pieza3d p){
        return f1.cumple(p) || f2.cumple(p);
    }
}
