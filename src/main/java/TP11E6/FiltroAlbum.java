package TP11E6;

public class FiltroAlbum  extends Filtro{
    private String album;

    public FiltroAlbum(String album) {
        this.album = album;
    }

    @Override
    public boolean cumple(Figurita f) {
        return f.getAlbum().equals(album);
    }
}
