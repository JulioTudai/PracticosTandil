package TP7E2;

public class CEO {

    private Filtro f;

    public CEO(Filtro f){
        this.f = f;
    }

    public boolean cumplePelicula(Pelicula p){
        return f.cumple(p);
    }


    public Filtro getF() {
        return f;
    }

    public void setF(Filtro f) {
        this.f = f;
    }
}
