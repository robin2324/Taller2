
package Ejercicio5Modelo;

import java.util.Scanner;


public class Motocicleta extends VehiculoMotorizado{
    
    Scanner entrada = new Scanner(System.in);
    String respuesta;

    public Motocicleta() {
    }

    public Motocicleta(String fabricante, String modelo, String añoFabrica, double kilometraje) {
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
        System.out.println("cuantos pasajeros van en su moto: ");
        n = entrada.nextInt();
        CapacidadLimite num = new CapacidadLimite();
        respuesta = num.motocicleta(n);
        
        
    }
    
    public void mostrar(){
        
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año de fabricacion: " + añoFabrica);
        System.out.println("Kilometraje: " + kilometraje);
        System.out.println(respuesta);
        
    }
    
    
}
