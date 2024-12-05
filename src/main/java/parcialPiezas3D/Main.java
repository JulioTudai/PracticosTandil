package parcialPiezas3D;

import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Pieza p1 = new Pieza("primera","primera",5,1,"primera");
        Pieza p2 = new Pieza("segunda","segunda",2,2,"segunda");
        Pieza p3 = new Pieza("tercera","tercera",3,3,"tercera");
        Pieza p4 = new Pieza("cuarta","cuarta",4,4,"cuarta");
        Pieza p5 = new Pieza("quinta","quinta",1,5,"quinta");

        PiezaCompuesta c1 = new PiezaCompuesta("c1","c1");
        PiezaCompuesta c2 = new PiezaCompuesta("c2","c2");

        c1.addElemento(p1);
        c1.addElemento(p2);
        c1.addElemento(p3);
        c2.addElemento(p4);
        c2.addElemento(p5);
        c1.addElemento(c2);

        System.out.println(c1.getMenorPla());


    }
}
