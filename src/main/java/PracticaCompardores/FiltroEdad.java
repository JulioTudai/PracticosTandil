package PracticaCompardores;

public class FiltroEdad extends Filtro{
    private int edad;

    public FiltroEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean cumple(Persona p) {
        return p.getEdad() < edad;
    }
}

