
package Modelo;


public class Circulo extends FiguraGeometrica implements ICalcular{

    public Circulo() {
        
    }

    public Circulo(double a) {
        System.out.println("Circulo");
        super(a);
    }

    @Override
    public double calcularArea() {
        return 2*Math.PI*Math.pow(this.a, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2*Math.PI*this.a;
    }
    
    
    
    
}
