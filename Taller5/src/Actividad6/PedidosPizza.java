
package Actividad6;


public class PedidosPizza {
    
    public static void main(String [] args){
        Pizza p1= new Pizza("margarita", "mediana");
        Pizza p2= new Pizza("funghi","familiar");
        p2.sirve();
        Pizza p3= new Pizza("cuatro quesos","mediana");
        p2.sirve();
        System.out.println("\npedidas: "+p2.getTotalPedidas());
        System.out.println("servidas: "+p2.getServidas());
    }
}
