
package Ejercicio3Modelo;

import Ejercicio3Modelo.*;

public class ProfesorInterino extends Profesor {
        String hora;

    public ProfesorInterino() {
        
    }

    public ProfesorInterino(String hora, String fecha, String nombre, int id) {
        super(fecha, nombre, id);
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "El profesor interino 1 se incorporo en la fecha: " + super.fecha + " "+ hora+" (test2)";
    }
    
}
