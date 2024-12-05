package ParcialResiduos;

public class SectorEspecial  extends Sector{
    private Filtro f;
    public SectorEspecial(String nombre){
        super(nombre);
    }

    public void addElemento(ElementoReciclable e){
        if(f.cumple(e)){
            super.addElemento(e);
        }
    }
    public boolean equals(Object o){
        try{
            SectorEspecial p = (SectorEspecial) o;
            if(this.nombre.equals(p.getNombre())){
                return true;
            }
        }    catch(Exception e){
            return false;
        }
        return false;

    }

}
