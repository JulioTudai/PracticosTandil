package TP1E3;

public class Rectangulo {
    private PuntoGeometrico p1;
    private PuntoGeometrico p2;

    public Rectangulo(PuntoGeometrico punto1, PuntoGeometrico punto2){
        this.p1 = punto1;
        this.p2 = punto2;
    }

    public Rectangulo(){
        this.p1 = new PuntoGeometrico(1,1);
        this.p2 = new PuntoGeometrico(3,3);
    }
    public void desplazarCuadrado(PuntoGeometrico pNuevo){
        this.p1.desplazarPunto(pNuevo.getX(),pNuevo.getY());
        this.p2.desplazarPunto(pNuevo.getX(),pNuevo.getY());
    }

    public int calcularArea(){
        int ancho = Math.abs(p1.getX() - p2.getX());
        int alto = Math.abs(p1.getY() - p2.getY());

        return  ancho*alto;
    }
    public int rectangulosIguales(Rectangulo otroR){
        int areaOtrorec = otroR.calcularArea();
        int areaInstancia = this.calcularArea();

        if (areaInstancia > areaOtrorec){
            return 1;

        }
        else if (areaInstancia < areaOtrorec) {
            return -1;

        }
        return 0;
    }
    public String cuadrado(){
        double ancho = Math.abs(p2.getX() - p1.getX());
        double alto = Math.abs(p2.getY() - p1.getY());

        if(ancho == alto){
            return "es un fucking cuadrado weeeeyyy";
        }
        return"sos del clan pa";

    }
    public double ladoSuperior(){
        double largoX = Math.abs(p2.getX() - p1.getX());
       return largoX;
    }

    public String acostado(){
        double ancho = Math.abs(p2.getX() - p1.getX());
        double alto = Math.abs(p2.getY() - p1.getY());
        if(ancho>alto){
            return "si esta acostado";
        }
        return" el wacho esta de pie";
    }





    public PuntoGeometrico getP1() {
        return p1;
    }

    public void setP1(PuntoGeometrico p1) {
        this.p1 = p1;
    }

    public PuntoGeometrico getP2() {
        return p2;
    }

    public void setP2(PuntoGeometrico p2) {
        this.p2 = p2;
    }
}
