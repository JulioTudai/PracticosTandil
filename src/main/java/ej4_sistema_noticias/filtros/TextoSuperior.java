package ej4_sistema_noticias.filtros;

import ej4_sistema_noticias.Noticia;

public class TextoSuperior extends Filtro{
    private int largo;

    public TextoSuperior(int largo) {
        this.largo = largo;
    }

    public boolean buscar(Noticia n){
        return n.getTexto().length()>largo;
    }
}
