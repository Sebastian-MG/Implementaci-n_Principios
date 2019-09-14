/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentaproductos;

import Clases.*;
import java.util.Scanner;


/**
 *
 * @author lenovo
 */
public class RentaProductos {
    static Scanner sc = new Scanner(System.in);
    
    static Producto[] prods =  new Producto[]{
        new Pelicula("X-men: Dark Phoenix", new String[]{"Simon Kinberg"},
                "Walt Disney Studios Motion Pictures", 2019, "Accion", "PG-13",
                new String[]{"James McAvoy", "Michael Fassbender", "Jennifer Lawrence"},
                new String[]{},"1.1", new Disco(), "1901", new Descuento(),
                (float)6.99, "DISP"),
        new Pelicula("Fragmentado", new String[]{"M. Night Shyamalan"}, "Universal Studios",
                2016, "Terror Psicologico", "PG-13", new String[]{"James McAvoy",
                    "Anya Taylor-Joy"}, new String[]{},"3.8", new Disco(), "1902",
                new Descuento(), (float)4.99, "DISP"),
        new Pelicula("El Resplandor", new String[]{"Stanley Kubrick"}, "Warner Bros. Pictures",
                1980, "Terror", "+18", new String[]{"Jack Nicholson", "Shelley Duvall",
                    "Danny Lloyd"}, new String[]{},"4.2", new VHS(), "1999",
                new Descuento(), (float)8.99, "DISP"),
        new Pelicula("Sueño de Fuga", new String[]{"Frank Darabont"}, "Warner Bros",
                1994, "Drama", "PG-13", new String[]{"Tim Robbins", "Morgan Freeman"},
                new String[]{"Mejor Película", "Mejor Actor", "Mejor Guion Adaptado",
                    "Mejor Banda Sonora", "Mejor Fotografía", "Mejor Montaje"},
                "4.6", new VHS(), "1919", new Descuento(), (float)9.99, "DISP"),
        /*(String nombre, String creador, String distribuidora,
            int añoEstreno, String temporada, String genero, String clasificacion,
            String[] reparto, Medio medio, String codigo, Descuento descuento,
            float valor, String estado)*/
        new Serie("Legion", "Noah Hawley", "20th Television", 2017, "2", "Ciencia ficción",
                "R", new String[]{"Dan Stevens IV", "Rachel Keller", "Aubrey Plaza"},
                new Digital(), "217", new Descuento(), (float)5.99, "DISP"),
    };
    
    private static void ImprimirProductos(String cond){
        for(int i = 0; i<prods.length; i++){
            if (prods[i].getEstado().equals(cond)){
                System.out.println(prods[i].getCodigo() + " - " + prods[i].getNombre());
            }
        }
    }
    
    private static int BuscarProducto(String cond, String key){
        for(int i = 0; i<prods.length; i++){
            if (prods[i].getEstado().equals(cond) && prods[i].getCodigo().equals(key)){
                return i;
            }
        }
        return -1;
    }
    
    private static void ModificarProducto(int ind, String cond){
        prods[ind].setEstado(cond);
    }
    
    private static void Vender(){
        String opcion;
        do{
            System.out.println("CATALOGO DISPONIBLE:");
            ImprimirProductos("DISP");
            System.out.println("Escriba el codigo del producto:");
            opcion=sc.next();
            int ind=BuscarProducto("DISP", opcion);
            if (ind!=-1){
                System.out.println("¿Esta seguro que desea vender " + prods[ind].getNombre() + "?");
                System.out.println("(oprima N para cancelar)");
                opcion=sc.next();
                if (!"n".equals(opcion.toLowerCase())){
                    ModificarProducto(ind, "VEND");
                    break;
                }
            }
        }while(false);
        //ImprimirProductos("VEND");
        //ImprimirProductos("DISP");
    }
    
    private static void Rentar(){
        
    }
    
    private static void Retornar(){
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion=0;
        System.out.println(prods[0].getCodigo());
        Menu:
        do{
            System.out.println("Ingrese un valor:");
            System.out.println("1- Vender un producto");
            System.out.println("2- Rentar un producto");
            System.out.println("3- Retornar un producto");
            System.out.println("0- Cerrar Sesion");
            opcion=sc.nextInt();
            switch(opcion){
                case 1:
                    Vender();
                    break;
                case 2:
                    Rentar();
                    break;
                case 3:
                    Retornar();
                    break;
                default:
                    System.out.println("Ha ingresado un valor erroneo");
                    opcion=0;
                case 0:
                    break Menu;
            }
        }while(opcion>=0 && opcion<=3);
        System.out.println("¡Adios!");
    }
}
