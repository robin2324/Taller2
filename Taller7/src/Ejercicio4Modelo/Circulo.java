
package Ejercicio4Modelo;

import java.util.Scanner;


public class Circulo extends FiguraGeometrica{
    
    //Scanner entrada = new Scanner(System.in);
    private double radio;
    //double a,b,c,d,e,f;

    public Circulo() {
    }

    public Circulo(double radio, double x, double y) {
        super(x, y);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

   

    @Override
    public double getArea(){
        return Math.PI*(this.radio*this.radio);
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + " Area= "+this.getArea()+" X= "+this.getX()+" Y= "+this.getY()+"}";
    }
    
    
    
}
