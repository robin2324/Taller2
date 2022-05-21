
package Ejercicio5Vista;

import Ejercicio5Modelo.*;

public class Main {
    public static void main(String[] args) {
        
        EmpleadoAsalariados e1 = new EmpleadoAsalariados(40,200);
        EmpleadoPorHoras e2 = new EmpleadoPorHoras(44,2);
        EmpleadoPorComision e3 = new EmpleadoPorComision(2,40,2);
        EmpleadoAsalariadosPorComision e4 = new EmpleadoAsalariadosPorComision(2.5,3,35,200);
        
        System.out.println(e1);
        e2.CalcularSueldo();
        System.out.println(e2);
        e3.CalcularSalario();
        e3.CalcularSalarioMasComision();
        System.out.println(e3);
        e4.CalcularSalario();
        System.out.println(e4);
        
        
    }
}
