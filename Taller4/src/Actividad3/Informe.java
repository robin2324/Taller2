
package Actividad3;

import java.util.Scanner;


public class Informe {
    Scanner entrada= new Scanner (System.in);
    int [] meses= new int [12] ;
    double mayor=0;
    double menor=0;
    double sum=0;
    double prom=0;
    int a;
    int b;
    
    public Informe (int mayor,int menor, double sum, double prom){
        
        this.mayor=mayor;
        this.menor=menor;
        this.sum=sum;
        this.prom=prom;
        
        
    }

    public int llenarMeses(){
        System.out.println("INGRESO DE VENTAS DEL AÑO");
        for (int i=0;i<12;i++){
            System.out.println("Ingrese las ventas del mes "+(i+1)+" : ");
            meses[i]=entrada.nextInt();
        }
        return meses[11];
    }
    
    
    public double sumar(){
        for (int i=0;i<12;i++){
        sum+=meses[i];
    }
        
        return sum;
    }
    
    public double mayor(){
        for (int i=0;i<12;i++){
            
            if (meses[i]>mayor)
                mayor = meses[i];
            
       
    }
        return mayor;
    }  
            
    
    public double menor(){
        for (int i=0;i<12;i++){
            if (meses[i]<menor)           
                menor=meses[i];
           
        
    }
        return menor;
    }
    
    public void promedio(){
        prom=sum/12;
    }
    
    
    
    public void mostrarDatos(){
        System.out.println("Las ventas en los meses son: ");
        
        for(int i=0;i<12;i++){
            System.out.println("Ventas del mes "+(i+1)+" : "+meses[i]);
        }
        
        System.out.println("El promedio de ventas es: "+prom);
        System.out.println("La menor venta en un mes es de: "+(menor));
        System.out.println("La mayor venta en un mes es de: "+(mayor));
        System.out.println("El acumulado de ventas es: "+sum);
    }

   
   
}
