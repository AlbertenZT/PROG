
package Vehiculos;
import java.util.*;
abstract public class Vehiculo {
    String matricula;
    int duracion;

    public Vehiculo(String matricula, int duracion) {
        this.matricula = matricula;
        this.duracion = duracion;
    }
    
    public Vehiculo (){
        matricula = "12345678Y";
        duracion = 200;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    abstract double alquiler();
    abstract void recibo();
    
    
    
    
    
    
    
    
}
