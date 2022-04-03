
package Actividad6;


public class Pizza {
    String tamaño;
    String tipo;
    String estado;
    int cPedida=0;
    int cServida=0;
    int contador=0;
    String modo= "pedida";
    
    public Pizza (String tipo, String tamaño){
        this.tipo=tipo;
        this.tamaño=tamaño;
        cPedida+=3;
        System.out.println("Pizza "+tipo+" "+tamaño+","+modo);
        
    }
    
    public void sirve(){
        
        if (contador==0){
        System.out.print("Pizza "+tipo+" "+tamaño+", servida ");
        cServida+=1;       
       }else{
            System.out.println("Esta pizza ya se ha servido");
        }
        contador = 1;
        
        
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

 
    
    public int getTotalPedidas(){
        System.out.println("");
        return cPedida;
    }
    
    public int getServidas(){
        return cServida;
    }
    
}
