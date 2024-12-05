package PREFINAL.Condicion;

import PREFINAL.Duende;

public class CondicionAltura extends Condicion{

    private double altura;

    public CondicionAltura(double altura){
        this.altura=altura;
    }

    @Override
    public boolean cumple(Duende duende){
        return duende.getAltura() < this.altura;
    }

}
