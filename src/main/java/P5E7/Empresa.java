package P5E7;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> empleados;

    public Empresa(){
        this.empleados =  new ArrayList<Empleado>();
    }
    public double calcularGastosDeEmpleados(){
        double sumaSueldos = 0;
        for (Empleado e : empleados){
            sumaSueldos += e.getSueldo();
        }
        return sumaSueldos;
    }


    public ArrayList<Empleado> getEmpleados(){
        ArrayList<Empleado> empleados2 = new ArrayList<>();
        empleados2.addAll(empleados);
        return empleados2;
    }

    public void addEmpleados(Empleado empleado) {
        this.empleados.add(empleado);
    }
}
