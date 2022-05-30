
package Ejercicio3Modelo;

import java.util.Scanner;


public class Cheques extends Cuentas{
    
    Scanner entrada = new Scanner(System.in);

    public Cheques() {
    }

    public Cheques(int numCuenta, String nombre, double saldo) {
        super(numCuenta, nombre, saldo);
    }

    @Override
    public void consultar() {
        System.out.println("\nnumero de cuenta: " + numCuenta);
        System.out.println("Nombre dle titular: " + nombre);
        System.out.println("Saldo registrado: " + saldo);
        
    }

    @Override
    public void depositar() {
        
        double consig;
        double comision;
        System.out.println("       --- calculando comision ---");
        comision = (10 * saldo) / 100;
        System.out.println(" -- Comision por uso de chequera es = " + comision + " ---");
        System.out.println("Ingrese la cantidad que desea aÃ±adir: ");
        consig = entrada.nextDouble();
        saldo = saldo + consig - comision;
        
        
    }

    @Override
    public void retirar() {
        double consig;
        double comision = 1200;
        System.out.println("comision por uso de chequera es de: " + comision);
        System.out.println("ingrese la cantidad que desea retirar: ");
        consig = entrada.nextDouble();
        if (consig > saldo)
        {
            System.out.println("\n---saldo insuficiente---\n");
        }else
        {
            if (comision > saldo-consig)
            {
                System.out.println("\n --- saldo insuficiente --- ");
            }else
            {
                saldo = saldo - consig - comision;
            }
        }
        
        
    }
    
    
    
    
    
    
    
    
    
    
}
