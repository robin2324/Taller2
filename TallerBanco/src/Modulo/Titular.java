
package Modulo;

import java.util.Scanner;


public class Titular {
    Scanner entrada = new Scanner(System.in);
    private int[] cc = new int [10];
    private String[] nombre = new String [10] ;
    private String[] sexo = new String [10] ;
    int x=1;
    int y=1;
    int z=0;

    public Titular() {
    }

    public Titular(int[] cc, String[] nombre, String[] sexo) {
        this.cc = cc;
        this.nombre = nombre;
        this.sexo = sexo;
    }

    public int[] getCc() {
        return cc;
    }

    public void setCc(int[] cc) {
        this.cc = cc;
    }

    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }

    public String[] getSexo() {
        return sexo;
    }

    public void setSexo(String[] sexo) {
        this.sexo = sexo;
    }

   
    
    public void crearTitular(int n){
       
        for (int i=x;i<=n;i++){
            System.out.println("Ingrese el numero de cedula del titular: ");
            cc [i]= entrada.nextInt();
            entrada.nextLine();
            System.out.println("Ingrese el nombre del titular: ");
            nombre[i]= entrada.nextLine();
            System.out.println("Ingrese el sexo del titular: ");
            sexo[i]= entrada.nextLine();
            x++;
            
        }
       
    }
    
    public void mostrandoTitulares(int n){
        
        for(int i=n;i<=n;i++){
            System.out.println("Cedula: "+cc[i]);
            System.out.println("Nombre: "+nombre[i]);
            System.out.println("Sexo: "+sexo[i]);
            
        }
    }
    
    public void Titulares(int n){
        //n=n+n;
        for(int i=1;i<=n;i++){
            System.out.println("Cedula: "+cc[i]);
            System.out.println("Nombre: "+nombre[i]);
            System.out.println("Sexo: "+sexo[i]);
            y++;
        }
        //y=y-1;
        
    }
    
    @Override
    public String toString() {
        return "\n  cedula: " + this.getCc() +
                "\n nombre: " + this.getNombre() +
                "\n sexo: " + this.getSexo();
    }
}
