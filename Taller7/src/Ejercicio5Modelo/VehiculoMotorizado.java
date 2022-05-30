
package Ejercicio5Modelo;


public class VehiculoMotorizado {
    
    String fabricante;
    String modelo;
    String añoFabrica;
    double kilometraje;

    public VehiculoMotorizado() {
    }

    public VehiculoMotorizado(String fabricante, String modelo, String añoFabrica, double kilometraje) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.añoFabrica = añoFabrica;
        this.kilometraje = kilometraje;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAñoFabrica() {
        return añoFabrica;
    }

    public void setAñoFabrica(String añoFabrica) {
        this.añoFabrica = añoFabrica;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }
    
    
    
    
    
    
    
    
    
}
