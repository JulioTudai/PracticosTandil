package TP2E1;

public class Episodio {
    private String titulo;
    private String descripcion;
    private boolean visto;
    private int calificacion;

    public Episodio (){
        this.titulo = "ninguno";
        this.descripcion = "ninguna";
        this.visto = false;
        this.calificacion = -1;
    }
    public Episodio (String titulo,String descripcion){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.visto = false;
        this.calificacion = -1;
    }

    public void calificar(int calif){
        if(calif > 0 && calif < 6){
            this.calificacion = calif;
            this.visto = true;
        }
        System.out.println("los valores permitidos estan entre 1 y 5");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isVisto() {
        return visto;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
}
