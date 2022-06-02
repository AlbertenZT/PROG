
package probar;

import java.io.*;
import java.util.*;
import java.util.logging.*;

public class Tienda {
    ArrayList<Producto> productos;

    public Tienda() {
        productos=new ArrayList();
    }
    
    public void crearProducto(String nombre,double precio){
        Producto p = new Producto(nombre,precio);
        productos.add(p);
    }
    public void borrarProducto(String nombre){
        
        for (int i = 0; i < productos.size(); i++) {
            if(productos.get(i).getNombre().equals(nombre)){
                productos.remove(i);
            }
        }
    }
    public void mostrarLista(){
        for (int i = 0; i < this.productos.size(); i++) {
            System.out.println(this.productos.get(i).getNombre());
        }
    }
    public void guardarLista(String fichero) throws IOException{
        
            
        try {
            BufferedWriter bw=new BufferedWriter(new FileWriter(new File(fichero)));
            for (int i = 0; i < productos.size(); i++) {
                bw.write(productos.get(i).getNombre()+";"+productos.get(i).getPrecio()+";"+productos.get(i).getSerie()+";\n");
            }
            bw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Tienda.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    public void sustituir(String nuevoF){
        try {
            BufferedReader br=new BufferedReader(new FileReader(new File(nuevoF)));
            String linea=null;
            String [] a;
            productos.clear();
            while((linea=br.readLine())!=null){
                a=linea.split(";");
                double b=Double.parseDouble(a[1]);
                Producto p=new Producto(a[0],b);
                productos.add(p);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Tienda.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Tienda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    public static void main(String[] args){
        Tienda t=new Tienda();
        t.crearProducto("Refrigerador", 150.00);
        t.crearProducto("champu", 8);
        t.crearProducto("gel", 10.0);
        
        System.out.println("---------------------------");        
        
        t.mostrarLista();
        System.out.println("");
        t.borrarProducto("champu");
        t.mostrarLista();
        try {
            t.guardarLista("fichero.txt");
            /*
            añadir producto de fichero a la lista
            */
        } catch (IOException ex) {
            Logger.getLogger(Tienda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
