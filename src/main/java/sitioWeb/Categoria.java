package sitioWeb;


import java.util.ArrayList;

public class Categoria extends ElementoWeb {
	protected ArrayList<ElementoWeb> elementos;
	private String descripcion;
	private String imagen;

	public Categoria(String descripcion, String imagen) {
		super();
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.elementos = new ArrayList<ElementoWeb>();
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}


	public void addElemento(ElementoWeb ee) {
		if(!elementos.contains(ee)) {
			elementos.add(ee);
		}
	}



	@Override
	public int getTotalNoticias() {
		int total = 0;
		for (ElementoWeb ee : elementos) {
			total += ee.getTotalNoticias();
		}
		return total;
	}

	public ArrayList<Noticia> buscar(Condicion cc){
		ArrayList<Noticia> aux = new ArrayList<>();
		for (ElementoWeb ee : elementos) {
			ArrayList<Noticia> parcial = ee.buscar(cc);
			for (Noticia noticiaQueCumple : parcial) {
				aux.add(noticiaQueCumple);
			}

		}
		return aux;

	}
}


