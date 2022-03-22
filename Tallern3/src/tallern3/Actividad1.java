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
public class Actividad1 {
    public static void main(String[] args){
        Scanner entrada= new Scanner(System.in);
        int n;
        double cont=0;
        int mayor,p=0,x=0;
        double pCostoso;
        
        
        System.out.println("Digite el tamaño del arreglo: ");
        n= entrada.nextInt();
        
        int [] A= new int[n];
        double [] B= new double[n];
        int [] C= new int[n];
        pCostoso=B[0];
        mayor=C[0];
        
        for(int i=0;i<n;i++){
            System.out.println("Ingrese el codigo del producto: "+(i+1));
            A[i]= entrada.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println("Ingrese el valor de venta del producto: "+(i+1));
            B[i]= entrada.nextDouble();
        }
        for (int i=0;i<n;i++){
            System.out.println("Ingrese la cantidad de unidades vendidas del producto: "+(i+1));
            C[i]= entrada.nextInt();
        }
        System.out.println("* El total de productos vendidos en el dia fue de: "+n);
        for (int i=0;i<n;i++){
            int s=C[i];
            cont= cont + (B[i]*s);
               
        }
        System.out.println("* El total de ingresos por ventas del dia son: "+cont);
      
        for(int i=0;i<n;i++){
            if (C[i]>mayor){
                p=i;
                mayor=C[i];
  
            }
        }
        System.out.println("* El producto mas vendido es el producto "+(p+1)+" con: "+mayor+ " unidades");
        for(int i=0;i<n;i++){
            if (B[i]>pCostoso){
                x=i;
                pCostoso=B[i];
            }
        }
        System.out.println("* El producto mas costoso vendido fue el producto "+(x+1));
    }
}
