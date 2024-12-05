package RecuPapaNoel;

public class CondicionVelocidad extends Condicion{
    private int velcidad;

    public CondicionVelocidad(int velcidad) {
        this.velcidad = velcidad;
    }
    public boolean cumple(Duende d){
        return d.getVelocidad()> velcidad;
    }
}
