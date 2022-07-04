
package Persistencia;

import Modelo.AudioLibro;
import Modelo.Libro;
import Modelo.Publicacion;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;


public class ManejoArchivoTexto{

    Scanner entrada = new Scanner(System.in);
    private Libro libro;
    private AudioLibro audioLibro;
    File fichero = new File("Libros.txt");
    
    public ManejoArchivoTexto() {
    }

    

    public void CrearArchivo(){
        int x=0;
        try {
            if(fichero.exists()){
                System.out.println("El archivo ya existe");
                x=1;
            }else{
                fichero.createNewFile();
                System.out.println("El archivo ha sido creado");
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    private int nPaginas;
    private int edicion;
    private double duracion;
    private double peso;
    private String formato;

    public void AsignarDatos(int n, String isbn, String titulo, String autor, int anio, double costo, int Paginas, int Edicion, double Duracion, double Peso, String format){
        
        nPaginas = Paginas;
        edicion = Edicion;
        duracion = Duracion;
        peso = Peso;
        formato = format;
        boolean excep= false;
        
        try {
            if(n==1){
                BufferedWriter fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fichero, true)));
                fescribe.write("        1            "+isbn+"         "+titulo+"                   "+autor+"                             "+nPaginas+"                    "+edicion+"                   "+peso+"                "+duracion+"                          "+formato+"                    "+costo+"  ");
                fescribe.write("\n");
                System.out.println("El libro fue insertado correctamente");
                fescribe.close();
                
            }if (n==2){
                BufferedWriter fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fichero, true)));
                fescribe.write("        2             "+isbn+"        "+titulo+"                   "+autor+"                           "+nPaginas+"                      "+edicion+"                 "+peso+"                "+duracion+"                   "+formato+"                                  "+costo+" ");
                //System.err.printf("%-15s","%-15s","%-15s","%-15s","%-15s","%-15s","%-15s","%-15s",isbn,titulo,autor,nPaginas,edicion,peso,duracion,formato);
                fescribe.write("\n");
                System.out.println("El libro fue insertado correctamente");
                fescribe.close();
            }
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public void mostrarLibros(){
        
        try {
            
           //System.out.printf("%-10s %-10s %-30s %-30s %-10s %-10s %-10s %-10s %-10s%n", "TIPO", "ISBN", "TITULO", "AUTOR", "NO PAG", "EDICION", "PESO", "DURACION", "FORMATO");
           //System.out.println("----------------------------------------");
           FileReader fr = new FileReader("Libros.txt");
           BufferedReader br = new BufferedReader(fr);
           String cadena;
           while((cadena=br.readLine())!=null){
               System.out.println(""+cadena);
           }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
    }
    
    public void buscarLibro(String n){
        String usuario = n;
        int c=0;
        try {
            System.out.printf("%-10s %-10s %-30s %-30s %-10s %-10s %-10s %-10s %-10s%n", "TIPO", "ISBN", "TITULO", "AUTOR", "NO PAG", "EDICION", "PESO", "DURACION", "FORMATO");
            System.out.println("----------------------------------------");
            BufferedReader leer= new BufferedReader(new FileReader("Libros.txt"));
            String linea="";
            while((linea=leer.readLine())!=null){
                if (linea.indexOf(usuario)!=-1){
                    System.out.println("se econtro el libro: ");
                    System.out.println(linea);
                }
                
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
    }
    
    public void eliminarLibro(String n){
        String usuario = n;
        
        try {
            BufferedReader bus = new BufferedReader(new FileReader("Libros.txt"));
            String linea ="";
            while((linea=bus.readLine())!=null){
                
                if(linea.indexOf(usuario)!=-1){
                    
                    
                }
            }
            
            
        } catch (Exception e) {
        }
        
        
        
    }
    
    
    
    
  
    
    
    
    
    
}
