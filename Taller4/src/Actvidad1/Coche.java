
package Actvidad1;


public class Coche {
    String color;
    String marca;
    String modelo;
    int numCaballo;
    int numPuerta;
    int numMatricula;
    


public Coche (String color,String marca,String modelo,int numCaballo,int numPuerta,int numMatricula){
    this.color= color;
    this.marca=marca;
    this.modelo=modelo;
    this.numCaballo=numCaballo;
    this.numPuerta=numPuerta;
    this.numMatricula=numMatricula;
    
}

public void mostrarDatos(){
    System.out.println("El color del coche es: "+color);
    System.out.println("La marca del coche es: "+marca);
    System.out.println("El modelo del coche es:  "+modelo);
    System.out.println("El numero de caballos del coche es: "+numCaballo);
    System.out.println("El numero de puertas del coche es: "+numPuerta);
    System.out.println("El numero de matricula del coche es: "+numMatricula+"\n");
}

}