
package Vehiculos;
import java.util.*;
abstract public class VehiculoCarga extends Vehiculo{
    int Tara;

    public VehiculoCarga(int Tara, String matricula, int duracion) {
        super(matricula, duracion);
        this.Tara = Tara;
    }

    
    public VehiculoCarga(){
        Tara=4;
    }

    public int getTara() {
        return Tara;
    }

    public void setTara(int Tara) {
        this.Tara = Tara;
    }
    
    @Override
    abstract double alquiler();
    
    void recibo(){
        System.out.println("Matricula:"+getMatricula()+" \n" +
                            "Duración: "+getDuracion()+" días \n" +
                            "Tara: "+getTara()+" Toneladas \n" +
                            "Importe:"+alquiler()+" € ");
    }
    
    
}
