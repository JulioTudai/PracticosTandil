package TP1E1;
/*
Atributos
*nombre por defecto es N
*Apellido por defecto es N
*edad
*fechaNacimiento Por defecto 2000.1.1
*DNI es obigatorio no posee valor por defecto
*sexo por defecto FEM
*peso 1
*altura 1

Constructores
1° DNI
2° dni,nombre yapellido
3° dni,nombre,apellido y fecha nac

responsabilidad de esta clase (metodos)

1°indiceMCorporal() metodo que toma el peso de la instancia y lo divide por su altura al cuadrado
retorna double

2°estadoFisico() pide el indice de masa corporal  y se fija si el valor esta entre 18.5 y 25, si da true esta en forma
sino no esta en forma
retorna un string.

3°cumpleAños() toma su fecha de cumpleaños y la compara con la fecha actual (objeto localdate fecha de hoy)
si da true esta cumpliendo años, y sino no esta cumpliendo años
retorna string.

4°mayorEdad() consulta la edad de su instancia y compara si es mayor de 17 años, si da true es mayor de edad
retorna String.

5°votar() consulta si edad y si es mayor de 16 añosde edad puede votar
retorna String.

6°edadReal() compara la fecha de nacimiento con la fecha actual, determina cuantos años tiene
y los compara con la fecha de nacimiento de la instancia y determina si es verdad o no
retorna String

7°informacion() devolver un string con toda la informacion de la instancia modificado el toString


 */

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Persona {
   private String nombre;
   private String apellido;
   private LocalDate  fechaNacimiento = LocalDate.of(2000,1,1);
   private int dni;
   private String sexo;
   private double peso;
   private double altura;
   private int edad;

    public Persona (int dni){
        this.dni = dni;
        this.nombre = "N";
        this.apellido = "N";
        this.sexo = "Femenino";
        this.edad = 10;
        this.peso = 1;
        this.altura = 1;
        this.fechaNacimiento = LocalDate.of(2000,1,1);

    }
    public Persona (int dni, String nombre, String apellido){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = 10;
        this.peso = 1;
        this.altura = 1;
        this.sexo = "Femenino";
        this.fechaNacimiento = LocalDate.of(2000,1,1);

    }

    public Persona (int dni, String nombre, String apellido,LocalDate fechaNac){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNac;
        this.edad = 10;
        this.peso = 1;
        this.altura = 1;
        this.sexo = "Femenino";
    }

    public double indiceMCorporal (){

        return this.peso/(this.altura*this.altura);
    };

    public String fisicoApto(){
        if(indiceMCorporal()>18.5 && indiceMCorporal() < 25){
            return "Estado fisico apto";
        }
        return "Estado fisico no apto";
    }

    public String cumpleAnios(){
        LocalDate fechaHoy =  LocalDate.now();
        /*if(this.fechaNacimiento.getYear() == fechaHoy.getYear() &&
                this.fechaNacimiento.getMonth() == fechaHoy.getMonth() &&
                this.fechaNacimiento.getDayOfMonth() == fechaHoy.getDayOfMonth()) {

            return "fc pa";
            //TODO anda perfecto ahora probamos con equals
         */
            if (this.fechaNacimiento.equals(fechaHoy)){
                return " fc pa";
            }
        return "felicidades no sos un año mas jovie";

    }

    public String mayorEdad(){
        if(getEdad()>=18){
            return "anda a labura gato";
        }
        return "safaste perro";

    }

    public String votar(){
        if(getEdad()>=16){
            return "no vote a la cristi gato";
        }
        return "safaste milei";
    }

    public String edadReal(){
        if(getEdad() == this.edad){
            return "su edad es real";
        }
        return " la re mentiste perro";
    }
    public String getDatosCompletos(){
        return  "nombre :"+this.nombre+
                "Apellido :"+this.apellido+
                "edad :"+ getEdad()+
                "fecha nacimiento :"+fechaNacimiento.getYear()+","+fechaNacimiento.getMonth()+","+fechaNacimiento.getDayOfMonth()+
                "dni"+this.dni+
                "altura"+this.altura+
                "peso"+ this.peso;
    }


    public int getDni() {
        return dni;
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        LocalDate fechaHoy = LocalDate.now();
        int edad = (int) ChronoUnit.YEARS.between(this.fechaNacimiento,fechaHoy);
        return edad;
    }


    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
