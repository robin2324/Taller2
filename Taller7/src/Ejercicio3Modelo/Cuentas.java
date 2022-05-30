
package Ejercicio3Modelo;


public abstract class Cuentas {
    
    int numCuenta;
    String nombre;
    double saldo;

    public Cuentas() {
    }

    public Cuentas(int numCuenta, String nombre, double saldo) {
        this.numCuenta = numCuenta;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    public abstract void consultar();
    public abstract void depositar();
    public abstract void retirar();
    
    
    
    
    
    
}
