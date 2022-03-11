
package Vehiculos;
import java.util.*;
public class Camion extends VehiculoCarga{

    public Camion(int Tara, String matricula, int duracion) {
        super(Tara, matricula, duracion);
    }

    

    public Camion() {
    }
    
    @Override
    double alquiler() {
        return ((getDuracion()*50)+40);
    }
    
    void reciboCoche(){
        System.out.println("--------------------\n" +
                                    "CAMION\n" +
                            "--------------------");
        super.recibo();
    }
}
