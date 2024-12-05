package RecuPapaNoel;

import java.util.ArrayList;

public class PapaNoel {
    private ArrayList<Duende>  duendesDisp;
    private ArrayList<Plantel> conjutos;

    public PapaNoel() {
        this.duendesDisp = new ArrayList<>();
        this.conjutos = new ArrayList<>();
    }

    public int getCantidadDuendes(Condicion c){
        int suma =0;
        for (Plantel p: conjutos){
            suma += p.getCantDuendes(c);
        }
        return suma;
    }
    public ArrayList<Plantel> copia(){
        ArrayList<Plantel> copia= new ArrayList<>();
        for (Plantel p : conjutos){
            Plantel e= p.copia();
            copia.add(e);
        }
        return copia;
    }
}
