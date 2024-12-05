package TP11E3;

import java.util.ArrayList;

public class Noticia extends  ContenidoSitio{
    private String titulo,introduccion,texto,autor,Link;
    private ArrayList<String> palabrasClaves;

    public Noticia(String titulo, String introduccion, String texto, String autor, NoticiaCompuesta c) {
        this.Link = "Acceso directo a :" + c.getNombre();
        this.titulo = titulo;
        this.introduccion = introduccion;
        this.texto = texto;
        this.autor = autor;
        this.palabrasClaves = new ArrayList<>();
    }




    //TODO GETTERS Y SETERS
    public void addPal(String e){
        palabrasClaves.add(e);
    }

    public ArrayList<String> getPalabrasClaves(){
        return new ArrayList<>(palabrasClaves);
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
        return Link;
    }

    public void setLink(String link) {
        Link = link;
    }
}
