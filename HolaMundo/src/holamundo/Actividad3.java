/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holamundo;

/**
 *
 * @author USUARIO
 */
public class Actividad3 {
    
    public static void main(String[] args){
        double iva=.19,utilidad=.2,precio=5.500;
        double I,U,preciov;
        
        I= precio*iva;
        U= precio*utilidad;
        
        preciov=precio+I+U;
        
        System.out.printf("El precio final de venta del articulo es = %f%n", preciov);
      
        
        
    }
}
