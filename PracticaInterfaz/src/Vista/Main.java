
package Vista;

import Modelo.*;

public class Main {
    public static void main(String[] args) {
        
        ICalcular circulo = new Circulo(2);
        imprimirFiguras(circulo);
        
        Cuadrado cuadrado = new Cuadrado(5);
        imprimirFiguras(cuadrado);
        
        FiguraGeometrica rectangulo = new Rectangulo(4, 3);
        imprimirFiguras((ICalcular) rectangulo);
        
    }
    public static void imprimirFiguras(ICalcular f){
        System.out.println("Area: "+f.calcularArea());
        System.out.println("Perimetro: "+f.calcularPerimetro());
        System.out.println("---------------------------\n");
    }
    
}
