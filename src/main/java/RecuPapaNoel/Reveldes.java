package RecuPapaNoel;

import java.util.ArrayList;
//TODO QUE ONDA ACA TENGO QUE USAR VARIOS ATRIBUTOS DEL PADRE ME CONVIEVE USARLOS EN PROTECTED?
public class Reveldes  extends Duende{
    private int modificadorVel;
    private int modificadorCreatividad;

    public Reveldes(String nombre,int velocidad,int creatividad,int anio, int modificadorCreatividad, int modificadorVel){
        super(nombre,anio,velocidad,creatividad);
        this.modificadorCreatividad = modificadorCreatividad;
        this.modificadorVel=modificadorVel;
    }
    public ArrayList<String> getHabilidades(){
        ArrayList<String> primera = new ArrayList<>();
        primera.add(this.habilidades.get(0));
        return primera;
    }

    public int getVelocidad(){
        return this.getVelocidad()-modificadorVel;
    }

    public int getCreatividad(){
        return this.getCreatividad()/modificadorCreatividad;
    }

    //TODO GETTERS Y SETTERS

    public int getModificadorVel() {
        return modificadorVel;
    }

    public void setModificadorVel(int modificadorVel) {
        this.modificadorVel = modificadorVel;
    }

    public int getModificadorCreatividad() {
        return modificadorCreatividad;
    }

    public void setModificadorCreatividad(int modificadorCreatividad) {
        this.modificadorCreatividad = modificadorCreatividad;
    }
}
