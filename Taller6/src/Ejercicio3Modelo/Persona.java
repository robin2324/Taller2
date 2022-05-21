
package Ejercicio3Modelo;


public class Persona {
     String nombre;
    int id;

    public Persona() {
    }

    public Persona(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return "" + nombre + " con id de profesor = Prof " + id;
    }
}
