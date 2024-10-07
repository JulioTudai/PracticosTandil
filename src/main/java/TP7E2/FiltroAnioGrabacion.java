package TP7E2;

import java.time.LocalDate;


public class FiltroAnioGrabacion extends Filtro{

    private LocalDate anio;

    public FiltroAnioGrabacion(LocalDate anio) {
        this.anio = anio;
    }

    public boolean cumple(Pelicula p){
        return p.getAnioEstreno().isBefore(anio);
    }
}
