package ParcialResiduos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear algunas direcciones
        Direccion direccion1 = new Direccion("Calle 1", 123);
        Direccion direccion2 = new Direccion("Calle 2", 456);

        // Crear algunas personas
        Persona persona1 = new Persona(direccion1, "Perez", "Juan");
        Persona persona2 = new Persona(direccion2, "Gomez", "Ana");

        // Crear algunos pedidos
        Pedido pedidoPoda = new Pedido("Recolección Poda", persona1, 5.0, 300.0);
        pedidoPoda.setDescriptores("follaje");
        pedidoPoda.setDescriptores("hojas");

        Pedido pedidoEscombros = new Pedido("Recolección Escombros", persona2, 10.0, 500.0);
        pedidoEscombros.setDescriptores("ladrillos");
        pedidoEscombros.setDescriptores("metales");

        Pedido pedidoTecnologico = new Pedido("Recolección Tecnológica", persona1, 1.0, 100.0);
        pedidoTecnologico.setDescriptores("electrodoméstico");

        // Crear un sector y añadir pedidos
        Sector sector1 = new Sector("Sector A");
        sector1.addElemento(pedidoPoda);
        sector1.addElemento(pedidoEscombros);
        sector1.addElemento(pedidoTecnologico);

        // Prueba de métodos
        // Cantidad de frenadas (equivalente al número de pedidos en el sector)
        System.out.println("Cantidad de frenadas en el sector: " + sector1.cantFrenadas());

        // Volumen total del sector
        System.out.println("Volumen total en el sector: " + sector1.getVolumen());

        // Peso total del sector
        System.out.println("Peso total en el sector: " + sector1.getPeso());

        // Buscar un pedido que cumpla con un filtro (ejemplo: pedidos con palabra clave "ladrillos")
        Filtro filtroLadrillos = new Filtro() {
            @Override
            public boolean cumple(ElementoReciclable e) {
                return e.poseePalabraClave("ladrillos");
            }
        };

       ArrayList<Pedido> pedidosLadrillos = sector1.buscar(filtroLadrillos);
        System.out.println("Pedidos que contienen 'ladrillos':");
        for (Pedido p : pedidosLadrillos) {
            System.out.println(p.getNombre());
        }

        /*

        // Verificar si el sector posee una palabra clave
        boolean contieneMetales = sector1.poseePalabraClave("metales");
        System.out.println("El sector contiene la palabra 'metales': " + contieneMetales);

        
        Filtro palabraCla = new FiltroPalabraClave("metales");
        ArrayList<Pedido> p = new ArrayList<>();
        p = sector1.buscar(palabraCla);
        System.out.println(p);

        */
        /*
        boolean contienefollaje = sector1.poseePalabraClave("electrodoméstico");
        System.out.println("El sector contiene la palabra 'electrodoméstico': " + contienefollaje);

         */


        for (ElementoReciclable  e: sector1.getElementos()) {

            System.out.println(e);
        }

    }

}
