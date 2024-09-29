package TP1E3;

import java.sql.SQLOutput;

public class Main {
    public static void main (String[] args) {
        PuntoGeometrico p1 = new PuntoGeometrico(1,1);
        PuntoGeometrico p2 = new PuntoGeometrico(6,3);
        PuntoGeometrico pDesplazar = new PuntoGeometrico(2,2);
        PuntoGeometrico p3 = new PuntoGeometrico(2,6);
        PuntoGeometrico p4 = new PuntoGeometrico(2,6);

        Rectangulo r1 = new Rectangulo(p1,p2);
        Rectangulo r2 = new Rectangulo(p3,p4);


        System.out.println(p1.LugarPuntoGeometrico());

       // System.out.println(p1.distanciaEntrePuntos(p2));
        //TODO distancia entre puntos anda joya
        //Rectangulo r1 = new Rectangulo(p1,p2);



       /* System.out.println(r1.getP1().getX());
        System.out.println(r1.getP1().getY());

        r1.desplazarCuadrado(pDesplazar);
        System.out.println("desplazado");

        System.out.println(r1.getP1().getX());
        System.out.println(r1.getP1().getY());
        */
        //TODO desplazar anda perfecto

        //System.out.println(" el area del rectangulo es de ="+r1.calcularArea());

        //TODO calcular area anda perfecto

        //System.out.println(r1.rectangulosIguales(r2));
        //TODO comparar rectangulos anda bien

        //System.out.println(r2.cuadrado());
        //TODO si es o no un cuadrado anda bien

       // System.out.println("el lado superior mide: "+r1.ladoSuperior());
        //TODO largo superior nada bien

        System.out.println(r1.acostado());
        System.out.println(r2.acostado());
        //TODO TERMINADO MAS o MENOS SE ENTENDIO







    }
}
