package PREFINAL;

public class DuendeDaltonico extends Duende{

    public DuendeDaltonico(String nombre, double altura, double talle, String profesion){
        super(nombre, altura, talle, profesion);
    }

    @Override
    public boolean checkColor(String color){
        return true;
    }

}
