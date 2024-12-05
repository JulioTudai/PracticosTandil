package TP2E1;

import java.util.ArrayList;

public class Serie {
    private ArrayList<Temporada> temporadas;
    private String titulo;
    private String descripcion;
    private String creador;
    private String genero;


    public Serie(){
        this.titulo = "vacio";
        this.descripcion="vacio";
        this.creador="vacio";
        this.genero="vacio";
        this.temporadas = new ArrayList<Temporada>();
    }

    public Serie(String titulo,String descripcion, String creador, String genero, ArrayList<Temporada> temp) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.creador = creador;
        this.genero = genero;
        this.temporadas = new ArrayList<Temporada>(temp);
    }

    public int episodiosVistos(){
        int episodiosVistos = 0;
        for (Temporada t : temporadas){
            episodiosVistos += t.episodiosVistos();
        }
        return episodiosVistos;
    }
    public double promedioSerie(){
        int sumaCalif = 0;
        int cantTemp = 0;

        for (Temporada t : temporadas){
           sumaCalif+= t.promedioTemporada();
           cantTemp++;
        }
        return sumaCalif/cantTemp;
    }

    public boolean serieCompletada(){
        for (Temporada temp : temporadas){
            if (!temp.tempCompleta()){
                return false;
            }
        }
        return true;
    }


}
