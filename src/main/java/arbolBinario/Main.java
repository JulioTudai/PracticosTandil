package arbolBinario;

public class Main {
    public static void main(String[] args) {
        // Crear nodos
        Nodo nodo1 = new Nodo(1);
        Nodo nodo2 = new Nodo(2);
        Nodo nodo3 = new Nodo(3);
        Nodo nodo4 = new Nodo(4);
        Nodo nodo5 = new Nodo(5);
        Nodo nodo6 = new Nodo(6);
        Nodo nodo7 = new Nodo(7);
        Nodo nodo8 = new Nodo(8);
        Nodo nodo9 = new Nodo(9);
        Nodo nodo10 = new Nodo(10);

        // Agregar nodos a nodo1
        System.out.println("Agregando nodo2 a nodo1");
        nodo1.addNodo(nodo2);

        System.out.println("Agregando nodo3 a nodo1");
        nodo1.addNodo(nodo3);

        // Intentar agregar un nodo ya existente (nodo2) a nodo1
        System.out.println("Intentando agregar nodo2 nuevamente a nodo1 (ya existe)");
        nodo1.addNodo(nodo2);  // No debería agregarse

        // Intentar agregar nodo4 y nodo5 a nodo2
        System.out.println("Agregando nodo4 a nodo1");
        nodo1.addNodo(nodo4);

        System.out.println("Agregando nodo5 a nodo1");
        nodo1.addNodo(nodo5);

        System.out.println("Agregando nodo6 a nodo1");
        nodo1.addNodo(nodo6);
        System.out.println("Agregando nodo7 a nodo1");
        nodo1.addNodo(nodo7);
        System.out.println("Agregando nodo8 a nodo1");
        nodo1.addNodo(nodo8);
        System.out.println("Agregando nodo9 a nodo1");
        nodo1.addNodo(nodo9);
        System.out.println("Agregando nodo10 a nodo1");
        nodo1.addNodo(nodo10);

        // Intentar agregar un nodo más allá del tamaño máximo (MAXTAM = 2)
       // System.out.println("Intentando agregar nodo3 a nodo2 (debería fallar por MAXTAM)");
       // nodo2.addNodo(nodo3);  // No debería agregarse porque nodo2 ya tiene 2 hijos (nodo4 y nodo5)

        // Verificar si un nodo está contenido
        System.out.println("¿Contiene nodo1 al nodo2?: " + nodo1.contieneNodo(nodo2)); // true
        System.out.println("¿Contiene nodo1 al nodo4?: " + nodo1.contieneNodo(nodo4)); // true, porque nodo4 es hijo de nodo2
        System.out.println("¿Contiene nodo1 al nodo5?: " + nodo1.contieneNodo(nodo5)); // true
        System.out.println("¿Contiene nodo1 al nodo3?: " + nodo1.contieneNodo(nodo3)); // true
        System.out.println("¿Contiene nodo1 al nodo1?: " + nodo1.contieneNodo(nodo1)); // false
        System.out.println("¿Contiene nodo2 al nodo4?: " + nodo2.contieneNodo(nodo4));
        System.out.println("¿Contiene nodo4 al nodo6?: " + nodo4.contieneNodo(nodo6));
        System.out.println("¿Contiene nodo4 al nodo7?: " + nodo4.contieneNodo(nodo7));
        System.out.println("¿Contiene nodo6 al nodo8?: " + nodo6.contieneNodo(nodo8));
        System.out.println("¿Contiene nodo6 al nodo9?: " + nodo6.contieneNodo(nodo9));
        System.out.println(nodo1);
        System.out.println(nodo2);
        System.out.println(nodo3);
        System.out.println(nodo4);
        System.out.println(nodo6);
        System.out.println(nodo5);
        System.out.println(nodo3);
        System.out.println(nodo7);

    }
}

