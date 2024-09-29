package TP3E1;

import java.util.ArrayList;

public class EmpresaConsultora {
    private ArrayList<Encuesta> encuestasRealizadas;
    private ArrayList<Empleado> empleados;
    private int plus;

    public EmpresaConsultora(int plus){
        this.plus = plus;
        this.encuestasRealizadas = new ArrayList<Encuesta>();
        this.empleados = new ArrayList<Empleado>();
    }

    public String empleadoGanador(){
        Empleado ganador;
        ganador = empleados.get(0);
        for (Empleado e : empleados){
            if (e.getEncuestasRealizadas() > ganador.getEncuestasRealizadas()){
                ganador = e;
            }
        }
        int plusFinal = calcularPlus(ganador);
        //sueldoFinalEmpleado(plusFinal);
        return "el empleado ganador es" +ganador.getNombre();
    }
    public int calcularPlus(Empleado ganador){
        int plusFinal = ganador.getEncuestasRealizadas()*plus;
        return plusFinal;

    }


    public ArrayList<Encuesta> getEncuestasRealizadas() {
        return encuestasRealizadas;
    }

    public void setEncuestasRealizadas(ArrayList<Encuesta> encuestasRealizadas) {
        this.encuestasRealizadas = encuestasRealizadas;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public int getPlus() {
        return plus;
    }

    public void setPlus(int plus) {
        this.plus = plus;
    }
}
