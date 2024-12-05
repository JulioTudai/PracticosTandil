package parcialPiezas3D;

public class FiltroColor extends Filtro{
    private String color;

    public FiltroColor(String color) {
        this.color = color;
    }
    public boolean cumple(Pieza3d p){
        return p.getColores().contains(color);
    }
}
