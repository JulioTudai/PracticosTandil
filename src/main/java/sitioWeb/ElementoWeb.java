package sitioWeb;

import java.util.ArrayList;

public abstract class ElementoWeb {
	
	public abstract int getTotalNoticias();
	 protected abstract ArrayList<Noticia> buscar(Condicion condicion);
}
