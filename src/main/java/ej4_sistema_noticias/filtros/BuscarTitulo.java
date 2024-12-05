package ej4_sistema_noticias.filtros;

import ej4_sistema_noticias.Noticia;

public class BuscarTitulo extends Filtro{
    private String titulo;

    public BuscarTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean buscar(Noticia n){
        return n.equals(titulo);
    }
}
