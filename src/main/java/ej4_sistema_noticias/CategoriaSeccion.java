package ej4_sistema_noticias;
import java.util.ArrayList;
import ej4_sistema_noticias.filtros.*;

public class CategoriaSeccion extends AdminContenido{
    private String descripcion;
    private String imagen;
    private ArrayList<AdminContenido> categorias;
    
    public CategoriaSeccion(String descripcion, String imagen) {
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.categorias=new ArrayList<>();
    }

    public ArrayList<Noticia> buscador(Filtro f){
        ArrayList<Noticia> retorno=new ArrayList<>();
        for(AdminContenido elem:categorias){
            retorno.addAll(elem.buscador(f));
        }
        return retorno;
    }

    public int getNoticias(){
        int contador=0;
        for(AdminContenido elem:categorias){
            contador+=elem.getNoticias();
        }
        return contador;
    }

    public void addCategoriaSeccion(AdminContenido seccion){
        this.categorias.add(seccion);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    
}
