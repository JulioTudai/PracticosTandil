package ej4_sistema_noticias.filtros;

import ej4_sistema_noticias.Noticia;

public class BuscarAutor extends Filtro{
    private String autor;

    public BuscarAutor(String autor) {
        this.autor = autor;
    }

    public boolean buscar(Noticia n){
        return n.getAutor().equals(autor);
    }
}
