
package Vehiculos;
import java.util.*;
abstract public class VehiculoTransporte extends Vehiculo{
    
    int plazas;

    public VehiculoTransporte(int plazas, String matricula, int duracion) {
        super(matricula, duracion);
        this.plazas = plazas;
    }
    
    public VehiculoTransporte() {
        plazas = 5;
    }
    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    @Override
    abstract double alquiler();
    
    @Override
    void recibo(){
        System.out.println("Matricula:"+getMatricula()+" \n" +
                            "Duración: "+getDuracion()+" días \n" +
                            "Plazas: "+getPlazas()+" \n" +
                            "Importe:"+alquiler()+" € ");
    }
    
    
    
    
    
    
    
    
    
}
