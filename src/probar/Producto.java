
package probar;

import java.io.Serializable;
import java.util.*;

public class Producto implements Serializable{
    private String nombre;
    private double precio;
    private int serie;
    
    public Producto() {
        this.nombre = "";
        this.precio = 0;
        serie=generar();
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getSerie() {
        return serie;
    }
    
    
    
    
    public Producto(String nombre, double precio) {
        Scanner sc = new Scanner(System.in);
        this.nombre = nombre;
        if(precio<=0){
            while(precio<=0){
                System.out.println("digame un precio valido");
                precio = sc.nextInt();
                if(precio>0){
                    this.precio = precio;
                    break;
                } 
            }
        }else{this.precio = precio;}
        serie=generar();
        
    }
    private int generar(){
        int r = (int)(Math.random()*100000)+1;
        return r;
    }
    public void pedirNombre(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual será el nuevo nombre?");
        String nom = sc.nextLine();
        this.nombre=nom;
    }
    public void pedirPrecio(){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Cual será el nuevo Precio?");
            int nom = sc.nextInt();
            if(nom>0){
                this.precio=nom;
                break;
            }
        }
        
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("dime un precio valido");
            int precionuevo = sc.nextInt();
            if(precionuevo>0){
                this.precio = precio;
            }
            
        }
    }
    public boolean iguales(Producto p){
        if(this.getNombre().equals(p.getNombre())){
            System.out.println("nombre iguales");
            if(this.getSerie()==p.getSerie()){
                System.out.println("Serie identica.Son el mismo producto");
                return true;
            }else{System.out.println("Serie distinta.Son diferente producto");return false;}
        }else{System.out.println("nombre distinto.Son diferente producto");return false;}
    }
    
    public void resumen(){
        System.out.println("INFORME DE PRODUCTO \n" +
"------------------------------ \n" +
"<Nombre> \n" +getNombre()+
"<Serie> \n" +getSerie()+
"<Precio>\n "+getPrecio());
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + ", serie=" + serie + '}';
    }
    
    
    
    
}
