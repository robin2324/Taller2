/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holamundo;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Actividad4 {
    
    
    
    public static void main(String[] args){
        
        Scanner entrada= new Scanner (System.in);
        
        int D;
        double K,L,P,E,Es,T,Pe,Pef;
        
        System.out.print("Ingrese cuantos dias de viaje fueron = \n");
        D= entrada.nextInt();
        
        System.out.print("Ingrese cuantos kilometros condujo por dia = \n");
        K= entrada.nextDouble();
        
        System.out.print("Ingrese el costo del litro de gasolina = \n");
        L= entrada.nextDouble();
        
        P= ((K*L)/D);
   
        System.out.print("Ingrese el costo del estacionamiento por dia= \n");
        Es= entrada.nextDouble();
        
        System.out.print("Ingrese el pago de peaje por dia = \n");
        Pe= entrada.nextDouble();
        
        Pef=Pe*D;
        
        K= ((Es+L)*D);
        
        T= K + P + Pef;
        
        System.out.printf("El promedio de kilometros por litro de gasolina es = \n"+P,"\n");
        
        System.out.printf("\n El total a pagar por "+D+ " dias de viaje es = \n"+T,"\n");
        
    }
}
