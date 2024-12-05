package ej4_sistema_noticias;
import java.util.ArrayList;
import ej4_sistema_noticias.filtros.*;

public class Noticia extends AdminContenido{
    private String titulo;
    private String introduccion;
    private String texto;
    private String autor;
    private String link;
    private ArrayList<String> palabrasClaves;

    public Noticia(String titulo, String introduccion, String texto, String autor, String link) {
        this.titulo = titulo;
        this.introduccion = introduccion;
        this.texto = texto;
        this.autor = autor;
        this.link = link;
        this.palabrasClaves=new ArrayList<>();
    }

    public ArrayList<Noticia> buscador(Filtro f){
        ArrayList<Noticia> retorno=new ArrayList<>();
        if (f.buscar(this)) {
            retorno.add(this);
        }
        return retorno;
    }

    public int getNoticias(){
        return 1;
    }

    public boolean contienePalabraClave(String palabra){
        return palabrasClaves.contains(palabra);
    }

    public void agregarPalabraClave(String s){
        this.palabrasClaves.add(s);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIntroduccion() {
        return introduccion;
    }

    public void setIntroduccion(String introduccion) {
        this.introduccion = introduccion;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public boolean equals(Object o){
        try {
            Noticia other=(Noticia)o;
            return this.getAutor().equalsIgnoreCase(other.getAutor()) || 
            this.getTitulo().equalsIgnoreCase(other.getTitulo());
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Noticia [titulo=" + this.getTitulo() + ", autor=" + this.getAutor() + "]";
    }

}
