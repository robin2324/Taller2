
package Actividad7;

import java.util.Scanner;

public class Asignatura {
    private String nombre;
    private int contador=0;
    private String codigo;
    private int n;
    private int [] grupo;
    private int [] nGrupo;
    private String [] docente;
    private int [] nEstudiantes;
    private String [] nombreEstudiante;
    private float [] p1;
    private float [] p2;
    private float [] p3;
    private float [] prom;
    
    public Asignatura(String nombre, String codigo, int n, int [] grupo, int [] nGrupo, String [] docente, int [] nEstudiantes, String [] nombreEstudiante,float [] p1, float [] p2, float [] p3, float [] prom ){
        this.nombre=nombre;
        this.codigo=codigo;
        this.n=n;
        this.grupo=grupo;
        this.nGrupo=nGrupo;
        this.docente=docente;
        this.nEstudiantes= nEstudiantes;
        this.nombreEstudiante= nombreEstudiante;
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
        this.prom=prom;
        
    }
    public Asignatura(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[] getGrupo() {
        return grupo;
    }

    public void setGrupo(int[] grupo) {
        this.grupo = grupo;
    }

    public int[] getnGrupo() {
        return nGrupo;
    }

    public void setnGrupo(int[] nGrupo) {
        this.nGrupo = nGrupo;
    }

    public String[] getDocente() {
        return docente;
    }

    public void setDocente(String[] docente) {
        this.docente = docente;
    }

    public int[] getnEstudiantes() {
        return nEstudiantes;
    }

    public void setnEstudiantes(int[] nEstudiantes) {
        this.nEstudiantes = nEstudiantes;
    }

    public String[] getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String[] nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public float[] getP1() {
        return p1;
    }

    public void setP1(float[] p1) {
        this.p1 = p1;
    }

    public float[] getP2() {
        return p2;
    }

    public void setP2(float[] p2) {
        this.p2 = p2;
    }

    public float[] getP3() {
        return p3;
    }

    public void setP3(float[] p3) {
        this.p3 = p3;
    }

    public float [] getProm() {
        return prom;
    }

    public void setProm(float [] prom) {
        this.prom = prom;
    }
    
    public void Asignature(){
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la asignatura: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el codigo de la asigntatura");
        codigo = entrada.nextLine();
}
    public void grupo(){
        Scanner entrada = new Scanner(System.in);
        
        do{
            System.out.println("Cuantos grupos de la asignatura son: ");
            n= entrada.nextInt();
            if (n>3){
                System.out.println("Maximo se pueden 3 grupos");
            }
        }while (n>3);
        
        grupo = new int [n];
        nGrupo= new int [n];
        docente = new String [n];
        nEstudiantes= new int [n];
        nombreEstudiante= new String [n];
        p1= new float [10];
        p2= new float [10];
        p3= new float [10];
        prom= new float [10];
        
        System.out.println("--- GRUPOS ---");
        for (int i=1; i<grupo.length;i++){
            System.out.println("Ingrese el numero del grupo "+i+" :");
            nGrupo[i-1]= entrada.nextInt();
            entrada.nextLine();
            System.out.println("Ingrese el nombre del docente:");
            docente[i-1]= entrada.nextLine();
            
            do{
                System.out.println("Ingrese el numero de estudiantes: ");
                nEstudiantes[i-1]= entrada.nextInt();
                contador+= nEstudiantes[i-1];
                if (nEstudiantes[i-1]>3){
                    System.out.println("No se puede inscribir a mas de 3 estudiantes");
                }
            }while (nEstudiantes[i-1]>3);
            
            
        }
        
        System.out.println("");
        for (int x=1; x<=contador;x++){
            entrada.nextLine();
            System.out.println("Ingrese el nombre del estudiante: "+x);
            nombreEstudiante[x-1]= entrada.nextLine();
            System.out.println("Ingrese la nota 1:");
            p1[x-1]= entrada.nextInt();
            System.out.println("Ingrese la nota 2:");
            p2[x-1]= entrada.nextInt();
            System.out.println("Ingrese la nota 3:");
            p3[x-1]= entrada.nextInt();
            prom[x-1]= (p1[x-1]+p2[x-1]+p3[x-1])/3;
        }
        
    }
    
    public void mostrarGrupos(){
        Scanner entrada = new Scanner(System.in);
        int opcion;
        String op="";
        do{
            System.out.println("Elija una opcion: ");
            System.out.println("1. Mostrar los grupos");
            System.out.println("2. Mostrar promedio de estudiantes");
            opcion = entrada.nextInt();
            switch (opcion){
                case 1:
                    for (int i=1; i<grupo.length;i++){
                        System.out.println("Numero del grupo "+i+" : ");
                        System.out.println(nGrupo[i-1]);
                        System.out.println("Docente del grupo "+i+" : ");
                        System.out.println(docente[i-1]);
                        System.out.println("Estudiantes del grupo "+i+" : ");
                        System.out.println(nEstudiantes[i-1]);
                        System.out.println("");
                    }
                    
                case 2:
                    for (int i=1; i<= contador; i++){
                        System.out.println("Nombre del estudiante "+i+" : ");
                        System.out.println(nombreEstudiante[i-1]);
                        System.out.println("Promedio del estudiante "+i+" : ");
                        System.out.println(prom[i-1]);
                        System.out.println("");
                    }
                    
            }
            
            System.out.println("¿Desea regresar al menu?: ");
            entrada.nextLine();
            System.out.println("s(si) o n(no) ");
            op = entrada.nextLine();
            System.out.println("");
            
        }while ("s".equals(op));
        
        
    }
    
    public void mostrarAsignatura(){
        System.out.println("");
        System.out.println("Nombre de la asignatura: "+nombre);
        System.out.println("Codigo de la asignatura: #"+codigo);
        System.out.println("");
        
        
    }
    
    
}