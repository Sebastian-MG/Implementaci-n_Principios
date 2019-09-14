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
public class Pelicula extends Producto{
    
    private String[] Director;
    private String genero;
    private String[] premiosNominados;
    private String calificacion;

    public Pelicula() {
    }

    public Pelicula(Pelicula pelicula) {
        this.Director = pelicula.getDirector();
        this.genero = pelicula.getGenero();
        this.premiosNominados = pelicula.getPremiosNominados();
        this.calificacion = pelicula.getCalificacion();
    }

    public Pelicula(String nombre, String[] Director, String distribuiodora,
            int añoEstreno, String genero, String clasificacion, String[] reparto,
            String[] premiosNominados, String calificacion, Medio medio,
            String codigo, Descuento descuento, float valor, String estado) {
        super(nombre,distribuiodora, añoEstreno, clasificacion, reparto, medio,
                estado, codigo, descuento, valor);
        this.Director = Director;
        this.genero = genero;
        this.premiosNominados = premiosNominados;
        this.calificacion = calificacion;
    }
    
    public Pelicula(String nombre, String[] Director, String distribuiodora,
            int añoEstreno, String genero, String clasificacion, String[] reparto,
            String[] premiosNominados, String calificacion, Medio medio){
        this.Director = Director;
        this.genero = genero;
        this.premiosNominados = premiosNominados;
        this.calificacion = calificacion;
    }

    public String[] getDirector() {
        return Director;
    }

    public String getGenero() {
        return genero;
    }

    public String[] getPremiosNominados() {
        return premiosNominados;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setDirector(String[] Director) {
        this.Director = Director;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPremiosNominados(String[] premiosNominados) {
        this.premiosNominados = premiosNominados;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }
    
    
}
