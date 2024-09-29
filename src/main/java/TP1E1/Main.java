package TP1E1;


import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main (String[] args) {

        Persona p1 = new Persona(1,"yop","yop2",LocalDate.of(2014,5,7));
        /*
        System.out.println(p1.indiceMCorporal());
        System.out.println(p1.fisicoApto());
        p1.setAltura(1.70);
        p1.setPeso(63);
        System.out.println(p1.indiceMCorporal());
        System.out.println(p1.fisicoApto());
        */
        //TODO esto anda perfecto indice mc y estado fisico
        /*
        System.out.println(p1.cumpleAnios());
        p1.setFechaNacimiento(LocalDate.now());
        System.out.println(p1.cumpleAnios());
         */
        //TODO esto tambien nanda perfecto con equals y sin equals preguntar bien cual es la diferencia

        /*
        System.out.println("la edad es = "+p1.getEdad());
        System.out.println(p1.mayorEdad());

         */
        //TODO get edad anda perfecto
        /*
        System.out.println(p1.votar());

         */
        //TODO el votar tambien anda veryperct papucho

        /*
        System.out.println(p1.edadReal());

         */
        //TODO edad real anda joya

        System.out.println(p1.getDatosCompletos());









    }


}
