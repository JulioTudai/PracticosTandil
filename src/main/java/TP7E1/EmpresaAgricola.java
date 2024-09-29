package TP7E1;

import java.util.ArrayList;

/*
-Arreglo ProductoQuimico productos quimicos

+get y set modificados
+public arregleo<ProductoQuimico> trata ( condicion c)

esta clase tiene que poder devolver la lista de los pruductos quimicos
que sirven para tratar cierta enfermedad o dado una enfermedad y un cultivo
cuales son los productos quimicos que le corresponden tienendo en cuenta que
ciertos productos quimicos no puedn aplicarse a algunos cultivos.


cosas que ya estan:

cosas que creo que estan mal del compa
1. el chabon esta haciedo las cosas desde granja y es desde empresa
crea una granja y lista todos los productos que  sirven para un cultivo donde esta el arreglo
de productos quimicos. pero a los productos quimicos los tiene la empresa y la empresa lista los productos
quimicos que tratan cierta enfermedad.
2

 */
public class EmpresaAgricola {
    private ArrayList<ProductoQuimico> productosQuimicos;

    public EmpresaAgricola (){
        this.productosQuimicos=new ArrayList<>();
    }

    public ArrayList<ProductoQuimico> trataEnfermedad(Condicion c1){
        ArrayList<ProductoQuimico> tratan = new ArrayList<>();
        if(c1!=null){
            for(int i =0;i<productosQuimicos.size();i++){
                if(c1.cumple(productosQuimicos.get(i))){
                    tratan.add(productosQuimicos.get(i));
                }
            }
        }else{
            System.out.println("condicion nula");

        }
        return tratan;
    }
    public void addProductosQuimicos(ProductoQuimico p){
        if (p != null && !productosQuimicos.contains(p)){
            this.productosQuimicos.add(p);
        }
    }
    public ArrayList<ProductoQuimico> getProductosQuimicos(){
        return new  ArrayList<>(productosQuimicos);
    }


}
