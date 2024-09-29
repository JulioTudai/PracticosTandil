package TP7E1;
/*
-String nombre
-Arreglo enfermedardes : enfermedadesCultivo

+get y set normales y modificados
+sirveProductoQuimico (ProducotoQuimico p): terminado
 */

import java.util.ArrayList;

public class Cultivo {
    private String nombre;
    private ArrayList<EnfermedadCultivo> enfermedadesCultivo;

    public Cultivo(String nombre){
        this.nombre = nombre;
        this.enfermedadesCultivo = new ArrayList<>();
    }

    /*public String sirveProductoQuimico(ProductoQuimico p){ todo con for pero esta mal
        int contador = 0;
        if(p!=null){
            for(int i =0 ; i< enfermedadesCultivo.size();i++){
                for(String patologico : e1.getEstadosPatologicos()){
                   if( p.getEstadosPatologicosTrata().contains(patologico)){ // todo equals de estados patalogicos trata
                       contador++;
                   }
                }
                if(contador == e1.getEstadosPatologicos().size() && !p.getNoUsarEnCultivos().contains(this)){ // todo equals de no usar encultivos
                    return "el producto quimico :" + p.getNombre() +" sirve para tratar la enfermedad :"+e1.getNombre();
                }
            }
        }
    }

     */

    public boolean sirveProducto3(ProductoQuimico p){// todo: sin cointains para no redefinir equals en otras clases
       for(int i = 0 ; i <p.getNoUsarEnCultivos().size(); i++){
           if(this.getNombre().equals(p.getNoUsarEnCultivos().get(i).getNombre())){
               System.out.println("este producto quimico no se puede usar con este cultivo");
               return false;
           }
       }
        for(int i =0 ; i < enfermedadesCultivo.size();i++){
            if(p.cumpleEstadosPatologicos(enfermedadesCultivo.get(i))){
                System.out.println("el producto quimico "+ p.getNombre() + " trata la enfermedad :" +enfermedadesCultivo.get(i).getNombre());
                return true;
            }
        }
        System.out.println("este producto quimico no sirve para ninguna del as enfermedades de este cultivo");
        return false;

    }

    public String sirveProducto2(ProductoQuimico p){ // todo con while y sin boolean ( no redefini una mierda los equals)
        int contador =0;
        int i =0;
        if(p != null){
            while(i < enfermedadesCultivo.size() &&  contador < enfermedadesCultivo.get(i).getEstadosPatologicos().size() ){
                contador =0;
                for(int j =0 ; j < enfermedadesCultivo.get(i).getEstadosPatologicos().size();j++){
                    if(p.getEstadosPatologicosTrata().contains(enfermedadesCultivo.get(i).getEstadosPatologicos().get(j))){//todo redefirnir equals
                        contador ++;
                    }
                }
                if(contador == enfermedadesCultivo.get(i).getEstadosPatologicos().size() && p.getNoUsarEnCultivos().contains(this)) { // todo redefinir equals
                    return "el pruducto quimico  :" + p.getNombre() + " sirve para tratar una de las enfermedades";
                }
                i++;
            }
        }
        return "busqueda completa"; //todo volver a hacer esto
    }
    public void setEnfermedadesCultivo(EnfermedadCultivo e1){
        if(e1 !=null  && !enfermedadesCultivo.contains(e1)){
            enfermedadesCultivo.add(e1);
        }
    }

    public boolean equals(Object o){
        try{
            Cultivo c1 = (Cultivo) o;
            return nombre.equals(c1.getNombre());
        }
        catch (Exception e){

        }
        return  false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
