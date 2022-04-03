
package Actividad2;


public class PruebaTexto {
    public static void main(String [] args){
        String texto = "No lo se Ernesto no lo se, pero si lo supiera te juro que si, pero no se sabe!";
        Parrafo str = new Parrafo(texto);
        
        str.nVocales(texto);
        str.nConsonantes(texto);
        str.nSimbolos(texto);
        str.buscar(texto, "si");
        str.vocalModal(texto, "a");
        str.nPalabras(texto);
        str.palabraMayor(texto);
        
    }
    
    
}
