
package Modelo;


public class Rectangulo extends FiguraGeometrica implements ICalcular{
    private double b;

    public Rectangulo() {
    }

    public Rectangulo(double b, double a) {
        System.out.println("Rectangulo");
        super(a);
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double calcularArea() {
        return this.a*this.b;
    }

    @Override
    public double calcularPerimetro() {
        return (this.a*2)+(this.b*2);
    }

    
    
    
    
    
}
