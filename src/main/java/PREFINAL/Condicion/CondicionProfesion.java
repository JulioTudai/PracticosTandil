package PREFINAL.Condicion;

import PREFINAL.Duende;

public class CondicionProfesion extends Condicion{

    private String profesion;

    public CondicionProfesion(String profesion){
        this.profesion=profesion;
    }

    @Override
    public boolean cumple(Duende duende){
        return duende.getProfesion().equalsIgnoreCase(this.profesion);
    }

}
