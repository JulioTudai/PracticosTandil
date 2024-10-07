package TP7E2;

public class FiltroActor extends  Filtro{
    private String actor;

    public FiltroActor(String actor) {
        this.actor = actor;
    }

    public boolean cumple(Pelicula p){
        return p.getActores().contains(actor.toLowerCase());
    }
}
