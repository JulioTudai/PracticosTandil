package RecuPapaNoel;

import java.util.ArrayList;

public class Duende  extends Plantel implements Comparable<Duende>{
    private String nombre;
    private int velocidad,creatividad,anio;
    protected ArrayList<String> habilidades;

    public Duende(String nombre, int velocidad, int creatividad, int anio) {
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.creatividad = creatividad;
        this.anio = anio;
        this.habilidades= new ArrayList<>();
    }
    public int getCantDuendes(Condicion c){
        if(c.cumple(this)){
            return 1;
        }
        return 0;
    }
    public Plantel copia(){
        Duende copia = crearDuende();
        return copia;
    }
    public Duende crearDuende(){
        Duende copia = new Duende(this.nombre,this.velocidad,this.creatividad,this.anio);
        return copia;
    }

    public int compareTo(Duende d){
        int resultado = this.anio - d.getAnio();

        if(resultado ==0){
            resultado = this.velocidad - d.getVelocidad();

            if (resultado ==0) {
                resultado = this.nombre.compareTo(d.getNombre());
            }
        }
        return resultado;
    }

    //TODO GETERS Y SETRS
    public void addHabilidades(String a){
        habilidades.add(a);
    }
    public ArrayList<String> getHabilidades(){
        return new ArrayList<>(habilidades);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getCreatividad() {
        return creatividad;
    }

    public void setCreatividad(int creatividad) {
        this.creatividad = creatividad;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
