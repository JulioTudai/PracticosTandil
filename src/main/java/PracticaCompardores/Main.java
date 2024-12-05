package PracticaCompardores;

import java.util.ArrayList;

public class Main {

        public static void main(String[] args) {
            // Crear el grupo de personas vacío
            GrupoPersona grupo = new GrupoPersona(new ArrayList<>());

            // Crear 10 personas con nombres y apellidos de una sola letra
            Persona p1 = new Persona("A", "B", 31, 1, 150.0);
            Persona p2 = new Persona("B", "C", 30, 2, 150.0);
            Persona p3 = new Persona("C", "D", 22, 3, 200.0);
            Persona p4 = new Persona("D", "E", 28, 4, 250.0);
            Persona p5 = new Persona("E", "F", 35, 5, 300.0);
            Persona p6 = new Persona("F", "G", 27, 6, 350.0);
            Persona p7 = new Persona("G", "H", 40, 7, 400.0);
            Persona p8 = new Persona("H", "I", 33, 8, 450.0);
            Persona p9 = new Persona("I", "J", 29, 9, 500.0);
            Persona p10 = new Persona("J", "K", 26, 10, 550.0);

            // Asignar apodos de una sola letra a cada persona
            p1.AddApodos("X");
            p2.AddApodos("Y");
            p3.AddApodos("Z");
            p4.AddApodos("W");
            p5.AddApodos("V");
            p6.AddApodos("U");
            p7.AddApodos("T");
            p8.AddApodos("S");
            p9.AddApodos("R");
            p10.AddApodos("Q");

            // Agregar las personas al grupo una a una
            grupo.addPersona(p1);
            grupo.addPersona(p2);
            grupo.addPersona(p3);
            grupo.addPersona(p4);
            grupo.addPersona(p5);
            grupo.addPersona(p6);
            grupo.addPersona(p7);
            grupo.addPersona(p8);
            grupo.addPersona(p9);
            grupo.addPersona(p10);



            Filtro f = new FiltroPrecio(10000000);

            // Obtener la lista ordenada
            //ArrayList<Persona> personasOrdenadas = grupo.getOrdenNatural();
            ArrayList<Persona> buscarPrecio = grupo.buscar(f);


            // Imprimir personas ordenadas
            System.out.println("Personas ordenadas:");
            for (Persona p : buscarPrecio) {
                System.out.println(p);
            }
        }
}


