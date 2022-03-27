
package Actividad7;

import java.util.Scanner;


public class Libro {
    Scanner entrada = new Scanner (System.in);
    int [] libro= new int [5];
    String titulo;
    String edicion;
    String autor;
    String isbn;
    public String editorial= "Prentice-hall";
    String ciudad;
    String pais;
    String fecha;
    int pagina;
    String a;
    
    
    public Libro (String titulo, String edicion, String autor, String isbn, String editorial, String ciudad, String pais, String fecha, int pagina ){
        this.titulo=titulo;
        this.edicion= edicion;
        this.autor=autor;
        this.isbn=isbn;
        this.editorial=editorial;
        this.ciudad=ciudad;
        this.pais=pais;
        this.fecha=fecha;
        this.pagina=pagina;
        
    }
    
    public void setLibro (int[] libro){
        this.libro= libro;
    }
    
    public int[] getLibro(){
        return libro;
    }
    
    public void setTitulo (String titulo){
        this.titulo=titulo;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setEdicion (String edicion){
        this.edicion=edicion;
    }
    
    public String getEdicion(){
        return edicion;
    }
    
    public void setAutor(String autor){
        this.autor=autor;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public void setIsbn(String isbn){
        this.isbn=isbn;
    }
    
    public String getIsbn(){
        return isbn;
    }
    
    public void setEditorial(String editorial){
        this.editorial=editorial;
    }
    
    public String getEditorial(){
        return editorial;
    }
    
    public void setCiudad (String ciudad){
        this.ciudad=ciudad;
    }
    
    public String getCiudad(){
        return ciudad;
    }
    
    
    public void setPais (String pais){
        this.pais=pais;
    }
    
    public String getPais(){
        return pais;
    } 
    
    public void setFecha (String fecha){
        this.fecha=fecha;
    }
    
    public String getFecha(){
        return fecha;
    }
    

    
    
    
    public int llenarLibro(){
        for (int i=1;i<=2;i++){
            System.out.println("Ingrese el titulo del libro :"+i);
            a= entrada.nextLine();
            titulo= entrada.nextLine();
            System.out.println("Ingrese la edicion del libro :"+i);
            edicion= entrada.nextLine();
            System.out.println("Ingrese el autor del libro :"+i);
            autor = entrada.nextLine();
            System.out.println("Ingrese el ISBN del libro :"+i);
            isbn= entrada.nextLine();
            System.out.println("Ingrese la ciudad de donde es el libro :"+i);
            ciudad= entrada.nextLine();
            System.out.println("Ingrese el pais de donde es el libro :"+i);
            pais= entrada.nextLine();
            System.out.println("Ingrese la fecha de publicacion del libro :"+i);
            fecha= entrada.nextLine();
            System.out.println("Ingrese el numero de paginas totales del libro :"+i);
            pagina= entrada.nextInt();
            System.out.print("\n");
          
            
        }
        return libro [2];
    }
    
    public int mostarLibro(){
        for (int k=1;k<=2; k++){
            System.out.println("Titulo del libro "+k+" es: "+titulo);
            System.out.println("Edicion del libro "+k+" es: "+edicion);
            System.out.println("El autor del libro "+k+" es: "+autor);
            System.out.println("El ISBN del libro "+k+" es: "+isbn);
            System.out.println("La ciudad de donde es el libro "+k+" es: "+ciudad);
            System.out.println("El pais de donde es el libro "+k+" es: "+pais);
            System.out.println("La fecha de publicacion del libro "+k+" es: "+fecha);
            System.out.println("El numero totales de paginas del libro "+k+" es: "+pagina);
            System.out.print("\n");
        }
        return libro[2];
    }
    
    
    
}
