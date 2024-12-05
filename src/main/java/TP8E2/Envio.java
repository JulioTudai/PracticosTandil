package TP8E2;

public class Envio extends ElementoEnviable{
    private double peso;

    public Envio(Persona destinatario, Persona remitente, boolean retiroSucursal, int nroTracking, String ciudadDestino, double peso, String nombre) {
        super(destinatario, remitente, retiroSucursal, nroTracking, ciudadDestino,nombre);
        this.peso = peso;
    }

    @Override
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
