package TP7E2;

public class FiltroDirector extends Filtro{
    private String director;

    public FiltroDirector(String director) {
        this.director = director;
    }

    public boolean cumple(Pelicula p){
        return p.getDirector().equalsIgnoreCase(director);
    }
}
