package ParcialResiduos;

public class Persona {
    private String nombre;
    private String apellido;
    private Direccion direccion;

    public Persona(Direccion direccion, String apellido, String nombre) {
        this.direccion = direccion;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}
