package recuperatorio;

import java.util.ArrayList;

public class Pitufo extends ElementoRecoleccion implements Comparable<Pitufo>{
    private String nombre;
    private int experiencia;
    private double velocidad;
    private double creatividad;
    protected ArrayList<String> habilidades;

    public Pitufo(String nombre, int experiencia, double velocidad, double creatividad) {
        this.nombre = nombre;
        this.experiencia = experiencia;
        this.velocidad = velocidad;
        this.creatividad = creatividad;
        this.habilidades = new ArrayList<>();
    }

    @Override
    public double getVelocidadTrabajo() {
        return this.velocidad;
    }

    @Override
    public double getCreatividad() {
        return this.creatividad;
    }

    public void addHabilidad(String hab){
        if (!this.habilidades.contains(hab))
            this.habilidades.add(hab);
    }

    @Override
    public ArrayList<String> getHabilidades() {
        return new ArrayList<>(this.habilidades);
    }

    @Override
    public int cantidadPitufos(Condicion c) {
        if (c.cumple(this))
            return 1;
        return 0;
    }

    @Override
    public ElementoRecoleccion getCopia() {
        Pitufo copia = getCascaron();
        for (String hab:habilidades)
            copia.addHabilidad(hab);
        return copia;
    }

    protected Pitufo getCascaron(){
        return new Pitufo(nombre, experiencia, velocidad, creatividad);
    }

    public int getExperiencia() {
        return experiencia;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int compareTo(Pitufo o) {
        int res = this.getExperiencia() - o.getExperiencia();
        if (res == 0) {
            res = Double.compare(this.getCreatividad(), o.getCreatividad());
            if (res == 0)
                return this.getNombre().compareTo(o.getNombre());
        }
        return res;
    }
}
