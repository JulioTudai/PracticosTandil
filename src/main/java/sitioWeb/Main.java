package sitioWeb;

public class Main {

	public static void main(String[] args) {

		// Crear algunas noticias
		Noticia noticia1 = new Noticia( "Noticia 1","Introducción noticia 1", "Texto completo de la noticia 1", "Autor 1", "link1.com");
		Noticia noticia2 = new Noticia( "Noticia 2", "Introducción noticia 2","Texto completo de la noticia 2", "Autor 2", "link2.com");
		Noticia noticia3 = new Noticia( "Noticia 3",  "Introducción noticia 3 ","Texto completo de la noticia 3", "Autor 3", "link3.com");
		
		//	Agregar palabras clave
		noticia1.addPalabra("política");
		noticia1.addPalabra("politica");
		noticia2.addPalabra("deportes");
		noticia2.addPalabra("futbol");
		noticia3.addPalabra("tecnologia");
		
		
		// Crear una categoría con dos secciones
		Categoria categoriaNoticias = new Categoria("Noticias Generales", "imagen_categoria.jpg");

		Seccion seccionPolitica = new Seccion("Sección Política", "imagen_politica.jpg");
		Seccion seccionDeportes = new Seccion("Sección Deportes", "imagen_deportes.jpg");

		// Agregar noticias a las secciones
		seccionPolitica.addElemento(noticia1); // Noticia 1 en sección política
		seccionDeportes.addElemento(noticia2); // Noticia 2 en sección deportes
		seccionDeportes.addElemento(noticia3); // Noticia 3 en sección deportes

		// Agregar secciones a la categoría
		categoriaNoticias.addElemento(seccionPolitica);
		categoriaNoticias.addElemento(seccionDeportes);

		// Pruebas para obtener la cantidad de noticias en cada sección y categoría
		System.out.println("Cantidad de noticias en la sección Política: " + seccionPolitica.getTotalNoticias());
		System.out.println("Cantidad de noticias en la sección Deportes: " + seccionDeportes.getTotalNoticias());
		System.out.println("Cantidad de noticias en la categoría Noticias Generales: " + categoriaNoticias.getTotalNoticias());
	}

}


