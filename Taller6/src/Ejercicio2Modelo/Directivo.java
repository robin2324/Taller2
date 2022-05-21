
package Ejercicio2Modelo;


public class Directivo extends Empleado{

    public Directivo() {
    }

    public Directivo(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Empleado "+super.getNombre()+" -> "+"Directivo";
    }
    
    
    
    
    
    
}
