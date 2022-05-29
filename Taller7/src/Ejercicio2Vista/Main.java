
package Ejercicio2Vista;

import Ejercicio2Modelo.*;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int cas;
        int opci;
        boolean salir;
        System.out.println(" --- ALQUILER DE VEHICULOS ---");
        System.out.println("¿Que desea alquilar? "
                            + "\n1. autobus" + "\n2. tractor");
        opci = entrada.nextInt();
        switch(opci)
        {
            case 1:
                Vehiculo rum = new Autobuses();
                rum.cap_datos();
                rum.alquiler();
                rum.mostrar();
                break;
            case 2:
                Vehiculo rum1 = new Tractores();
                rum1.cap_datos();
                rum1.alquiler();
                rum1.mostrar();
                break;
        }
        
        
        
    }
    
}
