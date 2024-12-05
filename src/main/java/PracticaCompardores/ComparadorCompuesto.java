package PracticaCompardores;

import java.util.Comparator;

public class ComparadorCompuesto  implements Comparator<Establecimiento> {
    private Comparator<Establecimiento> c1,c2;

    public ComparadorCompuesto(Comparator<Establecimiento> c1, Comparator<Establecimiento> c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public int compare(Establecimiento o1, Establecimiento o2) {
        return 0;
    }
}
