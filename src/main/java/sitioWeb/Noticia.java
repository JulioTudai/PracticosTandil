package sitioWeb;

import java.util.ArrayList;

public class Noticia extends ElementoWeb {
	/*	posee un título, un	listado de palabras claves,
	 *  una introducción, el texto, el autor, y un link asociado.
	 */
	private String titulo, introduccion, texto, autor, link;
	private ArrayList<String> pClaves;
	
	public Noticia(String titulo, String introduccion, String texto, String autor, String link) {
		super();
		this.titulo = titulo;
		this.introduccion = introduccion;
		this.texto = texto;
		this.autor = autor;
		this.link = link;
		this.pClaves = new ArrayList<>();
	}
	
	public void addPalabra(String pp) {
		if(!pClaves.contains(pp)) {
			pClaves.add(pp);
		}
	}
	
	public String getTitulo() {
		return titulo;
	}

	public String getIntroduccion() {
		return introduccion;
	}

	public String getTexto() {
		return texto;
	}

	public String getAutor() {
		return autor;
	}

	public String getLink() {
		return link;
	}

	@Override
	public int getTotalNoticias() {
		return 1;
	}

	@Override
	protected ArrayList<Noticia> buscar(Condicion condicion) {
		ArrayList<Noticia> aux = new ArrayList<Noticia>();
		if(condicion.cumple(this)) {
			aux.add(this);
		}
		return aux;
	}

}
