
package Actividad3;

import java.util.Scanner;

public class Principal {
    public static void main(String [] args){
        Scanner entrada= new Scanner(System.in);
        
        
    String nombreEquipo;
    String ciudad;
    String nombreTecnico;
    int noInscripcion;
    int jugadores;
    String [] nombreJugador= new String [20];
    int [] edad = new int [20];
    String [] posicion = new String [20] ;
    int n,n2,n3=0;
    int n1=0;
    do{
    System.out.println("Cuantos equipos desea inscribir en el campeonato (maximo 5): ");
    n= entrada.nextInt();
    }while (n>5);
    CampeonatoMicro op[] = new CampeonatoMicro[n];
    System.out.println("--- CAPTURA DE EQUIPOS ---");
    for (int x=0;x<n;x++){
        entrada.nextLine();
        System.out.print("");
        System.out.print("Nombre de equipo: ");
        nombreEquipo= entrada.nextLine();
        System.out.print("Ciudad: ");
        ciudad= entrada.nextLine();
        System.out.print("Nombre del tecnico: ");
        nombreTecnico= entrada.nextLine();
        System.out.print("Numero de inscripcion: ");
        noInscripcion= entrada.nextInt();
        do {
        System.out.print("Numero de jugadores que desea inscribir en el equipo (maximo 6): ");
        jugadores= entrada.nextInt();
        }while (jugadores>6);
        n2= jugadores+n3;
        
        for (int i=n1; i<n2;i++){
            entrada.nextLine();
            System.out.print("Nombre del jugador "+(i+1)+" : ");
            nombreJugador [i]= entrada.nextLine();
            System.out.print("Edad del jugador "+(i+1)+" : ");
            edad [i]=entrada.nextInt();
            System.out.print("Posicion donde juega el jugador "+(i+1)+" : ");
            posicion [i] = entrada.next();
            System.out.print("");
            n1++;
            n3++;
        }
        
    op[x]= new CampeonatoMicro(nombreEquipo, ciudad,nombreTecnico,noInscripcion,jugadores, nombreJugador , edad , posicion );
    }
    
    
    for (int i=0;i<op.length;i++){
        System.out.println("\n--- NOMINA DEL EQUIPO "+(i+1)+" ---");
        op[i].mostrarDatos();
        System.out.println("");
    }
    System.out.println("--- NOMINA JUGADORES ---");
    for (int i=0; i<n1;i++){
        System.out.println("");
        System.out.println("El nombre del jugador "+(i+1)+" es: "+nombreJugador[i]);
        System.out.println("La edad del jugador "+(i+1)+" es: "+edad[i]);
        System.out.println("La posicion donde juega el jugador "+(i+1)+" es: "+posicion[i]);
       
    }
    

        
    }


}
