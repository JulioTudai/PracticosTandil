package TP7E1;

public class CondicionEnfermedad  extends Condicion{

    private EnfermedadCultivo enfermedad;
    public CondicionEnfermedad(EnfermedadCultivo e1){
        this.enfermedad = e1;
    }

    public boolean cumple(ProductoQuimico p1){

        return p1.cumpleEstadosPatologicos(enfermedad);
    }

}
