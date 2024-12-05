package recuperatorio;

import java.util.ArrayList;

public class PitufoRebelde extends Pitufo{  //Malhumorado
    @Override
    protected Pitufo getCascaron() {
        return new PitufoRebelde(this.getNombre(), this.getExperiencia(), this.getCreatividad(), this.getVelocidadTrabajo(), resta, divisor);
    }

    private double resta, divisor;

    public PitufoRebelde(String nombre, int experiencia, double velocidad, double creatividad, double resta, double divisor) {
        super(nombre, experiencia, velocidad, creatividad);
        this.resta = resta;
        this.divisor = divisor;
    }

    @Override
    public double getVelocidadTrabajo() {
        return super.getVelocidadTrabajo()-resta;
    }

    @Override
    public double getCreatividad() {
        return super.getCreatividad()/divisor;
    }

    @Override
    public ArrayList<String> getHabilidades() {
        ArrayList<String> retorno = new ArrayList<>();
        if (!habilidades.isEmpty())
            retorno.add(habilidades.get(0));
        return retorno;
    }
}
