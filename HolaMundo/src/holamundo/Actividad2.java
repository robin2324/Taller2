/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holamundo;

/**
 *
 * @author USUARIO
 */
public class Actividad2 {
    public static void main(String[] args){
        double n1=1,n2=2,n3=3;
        double producto,cociente,modulo;
        
        producto=n1*n2*n3;
        
        cociente=n1/n2/n3;
        
        modulo= n1%n2%n3;
        
        System.out.printf("Numero 1 = %f\n",n1);
        System.out.printf("Numero 2 = %f%n",n2);
        System.out.printf("Numero 3 = %f%n",n3);
        System.out.printf("La suma de %.2f + %.2f + %.2f es = %.2f%n ",n1,n2,n3,(n1+n2+n3));
        System.out.printf("El promedio de %.2f, %.2f y %.2f es = %.2f%n",n1,n2,n3,((n1+n2+n3)/3));
        System.out.printf("El producto de los numeros es = %.2f%n",+producto);
        System.out.printf("El cociente de los numeros es = %.2f%n ",+cociente);
        System.out.printf("El modulo de los numeros es = %.2f%n",+modulo);
    }
}
