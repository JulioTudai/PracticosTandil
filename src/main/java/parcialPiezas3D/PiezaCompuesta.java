package parcialPiezas3D;

import java.util.ArrayList;

public class PiezaCompuesta extends Pieza3d {
    private ArrayList<Pieza3d> piezas;
    private static double tiempoExtra;
    private static int pesoExtra;

    public PiezaCompuesta(String nombre, String descripcion){
        super(nombre,descripcion);
        this.piezas = new ArrayList<>();
    }
    public PiezaCompuesta(String nombre, String descripcion,int pesoExtra){
        super(nombre,descripcion);
        PiezaCompuesta.pesoExtra = pesoExtra;
        this.piezas = new ArrayList<>();
    }
    public PiezaCompuesta(String nombre, String descripcion,double tiempoExtra){
        super(nombre,descripcion);
        PiezaCompuesta.tiempoExtra =tiempoExtra;
        this.piezas = new ArrayList<>();
    }

    public ArrayList<String>getColores(){
        ArrayList<String> salidaColores = new ArrayList<>();
        for (int i =0; i<piezas.size();i++){
            ArrayList<String> aux = piezas.get(i).getColores();
            for(int j =0; j < aux.size();j++){
                if(!salidaColores.contains(aux.get(j))){
                    salidaColores.add(aux.get(j));
                }
            }
        }
        return salidaColores;
    }

    public Pieza getMenorPla(){
        Pieza ganador = null;
        double menor=10000000;
        for(Pieza3d p: piezas){
           Pieza participante = p.getMenorPla();
            if(participante!=null && participante.getCantPla() < menor){
                ganador = participante;
                menor = ganador.getCantPla();
            }
        }
        return ganador;
    }



    @Override
    public double getCantPla(){
        int sumaPla = 0;
        int sumaPiezas =0;
        for(Pieza3d p:piezas){
             sumaPla += p.getCantPla();
        }
        sumaPiezas = getCantSimple();
        return sumaPla + pesoExtra * sumaPiezas;
    }

    @Override
    public int getTiempo(){
        int sumaTiempos =0;
        int sumaPiezas =0;
        for(Pieza3d p:piezas){
            sumaTiempos += p.getTiempo();
        }
        sumaPiezas =  getCantSimple();
        return sumaTiempos + (int) tiempoExtra * sumaPiezas;
    }
    public ArrayList<Pieza> buscar(Filtro f){
        ArrayList<Pieza> salida = new ArrayList<>();
        for(Pieza3d p : piezas){
            salida.addAll(p.buscar(f));
        }
        return salida;
    }

    public int getCantSimple(){
        int suma =0;
        for(Pieza3d p: piezas){
            suma += p.getCantSimple();
        }
        return suma;
    }
    //TODO comienzo de add y esas cosas modificadas
    public void addElemento(Pieza3d e){
        if(!piezas.contains(e) && e!=null){
            this.piezas.add(e);
        }
    }
    public ArrayList<Pieza3d> getElementos(){
        return new ArrayList<>(piezas);
    }
    public void remove(Pieza3d p){
        this.piezas.remove(p);
    }
    public boolean equals(Object o){
      try{
          PiezaCompuesta p = (PiezaCompuesta) o;
          if(this.getNombre().equals(p.getNombre()) &&
                  this.getDescripcion().equals(p.getDescripcion())){
              return true;
          }
      }catch(Exception e){
          return false;
      }
      return false;
    }


    //TODO comienzo de gets y sets sin modificar
    public static void setPesoExtra(int peso){
        PiezaCompuesta.pesoExtra = peso;
    }
    public static int getPesoExtra(){
        return pesoExtra;
    }

    public static double getTiempoExtra() {
        return tiempoExtra;
    }

    public static void setTiempoExtra(double tiempoExtra) {
        PiezaCompuesta.tiempoExtra = tiempoExtra;
    }

}
