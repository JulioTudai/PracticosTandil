package recuperatorio;

import java.util.ArrayList;
import java.util.Collections;

public class EmpresaRecoleccion {
    private ArrayList<Pitufo> reserva;

    public EmpresaRecoleccion() {
        reserva = new ArrayList<>();
    }

    public void addPitufo(Pitufo p){
        reserva.add(p);
    }

    public Pitufo getPitufo(){
        Collections.sort(reserva);
        if (!reserva.isEmpty())
            return reserva.remove(0);
        return null;
    }
}
