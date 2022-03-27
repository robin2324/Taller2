
package Actividad2;
import java.util.Scanner;

public class Cuenta {
    Scanner entrada= new Scanner(System.in);
    int noCuenta;
    String nombreCliente;
    double saldo;
    
    double consignar;
    double retirar;
    
    
    public void setNoCuenta(int noCuenta){
        this.noCuenta=noCuenta;
    }
    
    public int getNoCuenta(){
        return noCuenta;
    }
    
    public void setNombreCliente(String nombreCliente){
        this.nombreCliente=nombreCliente;
    }
    
    public String getNombreCliente(){
        return nombreCliente;
    }
    
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public int datosCuenta(){
        System.out.println("Ingrese el numero de cuenta: ");
        noCuenta= entrada.nextInt();
        return noCuenta;
    }
    
    public String datosCliente(){
        System.out.println("Ingrese el nombre del cliente: ");
        nombreCliente= entrada.next();
        return nombreCliente;
    }
    
    public double datosSaldo(){
        System.out.println("Ingrese el saldo de su cuenta: ");
        saldo= entrada.nextDouble();
        return saldo;
    }
    
    public double consignar(){
        System.out.println("Ingrese la cantidad a consignar: ");
        consignar= entrada.nextDouble();
        consignar= (saldo + consignar);
        return consignar;
    }
    
    public double retirar(){
        System.out.println("Ingrese la cantidad a retirar: ");
        retirar= entrada.nextDouble();
        retirar= (saldo - retirar);
        return retirar;
    }
    
    
    
    public void mostarResultados(){
        
        System.out.println("\nNumero de cuenta: "+noCuenta);
        System.out.println("Nombre del cliente: "+nombreCliente);
        if (consignar>saldo){
            System.out.println("Saldo: "+consignar);
        }else{
            System.out.println("Saldo: "+retirar);
        }
        //System.out.println("Saldo: "+saldo);
        
        
        
    }


    
    
    
    
}
