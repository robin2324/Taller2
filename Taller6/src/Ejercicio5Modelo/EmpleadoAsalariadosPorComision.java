
package Ejercicio5Modelo;


public class EmpleadoAsalariadosPorComision extends Empleado {
    private double porcentaje;
    private int ventas;
    double salario;
    
    public EmpleadoAsalariadosPorComision() {
    }

    public EmpleadoAsalariadosPorComision(double porcentaje, int ventas, int horas, double sueldo) {
        super(horas, sueldo);
        this.porcentaje = porcentaje;
        this.ventas = ventas;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }
    
    
    
    public double CalcularSalario(){
        double x;
        
        x = super.getSueldo()*0.1;
        
        salario = (super.getSueldo()+x) + (ventas*porcentaje);
        
        
        return salario;
        
    }

    @Override
    public String toString() {
        return "Empleado asalariados por comision "+"con sueldo = "+salario;
    }
    
    
    
    
}
