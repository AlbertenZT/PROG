
package ArrayList;
import java.util.*;
public class Saltador implements Comparable<Saltador>{
    
    String nombre;
    int Edad;
    static ArrayList<Salto> records = new ArrayList();
    
    public Saltador(String nombre, int Edad) {
        this.nombre = nombre;
        this.Edad = Edad;
        Salto salto = new Salto(nombre,0);
        records.add(salto);
    }
    public Saltador(){
        nombre = "";
        Edad =0;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    public void registrarSalto(int distancia){
        Salto salto = new Salto(nombre,distancia);
        int nom = records.indexOf(nombre);
        System.out.println(nom);
        /*if(records.get(nom).compareTo(salto)<0){
            records.set(nom, salto);
            
        }
        Collections.sort(records);*/
        
    }

    public ArrayList<Salto> getRecords() {
        return records;
    }
    

    @Override
    public int compareTo(Saltador Ibai) {
        int Saltarin1 = records.indexOf(Ibai);
        int Saltarin2 = records.indexOf(nombre);
        return records.get(Saltarin1).getDistancia()-records.get(Saltarin2).getDistancia();
        
    }

    @Override
    public String toString() {
        return "Saltador{" + "nombre=" + nombre + ", Edad=" + Edad + '}';
    }
    
    public void mostrar(){
        Collections.sort(records);
        for(int i = 0;i<records.size();i++){
            System.out.println("RECORD "+i+": "+records.get(i));
        }
    }
    
}
