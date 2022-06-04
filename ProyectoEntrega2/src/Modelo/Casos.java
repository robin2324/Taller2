
package Modelo;

import java.util.Scanner;


public class Casos extends Oficina{
    Scanner entrada = new Scanner(System.in);
    int[] numcaso; 
    String[] descripcion;
    String[] causa;
    int[] tipo;
    String[] tipo2;
    String[] prioridad;
    String[] asociado;
    String[] nomclave;
    Detectives detectiv1 = new Detectives(234312,"milo morbius",2,"homicidio");
    Detectives detectiv2 = new Detectives(123243,"david harrys",4,"narcoticos");
    Detectives detectiv3 = new Detectives(143232,"sherlock holmes",7,"cibercrimen");
    Detectives auxiliar = new Detectives(234456,"richard gomez",4,"homicidio");
    
    Sospechosos sospechoso1 = new Sospechosos(23432,"will eramirez","capo",27);
    Sospechosos sospechoso2 = new Sospechosos(34231,"steven fonseca","manso",32);
    Sospechosos sospechoso3 = new Sospechosos(23432,"pedro castro","monarca",23);
    
    Ultima_direccion direc1 = new Ultima_direccion(23454,"cesar","colombia","alto, ojos cafes, pelo rubio",23432,"will eramirez","capo",27);
    Ultima_direccion direc2 = new Ultima_direccion(12938,"cesar","bogota","alto, ojos cafes, pelo rubio",34231,"steven fonseca","manso",32);
    Ultima_direccion direc3 = new Ultima_direccion(32674,"cesar","colombia","alto, ojos cafes, pelo rubio",23432,"pedro castro","monarca",23);
    
    Anotacion num = new Anotacion();
    
    public Casos() {
    }

    public Casos(int[] numcaso, String[] descripcion, String[] causa,String[] tipo2, String[] prioridad, String[] nomclave) {
        this.numcaso = numcaso;
        this.descripcion = descripcion;
        this.causa = causa;
        this.tipo2 = tipo2;
        this.prioridad = prioridad;
        this.nomclave = nomclave;
    }

    public String[] getTipo2() {
        return tipo2;
    }

    public void setTipo2(String[] tipo2) {
        this.tipo2 = tipo2;
    }
    

    public int[] getNumcaso() {
        return numcaso;
    }

    public void setNumcaso(int[] numcaso) {
        this.numcaso = numcaso;
    }

