
package EjercicioKbron;
import java.util.*;
import java.lang.*;
public class Saltador implements Comparable<Saltador>{
    String Nombre;
    int edad;
    static List<Salto> records = new ArrayList<>();
    

    public Saltador(String Nombre, int edad) {
        this.Nombre = Nombre;
        this.edad = edad;
        Salto saltito = new Salto(Nombre,0);
        records.add(saltito);
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static List<Salto> getRecords() {
        return records;
    }
    
    public int GetIndex(String nombre){
        for(int i = 0;i<records.size();i++){
            if(records.get(i).getNombre().equalsIgnoreCase(nombre)){
                return i;
            }
        }
        return -1;
    }
    void registrarSalto(int distancia){
        Salto saltito2 = new Salto(Nombre,distancia);
        int indice = GetIndex(this.Nombre);
        if(records.get(indice).compareTo(saltito2)<0){
            records.set(indice, saltito2);
        }
        Collections.sort(records,Collections.reverseOrder());
        
    }

    @Override
    public int compareTo(Saltador o) {
        
        int indice = GetIndex(this.getNombre());
        int indice2 = GetIndex(o.getNombre());
        return indice-indice2;
    }
   
}
