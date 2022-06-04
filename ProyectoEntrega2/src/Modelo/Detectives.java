
package Modelo;


public class Detectives extends Oficina{
    int identifi;
    String nombre;
    int expe;
    String tipocaso;

    public Detectives(int identifi, String nombre, int expe, String tipocaso) {
        this.identifi = identifi;
        this.nombre = nombre;
        this.expe = expe;
        this.tipocaso = tipocaso;
    }


    public int getIdentifi() {
        return identifi;
    }

    public void setIdentifi(int identifi) {
        this.identifi = identifi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getExpe() {
        return expe;
    }

    public void setExpe(int expe) {
        this.expe = expe;
    }

    public String getTipocaso() {
        return tipocaso;
    }

    public void setTipocaso(String tipocaso) {
        this.tipocaso = tipocaso;
    }
    
    
    @Override
    public String toString() {
        return "\nnumero de identificacion: " + this.getIdentifi() +
                "\nnombre del detective: " + this.getNombre() +
                "\nexperiencia: " + this.getExpe() + " aÃ±os" +
                "\narea del detective: " + this.getTipocaso();
    }

    @Override
    public void setCasos(int n) {
    }

    @Override
    public void detectivesActivos() {
    }

    @Override
    public void setnewcaso(int n) {
    }

    @Override
    public void delete(int n) {
    }

    @Override
    public void mostrarCasos(int n) {
    }

  
    
    
    
    
    
}
