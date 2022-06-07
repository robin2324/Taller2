
package Modelo;

public class Cuadrado extends FiguraGeometrica implements ICalcular{
   

    public Cuadrado() {
    }

    public Cuadrado(double a) {
        System.out.println("Cuadrado");
        super(a);
    }

    @Override
    public double calcularArea() {
        
        return this.a*this.a;
        
    }

    @Override
    public double calcularPerimetro() {
        
        return this.a*4;
    }
    
    
    
    
    
}
