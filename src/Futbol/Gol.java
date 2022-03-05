
package Futbol;
import java.util.*;
public class Gol {
    String nombreEquipo;
    String jugador;
    int minuto;

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    @Override
    public String toString() {
       return nombreEquipo+" .Goleador: "+jugador+".Minuto: "+minuto;
    }
    
}
