
package Utilidades;

import Modelo.Libro;
import Modelo.Publicacion;
import Persistencia.ManejoArchivoTexto;
import java.util.Scanner;
import javax.print.attribute.standard.Finishings;


public class ArchivoTexto extends Publicacion{
    Scanner entrada = new Scanner(System.in);
    
    ManejoArchivoTexto ob = new ManejoArchivoTexto();
    int opcion1;

    public ArchivoTexto() {
    }
    
    
    
    public ArchivoTexto(String idbn, String titulo, String autor, int anio, double costo) {
        super(idbn, titulo, autor, anio, costo);
    }

    public int getOpcion1() {
        return opcion1;
    }

    public void setOpcion1(int opcion1) {
        this.opcion1 = opcion1;
    }

    
    
    
    
    int nPaginas,edicion;
    double duracion,peso;
    String formato;

    public int getnPaginas() {
        return nPaginas;
    }

    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
    
    
    
    public void ingresarDatos(){
        System.out.println("Ingrese el tipo de libro que desea ingresar: [1]->Libro  [2]-> Audio Libro");
        do{
        opcion1 = entrada.nextInt();
        }while((opcion1<=0)||(opcion1>2));
        try{
        if(opcion1==1){
            
            entrada.nextLine();
            System.out.println("Ingrese isbn: ");
            idbn = entrada.nextLine();
            System.out.println("Ingrese titulo: ");
            titulo = entrada.nextLine();
            System.out.println("Ingrese autor: ");
            autor = entrada.nextLine();
            entrada.nextLine();
            System.out.println("Ingrese el año: ");
            anio = entrada.nextInt();
            System.out.println("Ingrese el costo: ");
            costo = entrada.nextDouble();
            System.out.println("Ingrese el numero de paginas: ");
            nPaginas = entrada.nextInt();
            System.out.println("Ingrese la edicion: ");
            edicion = entrada.nextInt();
            ob.AsignarDatos(opcion1, idbn, titulo, autor, anio, costo, nPaginas, edicion, 0, 0, "NA");
            
    }if(opcion1==2){
        entrada.nextLine();
        System.out.println("Ingrese isbn: ");
        idbn = entrada.nextLine();
        System.out.println("Ingrese titulo: ");
        titulo = entrada.nextLine();
        System.out.println("Ingrese autor: ");
        autor = entrada.nextLine();
        entrada.nextLine();
        System.out.println("Ingrese el año: ");
        anio = entrada.nextInt();
        System.out.println("Ingrese el costo: ");
        costo = entrada.nextDouble();
        System.out.println("Ingrese la duracion (en segundos): ");
        duracion = entrada.nextDouble();
        System.out.println("Ingrese el peso (en Megabyte): ");
        peso = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Ingrese el formato: ");
        formato = entrada.nextLine();
        ob.AsignarDatos(opcion1, idbn, titulo, autor, anio, costo, 0, 0, duracion, peso, formato);
    }
        
    }catch(Exception e){
            System.out.println(e.getMessage());
    }
        
        
    }
    
    public void mostrarLibro(){
        
        ob.mostrarLibros();
    }
    
    String isbnB;
    public void BusquedaLibro(){
        System.out.println("Ingrese el isbn: ");
        isbnB = entrada.nextLine();
        ob.buscarLibro(isbnB);
        
    }
    
    
    
    
    
    @Override
    public String getDataStringFormat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getStringFormat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
