
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

public class Main {
    public static SimpleDateFormat sdf= new SimpleDateFormat ("dd/MM/yyyy");
    
    public static void main(String [] args){
        Date fechaActual= new Date();
        LocalDate sumFecha = LocalDate.now();
        LocalTime horaActual= LocalTime.now();
        
        LocalDate fechaActual2 = LocalDate.now();
        LocalDate restaFecha = fechaActual2.plusDays(-1);
        
        
        ClaseFecha op= new ClaseFecha(fechaActual, horaActual, sumFecha, restaFecha);
        
        op.fechaActual();
        op.sumaFecha(5);
        op.restaFecha(2);
        op.nDias("12/04/2022", "21/06/2022");
        op.diaDelAño();
        op.compararFechas("25/05/2023", "21/08/2022");
        op.tiempoTranscurrido("01/01/2000", "01/01/2022");
        op.nombreDia();
        
        
    }
    
}
