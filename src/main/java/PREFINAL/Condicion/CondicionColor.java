package PREFINAL.Condicion;

import PREFINAL.Duende;

public class CondicionColor extends Condicion{

    private String color;

    public CondicionColor(String color){
        this.color=color;
    }

    @Override
    public boolean cumple(Duende duende){
        return duende.checkColor(this.color);
    }

}
