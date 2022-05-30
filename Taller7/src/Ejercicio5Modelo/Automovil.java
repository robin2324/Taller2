
package Ejercicio5Modelo;

import java.util.Scanner;


public class Automovil extends VehiculoMotorizado{
    
    Scanner entrada = new Scanner(System.in);
    String op;

    public Automovil() {
    }

    public Automovil(String fabricante, String modelo, String añoFabrica, double kilometraje) {
        super(fabricante, modelo, añoFabrica, kilometraje);
    }

    public void Datos(){
        
        System.out.println("Ingrese fabricante: ");
        fabricante = entrada.nextLine();
        System.out.println("Ingrese el modelo: ");
        modelo = entrada.nextLine();
        System.out.println("Ingrese el año de fabricacion: ");
        añoFabrica = entrada.nextLine();
        System.out.println("Ingrese el kilometraje: ");
        kilometraje = entrada.nextDouble();
       
        
    }
    
    public String medidasDeSeguridad(){
        
        int pasaj;
        int opci;
        System.out.println("Que estilo de automovil es: ");
        System.out.println(" 1. VAN   2. Estandar   3. otro ");
        opci = entrada.nextInt();
        System.out.println("Que cantidad de pasajeros lleva: ");
        pasaj = entrada.nextInt();
        if(opci == 1)
        {
            CapacidadLimite num = new CapacidadLimite();
            op = num.van(pasaj);
        }else
        {
            CapacidadLimite num1 = new CapacidadLimite();
            op = num1.limite(pasaj);
        }
        
        return op;
        
    }
    
    
    public void mostrar(){
        
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año de fabricacion: " + añoFabrica);
        System.out.println("Kilometraje: " + kilometraje);
        System.out.println(op);
        
    }
    
    
    
    
    
}
