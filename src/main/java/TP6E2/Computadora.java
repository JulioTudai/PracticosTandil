package TP6E2;

public class Computadora {
    private int id;
    private int velocidad;
    private boolean disponible;

    public Computadora(int id, int velocidad, boolean disponible) {
        this.id = id;
        this.velocidad = velocidad;
        this.disponible = disponible;
    }

    public boolean soyMayor(Computadora c1) {
        if (this.velocidad > c1.getVelocidad()) {
            return true;
        }
        return false;
    }

    public String ejecutarTarea(Tarea t1){

        return "Tarea :" + t1.getId() + "ejecutada y termianda, memoria liberada :" +t1.getMemoria();
    }

    public boolean equals(Object obj){
       if(  obj instanceof Computadora){
           Computadora  c1 = (Computadora) obj;
           return this.id == c1.getId();
       }
       return false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    public String toString() {
        return "Computadora{" +
                "id='" + id + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }
}
