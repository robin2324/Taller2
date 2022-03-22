/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallern3;

/**
 *
 * @author USUARIO
 */
public class Actividad5 {
    public static void main(String[] args){
        int [] comuna1A= {194,180,221,432,820};
        int [] comuna2B= {48,20,90,50,61};
        int [] comuna3C= {206,320,140,821,946};
        int [] comuna4D= {45,16,20,14,18};
        int suma1=0,suma2=0,suma3=0,suma4=0,sumat=0;
        double p1=0,p2=0,p3=0,p4=0;
        int sComuna1=0,sComuna2=0,sComuna3=0,sComuna4=0,sComuna5=0,sComunaT=0;
        double pc1=0,pc2=0,pc3=0,pc4=0,pc5=0;
        
        System.out.println("COMUNA   CANDIDATO A   CANDIDATO B   CANDIDATO C   CANDIDATO D   ");
        for(int i=0; i<5; i++){
            System.out.println((i+1)+"           "+comuna1A[i]+"            "+comuna2B[i]+"            "+comuna3C[i]+"          "+comuna4D[i]);
            
        }
        for (int i=0; i<5;i++){
            sumat+= comuna1A[i]+ comuna2B[i]+ comuna3C[i]+comuna4D[i];
            suma1+= comuna1A[i];
            suma2+= comuna2B[i];
            suma3+= comuna3C[i];
            suma4+= comuna4D[i];
            p1 = suma1*100/sumat;
            p2= suma2*100/sumat;
            p3= suma3*100/sumat;
            p4= suma4*100/sumat;
        }
        System.out.println(" ");
        System.out.println("- Los votos totales fueron de : "+sumat);
        System.out.println("* El total de votos recibidos por el candidato A son: "+suma1+", con un porcentaje de votacion de: "+p1+"%");
        if ((suma1>suma2)&&(suma1>suma3)&&(suma1>suma4)&&(p1>p2)&&(p1>p3)&&(p1>p4)){
            System.out.println("* El candidato A tuvo mas votos");
            System.out.println("* ¡¡¡¡El candidato ha ganado!!!!");
        }
        System.out.println("* El total de votos recibidos por el candidato B son: "+suma2+", con un porcentaje de votacion de: "+p2+"%");
        if ((suma2>suma1)&&(suma2>suma3)&&(suma2>suma4)&&(p2>p1)&&(p2>p3)&&(p2>p4)){
            System.out.println("* El candidato B tuvo mas votos");
            System.out.println("* ¡¡¡¡El candidato ha ganado!!!!");
        }
        System.out.println("* El total de votos recibidos por el candidato C son: "+suma3+", con un porcentaje de votacion de: "+p3+"%");
        if ((suma3>suma1)&&(suma3>suma2)&&(suma3>suma4)&&(p3>p1)&&(p3>p2)&&(p3>p4)){
            System.out.println("* El candidadato C tuvo mas votos");
            System.out.println("* ¡¡¡¡El candidato ha ganado!!!!");
        }
        System.out.println("* El total de votos recibidos por el candidato D son: "+suma4+", con un porcentaje de votacion de: "+p4+"%");
        if ((suma4>suma1)&&(suma4>suma2)&&(suma4>suma3)&&(p4>p1)&&(p4>p2)&&(p4>p3)){
            System.out.println("* El candidato D tuvo mas votos");
            System.out.println("* ¡¡¡¡EL candidato ha ganado!!!!");
        }
        sComuna1= comuna1A[0]+comuna2B[0]+comuna3C[0]+comuna4D[0];
        sComuna2= comuna1A[1]+comuna2B[1]+comuna3C[1]+comuna4D[1];
        sComuna3= comuna1A[2]+comuna2B[2]+comuna3C[2]+comuna4D[2];
        sComuna4= comuna1A[3]+comuna2B[3]+comuna3C[3]+comuna4D[3];
        sComuna5= comuna1A[4]+comuna2B[4]+comuna3C[4]+comuna4D[4];
        //sComunaT= sComuna1+sComuna2+sComuna3+sComuna4+sComuna5;
        pc1=sComuna1*100/sumat;
        pc2=sComuna2*100/sumat;
        pc3=sComuna3*100/sumat;
        pc4=sComuna4*100/sumat;
        pc5=sComuna5*100/sumat;
        if ((pc1>pc2)&&(pc1>pc3)&&(pc1>pc4)&&(pc1>pc5)){
            System.out.println("* La comuna 1 tuvo mayor porcentaje de votacion");
        }
        if ((pc2>pc1)&&(pc2>pc3)&&(pc2>pc4)&&(pc2>pc5)){
            System.out.println("* La comuna 2 tuvo mayor porcentaje de votacion");
        }
        if ((pc3>pc1)&&(pc3>pc2)&&(pc3>pc4)&&(pc3>pc5)){
            System.out.println("* La comuna 3 tuvo mayor porcentaje de votacion");
        }
        if ((pc4>pc1)&&(pc4>pc2)&&(pc4>pc3)&&(pc4>pc5)){
            System.out.println("* La comuna 4 tuvo mayor porcentaje de votacion");
        }
        if ((pc5>pc1)&&(pc5>pc2)&&(pc5>pc3)&&(pc5>pc4)){
            System.out.println("* La comuna 5 tuvo mayor porcentaje de votacion");
        }
        
    }
}
