package TP6E2;

public class Tarea {
    private int id;
    private int memoria;

    public Tarea (int id, int memoria){
        this.id = id;
        this.memoria = memoria;
    }

    public boolean soyMayor(Tarea t1){

        if(this.memoria > t1.getMemoria()){
            return true;
        }
        return false;
    }

    public boolean equals( Object obj){
       if(obj instanceof Tarea){
           Tarea t1 = (Tarea) obj;
           return this.getId() == t1.getId();
       }
       return false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
}
