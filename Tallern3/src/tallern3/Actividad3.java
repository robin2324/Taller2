/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallern3;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Actividad3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner entrada= new Scanner(System.in);
       int semana= 0;
       int [] ganancia= new int[7];
       int dias=7;
       int s;
       int comision=200;
       for (int i=0;i<dias;i++){
           System.out.println("Ingrese la ganancia del dia "+(i+1)+":");
           ganancia[i]= entrada.nextInt();
       }
       
       for (int i=0;i<dias;i++){
           semana= semana+ganancia[i];
       }
       
       if (semana>15000){
           s=semana;
           System.out.println("Categoria B. El pago semanal del vendedor es: "+(semana+(s*(0.13+0.09))+comision));
       }else
           if ((semana>7000)&&(semana<=15000)){
               s=semana;
               System.out.println("Categoria A. El pago semanal del vendedor es: "+(semana+(s*(0.1+0.09))+comision));
           }else
               if ((semana>=5000)&&(semana<=7000)){
                   s=semana;
                   System.out.println("Categoria A. El pago semanal del vendedor es: "+(semana+(s*(0.07+0.09))+comision));
               }else
                   if((semana>3000)&&(semana<5000)){
                   s=semana;
                   System.out.println("Categoria A. El pago semanal del vendedor es: "+(semana+(s*(0.05+0.09))+comision));
                   }else
                       System.out.println("El pago semanal del vendedor es: "+(semana+comision+(semana*0.09)));
       
       
        
        
        
    }
}
