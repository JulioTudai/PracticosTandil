package TP11E6;


public class CalculadorPrecioFijo extends CalculadorPrecio {

    double precioFijo;

    public CalculadorPrecioFijo(double precioFijo) {
        this.precioFijo = precioFijo;
    }
    public double calcular(EdicionLimitada e){
        return e.precio * precioFijo;
    }
}
