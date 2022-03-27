
package Actividad4;


public class PruebaHabitacion {
    public static void main(String [] args){
        
        Habitacion op= new Habitacion();
        
        op.setLargo(14.5);
        System.out.println("EL largo es: "+op.getLargo());
        op.setAncho(11.3);
        System.out.println("El ancho es: "+op.getAncho());
        op.setAltura(18.2);
        System.out.println("La algura es: "+op.getAltura());
       
        op.calcularEnchape();
        op.caluclarTapizado();
        op.mostrarResultados();
        
        
        
    }
    
    
    
}
