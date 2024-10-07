package TP5E4;

public  class Persona {
    private String nombre;
    private Cualidad cualidades;

    public Persona (String nombre,Cualidad c){
        this.nombre = nombre;
        this.cualidades = c;
    }
    public boolean equals(Alumno a){
        return this.getNombre().equals(a.getNombre())
                && this.getCualidades().equals(a.getCualidades());
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cualidad getCualidades() {
        return cualidades;
    }

    public void setCualidades(Cualidad cualidades) {
        this.cualidades = cualidades;
    }
}
