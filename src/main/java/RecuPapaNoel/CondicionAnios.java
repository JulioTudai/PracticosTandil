package RecuPapaNoel;

public class CondicionAnios extends Condicion{
    private int anios;

    public CondicionAnios(int anios) {
        this.anios = anios;
    }
    public boolean cumple(Duende d){
        return d.getAnio() >anios;
    }
}
