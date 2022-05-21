
package Ejercicio3Modelo;



public class Profesor extends Persona {

    String fecha;
    
    public Profesor() {
        super();
    }

    public Profesor(String fecha, String nombre, int id) {
        super(nombre, id);
        this.fecha = fecha;
    }


    @Override
    public String toString() {
        return "Profesor de nombre: " + super.toString()+"(test1)";
    }
}
