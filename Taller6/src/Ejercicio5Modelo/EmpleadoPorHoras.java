
package Ejercicio5Modelo;


public class EmpleadoPorHoras extends Empleado{

    double salario;
    
    
    public EmpleadoPorHoras() {
    }

    public EmpleadoPorHoras(int horas, double sueldo) {
        super(horas, sueldo);
    }

    
    

    public double CalcularSueldo(){
        
        int h;
        
        if (super.getHoras()>40){
            h = super.getHoras()-40;
            
            salario = ((40*super.getSueldo())+(h*(super.getSueldo()+0.5)));
        }else{
            salario = super.getHoras() * super.getSueldo();
        }
        
        
        
     return salario;   
    }

    @Override
    public String toString() {
        return "Empleado por horas "+"con sueldo = "+salario;
    }
    
  
    
    
}
