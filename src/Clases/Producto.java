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
public class Producto implements InterfazProducto{

    private String nombre;
    private String distribuidora;
    private int añoEstreno;
    private String clasificacion;
    private String[] reparto;
    private Medio medio;    
    private String estado;
    private String codigo;
    private Descuento descuento;
    private float valor;

    @Override
    public void Vender(){
        
    }
    
    public Producto() {
    }
    
    public Producto(Producto producto) {
        this.nombre = producto.getNombre();
        this.distribuidora = producto.getDistribuidora();
        this.añoEstreno = producto.getAñoEstreno();
        this.clasificacion = producto.getClasificacion();
        this.reparto = producto.getReparto();
        this.medio = producto.getMedio();
        this.estado = producto.getEstado();
        this.codigo = producto.getCodigo();
        this.descuento = producto.getDescuento();
        this.valor = producto.getValor();
    }
    
    public Producto(String nombre, String distribuidora, int añoEstreno, String clasificacion, String[] reparto, Medio medio, String estado, String codigo, Descuento descuento, float valor) {
        this.nombre = nombre;
        this.distribuidora = distribuidora;
        this.añoEstreno = añoEstreno;
        this.clasificacion = clasificacion;
        this.reparto = reparto;
        this.medio = medio;
        this.estado = estado;
        this.codigo = codigo;
        this.descuento = descuento;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public int getAñoEstreno() {
        return añoEstreno;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public String[] getReparto() {
        return reparto;
    }

    public Medio getMedio() {
        return medio;
    }
    
    public String getEstado() {
        return estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public Descuento getDescuento() {
        return descuento;
    }

    public float getValor() {
        return valor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public void setAñoEstreno(int añoEstreno) {
        this.añoEstreno = añoEstreno;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public void setReparto(String[] reparto) {
        this.reparto = reparto;
    }

    public void setMedio(Medio medio) {
        this.medio = medio;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescuento(Descuento descuento) {
        this.descuento = descuento;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
}
