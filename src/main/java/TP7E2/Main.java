package TP7E2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Crear algunas películas para la prueba
        Pelicula p1 = new Pelicula("lalunadelDecierto", "Martin Scorsese", "Aventura en el desierto",
                LocalDate.of(2012, 6, 15), LocalTime.of(1, 30), 13);
        Pelicula p2 = new Pelicula("Terror bajo la luna", "John Carpenter", "Terror nocturno",
                LocalDate.of(2008, 10, 31), LocalTime.of(1, 40), 16);
        Pelicula p3 = new Pelicula("Acción en Marte", "Christopher Nolan", "Aventura espacial",
                LocalDate.of(2015, 7, 20), LocalTime.of(2, 0), 13);
        Pelicula p4 = new Pelicula("Infantil: Viaje a la Luna", "Peter Jackson", "Un viaje infantil",
                LocalDate.of(2019, 11, 15), LocalTime.of(1, 10), 3);
        Pelicula p5 = new Pelicula("Documental: Naturaleza", "Martin Scorsese", "Documental sobre la naturaleza",
                LocalDate.of(2018, 1, 25), LocalTime.of(1, 50), 0);

        p1.setGeneros("Aventura");
        p1.setActores("Will Smith");
        p1.setActores("Scarlett Johansson");

        p2.setGeneros("Terror");
        p2.setActores("Will Smith");
        p2.setActores("Tom Hanks");

        p3.setGeneros("Acción");
        p3.setGeneros("Ciencia Ficción");
        p3.setActores("Chris Evans");
        p3.setActores("Will Smith");

        p4.setGeneros("Infantil");
        p4.setActores("Emma Watson");
        p4.setActores("Will Smith");

        p5.setGeneros("Documental");
        p5.setActores("Leonardo DiCaprio");

        // Crear plataforma y agregar las películas usando el método setPeliculas
        Plataforma plataforma = new Plataforma();
        plataforma.setPeliculas(p1);
        plataforma.setPeliculas(p2);
        plataforma.setPeliculas(p3);
        plataforma.setPeliculas(p4);
        plataforma.setPeliculas(p5);


        // ------------------------
        // PRUEBAS DEL METODO buscarPelicula
        // ------------------------

        // 1. Buscar todas las películas que en el título contengan la palabra "luna".
        Filtro filtroTitulo = new FiltroNombreTitulo("luna");
        System.out.println("Películas con 'luna' en el título:");
        plataforma.buscarPelicula(filtroTitulo).forEach(System.out::println);

        // 2. Buscar todas las películas que contengan un género específico (ej: "terror").
        Filtro filtroGenero = new FiltroGenero("Terror");
        System.out.println("\nPelículas del género 'Terror':");
        plataforma.buscarPelicula(filtroGenero).forEach(System.out::println);

        // 3. Buscar todas las películas en las que haya actuado Will Smith y cuyo director NO haya sido Martin Scorsese.
        Filtro filtroActor = new FiltroActor("Will Smith");
        Filtro filtroDirectorNotScorsese = new FiltroNot(new FiltroDirector("Martin Scorsese"));
        Filtro filtroActorYNoScorsese = new FiltroAnd(filtroActor, filtroDirectorNotScorsese);
        System.out.println("\nPelículas con Will Smith y director que no es Martin Scorsese:");
        plataforma.buscarPelicula(filtroActorYNoScorsese).forEach(System.out::println);

        // 4. Buscar todas las películas que se hayan grabado antes del 2015 y cuya duración sea menor a 95 minutos.
        Filtro filtroAnio = new FiltroAnioGrabacion(LocalDate.of(2015, 1, 1));  // true indica "antes de"
        Filtro filtroDuracion = new FiltroDuracion(LocalTime.of(1, 35));  // true indica "menor a"
        Filtro filtroAnioYDuracion = new FiltroAnd(filtroAnio, filtroDuracion);
        System.out.println("\nPelículas grabadas antes de 2015 y con duración menor a 95 minutos:");
        plataforma.buscarPelicula(filtroAnioYDuracion).forEach(System.out::println);

        // ------------------------
        // PRUEBAS DEL METODO aceptaCeo
        // ------------------------

        // CEO con Filtro: Películas cuya duración sea menor a 120 minutos, que no sean del género "comedia".
        Pelicula p6 = new Pelicula("lato", "Martin Scorsese", "Aventura en el desierto",
                LocalDate.of(2012, 6, 15), LocalTime.of(1, 30), 13);
        p6.setGeneros("pelado");
        p6.setActores("yo");
        Pelicula p7 = new Pelicula("delDecierto", "Martin Scorsese", "Aventura en el desierto",
                LocalDate.of(2012, 6, 15), LocalTime.of(2, 30), 13);
        p7.setGeneros("comedia");
        p7.setActores("yo2");
        Filtro filtroDuracionMenor120 = new FiltroDuracion(LocalTime.of(2, 0));
        Filtro filtroNoComedia = new FiltroNot(new FiltroGenero("Comedia"));
        Filtro filtroCeo1 = new FiltroAnd(filtroDuracionMenor120, filtroNoComedia);
        CEO ceo1 = new CEO(filtroCeo1);
        plataforma.setCeo(ceo1);
        System.out.println("\nPelículas que acepta el CEO1 (duración menor a 120 minutos, que no sean comedias):");
        plataforma.aceptaCeo(p6);
        plataforma.aceptaCeo(p7);


       /* // CEO con Filtro: Películas posteriores a 2017, a no ser que sean del género "infantil" o "documental".
        Filtro filtroAnioPosterior2017 = new FiltroAnioGrabacion(LocalDate.of(2017, 12, 31), false);  // false indica "posterior a"
        Filtro filtroInfantilODocumental = new FiltroOr(new FiltroGenero("Infantil"), new FiltroGenero("Documental"));
        Filtro filtroCeo2 = new FiltroOr(filtroInfantilODocumental, filtroAnioPosterior2017);
        CEO ceo2 = new CEO(filtroCeo2);
        System.out.println("\nPelículas que acepta el CEO2 (posteriores a 2017 o infantiles/documentales):");
        plataforma.getPeliculas().forEach(p -> {
            if (plataforma.aceptaCeo(p, ceo2)) {
                System.out.println(p);
            }
        });

        */
    }//todo anda todo flama soy tremendo programador (pd en las condiciones siempre arrancar desde el atributo de la clase y despues el que tiene el filtro


}
