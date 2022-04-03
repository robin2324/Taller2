
package Actividad2;

import java.util.StringTokenizer;


public class Parrafo {
    private String texto;
    
    
    public Parrafo (String texto){
        this.texto=texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    public void nVocales(String str){
        int nVocal=0;
        char [] vocales = {'a','e','i','o','u'};
        
        for (int i=0; i<str.length();i++){
            for (int x=0; x<vocales.length;x++){
                if (str.charAt(i)== vocales[x]){
                    nVocal++;
                }
            }
        }
        System.out.println("El numero de vocales en el texto son: "+nVocal);
        
        
    }
    
    public void nConsonantes(String str){
        int nConso=0;
        char [] consonantes= {'b','c','d','f','g','h','j','k','l','m','n','ñ','p','q','r','s','t','v','w','x','y','z'};
        
        for (int i=0;i<str.length();i++){
            for (int x=0;x<consonantes.length;x++){
                if (str.charAt(i)== consonantes[x]){
                    nConso++;
                }
            }
        }
        System.out.println("El numero de consonantes en el texto son: "+nConso);
    }
    
    public void nSimbolos(String str){
        int nSim=0;
        char [] simbolos= {'°','!','"','#','$','%','&','/','(',')','=','?','¡','¿','+','*',';',':','-','_','{','}'};
        
        for (int i=0;i<str.length();i++){
            for (int x=0;x<simbolos.length;x++){
                if (str.charAt(i)== simbolos[x]){
                    nSim++;
                }
                
            }
            
        }
        System.out.println("El numero de simbolos son: "+nSim);
    
    }
    
    
    public void buscar(String str, String palabra){
        int tub;
        int contador=0;
        tub= str.indexOf(palabra);
        
        while (tub!=-1){
            contador++;
            tub= str.indexOf(palabra, tub+1);
            
        }
        System.out.println("Las veces que se repite la palabra: "+palabra+" son: "+contador+" veces");
        
    }
    
    public void vocalModal(String str,String vocal){
        int tub;
        int contador=0;
        
        tub= str.indexOf(vocal);
        
        while (tub!=-1){
            contador++;
            tub= str.indexOf(vocal, tub+1);
        }
        System.out.println("Las veces que se repite la vocal "+vocal+" son: "+contador+" veces");
        
        
    }
    
    public void nPalabras(String str){
        StringTokenizer num= new StringTokenizer(str," ");
        while (num.hasMoreElements()){
            System.out.println("Palabra: "+num.nextElement());
        }
        
        
    }
    
    
    public void palabraMayor(String str){
        int longitud=0;
        int posicion=0;
        int mayor=0;
        int posMayor=0;
        
        for (int i=0;i<str.length();i++){
            while (! Character.isLetter(str.charAt(i))&& (i+1<str.length())){
                longitud++;
                i++;
            }
            if (longitud>mayor){
                mayor = longitud;
                posMayor = posicion;
            }
            
        }
        
        String palabra = "";
        for (int i=0;i<mayor;i++){
            palabra = palabra.concat(String.valueOf(str.charAt(posMayor+i)));
            
        }
        System.out.println("La palabra mas larga es: "+palabra+" y tiene "+mayor+" caracteres");
    }
    
    
    
    
}
