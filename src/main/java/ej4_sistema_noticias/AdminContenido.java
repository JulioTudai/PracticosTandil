package ej4_sistema_noticias;
import java.util.ArrayList;
import ej4_sistema_noticias.filtros.*;

public abstract class AdminContenido {

    public abstract int getNoticias();

    public abstract ArrayList<Noticia> buscador(Filtro f);
}
