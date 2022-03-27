
package Actividad2;

import java.util.Scanner;


public class Resultado {
    public static void main (String [] args){
        
    
    Scanner entrada= new Scanner(System.in);
    String op;
    
    Cuenta cc = new Cuenta();
    
    cc.datosCuenta();
    cc.datosCliente();
    cc.datosSaldo();
    
    System.out.println("Digite C(consignar) si desea consignar o R(retirar) si desea retirar: ");
    op=entrada.next();
    
    if (op.equals("C")){
        cc.consignar();
    }else{
        cc.retirar();
    }
    
    cc.mostarResultados();
    
    
    }
}
