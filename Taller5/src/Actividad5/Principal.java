
package Actividad5;


public class Principal {
    public static void main(String[] args){
        
        Punto p1 = new Punto();
        System.out.println("Distancia 1: "+p1.calcularDistancia(20, 11));
        
        Punto p2 = new Punto();
        System.out.println("Distancia 2: "+p2.calcularDistancia(15, 5));
        
        Punto p3 = new Punto();
        Punto p = new Punto(18,18);
        System.out.println("Distancia 3: "+p3.calcularDistancia(p));
        
        Punto p4 = new Punto(5);
        System.out.println("Distancia 4: "+p4.calcularDistancia(9));
        
        
    }
    
    
}
