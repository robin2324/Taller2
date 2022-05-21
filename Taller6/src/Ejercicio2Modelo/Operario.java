
package Ejercicio2Modelo;


public class Operario extends Empleado {

    public Operario() {
    }

    public Operario(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Empleado "+super.getNombre()+" -> "+"Operario";
    }
    
    
    
    
}
