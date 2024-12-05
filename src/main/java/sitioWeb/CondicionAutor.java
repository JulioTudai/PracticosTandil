package sitioWeb;

public class CondicionAutor extends Condicion {
	private String autor;
	
	public CondicionAutor(String autor) {
		super();
		this.autor = autor;
	}

	@Override
	public boolean cumple(Noticia nn) {
		// TODO Auto-generated method stub
		return nn.getAutor().contains(autor);
	}

}
