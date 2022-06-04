
package Modelo;


public class Ultima_direccion extends Sospechosos{
    int numvivienda;
    String departamento;
    String pais;
    String descri_fisica;
    Sospechosos sospechoso;

    public Ultima_direccion(int numvivienda, String departamento, String pais, String descri_fisica, int id, String nombre, String alias, int edad) {
        super(id, nombre, alias, edad);
        this.numvivienda = numvivienda;
        this.departamento = departamento;
        this.pais = pais;
        this.descri_fisica = descri_fisica;
    }
    

    public int getNumvivienda() {
        return numvivienda;
    }

    public void setNumvivienda(int numvivienda) {
        this.numvivienda = numvivienda;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDescri_fisica() {
        return descri_fisica;
    }

    public void setDescri_fisica(String descri_fisica) {
        this.descri_fisica = descri_fisica;
    }

    public Sospechosos getSospechoso() {
        return sospechoso;
    }

    public void setSospechoso(Sospechosos sospechoso) {
        this.sospechoso = sospechoso;
    }
    
    @Override
    public String toString() {
        return "\nnumvivenda: " + this.getNumvivienda()+
                "\ndepartamento: " + this.getDepartamento() +
                "\npais: " + this.getPais()+
                "\ndescripcion fisica:" + this.getDescri_fisica();
    }
    
}
