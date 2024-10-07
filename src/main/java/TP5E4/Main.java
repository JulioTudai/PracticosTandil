package TP5E4;

public class Main {
    public static void main(String[] args) {
        // Crear cualidades para la casa y el alumno
        Cualidad cualidadesCasa = new Cualidad(50, 60, 70, "puro");
        Cualidad cualidadesAlumno = new Cualidad(55, 65, 75, "puro");
        Cualidad cualidadesAlumno2 = new Cualidad(55, 65, 75, "puro");
        Cualidad cualidadesAlumno3 = new Cualidad(56, 65, 75, "puro");


        // Crear una casa con requisitos específicos
        Casa casa = new CasaXcualidad("Gryffindor", cualidadesCasa, "Slytherin", 1);

        Familiar f1 = new Familiar("pepe",cualidadesAlumno3);



        Casa casaLinaje = new CasaPorLinaje("Grifindor",cualidadesCasa,"enemi",3);
        //casa.addAlumno((Persona)f1);

        // Crear un alumno con cualidades específicas
        Alumno alumno = new Alumno("Harry Potter1", cualidadesAlumno);
        Alumno alumno2 = new Alumno("Harry Potter", cualidadesAlumno2);
        Alumno alumno3 = new Alumno("Harry Potter", cualidadesAlumno3);
        Alumno alumno4 = new Alumno("pepe", cualidadesAlumno3);

        alumno.addFamiliares(f1);

        // Crear el seleccionador y usarlo para seleccionar al alumno para la casa
        Seleccionador seleccionador = new Seleccionador();
       // seleccionador.addCasas(casa);

        //System.out.println(seleccionador.definirCasaAlumno(alumno));
        //System.out.println(seleccionador.definirCasaAlumno(alumno2));
        //System.out.println(seleccionador.definirCasaAlumno(alumno3));
        //TODO casa por cualidad anda perfecto
        casaLinaje.addAlumno(alumno4);
        seleccionador.addCasas(casaLinaje);
        System.out.println(seleccionador.definirCasaAlumno(alumno));

        }
    }

