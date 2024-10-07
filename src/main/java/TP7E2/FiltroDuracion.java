package TP7E2;

import java.time.LocalTime;

public class FiltroDuracion extends Filtro {
    private LocalTime duracion;

    public FiltroDuracion(LocalTime duracion) {
        this.duracion = duracion;
    }

    public boolean cumple(Pelicula p){
        return p.getDuracion().isBefore(duracion);
    }
}
