package RecuPapaNoel;

public class HDC extends Asociaciones{

    public HDC(){
        super();
    }
    public int getCreatividad(){
        int mayor =100000000;
        for (Plantel p : elementos){
            if(mayor < p.getCreatividad()){
                mayor = p.getCreatividad();
            }
        }
        return mayor;
    }
    public int getVelocidad(){
        int ultimoElem = elementos.size();
        return this.elementos.get(ultimoElem-1).getVelocidad();
    }
    public Asociaciones crearAsociacion(){
        HDC copia = new HDC();
        return copia;
    }
}
