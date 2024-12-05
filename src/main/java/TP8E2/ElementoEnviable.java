package TP8E2;

public abstract class ElementoEnviable {
    protected String nombre;
    protected Persona destinatario, remitente;

    protected int nroTracking;
    protected boolean retiroSucursal;
    private String ciudadDestino;

    public ElementoEnviable(Persona destinatario, Persona remitente, boolean retiroSucursal, int nroTracking, String ciudadDestino, String nombre) {
        this.destinatario = destinatario;
        this.remitente = remitente;
        this.retiroSucursal = retiroSucursal;
        this.nroTracking = nroTracking;
        this.ciudadDestino = ciudadDestino;
    }

    public abstract double getPeso();


    public Persona getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Persona destinatario) {
        this.destinatario = destinatario;
    }

    public Persona getRemitente() {
        return remitente;
    }

    public void setRemitente(Persona remitente) {
        this.remitente = remitente;
    }

    public boolean isRetiroSucursal() {
        return retiroSucursal;
    }

    public void setRetiroSucursal(boolean retiroSucursal) {
        this.retiroSucursal = retiroSucursal;
    }

    public int getNroTracking() {
        return nroTracking;
    }

    public void setNroTracking(int nroTracking) {
        this.nroTracking = nroTracking;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }
}
