
package Ejercicio2Modelo;


public class Oficial extends Operario {

    public Oficial() {
    }

    public Oficial(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return super.toString()+" -> Oficial";
    }
    
    
    
    
}
