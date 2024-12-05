package TP11E3;

import java.util.ArrayList;

public abstract class ContenidoSitio {

    public abstract int cantNoticias();
    public abstract ArrayList<Noticia> copia();
    public abstract ArrayList<Noticia> buscar();
    public abstract ArrayList<String> mapaSitio();
}
