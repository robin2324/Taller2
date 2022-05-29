
package Ejercicio2Modelo;

import java.util.Scanner;


public class Autobuses extends Vehiculo{
    
    Scanner entrada = new Scanner(System.in);
    
    private double preKilo;
    private double cantKillRenta;
    private double cantKillDevol;
    private int numAcientos;
    private double precio;

    public Autobuses() {
    }

    public Autobuses(double preKilo, double cantKillRenta, double cantKillDevol, int numAcientos, double precio, String matricula, String modelo) {
        super(matricula, modelo);
        this.preKilo = preKilo;
        this.cantKillRenta = cantKillRenta;
        this.cantKillDevol = cantKillDevol;
        this.numAcientos = numAcientos;
        this.precio = precio;
    }

    public double getPreKilo() {
        return preKilo;
    }

    public void setPreKilo(double preKilo) {
        this.preKilo = preKilo;
    }

    public double getCantKillRenta() {
        return cantKillRenta;
    }

    public void setCantKillRenta(double cantKillRenta) {
        this.cantKillRenta = cantKillRenta;
    }

    public double getCantKillDevol() {
        return cantKillDevol;
    }

    public void setCantKillDevol(double cantKillDevol) {
        this.cantKillDevol = cantKillDevol;
    }

    public int getNumAcientos() {
        return numAcientos;
    }

    public void setNumAcientos(int numAcientos) {
        this.numAcientos = numAcientos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public void cap_datos() {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa la matricula: ");
        matricula = entrada.nextLine();
        System.out.println("Ingrese el modelo: ");
        modelo = entrada.nextLine();
        System.out.println("Precio del kilometro: ");
        preKilo = entrada.nextDouble();
        System.out.println("Ingrese el numero de acientos: ");
        numAcientos = entrada.nextInt();
        
    }

    @Override
    public void alquiler() {
        
        boolean alquiler = true;
        int val;
        while(alquiler != false)
        {
            System.out.println("\nque desea? "
                + "\n1. alquilar" + "\n2. devolver");
            val = entrada.nextInt();
            switch (val)
            {
                case 1:                    
                    alquiler = true;
                    System.out.println("cantidad de kilometrosl al alquilar: ");
                    cantKillRenta = entrada.nextDouble();
                    System.out.println("cantidad de kilometrosl al devolver:");
                    cantKillDevol = entrada.nextDouble();
                    System.out.println("--- autobus alquilado ---");
                    break;
                case 2: 
                    alquiler = false;
                    System.out.println("--- autobus devuelto ---");
                    precio = (cantKillDevol - cantKillRenta) * preKilo;    
            }
        } 
    }

    @Override
    public void mostrar() {
        
        System.out.println("\nmatricula: " + matricula);
        System.out.println("modelo: " + modelo);
        System.out.println("numero de acientos: " + numAcientos);
        System.out.println("valor a pagar: " + precio);
        
        
    }
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    

