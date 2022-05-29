
package Ejercicio4Vista;

import Ejercicio4Modelo.*;
//import Ejercicio4Modelo.FiguraGeometrica;
import java.util.Scanner;


public class main1 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        double intercambio;
        int op;
        int cont=0;
        double a,b,c,d=0,e,f,g,h,i,j,k,l,m,n;
        
        
        System.out.println("INGRESE EL RADIO DEL CIRCULO: ");
        a = entrada.nextDouble();
        System.out.println("INGRESE LA POSICION X: ");
        b = entrada.nextDouble();
        System.out.println("INGRESE LA POSICION Y: ");
        c = entrada.nextDouble();
        
        FiguraGeometrica cir = new Circulo(a,b,c);
        
        System.out.println("INGRESE LA ALTURA DEL RECTANGULO: ");
        d = entrada.nextDouble();
        System.out.println("INGRESE LA ANCHURA DEL RECTANGULO");
        e = entrada.nextDouble();
        System.out.println("INGRESE LA POSICION X: ");
        f = entrada.nextDouble();
        System.out.println("INGRESE LA POSICION Y: ");
        g = entrada.nextDouble();
        
        FiguraGeometrica rec = new Rectangulo(d,e,f,g);
        
        System.out.println("----- ATRIBUTOS DE LAS FIGURAS ----");
        System.out.println(cir);
        System.out.println("");
        System.out.println(rec);
        
        System.out.println("\n CIRCULO: ");
        System.out.println("INGRESE LA NUEVA COORDENADA DE X: ");
        i= entrada.nextDouble();
        System.out.println("INGRESE LA NUEVA COORDENADA DE Y: ");
        j = entrada.nextDouble();
        System.out.println("\n RECTANGULO: ");
        System.out.println("INGRESE LA NUEVA COORDENADA DE X: ");
        k = entrada.nextDouble();
        System.out.println("INGRESE LA NUEVA COORDENADA DE Y: ");
        l = entrada.nextDouble();
        intercambio = d;
        //e = d;
        
        
        
        System.out.println("----- INFORMACION CON MANIPULACIONES -----");
        System.out.println("CIRCULO: ");
        System.out.println("RADIO: "+a);
        System.out.println("POSICION X: "+i);
        System.out.println("POSICION Y: "+j);
        System.out.println("AREA: "+cir.getArea());
        System.out.println("");
        System.out.println("RECTANGULO: ");
        System.out.println("ALTURA: "+e);
        System.out.println("ANCHURA: "+d);
        System.out.println("POSICION X: "+k);
        System.out.println("POSICION Y: "+l);
        System.out.println("AREA: "+rec.getArea());
        
    }
}
