package TP7E1;

import java.util.ArrayList;

/*
-String nombre
-Arreglo cultivos : desaconjaUso
-Arreglo String : estadosPatologicosTrata

+get y set normales y modificados

 */
public class ProductoQuimico {
    private String nombre;
    private ArrayList<Cultivo> noUsarEnCultivos;
    private ArrayList<String> estadosPatologicosTrata;


    public ProductoQuimico(String nombre){
        this.nombre = nombre;
        this.noUsarEnCultivos = new ArrayList<>();
        this.estadosPatologicosTrata = new ArrayList<>();

    }
    public void setNoUsarEnCultivos(Cultivo c1){
        if(c1!=null && !noUsarEnCultivos.contains(c1)){//redefinir equals cultivo
            noUsarEnCultivos.add(c1);
        }else{
            System.out.println("Este cultivo ya pertenece al arrego de no usar o el objeto es null");
        }
    }
    public boolean cumpleEstadosPatologicos(EnfermedadCultivo enfermedad){
        int contador = 0;
        if(estadosPatologicosTrata.containsAll(enfermedad.getEstadosPatologicos()))

        if(this.estadosPatologicosTrata.size() >= enfermedad.getEstadosPatologicos().size()) {
            for (int i = 0; i < estadosPatologicosTrata.size(); i++) {
                for (int j = 0; j < enfermedad.getEstadosPatologicos().size(); j++) {
                    if (this.estadosPatologicosTrata.get(i).equals(enfermedad.getEstadosPatologicos().get(j))) {
                        contador++;
                    }
                }
            }
            return contador == estadosPatologicosTrata.size();
        }
        return false;

    }
    public boolean equals (ArrayList<String> estadosPatologicos){//todo lo intente weon
        int contador =0;
         for (int i = 0; i < estadosPatologicosTrata.size(); i++) {
            for (int j = 0; j < estadosPatologicos().size(); j++) {
                if (this.estadosPatologicosTrata.get(i).equals(estadosPatologicos().get(j))) {
                    contador++;
                }
            }
        }
        return contador == estadosPatologicosTrata.size();
    }
        return false;
    }

    public boolean equals( Object o1){
        try{
            ProductoQuimico p1 = (ProductoQuimico) o1;
            this.getNombre().equals(p1.getNombre());
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
    public ArrayList<Cultivo> getNoUsarEnCultivos(){
        return  new ArrayList<Cultivo>(noUsarEnCultivos);
    }

    public ArrayList<String> getEstadosPatologicosTrata(){
        return new ArrayList<>(estadosPatologicosTrata);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
