package ParcialResiduos;

import java.util.ArrayList;

public class Pedido extends ElementoReciclable  {
    private Persona solicitador;
    private double volEstimado;
    private double peso;
    private ArrayList<String> descriptores;

    public Pedido(String nombre, Persona solicitador, double volEstimado, double peso) {
        super(nombre);
        this.solicitador = solicitador;
        this.volEstimado = volEstimado;
        this.peso = peso;
        this.descriptores = new ArrayList<>();
    }

    public ArrayList<Pedido>buscar(Filtro f){
        ArrayList<Pedido> salida = new ArrayList<>();
        if(f.cumple(this)){
            salida.add(this);
        }
        return salida;
    }

    public void setDescriptores(String d){
        if(!this.descriptores.contains(d)){
            this.descriptores.add(d);
        }

    }
    public boolean equals(Object o){
        try{
            Pedido p = (Pedido) o;
            if(this.nombre.equals(p.getNombre()) &&
                    this.descriptores.containsAll(p.getDescriptores())){
                return true;
            }
        }
            catch(Exception e){
                return false;
            }
       return false;

    }
    public int cantFrenadas(){
        return 1;
    }
    public boolean poseePalabraClave(String pal){
        return this.descriptores.contains(pal);
    }

    public ArrayList<String> getDescriptores(){
        return new ArrayList<>(this.descriptores);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getVolumen() {
        return volEstimado;
    }

    public void setVolEstimado(double volEstimado) {
        this.volEstimado = volEstimado;
    }

    public Persona getSolicitador() {
        return solicitador;
    }

    public void setSolicitador(Persona solicitador) {
        this.solicitador = solicitador;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "descriptores=" + descriptores +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
