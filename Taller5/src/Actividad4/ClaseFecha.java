
package Actividad4;
import static Actividad4.Principal.DateAString;
import static Actividad4.Principal.sdf;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.Month;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClaseFecha {
    public static SimpleDateFormat sdf= new SimpleDateFormat ("dd/MM/yyyy");
    private Date fechaActual = new Date();
    private LocalTime horaActual;
    private LocalDate sumFecha;
    private LocalDate restaFecha;
    private LocalDate fechaActual2;
    
    
    
    
    public ClaseFecha(Date fechaActual, LocalTime horaActual, LocalDate sumFecha,LocalDate restaFecha){
        this.fechaActual= fechaActual;
        this.horaActual= horaActual;
        this.sumFecha=sumFecha;
        this.restaFecha= restaFecha;
        //this.fechaActual2= fechaActual2;
        
        
    }

    public Date getFechaActual() {
        return fechaActual;
    }

    public void setFechaActual(Date fechaActual) {
        this.fechaActual = fechaActual;
    }

    public LocalTime getHoraActual() {
        return horaActual;
    }

    public void setHoraActual(LocalTime horaActual) {
        this.horaActual = horaActual;
    }

    public LocalDate getSumFecha() {
        return sumFecha;
    }

    public void setSumFecha(LocalDate sumFecha) {
        this.sumFecha = sumFecha;
    }

    public LocalDate getFechaActual2() {
        return fechaActual2;
    }

    public void setFechaActual2(LocalDate fechaActual2) {
        this.fechaActual2 = fechaActual2;
    }
    
    
    
    
    public void fechaActual(){
        Date fechaActual = new Date();
        //DateAString(fechaActual);
        LocalTime horaActual = LocalTime.now();
        
        System.out.println("Son las "+horaActual+" del "+DateAString(fechaActual));
        System.out.println("");
        
    }
    public void sumaFecha(int dia){
       LocalDate sumFecha = LocalDate.now();
       sumFecha = sumFecha.plusDays(dia);
       System.out.println("La suma de "+dia+" dia(s) a la fecha actual es: "+sumFecha);
       System.out.println("");
       
    }
    
    public void restaFecha(int dia){
        LocalDate fechaActual2 = LocalDate.now();
        LocalDate restaFecha = fechaActual2.plusDays(-dia);
        System.out.println("La resta de "+dia+" dia(s) a la fecha actual es: "+restaFecha);
        System.out.println("");
    }
    
    
    public void nDias(String fecha_inicio, String fecha_final){
        try {
            Date fecha_inicio1 = sdf.parse(fecha_inicio);
            Date fecha_final1 = sdf.parse(fecha_final);
            
            long tiempo_transcurrido = fecha_final1.getTime() - fecha_inicio1.getTime();
            
            TimeUnit unidad = TimeUnit.DAYS;
            
            long nDias = unidad.convert(tiempo_transcurrido, TimeUnit.MILLISECONDS);
            System.out.println("Los dias transcurridos entre las fechas "+fecha_inicio+" y "+fecha_final+" son: "+nDias+" Dia(s)");
            System.out.println("");
            
            
        }catch (ParseException ex){
            System.out.println("FECHA INVALIDA");
            //Logger.getLogger(ClaseFecha.class.getName()).log(Principal.Leve1.SEVERE, null, ex);
        }
        
        
        
        
    }
    
    public void diaDelAño(){
        try {
            
            Date fechaInicio = sdf.parse("01/01/2022");
            Date FechaActual = new Date();
            
            
            long tiempoTranscurrido = fechaActual.getTime() - fechaInicio.getTime();
            
            TimeUnit unidad = TimeUnit.DAYS;
            
            long diaDelAño= unidad.convert(tiempoTranscurrido, TimeUnit.MILLISECONDS);
            
            System.out.println("Es el dia "+diaDelAño+" del 2022");
            System.out.println("");
        }catch (ParseException ex){
            System.out.println("FECHA INVALIDA");
            //Logger.getLogger(ClaseFecha.class.getName()).log(Principal.Leve1.SEVERE, null, ex);
        }
    
    }
    
    
    public void compararFechas(String fechaA, String fechaB){
        try{
            Date fechaA1 = sdf.parse(fechaA);
            Date fechaB1 = sdf.parse(fechaB);
            
            if (fechaA.compareTo(fechaB)<0){
                System.out.println("La fecha A= "+fechaA+" es menor a la fecha B = "+fechaB);
            }else if (fechaA.compareTo(fechaB)>0){
                System.out.println("La fecha A= "+fechaA+" es mayor a la fecha B = "+fechaB);
            }else if (fechaA.compareTo(fechaB)==0){
                System.out.println("La fecha A = "+fechaA+" es igual a la fecha B = "+fechaB);
            }
            System.out.println("");
            
        }catch (ParseException ex){
            System.out.println("FECHA INVALIDA");
        }
        
        
        
        
    }
    
    public void tiempoTranscurrido(String fecha1, String fecha2){
        try {
            Date primeraFecha = sdf.parse(fecha1);
            Date segundaFecha = sdf.parse(fecha2);
            
            
            ZoneId defaultZoneId = ZoneId.systemDefault();
            Instant instant = primeraFecha.toInstant();
            Instant instant1 = segundaFecha.toInstant();
            LocalDate localdate1 = instant
                    .atZone(defaultZoneId).toLocalDate();
            LocalDate localdate2 = instant1
                    .atZone(defaultZoneId).toLocalDate();
            
            

            
            System.out.println("La primera fecha es = "+fecha1+", la segunda fecha es = "+fecha2);
            
            Period tiempoTranscurrido = Period.between(localdate1, localdate2);
            
            System.out.println("La diferencia en dias es de : "+(tiempoTranscurrido.getDays()));
            System.out.println("La diferencia en meses es de: "+(tiempoTranscurrido.getMonths()));
            System.out.println("La diferencia en años es de : "+(tiempoTranscurrido.getYears()));
            
        }catch (ParseException ex){
            System.out.println("FECHA INVALIDA");
        }
        
        
    }
    
    
    public void nombreDia(){
        try {
            Date fechaInicio = sdf.parse("01/01/2022");
            Date fechaActual = new Date();
            
            long tiempo_Transcurrido= fechaActual.getTime() - fechaInicio.getTime();
            
            TimeUnit unidad = TimeUnit.DAYS;
            
            long diaDelAño1 = unidad.convert(tiempo_Transcurrido, TimeUnit.MILLISECONDS);
            
            int x = (int) diaDelAño1;
            
            Calendar calendario = Calendar.getInstance();
            calendario.set(Calendar.YEAR, 2022);
            calendario.set(Calendar.DAY_OF_YEAR, x);
            
            int nombreDia1 = calendario.get(Calendar.DAY_OF_WEEK);
            System.out.println("");
            System.out.println("Dia de la semana: "+nombreDia1);
            
            if (nombreDia1==1){
                System.out.println("¡¡ HOY ES LUNES !!");
            }else if (nombreDia1==2){
                System.out.println("¡¡ HOY ES MARTES !!"); 
            }else if (nombreDia1==3){
                System.out.println("¡¡ HOY ES MIERCOLES !!");
            }else if(nombreDia1==4){
                System.out.println("¡¡ HOY ES JUEVES !!");
            }else if(nombreDia1==5){
                System.out.println("¡¡ HOY ES VIERNES !!");
            }else if (nombreDia1==6){
                System.out.println("¡¡ HOY ES SABADO !!");
            }else if (nombreDia1==7){
                System.out.println("¡¡ HOY ES DOMINGO !!");
        }   
            
        }catch (ParseException ex){
            System.out.println("FECHA INVALIDA");
        }
        
        
    }
    
    
     public static String DateAString (Date fecha){
        String fechaCadena = sdf.format(fecha);
        return fechaCadena;
    }

    private void toInstant() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
     
     
     
         private static class Leve1 {

        private static Level SEVERE;

        public Leve1() {
        }
    }
}

