package TP2E5;

import java.util.ArrayList;

public class Peluquero {
    private String nombre;
    private ArrayList<Turno> turnosOcupados;
    private ArrayList<Turno> turnosDisponibles;


    public Peluquero(String nombre){
        this.nombre = nombre;
        this.turnosOcupados = new ArrayList<Turno>();
        this.turnosDisponibles = new ArrayList<Turno>();
    }

    public int peluqueroPrimerTurnoDisp(){
        int hora1;
        hora1 = turnosDisponibles.get(0).getHora();

        for (Turno turno : turnosDisponibles){
            if (turno.getHora() < hora1){
                hora1 = turno.getHora();
            }
        }
        return hora1;
    }
    public boolean turnoDisponible(Turno turno){

        for (Turno t : turnosDisponibles){
            if(turno.getHora() == t.getHora() && turno.getFecha().getDayOfMonth() == t.getFecha().getDayOfMonth()){
                return false;
            }
        }
        return true;
    }

    public ArrayList<Turno> getTurnosDisponibles() {
        return turnosDisponibles;
    }

    public void setTurnosDisponibles(ArrayList<Turno> turnosDisponibles) {
        this.turnosDisponibles = turnosDisponibles;
    }

    public ArrayList<Turno> disponible(){
        return turnosDisponibles;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Turno> getTurnosOcupados() {
        return turnosOcupados;
    }

    public void setTurnosOcupados(ArrayList<Turno> turnosOcupados) {
        this.turnosOcupados = turnosOcupados;
    }
}
