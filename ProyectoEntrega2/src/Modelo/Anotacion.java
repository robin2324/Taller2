
package Modelo;

import java.util.Scanner;

public class Anotacion extends Bitacora{
    
    public Anotacion(String[] fecha, String[] observacion) {
        super(fecha, observacion);
    }

    public Anotacion() {
    }

    public String[] getFecha() {
        return fecha;
    }

    public void setFecha(String[] fecha) {
        this.fecha = fecha;
    }

    public String[] getObservacion() {
        return observacion;
    }

    public void setObservacion(String[] observacion) {
        this.observacion = observacion;
    }

    @Override
    public void setBitacora(int n) {
        fecha = new String[n];
        observacion = new String[n];
        Scanner entrada = new Scanner(System.in);
        for (int i=1; i<=n; i++)
        {
            System.out.println("fecha: ");
            fecha[i-1] = entrada.nextLine();
            System.out.println("observacion: ");
            observacion[i-1] = entrada.nextLine();
            i++;
            break;
        }
    }
    
    
    public void mostrarBit(int n) {
        System.out.println("");
        String fech1 = "n";
        String observac1= "n";
        int x=1;
        for (int i=x; i<=n; i++)
        {
            fech1 = fecha[i-1];
            observac1 = observacion[i-1];
            x++;
            break;
        }
        System.out.println("fecha: " + fech1 
                + "\nobservacion: " + observac1);
    }

}
