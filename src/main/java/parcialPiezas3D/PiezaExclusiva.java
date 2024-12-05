package parcialPiezas3D;

import java.util.ArrayList;

public class PiezaExclusiva extends Pieza {
    private int costoExc;

    public PiezaExclusiva (String nombre, String descripcion,int pla, int tiempo, String color, int costoExc){
        super(nombre,descripcion,pla,tiempo,color);
        this.costoExc = costoExc;
    }

    @Override
    public double getCosto() {
        return super.getCosto() + costoExc;
    }

    public ArrayList<Pieza> buscar(Filtro f){
        ArrayList<Pieza> nada =  new ArrayList<>();
        return nada;
    }
    //todo get y set
    public int getCostoExc() {
        return costoExc;
    }

    public void setCostoExc(int costoExc) {
        this.costoExc = costoExc;
    }
}
