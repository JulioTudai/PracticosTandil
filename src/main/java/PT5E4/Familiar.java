package PT5E4;

public class Familiar extends Persona {
    private Casa casaPertenecen;

    public Familiar (String nombre, Cualidad c){
        super(nombre,c);
    }
    public boolean equals(Alumno a){
        return super.equals(a);
    }

}
