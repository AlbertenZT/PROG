
package Vehiculos;
import java.util.*;
public class Alquiler implements Exportable{
    Vehiculo[] pedido;
    String nombreEmpresa;
    
    @Override
    public void mostrar() {
        
    }
    
    public Alquiler(int Nvehiculos){
        Scanner sc = new Scanner(System.in);
        pedido = new Vehiculo[Nvehiculos];
        
        for(int i = 0;i < pedido.length;i++){
        System.out.println("Dime el tipo de vehiculo");
        char veh = sc.next().charAt(0);
        switch(veh){
            case 'C':
                System.out.println("matricula");
                String mat = sc.nextLine();
                System.out.println("duracion en dias");
                int dias = sc.nextInt();
                System.out.println("Plazas");
                int pl = sc.nextInt();
                Coche coche = new Coche(pl,mat,dias);
                pedido[i]=coche;
                break;
            
        }
        
    }}
    
}
