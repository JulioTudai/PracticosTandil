package P5E7;

public class EmpleadoBono extends Empleado{

    private int bono;
    private int ventasRequeridas;
    private int ventas;

    public EmpleadoBono (String nombre, int dni, int sueldoFijo,int b,int ventasreq, int ventas){
        super(nombre,dni,sueldoFijo);
        this.bono = b;
        this.ventasRequeridas = ventasreq;
        this.ventas = ventas;
    }

    public double getSueldo(){
        double sueldoFinal = 0;
        if(cumpleBono()){
            System.out.println("sueldo  mas bono");
            return sueldoFinal= this.getSueldoFijo() + this.getBono();
        }
        System.out.println("sueldo sin bono");
        return this.getSueldoFijo();
    }
    public boolean cumpleBono(){
        if(ventas > ventasRequeridas){
            return true;
        }
        return false;
    }
    public int getBono() {
        return bono;
    }

    public void setBono(int bono) {
        this.bono = bono;
    }

    public int getVentasRequeridas() {
        return ventasRequeridas;
    }

    public void setVentasRequeridas(int ventasRequeridas) {
        this.ventasRequeridas = ventasRequeridas;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }
}
