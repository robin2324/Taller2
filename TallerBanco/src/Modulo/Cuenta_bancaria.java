
package Modulo;

import java.util.Scanner;


public class Cuenta_bancaria {
    Scanner entrada = new Scanner(System.in);
    private int[] n_cuenta = new int[100];
    private String[] tipo = new String[100];
    private int[] saldo = new int[100];
    Titular titular = new Titular();
    int consulta; 
    int[] x = new int [100];
    int y=1,n1=0;
    int z=1;
    int n2,n3;
    

    public Cuenta_bancaria() {
    }

    public int[] getN_cuenta() {
        return n_cuenta;
    }

    public void setN_cuenta(int[] n_cuenta) {
        this.n_cuenta = n_cuenta;
    }

    public String[] getTipo() {
        return tipo;
    }

    public void setTipo(String[] tipo) {
        this.tipo = tipo;
    }

    public int[] getSaldo() {
        return saldo;
    }

    public void setSaldo(int[] saldo) {
        this.saldo = saldo;
    }

    public void Apertura(int n)
    {   
        
        for(int s=1; s<=n;s++){
        System.out.println("Ingrese cuantas cuentas desea crear en la sede #"+s+" (MAXIMO 10): ");
        do{
        x[s]= entrada.nextInt();
        n3++;
        }while(x[s]>10);
        n1=n1+x[s];
        n2=n1;
        for (int i=y; i<=n1; i++)
        {    
            System.out.println("");
            titular.crearTitular(i);
            System.out.println("Ingresa su numero de cuenta: ");
            n_cuenta[i] = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Ingrese el tipo de cuenta: ");
            System.out.println("- Ahorro");
            System.out.println("- Corriente");
            tipo[i] = entrada.nextLine();
            System.out.println("Ingrese el saldo inicial:");
            saldo[i] = entrada.nextInt();
            y++;
            System.out.println("");
        }    
    }
    }

    public void mostrarCuentasPorCodigo(){
        int encon=0;
        System.out.println("");
        System.out.println("Ingrese el numero de cuenta que desea consultar: ");
        consulta = entrada.nextInt();
        for (int i=1; i<=n1;i++){
            if (consulta == n_cuenta[i]){
                System.out.println("");
                titular.mostrandoTitulares(i);
                System.out.println("Tipo de cuenta: "+tipo[i]);
                System.out.println("Saldo inicial: "+saldo[i]);
                System.out.println("");
                encon=1;
            }
        }
        if (encon==0){
            System.out.println("");
            System.out.println("NO EXISTE ESE NUMERO DE CUENTA");
            System.out.println("");
        }
    }
    
    public void prueba(int n){
        int p = 1;
        if (n==1){
            for (int i=1;i<=x[p];i++){
                System.out.println("");
                titular.Titulares(i);
                System.out.println("Tipo de cuenta: "+tipo[i]);
                System.out.println("Saldo inicial: "+saldo[i]);
                System.out.println("");
                
            }
        }
        
        
        
    }
    
     
      
    
}
