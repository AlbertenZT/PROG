
package Vehiculos;
import java.util.*;
public class Furgoneta extends VehiculoCarga{

    public Furgoneta(int Tara, String matricula, int duracion) {
        super(Tara, matricula, duracion);
    }

    

    public Furgoneta() {
    }
    
    @Override
    double alquiler() {
        return ((getDuracion()*50)+(getTara()*20));
    }
    
    void reciboCoche(){
        System.out.println("--------------------\n" +
                                    "FURGONETA\n" +
                            "--------------------");
        super.recibo();
    }
    
    
}
