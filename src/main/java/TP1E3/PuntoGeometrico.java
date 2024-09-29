package TP1E3;

public class PuntoGeometrico {

    private int x;
    private int y;

    public PuntoGeometrico(){
        this.x = 0;
        this.y = 0;
    };
    public PuntoGeometrico(int x1, int y1){
        this.x = x1;
        this.y = y1;
    }

    public void desplazarPunto(int x1, int y1){
        this.x += x1;
        this.y += y1;
    };

    public String LugarPuntoGeometrico(){
        return  this.x+"."+this.y;
    }

    public double distanciaEntrePuntos(PuntoGeometrico otrop){
        int distanciaX = this.x - otrop.getX();
        int distancaY = this.y -otrop.getY();
        double distanciaFinal = Math.sqrt(distanciaX * distanciaX + distancaY * distancaY);
        return distanciaFinal;


       //esto no me andubo double distancia = Math.sqrt((this.x - otrop.getX())+(this.y - otrop.getY()));
       // return distancia * distancia;


    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
