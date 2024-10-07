package TP5E3;

public class Main {
    public static void main(String[] args) {
        Pila pila = new Pila();
        pila.push("1");
        pila.push("2");
        pila.push("3");


        System.out.println("Tope de la pila: " + pila.top()); // Output: 3

        Pila copia = pila.copy();
        System.out.println("Copia de la pila: " + copia.top()); // Output: 3

        Pila invertida = pila.reverse();
        System.out.println("Tope de la pila invertida: " + invertida.top()); // Output: 1

        System.out.println("Elemento retirado: " + pila.pop()); // Output: 3
        System.out.println("Nuevo tope de la pila: " + pila.top()); // Output: 2
    }
}
