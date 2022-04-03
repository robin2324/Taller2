
package Actividad4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.util.logging.Logger;


public class Principal {
    public static SimpleDateFormat sdf= new SimpleDateFormat ("dd/MM/yyyy");
    public static void main(String [] args) throws ParseException{
        //SimpleDateFormat sdf= new SimpleDateFormat ("dd//MM/YYYY");
        
        Date fechaActual= new Date();
        LocalDate sumFecha = LocalDate.now();
        LocalTime horaActual= LocalTime.now();
        DateAString(fechaActual);
        LocalDate fechaActual2= LocalDate.now();
        //FECHA ACTUAL
        System.out.println("Son las "+horaActual+" del "+DateAString(fechaActual));
        //SUMAR DIAS A LA FECHA ACTUAL
        sumFecha= sumFecha.plusDays(10);
        System.out.println("");
        System.out.println("Resultado de la suma de dias: "+sumFecha);
        //RESTA DE DIAS A LA FECHA ACTUAL
        LocalDate restaFecha = fechaActual2.plusDays(-1);
        System.out.println("");
        System.out.println("Resultado de la resta de dias: "+restaFecha);
        
        
        
        System.out.println("");
        //NUMERO DE DIAS TRANSCURRIDOS ENTRE DOS FECHAS
        try {
            
            Date fecha_inicio= sdf.parse("18/05/2022");
            Date fecha_final= sdf.parse("21/06/2022");
            
            long tiempo_transcurrido = fecha_final.getTime() - fecha_inicio.getTime();
            
            TimeUnit unidad = TimeUnit.DAYS;
            
            long nDias = unidad.convert(tiempo_transcurrido, TimeUnit.MILLISECONDS);
            
            System.out.println("Los dias transcurridos entre las fechas "+DateAString(fecha_inicio)+" y "+DateAString(fecha_final)+" son: "+nDias+" Dia(s)");
        }catch (ParseException ex){
            System.out.println("FECHA INVALIDA");
            Logger.getLogger(Principal.class.getName()).log(Leve1.SEVERE, null, ex);
        }
        System.out.println("");
        //DIA DEL AÑO CALENDARIO
        try{
            Date fechaInicio = sdf.parse("01/01/2022");
            fechaActual= fechaActual;
            
            long tiempoTranscurrido = fechaActual.getTime() - fechaInicio.getTime();
            
            TimeUnit unidad = TimeUnit.DAYS;
            
            long diaDelAño = unidad.convert(tiempoTranscurrido, TimeUnit.MILLISECONDS);
            
            System.out.println("Es el dia "+diaDelAño+" del 2022");
            
        }catch (ParseException ex){
            System.out.println("FECHA INVALIDA");
            Logger.getLogger(Principal.class.getName()).log(Leve1.SEVERE, null, ex);
        }
        
        System.out.println("");
        //COMPARAR Y DECIR FECHA MAYOR,MENOR O IGUALES
        LocalDate fechaA= LocalDate.of(2022, Month.JANUARY, 1);
        LocalDate fechaB= LocalDate.of(2023, Month.JANUARY, 1);
        
        if (fechaA.compareTo(fechaB) < 0){
            System.out.println("La fecha A= "+ fechaA+" es menor a la fecha B= "+fechaB);
        }else if(fechaA.compareTo(fechaB)>0){
            System.out.println("La fecha A= "+fechaA+" es mayor a la fecha B= "+fechaB);
        }
        if (fechaA.compareTo(fechaB)== 0){
            System.out.println("La fecha A= "+fechaA+" es igual a la fecha B= "+fechaB);
        }
        System.out.println("");
        
        //TIEMPO TRANSCURRIDO ENTRE DOS FECHAS
        LocalDate primeraFecha= LocalDate.of(2000, Month.JANUARY, 1);
        LocalDate segundaFecha= LocalDate.of(2022, Month.JUNE, 20);
        
        System.out.println("La primera fecha es= "+primeraFecha+", la segunda fecha es= "+segundaFecha);
        
        
        Period tiempoTranscurrido = Period.between(primeraFecha, segundaFecha);
        
        System.out.println("La diferencia en dias es de : "+(tiempoTranscurrido.getDays()+1));
        System.out.println("La diferencia en meses es de: "+(tiempoTranscurrido.getMonths()+1));
        System.out.println("La diferencia en años es de : "+tiempoTranscurrido.getYears());
        
        // NOMBRE DEL DIA DE LA SEMANA
        Date fechaInicio = sdf.parse("01/01/2022");
            fechaActual= fechaActual;
            
            long tiempo_Transcurrido = fechaActual.getTime() - fechaInicio.getTime();
            
            TimeUnit unidad = TimeUnit.DAYS;
            
            long diaDelAño = unidad.convert(tiempo_Transcurrido, TimeUnit.MILLISECONDS);
            
            int x = (int) diaDelAño;
         
        Calendar calendario = Calendar.getInstance();
        calendario.set(Calendar.YEAR, 2022);
        calendario.set(Calendar.DAY_OF_YEAR, x);
        
        int nombreDia= calendario.get(Calendar.DAY_OF_WEEK);
        System.out.println("");
        System.out.println("Dia de la semana: "+nombreDia);
        
        if (nombreDia==1){
            System.out.println("¡¡ HOY ES LUNES !!");
        }else if (nombreDia==2){
            System.out.println("¡¡ HOY ES MARTES !!"); 
        }else if (nombreDia==3){
            System.out.println("¡¡ HOY ES MIERCOLES !!");
        }else if(nombreDia==4){
            System.out.println("¡¡ HOY ES JUEVES !!");
        }else if(nombreDia==5){
            System.out.println("¡¡ HOY ES VIERNES !!");
        }else if (nombreDia==6){
            System.out.println("¡¡ HOY ES SABADO !!");
        }else if (nombreDia==7){
            System.out.println("¡¡ HOY ES DOMINGO !!");
        }
        
        
        
    }
    
    public static String DateAString (Date fecha){
        String fechaCadena = sdf.format(fecha);
        return fechaCadena;
    }
    /*public void sumarFecha(int dia){
       String fechaSuma = fechaSuma.plusDays(dia);
       
    }*/

    private static class Leve1 {

        private static Level SEVERE;

        public Leve1() {
        }
    }
    
}
