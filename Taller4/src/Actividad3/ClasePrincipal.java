
package Actividad3;


public class ClasePrincipal {
    public static void main(String[] args){
        
        Informe op= new Informe(0,0,0,0);
        
        op.llenarMeses();
        op.sumar();
        op.menor();
        op.mayor();
        op.promedio();
        
        op.mostrarDatos();
      
        
        
    }
    
    
}
