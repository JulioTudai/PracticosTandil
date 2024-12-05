package parcialPiezas3D;

public class PiezadeDsienio extends PiezaCompuesta {
    private Filtro f;

    public PiezadeDsienio(String nombre, String descripcion, Filtro f){
        super(nombre,descripcion);
        this.f=f;
    }

    public void addElemento(Pieza3d p){
        if(f.cumple(p)){
            super.addElemento(p);
        }
    }

    public Filtro getF() {
        return f;
    }

    public void setF(Filtro f) {
        this.f = f;
    }
}
