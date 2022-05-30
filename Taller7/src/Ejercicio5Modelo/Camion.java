
package Ejercicio5Modelo;

import java.util.Scanner;


public class Camion extends VehiculoMotorizado{
    
    Scanner entrada = new Scanner(System.in);
    String [] respuesta;
    int j;

    public Camion() {
    }

    public Camion(String fabricante, String modelo, String añoFabrica, double kilometraje) {
        super(fabricante, modelo, añoFabrica, kilometraje);
    }
    
    public void datos(){
        
        System.out.println("ingrese fabricante: ");
        fabricante = entrada.nextLine();
        System.out.println("ingrese el modelo: ");
        modelo = entrada.nextLine();
        System.out.println("ingrese el aÃ±o de fabricacion: ");
        añoFabrica = entrada.nextLine();
        System.out.println("ingrese el kilometraje: ");
        kilometraje = entrada.nextDouble();
        
        
    }
    
    public void medidasDeSeguridad(){
        
        int n;
        System.out.println("¿Cuantos remolques desea verificar? :");
        j = entrada.nextInt();
        respuesta = new String[j];
        CapacidadLimite num = new CapacidadLimite();
        num.camion(j);
        
    }
    
    
    public void mostrar(){
        
        System.out.println("\nFabricante: " + fabricante);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año de fabricacion: " + añoFabrica);
        System.out.println("Kilometraje: " + kilometraje);
        CapacidadLimite rum = new CapacidadLimite();
        rum.mostrarCamion(j);
        
    }
    
    
}
