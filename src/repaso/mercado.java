package repaso;
import java.util.*;
public class mercado {
    private ArrayList lista = new ArrayList();
    private Producto producto;


    public ArrayList getLista() {
        return lista;
    }


    ArrayList compra(){

        int num = (int)((Math.random()*7)+1);
        for(int i = 0;i<num;i++){
            double precio = ((Math.random()*9)+1);
            int cantidad = (int)((Math.random()*3)+1);
            Producto producto = new Producto(cantidad,precio);
            lista.add(producto);
        }
        return lista;
    }
    public Producto getProducto() {
        return producto;
    }

    public static void main(String[] args){
        mercado persona = new mercado();
        persona.compra();
        System.out.println("**Cantidad**precio");
        
        int precio_final = 0;
        
        for(int i = 0;i<persona.getLista().size();i++){
            
            System.out.println("producto"+(i+1)+"          "+persona.getProducto().getCantidad()+"   "+persona.getProducto().getPrecio());
            precio_final += persona.getProducto().getPrecio();
        }
        
        System.out.println("Precio final:   "+precio_final+"€");

    }

}