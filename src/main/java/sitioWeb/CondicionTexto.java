package sitioWeb;

public class CondicionTexto extends Condicion {
	private int largoDeTexto;
	

	public CondicionTexto(int largoDeTexto) {
		super();
		this.largoDeTexto = largoDeTexto;
	}


	@Override
	public boolean cumple(Noticia nn) {
		return nn.getTexto().length()>largoDeTexto;
	}

}
