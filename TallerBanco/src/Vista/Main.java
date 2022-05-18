
package Vista;

import java.util.Scanner;
import Modulo.*;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int opcion=0;
        boolean salir=false;
        Banco banco = new Banco();
        int x=0;
        
        do
        {
            System.out.println("");
            System.out.println("--- MENU ---\n");
            System.out.println("1. CREAR BANCO");    
            System.out.println("2. CREAR SEDES");
            System.out.println("3. CREAR CUENTA BANCARIA");
            System.out.println("4. CONSULTAR SEDE (POR CODIGO)");
            System.out.println("5. LISTADO DE LAS SEDES");
            System.out.println("6. CONSULTAR CUENTAS BANCARIAS (POR NUMERO DE CUENTA)");
            System.out.println("7. SALIR");
            System.out.print(">");
            opcion = entrada.nextInt();
            if (opcion == 1)
            {
                banco.crearBanco();
                x = x+1;
            }else
            {
                if (x != 0)
                {
                    switch (opcion)
                    {
                        case 2:
                            banco.crearSedes();
                            break;
                        case 3:
                            banco.crearCuenta();
                            break;
                        case 4:
                            banco.consultaPorcodigo();
                            break;
                        case 5:
                            banco.listaSede();
                            break;
                        case 6:
                            banco.mostrarCuentas();
                            break;
                        case 7: 
                            salir = true;
                            break;
                    }
                }
                else
                {
                    System.out.println(" ---¡¡¡¡ NO EXISTE UN BANCO (POR FAVOR CREARLO)!!!! ----");
                    System.out.println("");
                }
            }
        }
        while(salir=true);
}
}