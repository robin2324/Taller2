
package Ejercicio1Modelo;


public class Perecedero extends Producto{
    
    private int noDiasCaducar;
    double preciof;

    public Perecedero() {
    }

    public Perecedero(int noDiasCaducar, String nombre, double precio) {
        super(nombre, precio);
        this.noDiasCaducar = noDiasCaducar;
    }

    public int getNoDiasCaducar() {
        return noDiasCaducar;
    }

    public void setNoDiasCaducar(int noDiasCaducar) {
        this.noDiasCaducar = noDiasCaducar;
    }
    

    @Override
    public double getPreciof() {
        if (noDiasCaducar==1){
            preciof = super.getPrecio()/4;
        }else if (noDiasCaducar==2){
            preciof = super.getPrecio()/3;
        }else if (noDiasCaducar==3){
            preciof = super.getPrecio()/2;
        }else{
            preciof=this.getPrecio();
        }
        
        
        return preciof; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
