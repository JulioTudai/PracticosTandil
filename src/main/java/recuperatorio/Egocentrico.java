package recuperatorio;

public class Egocentrico extends Pitufo{ //Supremo
    private int factor;
    public Egocentrico(String nombre, int experiencia, double velocidad, double creatividad, int factor) {
        super(nombre, experiencia, velocidad, creatividad);
        this.factor = factor;
    }

    @Override
    public double getVelocidadTrabajo() {
        return super.getVelocidadTrabajo()*factor;
    }

    @Override
    public double getCreatividad() {
        return super.getCreatividad()*factor;
    }

    @Override
    public int getExperiencia() {
        return super.getExperiencia()*factor;
    }

    @Override
    protected Pitufo getCascaron() {
        return new Egocentrico(this.getNombre(), this.getExperiencia(), this.getVelocidadTrabajo()
        , this.getCreatividad(), factor);
    }
}
