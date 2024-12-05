package TP2E1;

import java.util.ArrayList;

public class Temporada {
    private ArrayList<Episodio> episodios;


    public Temporada (){
        episodios = new ArrayList<Episodio>();
    }

    public Temporada(Episodio e){
        this();
        episodios.add(e);
    }

    public int episodiosVistos(){
        int contador = 0;
        for (Episodio episodio : episodios ){
            if (episodio.isVisto()){
                contador++;
            }
        }
        return contador;
    }

    public double promedioTemporada(){
        int epVistos = 0;
        int sumaVistos = 0;
        for(Episodio e : episodios){
            if (e.isVisto()){
                epVistos++;
                sumaVistos += e.getCalificacion();
            }
        }
        return sumaVistos/epVistos;

    }

    public ArrayList<Episodio> getEpisodios() {
        return episodios;
    }

    public boolean tempCompleta(){
      // return episodios.size() == episodiosVistos();
        for (Episodio ep : episodios){
            if(!ep.isVisto()){
                return false;
            }
        }
        return true;
    }

    public void setEpisodios(ArrayList<Episodio> episodios) {
        this.episodios = episodios;
    }
}
