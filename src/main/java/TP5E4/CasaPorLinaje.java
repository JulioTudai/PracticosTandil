package TP5E4;

import java.util.ArrayList;

public class CasaPorLinaje extends Casa{

    public CasaPorLinaje(String nombre,Cualidad c,String enemigo,int maxAlunos){
        super(nombre,c,enemigo,maxAlunos);
    }

    public boolean comprobarRequisitosDeCasa(Alumno a){
        if(super.comprobarRequisitosDeCasa(a)){
            if (comprobarLinaje(a)){
                System.out.println("linaje correcto");
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean comprobarLinaje(Alumno a){
         ArrayList<Familiar> f = a.getFamiliares();
         for (Familiar f1 : f){
             for( Alumno a2 : this.getAlumnos()){
                 if(f1.equals(a2)){
                     return true;
                 }
             }
         }
         return false;
    }


}
