
package Modelo;


public class Bitacora{
    
    String[] fecha;
    String[] observacion;

    public Bitacora (String[] fecha, String[] observacion) {
        this.fecha = fecha;
        this.observacion = observacion;
    }

    public Bitacora() {
    }
    
    
    public String[] getFecha() {
        return fecha;
    }

    public void setFecha(String[] fecha) {
        this.fecha = fecha;
    }
    
    public String[] getObservacion() {
        return observacion;
    }

    public void setObservacion(String[] observacion) {
        this.observacion = observacion;
    }

    public void setBitacora(int n)
    {
        
    }
}
