
package Modulo;

import java.util.Scanner;


public class Banco {
    Scanner entrada = new Scanner(System.in);
    String nombre;
    int max_sedes;
    Sede sede = new Sede();
    Cuenta_bancaria cuenta = new Cuenta_bancaria();
    
    
    public Banco() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMax_sedes() {
        return max_sedes;
    }

    public void setMax_sedes(int max_sedes) {
        this.max_sedes = max_sedes;
    }
    
    public int crearBanco()
    {
        System.out.println("");
        System.out.println("Ingrese el nombre del banco: ");
        nombre = entrada.nextLine();     
        System.out.println("Ingrese el numero de sedes del banco (MAXIMO 10):");
        do{
        max_sedes = entrada.nextInt();
        }while(max_sedes>10);
        entrada.nextLine();
        System.out.println("");
        return max_sedes;
    }
    
    public void crearSedes()
    {
        System.out.println("---BANCO " + nombre + " ---");
        sede.crearSedes(max_sedes);
    }
    
    
    public void crearCuenta()
    {
        System.out.println("---BANCO " + nombre + " ---");
        cuenta.Apertura(max_sedes);
    }
    
    public void consultaPorcodigo()
    {
        System.out.println("---BANCO " + nombre + " ---");
        sede.consultarPorCodigo(max_sedes);
        
        
    }
    
    
    public void mostrarCuentas()
    {
        System.out.println("---BANCO " + nombre + " ---");
        cuenta.mostrarCuentasPorCodigo();
    }
    
    
    public void listaSede(){
        System.out.println("---BANCO " + nombre + " ---");
        sede.listadoSedes(max_sedes);
        
    }
    
    
}

