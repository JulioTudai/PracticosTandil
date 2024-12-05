package parcialPiezas3D;

public class FiltroNot extends Filtro{
    private Filtro f1;

    public FiltroNot(Filtro f1) {
        this.f1 = f1;
    }

    public boolean cumple(Pieza3d p){
        return !f1.cumple(p);
    }
}
