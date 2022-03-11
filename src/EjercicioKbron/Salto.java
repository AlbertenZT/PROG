/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioKbron;
import java.lang.*;
import java.util.*;
public class Salto implements Comparable<Salto>{
        String nombre;
        int distancia;

    public Salto(String nombre, int distancia) {
        this.nombre = nombre;
        this.distancia = distancia;
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
    public String toString() {
        return "Salto{" + "nombre=" + nombre + ", distancia=" + distancia + '}';
    }

    @Override
    public int compareTo(Salto o) {
        return this.getDistancia()-o.getDistancia();
    }
        
}
