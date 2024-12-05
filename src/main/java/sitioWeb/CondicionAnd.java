package sitioWeb;

public class CondicionAnd extends Condicion {
	Condicion c1;
	Condicion c2;
	
	public CondicionAnd(Condicion c1, Condicion c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public boolean cumple(Noticia nn) {
		return c1.cumple(nn) && c2.cumple(nn);
	}

}
