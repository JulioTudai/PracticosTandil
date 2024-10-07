package TP7E2;

import java.util.ArrayList;

public class Plataforma {
    private ArrayList<Pelicula> peliculas;
    private CEO ceo;

    public Plataforma(){
        this.peliculas = new ArrayList<>();
    }

    public ArrayList<Pelicula> buscarPelicula(Filtro f){
        ArrayList<Pelicula> encontradas = new ArrayList<>();
        for(Pelicula p :peliculas){
            if (f.cumple(p)) {

                encontradas.add(p);
                System.out.println("cumpli" + p.getTitulo());
            }
         }
        return encontradas;
    }

    public void aceptaCeo(Pelicula p){
        if(ceo.cumplePelicula(p)){
            this.setPeliculas(p);
            System.out.println("pelicula aceptada");
        }
    }

    public void setPeliculas(Pelicula p) {
        if (p != null && !peliculas.contains(p)) {//TODO redefinir euqals de peliculas
            peliculas.add(p);
        } else {
            System.out.println("pelicula nula o ya existe");
        }
    }

    public ArrayList<Pelicula> getPeliculas(){
        return new ArrayList<>(peliculas);
    }

    public CEO getCeo() {
        return ceo;
    }

    public void setCeo(CEO ceo) {
        this.ceo = ceo;
    }
}
