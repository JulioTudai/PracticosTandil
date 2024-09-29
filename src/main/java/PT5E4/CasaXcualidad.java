package PT5E4;

public class CasaXcualidad extends Casa {


    public CasaXcualidad (String nombre, Cualidad requisitos,String enemigos, int maxAlumnos){
        super(nombre,requisitos,enemigos,maxAlumnos);
    }
    public boolean comprobarRequisitosDeCasa(Alumno a){
        if(super.comprobarRequisitosDeCasa(a)){
            return true;
        }
        return false;
    }


}
