package RecuPapaNoel;

import java.util.ArrayList;

public abstract class Plantel {

    public abstract int getVelocidad();
    public abstract int getCreatividad();
    public abstract ArrayList<String> getHabilidades();
    public abstract int getCantDuendes(Condicion c);
    public abstract Plantel copia();
    //public abstract Plantel crearCopia();
}
