
package Actividad1;


public class Direccion {
    private String direccionDomicilio;
    private String direccionTrabajo;
    private String nombreEmpresa;

    public Direccion(String direccionDomicilio, String direccionTrabajo, String nombreEmpresa) {
        this.direccionDomicilio = direccionDomicilio;
        this.direccionTrabajo = direccionTrabajo;
        this.nombreEmpresa=nombreEmpresa;
    }

    public String getDireccionDomicilio() {
        return direccionDomicilio;
    }

    public void setDireccionDomicilio(String direccionDomicilio) {
        this.direccionDomicilio = direccionDomicilio;
    }

    public String getDireccionTrabajo() {
        return direccionTrabajo;
    }

    public void setDireccionTrabajo(String direccionTrabajo) {
        this.direccionTrabajo = direccionTrabajo;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
    
    
    
    
    
    
}
