/*
3. Vendedor. Tiene coche de la empresa (identificado por la matricula, marca y
modelo)
 */
package entregar2103;

public class Coche {
    String Matricula;
    String Marca;
    String modelo;

    public Coche(String Matricula, String Marca, String modelo) {
        this.Matricula = Matricula;
        this.Marca = Marca;
        this.modelo = modelo;
    }

    public Coche() {
        Matricula = "123456XXX";
        Marca = "Audi";
        modelo = "13-14";
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getMatricula() {
        return Matricula;
    }

    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return modelo;
    }
    
    
    
    
}
