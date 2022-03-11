
package Vehiculos;
import java.util.*;
public class Coche extends VehiculoTransporte{

    public Coche(int plazas, String matricula, int duracion) {
        super(plazas, matricula, duracion);
    }

    public Coche() {
    }
    
    @Override
    double alquiler() {
        return ((getDuracion()*50)+(1.5*getPlazas()));
    }
    
    void reciboCoche(){
        System.out.println("--------------------\n" +
                                    "COCHE\n" +
                            "--------------------");
        super.recibo();
    }
    
    
    
    
}
