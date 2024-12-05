package ej4_sistema_noticias.filtros;
import ej4_sistema_noticias.Noticia;

public class FiltroAnd extends Filtro{
    private Filtro c1,c2;

    public FiltroAnd(Filtro c1, Filtro c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public boolean buscar(Noticia n){
        return c1.buscar(n) && c2.buscar(n);
    }

}
