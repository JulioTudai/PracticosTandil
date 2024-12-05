package TP8E2;

public class Main {
    public static void main(String[] args) {
        // Crear remitente y destinatario
        Persona remitente = new Persona("Juan Pérez", "Calle 123");
        Persona destinatario = new Persona("María García", "Avenida 456");

        // Crear un envío individual
        Envio envio1 = new Envio(destinatario, remitente, true, 1001, "Buenos Aires", 2.5, "Paquete 1");
        Envio envio2 = new Envio(destinatario, remitente, false, 1002, "Buenos Aires", 1.0, "Paquete 2");

        // Crear un combo y agregar envíos
        Combo comboPrincipal = new Combo(destinatario, remitente, true, 2001, "Buenos Aires", "Combo 1");
        comboPrincipal.addElementoEnviable(envio1);
        comboPrincipal.addElementoEnviable(envio2);

        // Crear otro combo que será agregado al combo principal
        Combo comboSecundario = new Combo(destinatario, remitente, true, 3001, "Buenos Aires", "Combo Secundario");

        // Crear tres envíos para el combo secundario
        Envio envio3 = new Envio(destinatario, remitente, true, 1003, "Buenos Aires", 3.0, "Paquete 3");
        Envio envio4 = new Envio(destinatario, remitente, false, 1004, "Buenos Aires", 2.0, "Paquete 4");
        Envio envio5 = new Envio(destinatario, remitente, true, 1005, "Buenos Aires", 4.0, "Paquete 5");

        // Agregar los envíos al combo secundario
        comboSecundario.addElementoEnviable(envio3);
        comboSecundario.addElementoEnviable(envio4);
        comboSecundario.addElementoEnviable(envio5);

        // Agregar el combo secundario al combo principal
        comboPrincipal.addElementoEnviable(comboSecundario);

        // Mostrar información de los envíos y del combo principal
        System.out.println("Peso del envío 1: " + envio1.getPeso());
        System.out.println("Peso del envío 2: " + envio2.getPeso());
        System.out.println("Peso total del combo secundario: " + comboSecundario.getPeso());
        System.out.println("Peso total del combo principal: " + comboPrincipal.getPeso());

        System.out.println("Tracking del envío 1: " + envio1.getNroTracking());
        System.out.println("Tracking del envío 2: " + envio2.getNroTracking());
        System.out.println("Tracking del combo secundario: " + comboSecundario.getNroTracking());
        System.out.println("Tracking del combo principal: " + comboPrincipal.getNroTracking());

        // Verificar que todos los envíos y combos compartan el mismo número de tracking
        System.out.println("Tracking del envío 3 (dentro del combo secundario): " + envio3.getNroTracking());
        System.out.println("Tracking del envío 4 (dentro del combo secundario): " + envio4.getNroTracking());
        System.out.println("Tracking del envío 5 (dentro del combo secundario): " + envio5.getNroTracking());
    }
}
