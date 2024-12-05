package ej4_sistema_noticias.filtros;

import ej4_sistema_noticias.Noticia;

public class ContengaPalabraClave extends Filtro{
    private String palabra;

    public ContengaPalabraClave(String palabra) {
        this.palabra = palabra;
    }

    public boolean buscar(Noticia n){
        return n.contienePalabraClave(palabra);
    }
}
