package RecuPapaNoel;

public class ADR extends Asociaciones{

    public ADR(){
        super();
    }
    public int getVelocidad(){
        int mayor =100000000;
        for (Plantel p : elementos){
            if(mayor < p.getVelocidad()){
                mayor = p.getVelocidad();
            }
        }
        return mayor;
    }
    public int getCreatividad(){
        return elementos.get(0).getCreatividad();
    }
    public Asociaciones crearAsociacion(){
        ADR copia = new ADR();
        return copia;
    }
}
