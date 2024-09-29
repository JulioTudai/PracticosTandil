package P5E7;

import java.util.ArrayList;

public class Vendedor extends  Empleado{
    private double comisionPorVenta;
    private double ventas;

    public Vendedor(String nombre,int dni,int sueldoFijo,double comxVenta, double ventas){
        super(nombre,dni,sueldoFijo);
        this.comisionPorVenta = comxVenta;
        this.ventas = ventas;
    }


    public double getSueldo(){
        double dineroAsumar = getComisionPorVenta() * getVentas();
        return getSueldoFijo() +dineroAsumar;
    }
    public double getComisionPorVenta() {
        return comisionPorVenta;
    }

    public void setComisionPorVenta(double comisionPorVenta) {
        this.comisionPorVenta = comisionPorVenta;
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }
}
