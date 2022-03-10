/*
Crearemos
una clase Salto con:

String Nombre saltador (solo guardamos el
nombre no el objeto saltador)

Int distancia

Int  CompareTo: compara los saltos por distancia
(a mayor distancia mejor salto).

Crearemos
una clase Saltador con:

String Nombre:

Int  Edad:

Una lista
de saltos que denominaremos records:
está lista se recomiendo que sea estática. Tendrá una entrada por cada saltador
con su mejor salto. Estará ordenada de mayor a menor

registrarSalto(distancia):
 si es un nuevo record para el saltador
se sustituye su entrada en la lista y se reordena

Int ComparreTo
(Saltador) compara los saltadores
según su record, a mayor  distancia de
record está clasificado antes.

Añade los
contructores  y métodos ToString ,
mostrar, get y set que creas oportuno

Crea una
clase principal con 3 saltadores registra 2 saltos aleatorios para cada uno y
muestra los saltadores por orden y a continuación los records.
 */
package ArrayList;
import java.util.*;
public class Salto implements Comparable<Salto>{
    String nombre;
    int distancia;
    @Override
    public String toString() {
        return "Salto{" + "nombre=" + nombre + ", distancia=" + distancia + '}';
    }
    

    public Salto(String nombre, int distancia) {
        this.nombre = nombre;
        this.distancia = distancia;
    }

    
    public Salto(){
        nombre="";
        distancia =0;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
    
    @Override
    public int compareTo(Salto salto) {
        return this.distancia-salto.distancia;
    }

    
    
    
    
    
    
    
}
