
package Actividad1;


public class Principal {
    public static void main(String[] args){
        Persona p[] = {new Persona("Robin",18), new Persona("Richard",18)};
        Fecha f[] = {new Fecha(21,06,2003),new Fecha(03,03,2004)};
        Direccion d[] = {new Direccion("KR 21 #25-52","KR 40 #24-85","UNIVERSIDAD POPULAR DEL CESAR"), new Direccion("KR 21 #31-41","KR 50 #45-82","UNIVERSIDAD ANDINA")};
        
        for (int i=0;i<p.length;i++){
            System.out.println("--- DATOS PERSONA "+(i+1)+" ---");
            System.out.println("Nombre: "+p[i].getNombre());
            System.out.println("Edad: "+p[i].getEdad());
            System.out.println("Fecha nacimiento: "+f[i].getDia()+"/"+f[i].getMes()+"/"+f[i].getAño());
            System.out.println("Direccion de domicilio: "+d[i].getDireccionDomicilio());
            System.out.println("Direccion de trabajo: "+d[i].getDireccionTrabajo());
            System.out.println("Nombre de la Empresa: "+d[i].getNombreEmpresa());     
            System.out.println("");
        }
        
        
        
        
        
    }
}
