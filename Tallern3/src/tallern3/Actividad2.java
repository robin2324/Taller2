/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallern3;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Actividad2 {
        public static void main(String[] args){
        Scanner entrada= new Scanner(System.in);
        int limite=1500;
        int saldoMes,saldoFinal;
        int tAbono=500, tDeducciones=50;
        
        System.out.print("Ingrese el saldo inicial del mes: ");
        //limite= entrada.next();
        saldoMes= entrada.nextInt();
        
        saldoFinal= saldoMes+tAbono-tDeducciones;
        
        System.out.println("El nuevo balance es: "+saldoFinal);
        
        if (saldoFinal > limite){
            System.out.println("* Se excedio el limite de credito");
        }
        
        
        
    }
}


