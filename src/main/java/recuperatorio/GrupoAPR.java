package recuperatorio;

import java.util.ArrayList;

public class GrupoAPR extends Grupo{

    @Override
    public double getVelocidadTrabajo() {
        double velMax = 0;
        for (ElementoRecoleccion miembro: miembros) {
            double vel = miembro.getVelocidadTrabajo();
            if (vel > velMax)
                velMax = vel;
        }
        return velMax;
    }

    @Override
    public double getCreatividad() {
        if (miembros.size()>0)
            return miembros.get(0).getCreatividad();
        return 0;
    }


    @Override
    public Grupo getCascaron() {
        return new GrupoAPR();
    }
}