    public String[] getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String[] descripcion) {
        this.descripcion = descripcion;
    }

    public String[] getCausa() {
        return causa;
    }

    public void setCausa(String[] causa) {
        this.causa = causa;
    }

    public String[] getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String[] prioridad) {
        this.prioridad = prioridad;
    }

    public String[] getNomclave() {
        return nomclave;
    }

    public void setNomclave(String[] nomclave) {
        this.nomclave = nomclave;
    }
    
    @Override
    public void setCasos(int n) {
        numcaso = new int[n];
        descripcion = new String[n];
        causa = new String[n];
        tipo = new int[n];
        tipo2 = new String[n];
        asociado = new String[n];
        prioridad = new String[n];
        nomclave = new String[n];
    
        for (int i=1; i <= n ; i++)
        {
            System.out.println("");
            System.out.println("ingresa el codigo del caso: ");
            numcaso[i-1] = entrada.nextInt();
            System.out.println("ingrese que tipo segun el numero, de caso es: ");
            System.out.println(" 1: cibercrimen");
            System.out.println(" 2: homicidios");
            System.out.println(" 3: narcoticos");
            tipo[i-1] = entrada.nextInt();
            do {
                switch (tipo[i-1])
                {
                    case 1:
                    {
                        tipo2[i-1] = "cibercrimen";
                        System.out.println("asociacion especifica del cibercrimen:");
                        asociado[i-1] = entrada.nextLine();
                        break;
                    }
                    case 2:
                    {
                        tipo2[i-1] = "homicidio";
                        Detectives auxiliar = new Detectives(234456,"richard gomez",4,"homicidio");
                        break;
                    } 
                    case 3:
                    {
                        tipo2[i-1] = "narcoticos";
                        System.out.println("asociacion especifica de narcoticos:");
                        System.out.println(" - local");
                        System.out.println(" - estatal");
                        System.out.println(" - federdal");
                        asociado[i-1] = entrada.nextLine();
                        break;
                    }
                    default:{
                        System.out.println("opcion invalida");
                        break;
                    }
                }
            } while (tipo[i-1] == 0);
                
            entrada.nextLine();
            System.out.println("ingrese la descripcion del caso: ");
            descripcion[i-1] = entrada.nextLine();
            System.out.println("ingrese la prioridad del caso: ");
            System.out.println(" A: poca importancia");
            System.out.println(" B: moderada");
            System.out.println(" C: relevante");
            prioridad[i-1] = entrada.nextLine();
            if ("A".equals(prioridad[i-1]))
            {
                Detectives detectiv1 = new Detectives(234312,"milo morbius",2,"homicidio");
            }
            if ("B".equals(prioridad[i-1]))
            {
                Detectives detectiv2 = new Detectives(123243,"david harrys",4,"narcoticos");
            }
            if ("C".equals(prioridad[i-1]))
            {
                Detectives detectiv3 = new Detectives(143232,"sherlock holmes",7,"cibercrimen");
            }
            System.out.println("nombre clave del caso: ");
            nomclave[i-1] = entrada.nextLine();
            System.out.println("---bitacora---");
            num.setBitacora(n);
        }
    }
    
    @Override
    public void detectivesActivos() {
        System.out.println("---primer detective---");
        System.out.println(detectiv1);
        System.out.println("");
        System.out.println("---segundo detective---");
        System.out.println(detectiv2);
        System.out.println("");
        System.out.println("---tercer detective---");
        System.out.println(detectiv3);
    }
    
    public void setnewcaso(int n) {
        if(n!=0)
        {
            boolean salir = false;
            int opcion;
            int numero;
            int nuevo;
            String nuev;
            System.out.println("codigo del caso a alterar?: ");
            numero = entrada.nextInt();
            while (salir == false)
            {
                System.out.println("\t---OPCION A CORREGIR---\n"+
                        "1. codigo del caso \n" +
                        "2. descripcion del caso \n" +
                        "3. tipo del caso \n" +
                        "4. prioridad del caso\n" +
                        "5. nombre clave\n"+
                        "6. bitacora\n"+
                        "7. salir"+
                        "\n ingrese opcion\n");
                opcion = entrada.nextInt();
                switch(opcion)
                {
                    case 1:
                            entrada.nextLine();
                            System.out.println("ingrese el nuevo codigo: ");
                            numcaso[numero-1] = entrada.nextInt();
                            break;
                    case 2:
                        entrada.nextLine();
                        System.out.println("ingrese la nueva descripcion del caso: ");
                        descripcion[numero-1] = entrada.nextLine();
                        break;
                    case 3:
                        System.out.println("ingrese que tipo segun el numero, de caso es: ");
                        System.out.println(" 1: cibercrimen");
                        System.out.println(" 2: homicidios");
                        System.out.println(" 3: narcoticos");
                        tipo[numero-1] = entrada.nextInt();
                        do {
                            switch (tipo[numero-1])
                            {
                                case 1:
                                {
                                    entrada.nextLine();
                                    tipo2[numero-1] = "cibercrimen";
                                    System.out.println("asociacion especifica del cibercrimen:");
                                    asociado[numero-1] = entrada.nextLine();
                                    break;
                                }
                                case 2:
                                {
                                    tipo2[numero-1] = "homicidio";
                                    Detectives auxiliar = new Detectives(234456,"richard gomez",4,"homicidio");
                                    break;
                                } 
                                case 3:
                                {
                                    entrada.nextLine();
                                    tipo2[numero-1] = "narcoticos";
                                    System.out.println("asociacion especifica de narcoticos:");
                                    System.out.println(" - local");
                                    System.out.println(" - estatal");
                                    System.out.println(" - federdal");
                                    asociado[numero-1] = entrada.nextLine();
                                    break;
                                }
                                default:{
                                    System.out.println("opcion invalida");
                                    break;
                                }
                            }
                        } while (tipo[numero] == 0);
                    case 4:
                        entrada.nextLine();
                        System.out.println("ingrese la nueva prioridad del caso: ");
                        System.out.println(" A: poca importancia");
                        System.out.println(" B: moderada");
                        System.out.println(" C: relevante");
                        prioridad[numero-1] = entrada.nextLine();
                        if ("A".equals(prioridad[numero-1]))
                        {
                            Detectives detectiv1 = new Detectives(234312,"milo morbius",2,"homicidio");
                        }
                        if ("B".equals(prioridad[numero-1]))
                        {
                            Detectives detectiv2 = new Detectives(123243,"david harrys",4,"narcoticos");
                        }
                        if ("C".equals(prioridad[numero-1]))
                        {
                            Detectives detectiv3 = new Detectives(143232,"sherlock holmes",7,"cibercrimen");
                        }
                        break;
                    case 5: 
                        entrada.nextLine();
                        System.out.println("ingrese el nuevo nombre clave del caso: ");
                        nomclave[numero-1] = entrada.nextLine();
                        break;
                    case 6:
                        entrada.nextLine();
                        num.setBitacora(numero);
                    case 7:
                        salir = true;
                        break;

            }
        }
    }else
        {
            System.out.println(" ---PRIMERO DEBES REGISTRAR UN CASO---");
            System.out.println("");
        }
    }
    
    @Override
    public void delete(int n){
        if (n!=0)
        {
            int num1;
            System.out.println("digite el codigo del caso que desea borra:");
            num1 = entrada.nextInt();
            for (int i=num1; i<n; i++){
                    numcaso[i-1] = numcaso[i];
                    descripcion[i-1] = descripcion[i];
                    tipo2[i-1] = tipo2[i];
                    asociado[i-1] = asociado[i];
                    prioridad[i-1] = prioridad[i];
                    nomclave[i-1] = nomclave[i];
            }

            System.out.println("---REGISTRO ACTUALIZADO---");
            for (int i=1; i<=n-1; i++)
            {
                System.out.println("codigo: "+numcaso[i-1]);
                System.out.println("descripcion: "+descripcion[i-1]);
                System.out.println("tipo: "+tipo2[i-1]);
                System.out.println("prioridad: " + prioridad[i-1]);
                System.out.println("nombre clave: " + nomclave[i-1]);
                if ("A".equals(prioridad[i-1]))
                {
                    System.out.println("\n---detective principal---"+detectiv1);
                }
                if ("B".equals(prioridad[i-1]))
                {
                    System.out.println("\n---detective principal---"+detectiv2);
                }
                if ("C".equals(prioridad[i-1]))
                {
                    System.out.println("\n---detective principal---"+detectiv3);
                }
                if ("homicidio".equals(tipo2[i-1]))
                {
                    System.out.println("\n --segundo detective-- "+auxiliar);
                }
                else{
                    System.out.println("asociacion: " + asociado[i-1]);
                }
                if("A".equals(prioridad[i-1]))
                {
                    System.out.println("\n---sospechoso---"+sospechoso1);
                    System.out.println("\n---ultima direccion---"+direc1);
                    System.out.println("\n---bitacora---"+num.toString());
                } else
                {
                    if("B".equals(prioridad[i-1]))
                    {
                        System.out.println("\n---sospechoso---"+sospechoso2);
                        System.out.println("\n---ultima direccion---"+direc2);
                        System.out.println("\n---bitacora---"+num.toString());
                    }   else
                        {
                            if ("C".equals(prioridad[i-1]))
                            {
                                System.out.println("\n---sospechoso---"+sospechoso3);
                                System.out.println("\n---ultima direccion---"+direc3);
                                System.out.println("\n---bitacora---"+num.toString());
                            }
                        }
                }
                    System.out.println("");
            }
        }else
        {
            System.out.println("---PRIMERO DEBES REGISTRAR UN CASO---");
            System.out.println("");
        }
        
    }
    
    public void mostrarCasos(int n) {
        if(n!=0)
        {
            {
            System.out.println(" ---MOSTRANDO CASOS--- ");
            System.out.println("");
            for (int i=1; i<=n; i++)
            {
                System.out.println("codigo: "+numcaso[i-1]);
                System.out.println("descripcion: "+descripcion[i-1]);
                System.out.println("tipo: "+tipo2[i-1]);
                System.out.println("prioridad: " + prioridad[i-1]);
                System.out.println("nombre clave: " + nomclave[i-1]);
                if ("A".equals(prioridad[i-1]))
                {
                    System.out.println("\n---detective principal---"+detectiv1);
                }
                if ("B".equals(prioridad[i-1]))
                {
                    System.out.println("\n---detective principal---"+detectiv2);
                }
                if ("C".equals(prioridad[i-1]))
                {
                    System.out.println("\n---detective principal---"+detectiv3);
                }
                if (tipo[i-1]==2)
                {
                    System.out.println("\n---segundo detective---"+auxiliar);
                }
                else{
                    System.out.println("asociacion: " + asociado[i-1]);
                }
                if("A".equals(prioridad[i-1]))
                {
                    System.out.println("\n---sospechoso---"+sospechoso1);
                    System.out.println("\n---ultima direccion---"+direc1);
                    System.out.println("\n---bitacora---\n");
                    num.mostrarBit(n);
                } else
                {
                    if("B".equals(prioridad[i-1]))
                    {
                        System.out.println("\n---sospechoso---"+sospechoso2);
                        System.out.println("\n---ultima direccion---"+direc2);
                        System.out.println("\n---bitacora---\n");
                        num.mostrarBit(n);
                    }else
                    {
                        if ("C".equals(prioridad[i-1]))
                        {
                            System.out.println("\n---sospechoso---"+sospechoso3);
                            System.out.println("\n---ultima direccion---"+direc3);
                            System.out.println("\n---bitacora---\n");
                            num.mostrarBit(n);
                        }
                    }
                }
                    System.out.println("");
            }
        }
    }else
    {
        System.out.println("---PRIMERO DEBES REGISTRAR UN CASO---");
        System.out.println("");
    }
   }
}
