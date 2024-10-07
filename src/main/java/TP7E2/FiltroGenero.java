package TP7E2;

public class FiltroGenero extends Filtro{

    public String genero;

    public FiltroGenero(String genero) {
        this.genero = genero;
    }

    public boolean cumple(Pelicula p){
        return p.getGeneros().contains(genero.toLowerCase());
    }
}
