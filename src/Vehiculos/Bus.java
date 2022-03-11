
package Vehiculos;
import java.util.*;
public class Bus extends VehiculoTransporte{

    public Bus(int plazas, String matricula, int duracion) {
        super(plazas, matricula, duracion);
    }
    

    

    public Bus() {
    }
    
    @Override
    double alquiler() {
        return ((getDuracion()*1.5*50)+(getPlazas()*2));
    }
    
    void reciboCoche(){
        System.out.println("--------------------\n" +
                                    "BUS\n" +
                            "--------------------");
        super.recibo();
    }
    
    
    
    
    
}

