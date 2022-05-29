
package Ejercicio3Modelo;

import java.util.Scanner;


public class Ahorros extends Cuentas{
    
    Scanner entrada = new Scanner(System.in);
    
    String fechaVen;

    public Ahorros() {
    }

    public Ahorros(String fechaVen, int numCuenta, String nombre, double saldo) {
        super(numCuenta, nombre, saldo);
        this.fechaVen = fechaVen;
    }

    public String getFechaVen() {
        return fechaVen;
    }

    public void setFechaVen(String fechaVen) {
        this.fechaVen = fechaVen;
    }

    @Override
    public void consultar() {
        
        System.out.println("\nNumero de cuenta: " + numCuenta);
        System.out.println("Nombre dle titular: " + nombre);
        System.out.println("Saldo registrado: " + saldo);
        System.out.println("Fecha de vencimiento del aÃ±o 2020: " + fechaVen);
        
    }

    @Override
    public void depositar() {
        
        float comision; 
        float consig;
        /* calculamos la comision por interes mensual */
        System.out.println(" --- calculando comision ---"); 
        comision = (float) ((13 * saldo) / 100);
        System.out.println("Comision de interes mensual: " + comision);
        System.out.println("Ingrese la cantidad que desea añadir: ");
        consig = entrada.nextFloat();
        saldo = saldo + consig - comision;
    }

    @Override
    public void retirar() {
        
        float comision;
        float consig = 0;
        String comparacion;
        System.out.println(" \n--- calculando comision ---"); 
        comision = (float) ((13 * saldo) / 100);
        System.out.println("comision por uso de cuenta: " + comision);
            System.out.println("\nen que dia desea retirar el dinero: ");
            comparacion = entrada.nextLine();
                if (comparacion.equals(fechaVen))
                {
                    System.out.println("\nque cantidad desea retirar: ");
                    consig = entrada.nextFloat();
                    if (consig > saldo)
                    {
                        System.out.println("\n   ---saldo insuficiente---\n");
                        System.out.println("-- retiro mayor que el saldo --");
                        entrada.nextLine();
                    }else
                    {
                        if (comision > saldo-consig)
                        {
                            System.out.println("\n   --- saldo insuficiente --- ");
                            System.out.println("-- comision mayor que el saldo --");
                            entrada.nextLine();
                        }else
                        {
                            saldo = saldo - consig - comision;
                            System.out.println(" --- retiro exitoso ---");
                        }
                    }
                } else {
                    System.out.println("-- solo se puede retirar el la fecha de vencimiento --");
                }
    }
        
    
}
