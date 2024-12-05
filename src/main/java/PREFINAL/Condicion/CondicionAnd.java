package PREFINAL.Condicion;

import PREFINAL.Duende;

public class CondicionAnd extends Condicion{

    private Condicion cond1;
    private Condicion cond2;

    public CondicionAnd(Condicion cond1, Condicion cond2){
        this.cond1=cond1;
        this.cond2=cond2;
    }

    @Override
    public boolean cumple(Duende duende) { return this.cond2.cumple(duende) && this.cond2.cumple(duende); }

}
