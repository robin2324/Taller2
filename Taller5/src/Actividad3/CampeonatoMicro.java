
package Actividad3;

import java.util.Scanner;

public class CampeonatoMicro {
    Scanner entrada = new Scanner (System.in);
    int a[]= new int [3];
    private int [] equipos;
    private String nombreEquipo;
    private String ciudad;
    private String nombreTecnico;
    private int noInscripcion;
    private int jugadores;
    private String [] nombreJugador= new String [20];
    private int [] edad= new int [20];
    private String [] posicion= new String [20];
    
    
    
    
    public CampeonatoMicro(String nombreEquipo, String ciudad, String nombreTecnico, int noInscripcion, int jugadores, String [] nombreJugador, int [] edad, String [] posicion){
        super();
        this.nombreEquipo = nombreEquipo;
        this.ciudad = ciudad;
        this.nombreTecnico = nombreTecnico;
        this.noInscripcion = noInscripcion;
        this.nombreJugador = nombreJugador;
        this.edad = edad;
        this.posicion = posicion;
    }
    
    public int getJugadores(){
        return jugadores;
    }
    
    public void setJugadores(int jugadores){
        this.jugadores= jugadores;
    }
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNombreTecnico() {
        return nombreTecnico;
    }

    public void setNombreTecnico(String nombreTecnico) {
        this.nombreTecnico = nombreTecnico;
    }

    public int getNoInscripcion() {
        return noInscripcion;
    }

    public void setNoInscripcion(int noInscripcion) {
        this.noInscripcion = noInscripcion;
    }

    public String getNombreJugador() {
        return nombreJugador [20];
    }

    public void setNombreJugador(String [] nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public int getEdad() {
        return edad [20];
    }

    public void setEdad(int [] edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion [20];
    }

    public void setPosicion(String [] posicion) {
        this.posicion = posicion;
    }

    public int[] getEquipos() {
        return equipos;
    }

    public void setEquipos(int[] equipos) {
        this.equipos = equipos;
    }
    
    
   
    
    public void mostrarDatos(){
        System.out.print("");
        System.out.println("El nombre del equipo es: "+nombreEquipo);
        System.out.println("La ciudad del equipo es: "+ciudad);
        System.out.println("El nombre del tecnico es: "+nombreTecnico);
        System.out.println("El numero de inscripcion es: "+noInscripcion);
        //System.out.println("Numero de jugadores del equipo: "+jugadores);
        for (int i=0; i<jugadores;i++){
            System.out.println("El nombre del jugador "+(i+1)+" es: "+nombreJugador[i]);
            System.out.println("La edad del jugador "+(i+1)+" es: "+edad[i]);
            System.out.println("La posicion donde juega el jugador "+(i+1)+" es: "+posicion[i]);
            
        }
    }
    
    
    
    public void nominaJugadores(){
        for (int i=0;i<jugadores;i++){
            System.out.println("El nombre del jugador "+(i+1)+" es: "+nombreJugador[i]);
            System.out.println("La edad del jugador "+(i+1)+" es: "+edad[i]);
            System.out.println("La posicion donde juega el jugador "+(i+1)+" es: "+posicion[i]);
        }
    }
    

    
    
    
    
}
