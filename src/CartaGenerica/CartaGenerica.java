
package CartaGenerica;
import java.util.*;
public class CartaGenerica {
    private String palo;
    private int numero;
    
    public CartaGenerica() {
        
    }
    
    public CartaGenerica(String palo, int numero) {
        this.palo = palo;
        this.numero = numero;
    }
    
    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
    
    public String mostrar(){
        return "La carta es: "+getNumero()+" de "+getPalo();
    }
    
    
    
    
}
