package TP2E5;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Turno {
    private LocalTime hora;
    private LocalDate fecha;
    private Cliente cliente;
    private Peluquero peluquero;
    private int precio;
    private int descuento;

    public Turno (LocalTime hora, LocalDate fecha,Cliente cliente,Peluquero peluquero){
        this.hora = hora;
        this.fecha = fecha;
        this.cliente = cliente;
        this.peluquero = peluquero;
        this.precio = 200;
    }

    public Turno(LocalTime hora, LocalDate fecha, Cliente c){
        this.hora = hora;
        this.fecha = fecha;
        this.cliente = c;
        this.precio = 200;

    }



    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Peluquero getPeluquero() {
        return peluquero;
    }

    public void setPeluquero(Peluquero peluquero) {
        this.peluquero = peluquero;
    }

    public boolean disponible(Turno t){
        if(this.getHora() != t.getHora()){
            return true;
        }
        return false;
    }

    public int getHora() {
        return hora.getHour();
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
