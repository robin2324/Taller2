
package Ejercicio5Modelo;


public class EmpleadoPorComision extends Empleado{
    
    private int ventas;
    double salario,salario1;

    public EmpleadoPorComision() {
    }

    public EmpleadoPorComision(int ventas, int horas, double sueldo) {
        super(horas, sueldo);
        this.ventas = ventas;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }
    
    public double CalcularSalario(){
        
        salario = super.getHoras() * super.getSueldo();
        
        return salario;
    }
    

    public double CalcularSalarioMasComision(){
        
        double x;
        
        x = ventas * super.getSueldo();
        
        salario1 = salario + x;
        
        return salario1;
        
    }

    @Override
    public String toString() {
        return "Empleado por comision "+"con sueldo = "+salario1;
    }
    
    
    
    
}
