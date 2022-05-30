
package Ejercicio2Modelo;


public abstract class Vehiculo {
    
    String matricula;
    String modelo;

    public Vehiculo() {
    }

    public Vehiculo(String matricula, String modelo) {
        this.matricula = matricula;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public abstract void cap_datos();
    
    public abstract void alquiler();
    
    public abstract void mostrar();
    
    
    
}
