package TP8E2;

import java.util.ArrayList;

public class Combo extends ElementoEnviable{
    private ArrayList<ElementoEnviable> envios;

    public Combo(Persona destinatario, Persona remitente, boolean retiroSucursal, int nroTracking, String ciudadDestino, String nombre) {
        super(destinatario, remitente, retiroSucursal, nroTracking, ciudadDestino, nombre);
        this.envios = new ArrayList<>();
    }

    public double getPeso(){
        double peso = 0.0;
        for (ElementoEnviable envio : envios){
            peso += envio.getPeso();
        }
        return peso;
    }

    public void addElementoEnviable(ElementoEnviable elem){
        if (envios.isEmpty()) {
                this.setCiudadDestino(elem.getCiudadDestino());//TODO MIRA VIKI SE ME OCURRIO OTRA MANERA CUANDO NO LOS DECLARAS PROTECTED A LOS ATRIBUTOS DE LA CLASE PADRE ABSTRACTA
                this.remitente = elem.getRemitente();
                this.destinatario = elem.getDestinatario();
                elem.setNroTracking(this.nroTracking);
                envios.add(elem);
        }else if(elem.getCiudadDestino().equals(this.getCiudadDestino())){
            elem.setNroTracking(this.nroTracking);
            envios.add(elem);
        }
    }

    public void setNroTracking(int tr){
        this.nroTracking = tr;
        for (ElementoEnviable e: envios){
            e.setNroTracking(tr);
        }
    }




}
