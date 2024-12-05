package TP11E3;

import java.util.ArrayList;

public class NoticiaCompuesta  extends ContenidoSitio{

    private String nombre,descripcion,imagen;
    private ArrayList<ContenidoSitio> elementos;

    public NoticiaCompuesta(String nombre, String descripcion, String imagen) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.elementos = new ArrayList<>();
    }

    //TODO GETERS Y SETERS

    public void addElemento(ContenidoSitio c){
        this.elementos.add(c);
    }

    public ArrayList<ContenidoSitio> getElementos(){
        return new ArrayList<>(elementos);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
