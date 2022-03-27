
package Actividad6;


public class Resultado {
    public static void main(String [] args){
        EcuacionCuadratica op= new EcuacionCuadratica();
        
        
        op.setA(1);
        System.out.println("a= "+op.getA());
        op.setB(-2);
        System.out.println("b= "+op.getB());
        op.setC(-24);
        System.out.println("c= "+op.getC());
        
        op.calcular(1, -2, -24);
        op.mostrarEcuacion();
        op.mostrarResultados();
        
        
        
        
        
    }

   
}
