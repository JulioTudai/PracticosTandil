package TP5E4;

import java.util.ArrayList;

public   class Casa {
    private String nombre;
    private Cualidad requisitos;
    private final int MAXALUMNOS;
    private String enemigo;
    private ArrayList<Alumno> alumnos;

    public Casa(String nombre, Cualidad c, String enemigo, int maxA){
        this.nombre = nombre;
        this.requisitos = c;
        this.enemigo = enemigo;
        this.MAXALUMNOS = maxA;
        this.alumnos = new ArrayList<Alumno>();
    }
    public boolean comprobarRequisitosDeCasa(Alumno a){
        return a.getCualidades().getFuerza() > this.getRequisitos().getFuerza()
                && a.getCualidades().getDestreza() > this.getRequisitos().getDestreza()
                && a.getCualidades().getMagia() > this.getRequisitos().getMagia();
    }


    public boolean pertenece(Alumno a){
        for (Alumno alumno : alumnos){
            if(alumno.equals(a)){
                return true;
            }
        }
        return false;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cualidad getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(Cualidad requisitos) {
        this.requisitos = requisitos;
    }

    public int getMAXALUMNOS() {
        return MAXALUMNOS;
    }

    public String getEnemigo() {
        return enemigo;
    }

    public void setEnemigo(String enemigo) {
        this.enemigo = enemigo;
    }

    public ArrayList<Alumno> getAlumnos() {
        ArrayList<Alumno> alumnos2 = this.alumnos;
        return alumnos2;
    }
    public void addAlumno(Alumno a){
        if (this.MAXALUMNOS > alumnos.size()){

            alumnos.add(a);
        }
    }

}
