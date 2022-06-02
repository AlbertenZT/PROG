
package HerenciaRepaso;

public abstract class Vehiculo {
    
    String matricula;
    int Duraciondias;

    public Vehiculo(String matricula, int Duraciondias) {
        this.matricula = matricula;
        this.Duraciondias = Duraciondias;
    }

    public Vehiculo() {
        matricula="";
        Duraciondias=0;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getDuraciondias() {
        return Duraciondias;
    }

    public void setDuraciondias(int Duraciondias) {
        this.Duraciondias = Duraciondias;
    }
    
    public abstract double alquiler();
    
    public abstract void recibo();
    
}
