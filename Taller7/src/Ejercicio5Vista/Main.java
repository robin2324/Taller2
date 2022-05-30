
package Ejercicio5Vista;

import java.util.Scanner;
import Ejercicio5Modelo.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int opcion;
        
        
        System.out.println("Que vehiculo desea gestionas: ");
        System.out.println("1. Automovil \n2. Motocicleta \n3. Camion");
        opcion = entrada.nextInt();
        if (opcion==1){
            Automovil car = new Automovil();
            car.Datos();
            car.medidasDeSeguridad();
            car.mostrar();
            
        }else if (opcion==2){
            
            Motocicleta moto = new Motocicleta();
            moto.datos();
            moto.medidasDeSeguridad();
            moto.mostrar();
            
            
        }else if (opcion==3){
            Camion camion = new Camion();
            camion.datos();
            camion.medidasDeSeguridad();
            camion.mostrar();
            
        }else{
            System.out.println("---- ERROR ----");
            
        }
        
        
        
        
    }
    
    
    
}
