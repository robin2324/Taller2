
package Ejercicio1Vista;

import Ejercicio1Modelo.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        int cont=0;
        ArrayList<Producto>listaProducto = new ArrayList();
        
        Producto p = new Perecedero(2,"Jabon",20);
        listaProducto.add(p);
        
        listaProducto.add(new noPerecedero(19,2,"Melon",10));
        listaProducto.add(new noPerecedero(20,3,"Shampoo",50));
        listaProducto.add(new Perecedero(1,"Atun",50));
        listaProducto.add(new Perecedero(1,"Chocolate",100));
        
        for(Producto f: listaProducto){
            imprimirProducto(f);
        }
        
        
        
    }
    
    public static void imprimirProducto(Producto p){
        System.out.println("Producto: "+ p.getNombre());
        System.out.println("Precio final: "+ p.calcularPrecio());
        System.out.println("-------------------------\n");
    }
    
    
}
