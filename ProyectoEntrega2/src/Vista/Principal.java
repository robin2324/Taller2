
package Vista;

import java.util.Scanner;
import Modelo.*;

public class Principal {

    public static void main(String[] args){
        boolean salir = false;
        int num;
        int opcion;
        Casos caso1 = new Casos();
        Scanner entrada = new Scanner(System.in);
        System.out.println(" ----CUANTOS CASOS DESEA REGISTRAR----  ");
        num = entrada.nextInt();
        System.out.println("");
        while (salir != true)
        {
            System.out.println("\t---CASOS POLICIALES---\n"+
                    "1. registrar casos \n" +
                    "2. editar casos \n" +
                    "3. consultar casos \n" +
                    "4. consultar detectives\n" +
                    "5. eliminar casos\n" +
                    "6. salir"+
                      "\n ingrese opcion\n");
            opcion = entrada.nextInt();
            
            switch(opcion)
            {
                case 1:
                    caso1.setCasos(num);
                    break;
                case 2:
                    caso1.setnewcaso(num);
                    break;
                case 3:
                    caso1.mostrarCasos(num);
                    break;
                case 4: 
                    caso1.detectivesActivos();
                    break;
                case 5:
                    caso1.delete(num);
                    break;
                case 6:
                    salir = true;
                    break;
            }
        }
    }
    
}
