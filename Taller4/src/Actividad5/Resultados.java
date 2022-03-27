
package Actividad5;


public class Resultados {
    public static void main(String [] args){
        TrianguloIsoseles op= new TrianguloIsoseles();
        
        
        op.setAltura(12);
        System.out.println("La altura del triangulo isoseles es: "+op.getAltura());
        op.setBase(8);
        System.out.println("La base del triangulo isoseles es: "+op.getBase());
        
        op.calcularArea(8, 12);
        op.calcularLongitud(8, 12);
        op.calcularPerimetro(8, 12);
        op.mostrarResultados();
        
        
    }
    
}
