package TP5E4;

public class Cualidad {
    private int fuerza;
    private int destreza;
    private int magia;
    private String linaje;

    public Cualidad (int fz, int dz, int magia, String sangre){
        this.fuerza = fz;
        this.destreza = dz;
        this.magia = magia;
        this.linaje = sangre;

    }

    public boolean equals(Cualidad a2){
        return this.getFuerza() == a2.getFuerza()
                && this.getDestreza() == a2.getDestreza()
                && this.getMagia() == a2.getMagia();
    }


    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getMagia() {
        return magia;
    }

    public void setMagia(int magia) {
        this.magia = magia;
    }

    public String getLinaje() {
        return linaje;
    }

    public void setLinaje(String linaje) {
        this.linaje = linaje;
    }
}

