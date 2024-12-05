package recuperatorio;

public class Main {
    public static void main(String[] args) {


                // Crear objetos de la clase Pitufo
        Pitufo pitufo1 = new Pitufo("Pitufo Valiente", 5, 10.5, 8.2);
        Pitufo pitufo2 = new Pitufo("Pitufo Bromista", 3, 9.0, 7.5);
        Pitufo pitufo3 = new Pitufo("Pitufo Ingeniero", 7, 12.0, 9.8);

                // Crear objetos de la clase PitufoRebelde
                PitufoRebelde rebelde1 = new PitufoRebelde("Pitufo Rebelde1", 4, 10.0, 8.0, 2.5, 1.5);
                PitufoRebelde rebelde2 = new PitufoRebelde("Pitufo Rebelde2", 6, 11.0, 8.7, 3.0, 2.0);
                PitufoRebelde rebelde3 = new PitufoRebelde("Pitufo Rebelde3", 5, 10.8, 8.5, 2.8, 1.8);pitufo1.addHabilidad("d");
        pitufo1.addHabilidad("d");
        pitufo2.addHabilidad("d");
        pitufo3.addHabilidad("d");
        rebelde1.addHabilidad("d");
        rebelde2.addHabilidad("d");
        rebelde3.addHabilidad("d");
              /*  // Imprimir los objetos para verificar
                System.out.println("Pitufos:");
                System.out.println(pitufo1);
                System.out.println(pitufo2);
                System.out.println(pitufo3);

                System.out.println("\nPitufos Rebeldes:");
                System.out.println(rebelde1);
                System.out.println(rebelde2);
                System.out.println(rebelde3);

               */

                pitufo1.getCopia();
                rebelde1.getCopia();



    }
}
