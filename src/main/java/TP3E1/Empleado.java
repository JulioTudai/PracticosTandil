package TP3E1;

import java.util.ArrayList;

public class Empleado extends Persona{
    private boolean empleado;
    private int encuestasRealizadas;
    private int sueldo;


    public Empleado (String nombre, int dni, int sueldo){
        super(nombre,dni);
        this.sueldo =  sueldo;
        this.empleado = true;
    }
    public String realizarEncuesta (Encuesta encuesta, Persona p1){
        if(!encuesta.personaYaFueEncuestada(p1,p1.getDni())){
            p1.llenarEncuesta(encuesta);
            encuesta.addEcuestadoYencuestador(this,p1);
            encuestasRealizadas++;
            return "encuesta realizada con exito";
        }

        return "Esta persona ya contesto esta encuesta";
    }

    public boolean isEmpleado() {
        return empleado;
    }

    public void setEmpleado(boolean empleado) {
        this.empleado = empleado;
    }

    public int getEncuestasRealizadas() {
        return encuestasRealizadas;
    }

    public void setEncuestasRealizadas(int encuestasRealizadas) {
        this.encuestasRealizadas = encuestasRealizadas;
    }
}
