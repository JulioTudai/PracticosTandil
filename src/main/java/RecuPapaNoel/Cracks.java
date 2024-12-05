package RecuPapaNoel;

public class Cracks extends Duende{
    private int multiplicador;

    public Cracks (String nombre, int velocidad, int creatividad, int anio,int multiplicador){
        super(nombre,velocidad,creatividad,anio);
        this.multiplicador = multiplicador;
    }

    public int experiencia(){
        return this.getAnio()*multiplicador;
    }

    public int getCreatividad(){
        return this.getCreatividad()*multiplicador;
    }
    public int getVelocidad(){
        return this.getVelocidad()*multiplicador;
    }

    //TODO GETTERS Y SETERS

    public int getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(int multiplicador) {
        this.multiplicador = multiplicador;
    }
}
