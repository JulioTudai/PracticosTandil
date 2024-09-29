package TP3E1;

import java.util.ArrayList;

public class Encuesta {
    private ArrayList<String> preguntas;
    private ArrayList<Empleado>empleadosRealizo;
    private ArrayList<Persona>personasEncuestadas;

    public Encuesta(){
        this.empleadosRealizo = new ArrayList<Empleado>();
        this.personasEncuestadas = new ArrayList<Persona>();
        this.preguntas = new ArrayList<String>();
    }

    public boolean personaYaFueEncuestada(Persona p, int dniPersonaAEncuestar){
        for (Persona personaEncuestada : personasEncuestadas){
            if (personaEncuestada.getDni() == dniPersonaAEncuestar){
                return true;
            }
        }
        return false;
    }

    public void addEcuestadoYencuestador(Empleado e1, Persona p1){
        if(verificarEmpleado(e1)){
            empleadosRealizo.add(e1);
        }
        personasEncuestadas.add(p1);
    }
    public boolean verificarEmpleado(Empleado e){
        for (Empleado empleado : empleadosRealizo){
            if(empleado.getDni() == e.getDni()){
                return false;
            }
        }
        return true;
    }



    public ArrayList<String> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList<String> preguntas) {
        this.preguntas = preguntas;
    }

    public ArrayList<Persona> getPersonasEncuestadas() {
        return personasEncuestadas;
    }

    public void setPersonasEncuestadas(ArrayList<Persona> personasEncuestadas) {
        this.personasEncuestadas = personasEncuestadas;
    }

    public ArrayList<Empleado> getEmpleadosRealizo() {
        return empleadosRealizo;
    }

    public void setEmpleadosRealizo(ArrayList<Empleado> empleadosRealizo) {
        this.empleadosRealizo = empleadosRealizo;
    }
}
