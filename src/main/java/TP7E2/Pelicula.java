package TP7E2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Pelicula {
    private String titulo;
    private String director;
    private String sinopsis;
    private ArrayList<String> generos;
    private ArrayList<String>actores;
    private LocalDate anioEstreno;
    private LocalTime duracion;
    private int edadMinima;

    public Pelicula (String t,String d,String s,LocalDate a,LocalTime dura,int e ){
        this.titulo = t;
        this.director = d;
        this.sinopsis = s;
        this.generos = new ArrayList<>();
        this.actores = new ArrayList<>();
        this.anioEstreno = a;
        this.duracion = dura;
        this.edadMinima = e;

    }

    public void setGeneros(String g){
        if(g!=null && !generos.contains(g.toLowerCase())){//TODO Aca no hay que redefinir el equals porque son string no?
            this.generos.add(g.toLowerCase());
        }
    }

    public ArrayList<String> getGeneros(){
        return new ArrayList<>(generos);
    }

    public void setActores (String a){
        if(a!= null && !actores.contains(a.toLowerCase())){//TODO Aca no hay que redefinir el equals porque son string no?
            this.actores.add(a.toLowerCase());
        }
    }

    public ArrayList<String> getActores(){
        return new ArrayList<>(actores);
    }

    public boolean equals(Object o){
        try {
            Pelicula p = (Pelicula) o;
            if (this.titulo.equals(p.getTitulo())&& this.duracion.equals(p.getDuracion())){
                return true;
            }

        }catch (Exception e){
            return false;
        }
        return false;
    }


    public LocalDate getAnioEstreno() {
        return anioEstreno;
    }

    public void setAnioEstreno(LocalDate anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public LocalTime getDuracion() {
        return duracion;
    }

    public void setDuracion(LocalTime duracion) {
        this.duracion = duracion;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", director='" + director + '\'' +
                ", sinopsis='" + sinopsis + '\'' +
                ", generos=" + generos +
                ", actores=" + actores +
                ", anioEstreno=" + anioEstreno +
                ", duracion=" + duracion +
                ", edadMinima=" + edadMinima +
                '}';
    }
}
