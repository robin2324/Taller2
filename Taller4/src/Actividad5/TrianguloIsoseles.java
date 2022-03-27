
package Actividad5;


public class TrianguloIsoseles {
    private double base;
    private double altura;
    double area;
    double x;
    double longitudLados;
    double perimetro;
    
    
    
    public void setBase (double base){
        this.base=base;
    }
    
    public double getBase(){
        return base;
    }
    
    public void setAltura (double altura){
        this.altura=altura;
    }
    
    public double getAltura (){
        return altura;
    }
    
    public void calcularArea (double base, double altura){
        area= (base*altura)/2;
    }
    
    public void calcularLongitud(double base, double altura){
        x= Math.pow((base/2),2)+Math.pow(altura,2);
        longitudLados= Math.sqrt(x);
              
    }
    
    public void calcularPerimetro (double base, double altura){
        perimetro= 2*longitudLados+ base;
    }
    
    public void mostrarResultados(){
        System.out.println("El area del triangulo isoseles es: "+area);
        System.out.println("La longitud de los lados del triangulo isoseles es: "+longitudLados);
        System.out.println("El perimetro del triangulo isoseles es: "+perimetro);
    }
    
    
    
}
