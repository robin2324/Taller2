
package Ejercicio5Modelo;


public class EmpleadoAsalariados extends Empleado {
    

    public EmpleadoAsalariados() {
    }

    public EmpleadoAsalariados(int horas, double sueldo) {
        super(horas, sueldo);
    }

    @Override
    public String toString() {
        return "Empleado Asalariados sueldo = "+super.getSueldo();
    }
    
    

    

    
    
    
}
