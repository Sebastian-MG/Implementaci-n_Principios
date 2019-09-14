/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author lenovo
 */
public class Serie extends Producto{
    
    private String creador;
    private String temporada;
    private String genero;

    public Serie() {
    }
    
    public Serie(Serie serie) {
        this.creador = serie.getCreador();
        this.temporada = serie.getTemporada();
        this.genero = serie.getGenero();
    }

    public Serie(String nombre, String creador, String distribuidora,
            int añoEstreno, String temporada, String genero, String clasificacion,
            String[] reparto, Medio medio, String codigo, Descuento descuento,
            float valor, String estado) {
        super(nombre,distribuidora, añoEstreno, clasificacion, reparto, medio,
                estado, codigo, descuento, valor);
        this.creador = creador;
        this.temporada = temporada;
        this.genero = genero;
    }
    
    public Serie(String nombre, String creador, String distribuidora,
            int añoEstreno, String temporada, String genero, String clasificacion,
            String[] reparto, Medio medio) {
        this.creador = creador;
        this.temporada = temporada;
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public String getTemporada() {
        return temporada;
    }

    public String getGenero() {
        return genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    
}
