
package Modelo;


public class Sospechosos extends Oficina{
    int id;
    String nombre;
    String alias;
    int edad;


    public Sospechosos(int id, String nombre, String alias, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.alias = alias;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public String toString() {
        return "\nid: " + this.getId() +
                "\nnombre: " + this.getNombre() +
                "\nalias: " + this.getAlias() +
                "\nedad: " + this.getEdad();
    }
    
    
}
