
package Ejercicio3Vista;

import Ejercicio3Modelo.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int deci;
        int opci;
        System.out.println("Su cuenta es de tipo: "
                                 + "\n1. Cheques \n2. Ahorro");
        deci = entrada.nextInt();
        if (deci == 1)
        {
            Cheques cheque = new Cheques(2356,"Caroline Pallares",14000);
            cheque.consultar();
            System.out.println("\n ¿Que desea hacer en su cuenta? ");
            System.out.println(" \n1. Consignar \n2. Retirar");
            opci = entrada.nextInt();
            if (opci == 1)
            {
                cheque.depositar();
                cheque.consultar();
            }else
            {
                cheque.retirar();
                cheque.consultar();
            }
        }else
        {
            Ahorros cuenta = new Ahorros("14 nov",2000,"Patricio Acosta",5000);
            cuenta.consultar();
            System.out.println("\n ¿Que desea hacer en su cuenta? ");
            System.out.println(" \n1. Consignar \n2. Retirar");
            opci = entrada.nextInt();
            if (opci == 1)
            {
                cuenta.depositar();
                cuenta.consultar();
            }else
            {
                cuenta.retirar();
                cuenta.consultar();
            }
        }
    }
    
    
}
