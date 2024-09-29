package TP6E2;

public class Main {
    public static void main(String[] args) {
        ColaEspera cola = new ColaEspera();

        // Crear algunas computadoras
        Computadora comp1 = new Computadora(1, 3,true);
        Computadora comp2 = new Computadora(2, 4,true);
        Computadora comp3 = new Computadora(3, 2,true);
        Computadora comp4 = new Computadora(4, 1,true);

        // Agregar computadoras a la cola de espera
        cola.add(comp1);
        cola.add(comp2);
        cola.add(comp3);
        cola.add(comp4);

        // Mostrar las computadoras en orden
        System.out.println("Computadoras en la cola de espera (ordenadas por velocidad):");
        cola.mostrarComputadoras();
    }
}
