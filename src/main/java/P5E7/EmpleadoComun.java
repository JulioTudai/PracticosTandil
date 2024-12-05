package P5E7;

public class EmpleadoComun extends Empleado {

    public EmpleadoComun (String nombre, int dni,double sueldoFijo){
        super(nombre,dni,sueldoFijo);
    }
    public double getSueldo(){
        return this.getSueldoFijo();
    }
}
