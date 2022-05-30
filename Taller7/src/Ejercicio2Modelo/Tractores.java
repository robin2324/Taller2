
package Ejercicio2Modelo;

import java.util.Scanner;


public class Tractores extends Vehiculo{
    
    
    Scanner entrada = new Scanner(System.in);
    
    private double preciDia;
    private String fechaRect;
    private String fechaDevol;
    private String trabajo;
    private int dias;
    private double pago;

    public Tractores() {
    }

    public Tractores(double preciDia, String fechaRect, String fechaDevol, String trabajo, int dias, double pago, String matricula, String modelo) {
        super(matricula, modelo);
        this.preciDia = preciDia;
        this.fechaRect = fechaRect;
        this.fechaDevol = fechaDevol;
        this.trabajo = trabajo;
        this.dias = dias;
        this.pago = pago;
    }

    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }

    public double getPreciDia() {
        return preciDia;
    }

    public void setPreciDia(double preciDia) {
        this.preciDia = preciDia;
    }

    public String getFechaRect() {
        return fechaRect;
    }

    public void setFechaRect(String fechaRect) {
        this.fechaRect = fechaRect;
    }

    public String getFechaDevol() {
        return fechaDevol;
    }

    public void setFechaDevol(String fechaDevol) {
        this.fechaDevol = fechaDevol;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

    

    @Override
    public void cap_datos() {
        
        System.out.println("Ingresa la matricula: ");
        matricula = entrada.nextLine();
        System.out.println("Ingrese el modelo: ");
        modelo = entrada.nextLine();
        System.out.println("Precio del dia: ");
        entrada.nextLine();
        preciDia = entrada.nextDouble();
        System.out.println("Ingrese el tipo de trabajo: "
                + "\n - agricola" + "\n- industrial\n");
        trabajo = entrada.nextLine();
        
        
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
                    System.out.println("Dias transcurridos desde el dia de la renta: ");
                    dias = entrada.nextInt();
                    System.out.println("\n--- Tractor alquilado ---");
                    break;
                case 2: 
                    alquiler = false;
                    pago = dias * preciDia;
                    System.out.println("\n--- Tractor devuelto ---");
                    break;
            }
        }
        
        
        
    }

    @Override
    public void mostrar() {
        
        System.out.println("\nmatricula: " + matricula);
        System.out.println("Modelo: " + modelo);
        System.out.println("Tipo de trabajo: " + trabajo);
        System.out.println("Valor a pagar: " + pago);
        
    }
    
    
    
    
    
    
    
    
}
