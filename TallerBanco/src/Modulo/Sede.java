
package Modulo;

import java.util.Scanner;


public class Sede {
    Scanner entrada = new Scanner(System.in);
    private String[] nombreSede;
    private String[] direccion;
    private String[] ciudad; 
    int[] codigo;
    int x=0;
    Cuenta_bancaria cuenta1 = new Cuenta_bancaria();

    public Sede() {
    }
    
    public Sede(String[] nombreSede, String[] direccion, String[] ciudad, int[] codigo) {
        this.nombreSede = nombreSede;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.codigo=codigo;
    }

    public String[] getNombre() {
        return nombreSede;
    }

    public void setNombre(String[] nombreSede) {
        this.nombreSede = nombreSede;
    }

    public String[] getDireccion() {
        return direccion;
    }

    public void setDireccion(String[] direccion) {
        this.direccion = direccion;
    }

    public String[] getCiudad() {
        return ciudad;
    }

    public void setCiudad(String[] ciudad) {
        this.ciudad = ciudad;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }
    
    

    public void crearSedes(int n) {
        nombreSede = new String[n];
        direccion = new String[n];
        ciudad = new String[n];
        codigo = new int[n];

        for (int i=1; i<=n; i++)
        {
            System.out.println("");
            System.out.println("Sede #" + i);
            System.out.println("Ingrese el codigo de la sede: ");
            codigo[i-1] = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Ingresa el nombre de la sede: ");
            nombreSede[i-1] = entrada.nextLine();
            System.out.println("Ingrese la direccion de la sede: ");
            direccion[i-1] = entrada.nextLine();
            System.out.println("Ingrese la ciudad de la sede: ");
            ciudad[i-1] = entrada.nextLine();
            System.out.println("");
            x++;
        }
    }
    
    public void consultarPorCodigo(int n)
    {
        
        int j=0;
        System.out.println("Ingresa el codigo de la sede que desea consultar: ");
        j = entrada.nextInt();
        
            System.out.println("");
            System.out.println("Sede #" + j);
            System.out.println("Codigo: "+codigo[j-1]);
            System.out.println("Nombre: " + nombreSede[j-1]);
            System.out.println("Direccion: " + direccion[j-1]);
            System.out.println("Ciudad: " + ciudad[j-1]);
            System.out.println("");
            System.out.println("--- CUENTAS BANCARIAS ---");
            System.out.println("");
            cuenta1.prueba(j);
            
            
    }
    

    
    public void listadoSedes(int xx){
        System.out.println("--- SEDES ---");
        for (int i=1; i<=xx; i++){
            System.out.println("");
            System.out.println("Sede #" + i);
            System.out.println("Codigo: " + codigo[i-1]);
            System.out.println("Nombre: " +nombreSede[i-1]);
            System.out.println("Direccion: " +direccion[i-1]);
            System.out.println("Ciudad: " +ciudad[i-1]);
            
            
        }
        
    }
}
