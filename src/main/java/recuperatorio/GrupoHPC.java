package recuperatorio;

import java.util.ArrayList;

public class GrupoHPC extends Grupo{
    @Override
    public double getVelocidadTrabajo() {
        if (!miembros.isEmpty())
            return miembros.get(miembros.size()-1).getVelocidadTrabajo();
        return 0;
    }

    @Override
    public double getCreatividad() {
        double creaMax = 0;
        for (ElementoRecoleccion miembro: miembros) {
            double crea = miembro.getCreatividad();
            if (crea > creaMax)
                creaMax = crea;
        }
        return creaMax;
    }

    @Override
    public Grupo getCascaron() {
        return new GrupoHPC();
    }
}
