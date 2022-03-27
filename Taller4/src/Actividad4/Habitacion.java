
package Actividad4;


public class Habitacion {
    double largo;
    double ancho;
    double altura;
    
    double enchape;
    double tapizado;
    
    public void setLargo(double largo){
        this.largo=largo;
    }
    
    public double getLargo(){
        return largo;
    }
    
    public void setAncho(double ancho){
        this.ancho=ancho;
    }
    
    public double getAncho(){
        return ancho;
    }
    
    public void setAltura(double altura){
        this.altura=altura;
    }
    
    public double getAltura(){
        return altura;
    }
    
    
    
    public void calcularEnchape(){
        enchape= largo*ancho;
    }
    
    public void caluclarTapizado(){
        tapizado=altura*ancho;
    }
    
    
    public void mostrarResultados(){
        
        System.out.println("El total de metros cuadrados para enchapar el piso es: "+enchape);
        System.out.println("El total de metros cuadrados para tapizar las paredes es: "+tapizado);
        
        
        
    }
    
    
    
}
