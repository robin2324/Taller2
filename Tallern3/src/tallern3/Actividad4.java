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
public class Actividad4 {
    public static void main(String[] args){
        Scanner entrada= new Scanner(System.in);
        int n;
        double tarifaExtra=1.5,t,sueldo,sueldof;
        double sueldoBruto;
        String aux;
        int var=40,x;
        
        System.out.println("Ingrese el numero de empleados");
        n=entrada.nextInt();
        
        String [] E=new String[n];
        int [] H= new int[n];
        double [] T= new double[n];
        
        for (int i=0;i<n;i++){
            System.out.println("Ingrese el nombre del empleado: "+(i+1));
            aux= entrada.next();
            E[i]=aux;
            
        }
        for (int i=0;i<n;i++){
            System.out.println("Ingrese el numero de horas trabajadas a la semana del empleado: "+(i+1));
            H[i]= entrada.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println("Ingrese la tarifa por hora trabajada del empleado: "+(i+1));
            T[i]= entrada.nextDouble();
           
        }
        for(int i=0;i<n;i++){
            if (H[i]<=var){
                sueldo=H[i]*T[i];
                sueldoBruto= sueldo*52;
                System.out.println("* El sueldo bruto del trabajador "+(i+1)+" es: "+sueldoBruto);
            }
            
            
            if (H[i]>var){
                x=(var-H[i])*-1;
                //System.out.println("- El trabajador "+(i)+ " tuvo "+x+" horas extras ");
                sueldof=((H[i]-x)* T[i])+(x*(tarifaExtra*T[i]));
                //System.out.println(sueldof);
                sueldoBruto= sueldof*52;
                System.out.println("* El sueldo bruto del trabajador "+(i+1)+" con "+x+" horas extras es: "+sueldoBruto);
            }
        }
        
        
    }
}
