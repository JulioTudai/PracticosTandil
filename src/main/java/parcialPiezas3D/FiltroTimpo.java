package parcialPiezas3D;

public class FiltroTimpo extends Filtro{

    private int timpo;

    public FiltroTimpo(int timpo) {
        this.timpo = timpo;
    }

    public boolean cumple(Pieza3d p){
        return p.getTiempo() > timpo;
    }
}
