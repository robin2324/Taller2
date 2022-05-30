
package Ejercicio5Modelo;

import java.util.Scanner;


public class CapacidadLimite {
    
    int pasajero;
    int van;
    String [] respuesta;

    public CapacidadLimite() {
    }

    public CapacidadLimite(int pasajero, int van, String[] respuesta) {
        this.pasajero = pasajero;
        this.van = van;
        this.respuesta = respuesta;
    }

    public int getPasajero() {
        return pasajero;
    }

    public void setPasajero(int pasajero) {
        this.pasajero = pasajero;
    }

    public int getVan() {
        return van;
    }

    public void setVan(int van) {
        this.van = van;
    }

    public String[] getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String[] respuesta) {
        this.respuesta = respuesta;
    }
    
    
    public String limite(int n){
        
        int limite = 4;
        String respu="null";
        if (n > limite)
        {
            respu = " --- EXCEDIO EL LIMITE DE PASAJEROS ---";
        }else
        {
            respu = " --- PASAJEROS ESTABLES ---";
        }
        return respu;
       
    }
    
    
    public String van(int n){
        
        String van="null";
        int limite = 6;
        if (n > limite)
        {
            van = " --- EXCEDIO EL LIMITE DE PASAJEROS ---";
        }else
        {
            van = " --- PASAJEROS ESTABLES --- ";
        }
        return van;
        
    }
    
    public String motocicleta(int n){
        
        int limite = 2;
        String respu="null";
        if (n > limite)
        {
            respu = " --- EXCEDIO EL LIMITE DE PASAJEROS  ---";
        }else
        {
            respu = " --- PASAJEROS ESTABLES ---";
        }
        return respu;
    }
    
    public void camion(int x){
        
        Scanner entrada = new Scanner(System.in);
        int limite = 4;
        int n;
        respuesta = new String[x];
        for (int i=1; i<=x; i++)
        {
            System.out.println("Cuantos pasajeros van en su camion: ");
            n = entrada.nextInt();
            if (n > limite)
            {
                respuesta[i-1] = " --- EXCEDIO EL LIMITE DE PASAJEROS ---";
            }else
            {
                respuesta[i-1] = " --- PASAJEROS ESTABLES ---";
            }
        }
        
        
    }
    
    
    public void mostrarCamion(int x){
        
        for (int i=1; i<=x;i++){
            
            System.out.println("\n --- Camion # " + i +" ---");
            System.out.println(respuesta[i-1]);
            
        }
        
        
    }
    
    
    
}
