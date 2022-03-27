
package Actividad6;


public class EcuacionCuadratica {
    int a;
    int b;
    int c;
    
    double determinante;
    double x1;
    double x2;
    
    
    public void setA(int a){
        this.a=a;
    }
    
    public int getA (){
        return a;
    }
    
    public void setB(int b){
        this.b=b;
    }
    
    public int getB(){
        return b;
    }
    
    public void setC(int c){
        this.c=c;
    }
    
    public int getC(){
        return c;
    }
    
    public void calcular(int a,int b,int c){
        determinante= Math.pow(b,2)-(4*a*c);
        x1= ((b*(-1) + Math.sqrt(determinante))/(2*a));
        x2= ((b*(-1) - Math.sqrt(determinante))/(2*a));
    }
    
    public void mostrarEcuacion(){
        System.out.println("La ecuacion en su forma estandar es: ax^2 + bx + c = 0");
    }
    
    public void mostrarResultados(){
        System.out.println("El valor de x1= "+x1+" y el valor de x2= "+x2);
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
