package PREFINAL;

import PREFINAL.Condicion.Condicion;

public class PrendaAdaptativa extends Prenda{

    public PrendaAdaptativa(String nombre, double talle, Condicion condicion, String color){
        super(nombre, talle, condicion, color);
    }

    @Override
    public boolean seAdapta(Duende duende){
        return true;
    }

}
