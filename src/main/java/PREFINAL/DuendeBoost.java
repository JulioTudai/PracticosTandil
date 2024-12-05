package PREFINAL;

public class DuendeBoost extends Duende{

    private double alturaBoost;
    private double talleBoost;

    public DuendeBoost(String nombre, double altura, double alturaBoost, double talle, double talleBoost, String profesion){
        super(nombre, altura, talle, profesion);
        this.alturaBoost=alturaBoost;
        this.talleBoost=talleBoost;
    }

    public double getAlturaBoost(){ return this.alturaBoost; }
    public double getTalleBoost(){ return this.talleBoost; }

    public void setAlturaBoost(double alturaBoost){ this.alturaBoost=alturaBoost; }
    public void setTalleBoost(double talleBoost){ this.talleBoost=talleBoost; }

    @Override
    public double getAltura(){
        return super.getAltura()+this.getAlturaBoost();
    }

    public double getTalle(){
        return super.getTalle()+this.getTalleBoost();
    }

}
