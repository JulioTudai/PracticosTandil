package TP6E3;



public class PuertoCereales {
    private ColaOrdenada barcosDisponibles;
    private ColaOrdenada camionesDisponibles;

    public PuertoCereales (){
        this.barcosDisponibles = new ColaOrdenada();
        this.camionesDisponibles = new ColaOrdenada();
    }

    public void addBarco(Barco b1){
        if(b1 != null){
            if(this.camionesDisponibles.vacia()){
               this.barcosDisponibles.insertarElemento(b1);
            }
            else {
                Camion c1 = (Camion) this.camionesDisponibles.siguiente();
                b1.cargarse(c1);
            }

        }
    }

    public void addCamion(Camion c1){
        if(c1!=null){
            if(this.barcosDisponibles.vacia()){
                this.camionesDisponibles.insertarElemento(c1);
            }
            else{
                Barco b1 = (Barco) this.barcosDisponibles.siguiente();
                b1.cargarse(c1);
            }
        }
    }
}

