
package Ejercicio5Modelo;


public class Empleado {
    private int horas;
    private double sueldo;

    public Empleado() {
    }

    public Empleado(int horas, double sueldo) {
        this.horas = horas;
        this.sueldo = sueldo;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "horas=" + horas + ", sueldo=" + sueldo + '}';
    }

    
    
    
    
    
}
