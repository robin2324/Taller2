
package Vista;

import Modelo.AudioLibro;
import Modelo.Libro;
import Persistencia.ManejoArchivoTexto;
import Utilidades.ArchivoTexto;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        
        new Interfaz();
        
        /*ManejoArchivoTexto objeto = new ManejoArchivoTexto();
        ArchivoTexto archivo = new ArchivoTexto();
        Libro libro = new Libro();
        AudioLibro audioLibro = new AudioLibro();
        Scanner entrada = new Scanner(System.in);
        String idbn;
        String titulo;
        String autor;
        int anio;
        double costo;
        int nPaginas;
        int edicion;
        String isbnB;
        
        String opciones[]={"1.Insertar Publicacion", "2.Leer Publicaciones", "3.Buscar Publicacion", "4.Eliminar Publicacion", "5. Salir"};
        int seleccionPersistencia, opcion = 0,opcion1;
        
        System.out.println("Ingrese la persistencia que desea usar: ");
        System.out.println("[1]-> Archivo de texto   [2]-> Archivo binario");
        do{
            seleccionPersistencia = entrada.nextInt();
        }while((seleccionPersistencia<=0)||(seleccionPersistencia>2));
            
            do{
                if (seleccionPersistencia==1){
            System.out.println("\n[   MENU DE OPCIONES  ]\n");
            System.out.println("1.Insertar Publicacion");
            System.out.println("2.Leer Publicaciones");
            System.out.println("3.Buscar Publicacion");
            System.out.println("4.Eliminar Publicacion");
            System.out.println("5.Salir");
            System.out.println("\nElija una opcion: ");
            do{
                opcion = entrada.nextInt();
            }while((opcion<=0)||(opcion>5));
            if(opcion==1){
                        objeto.CrearArchivo();
                        archivo.ingresarDatos();
                      
                        /*System.out.println("Ingrese el tipo de libro que desea ingresar: [1]->Libro  [2]-> Audio Libro");
                        opcion1 = entrada.nextInt();
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
                            objeto.AsignarDatos(opcion1, idbn, titulo, autor, anio, costo, nPaginas, edicion, 0, 0, "N/A");
        }if (opcion==2){
            archivo.mostrarLibro();
            
        }if(opcion==3){
                
                archivo.BusquedaLibro();
        }
        
    }    
    }while(opcion!=5);
}
}
    
    /*public void crearLibro(int n){
        Scanner entrada = new Scanner(System.in);
        if(n==1){
            Libro libro = new Libro();
            System.out.println("Ingrese el isbn: ");
            
            
            */
        }
    }

