package PT5E4;

import java.util.ArrayList;

public class Alumno extends Persona {

    private ArrayList<Familiar> familiares;


    public Alumno(String nombre, Cualidad cuali){
        super(nombre,cuali);
        this.familiares = new ArrayList<Familiar>();

    }
    public boolean equals(Alumno a){
        return super.equals(a);
    }

    public ArrayList<Familiar> getFamiliares() {
        ArrayList<Familiar> familiares2 = this.familiares;
        return familiares2;
    }

    public void addFamiliares(Familiar f){
        this.familiares.add(f);
    }
}
