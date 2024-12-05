package recuperatorio;

import java.util.ArrayList;

public abstract class Grupo extends ElementoRecoleccion{
    protected ArrayList<ElementoRecoleccion> miembros;

    public Grupo() {
        miembros = new ArrayList<>();
    }

    public void agregarMiembro(ElementoRecoleccion nuevo){
        miembros.add(nuevo);
    }

    @Override
    public ArrayList<String> getHabilidades() {
        ArrayList<String> habilidades = new ArrayList<>();
        for (ElementoRecoleccion m:miembros){
            ArrayList<String> aux = m.getHabilidades();
            for (String habilidad:aux) {
                if (!habilidades.contains(habilidad)) {
                    habilidades.add(habilidad);
                }
            }
        }
        return habilidades;
    }

    @Override
    public int cantidadPitufos(Condicion c) {
        int cant =0;
        for (ElementoRecoleccion m:miembros)
            cant += m.cantidadPitufos(c);
        return cant;
    }

    public ElementoRecoleccion getCopia(){
        Grupo copia = getCascaron();
        for (ElementoRecoleccion m:miembros)
            copia.agregarMiembro(m.getCopia());
        return copia;
    }

    protected abstract Grupo getCascaron() ;//{
    //    return new Grupo(); //NEW DE CLASE ABSTRACTA
    //}
}
