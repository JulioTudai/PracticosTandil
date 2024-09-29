package TP2E5;

import java.util.ArrayList;

public class Peluqueria {
    private ArrayList<Peluquero> peluqueros;
    private ArrayList<Turno> turnosReservados;
    private ArrayList<Turno> turnosDisponibles;

    public Peluqueria (){
        this.peluqueros = new ArrayList<Peluquero>();
        this.turnosReservados = new ArrayList<Turno>();
        this.turnosDisponibles = new ArrayList<Turno>();
    }
    public String clienteSolicitarTurno(Peluquero p){
       ArrayList<Turno> disponibles = p.disponible();
        System.out.println("lista de horas y dias disponibles");
       for(Turno actual : disponibles){
           System.out.println("Dia: "+actual.getFecha().getDayOfMonth()+"Hora: "+actual.getHora());
       }
       return "Listo pa que mas queres";

    }
    public String primerTurnoDisponible(){
        int horaP1;
        Peluquero peluqueroTurno = null;
        horaP1 = peluqueros.get(0).peluqueroPrimerTurnoDisp();
        for (Peluquero p:peluqueros){
            if (p.peluqueroPrimerTurnoDisp() < horaP1){
                horaP1 = p.peluqueroPrimerTurnoDisp();
                peluqueroTurno = p;
            }
        }
        return "El primer turno disponible lo tiene el peluquero:"+peluqueroTurno.getNombre()+" a la hora: "+horaP1;
    }
    public String turnoEspecifico (Turno turno){
        for (Peluquero p : peluqueros){
            if(p.turnoDisponible(turno)){
                clienteFrecuente(turno);
                guardarturno(turno);
                return "turno dispoible y reservado";
            }
        }
        return " turno ocupado en todos los peluqueros";
    }

    public void guardarturno(Turno turno){
        turnosReservados.add(turno);
    }

    public void clienteFrecuente(Turno t){
        for (Turno turnos : turnosReservados){
            
        }

    }



    public ArrayList<Peluquero> getPeluqueros() {
        return peluqueros;
    }

    public void setPeluqueros(ArrayList<Peluquero> peluqueros) {
        this.peluqueros = peluqueros;
    }

    public ArrayList<Turno> getTurnosReservados() {
        return turnosReservados;
    }

    public void setTurnosReservados(ArrayList<Turno> turnosReservados) {
        this.turnosReservados = turnosReservados;
    }

    public ArrayList<Turno> getTurnosDisponibles() {
        return turnosDisponibles;
    }

    public void setTurnosDisponibles(ArrayList<Turno> turnosDisponibles) {
        this.turnosDisponibles = turnosDisponibles;
    }
}
