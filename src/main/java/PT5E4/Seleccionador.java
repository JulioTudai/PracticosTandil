package PT5E4;

import java.util.ArrayList;

public class Seleccionador {

    private ArrayList<Casa>  casas;

    public Seleccionador (){
        this.casas = new ArrayList<Casa>();
    }


    public String definirCasaAlumno(Alumno a){
        if(a == null){
            return "alumno vacio";
        }
        for (Casa c : casas){
            if(c.pertenece(a)) {
                return " el alumno ya pertenece a alguna de las casas";
            }
        }

        for (Casa c : casas){
            if(c.getMAXALUMNOS() > c.getAlumnos().size()){
                if(c.comprobarRequisitosDeCasa(a)){
                    c.addAlumno(a);
                    System.out.println("soy la casa " +c.getNombre());
                    return "Alumno : "+ a.getNombre()+" agregado correctamente";
                }
                else{
                    System.out.println("este alumno no comple con los requisitos de esta casa: "+c.getNombre());
                }
            }
            else{
                System.out.println("la casa "+c.getNombre()+" esta llena");
            }
        }
        return "el alumno no pudo ingresar a ninguna de las casas";
    }

    public ArrayList<Casa> getCasas() {
        ArrayList<Casa> casa2 = this.casas;
        return casa2;
    }

    public void addCasas(Casa casa) {
        this.casas.add(casa);
    }
}
