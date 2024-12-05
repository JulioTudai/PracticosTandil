package PREFINAL.Condicion;

import PREFINAL.Duende;

public class CondicionTalle extends Condicion{

    private double talle;

    public CondicionTalle(double talle){
        this.talle=talle;
    }

    @Override
    public boolean cumple(Duende duende){
        return duende.getTalle()==this.talle;
    }

}
