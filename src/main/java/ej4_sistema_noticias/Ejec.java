package ej4_sistema_noticias;
import ej4_sistema_noticias.filtros.*;

public class Ejec {
    public static void main(String[] args){

        CategoriaSeccion principal = new CategoriaSeccion(
            "Deportes", 
            "deportes.jpg"
        );
        
        CategoriaSeccion seccion1 = new CategoriaSeccion(
            "Tecnología", 
            "tecnologia.jpg"
        );
        
        CategoriaSeccion subseccion1 = new CategoriaSeccion(
            "Cultura", 
            "cultura.jpg"
        );

        principal.addCategoriaSeccion(seccion1);
        principal.addCategoriaSeccion(subseccion1);

        Noticia noticia1 = new Noticia(
            "Descubrimiento en Marte", 
            "Científicos encuentran rastros de agua.",
            "La inteligencia artificial está revolucionando industrias como la medicina y la educación. A medida que evoluciona, sus aplicaciones continúan expandiéndose, transformando cómo interactuamos con la tecnología y mejorando nuestras vidas cotidianas.",            
            "John Doe", 
            "https://ejemplo.com/marte"
        );
        
        Noticia noticia2 = new Noticia(
            "Avances en IA", 
            "Inteligencia artificial avanza rápidamente.",
            "La IA ha logrado a",
            "Jane Smith", 
            "https://ejemplo.com/ia"
        );
        
        Noticia noticia3 = new Noticia(
            "Nueva vacuna descubierta", 
            "Se ha desarrollado una nueva vacuna.",
            "El cambio climático afecta a todo el planeta, provocando eventos climáticos extremos y poniendo en riesgo ecosistemas y comunidades. Es urgente tomar medidas globales para reducir las emisiones y proteger nuestro futuro colectivo.",            "Dr. Albert", 
            "https://ejemplo.com/vacuna"
        );
        noticia3.agregarPalabraClave("partido");
        
        Noticia noticia4 = new Noticia(
            "Tendencias tecnológicas 2024", 
            "Tecnología para el próximo año.",
            "Se espera que 2",
            "Carlos Diaz", 
            "https://ejemplo.com/tecnologia"
        );
        noticia4.agregarPalabraClave("partido");
        
        Noticia noticia5 = new Noticia(
            "Cambio climático en aumento", 
            "El impacto del cambio climático.",
            "El cambio climático c",
            "Carlos Diaz", 
            "https://ejemplo.com/cambioclimatico"
        );

        principal.addCategoriaSeccion(noticia1);
        principal.addCategoriaSeccion(noticia2);
        seccion1.addCategoriaSeccion(noticia3);
        seccion1.addCategoriaSeccion(noticia4);
        subseccion1.addCategoriaSeccion(noticia5);

        Filtro autor=new BuscarAutor("Carlos Diaz");
        Filtro texto=new TextoSuperior(30);
        Filtro palabraClave=new ContengaPalabraClave("partido");

        System.out.println(principal.getNoticias());
        System.out.println(principal.buscador(autor));
        System.out.println(principal.buscador(texto));
        System.out.println(principal.buscador(palabraClave));

    }

}
