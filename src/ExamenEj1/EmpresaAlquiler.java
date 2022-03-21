/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenEj1;

import java.util.Scanner;

/**
 *
 * @author ismae
 */
public class EmpresaAlquiler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner SC = new Scanner(System.in);
        Vehiculo vehiculoAlquiler;
        
        System.out.println("introduce el tipo de Vehículo");
        String nTipoVehiculo =SC.nextLine();  
               
       vehiculoAlquiler=new Vehiculo(nTipoVehiculo);
              
        System.out.println("introduce el número de horas");
        int horas =SC.nextInt();
        int coste=0;        
        switch(nTipoVehiculo) {
			case "coche":
				 coste =60*horas;
                                break;
			case "moto":
				coste =15*horas;
                                break;
                        default:
                            coste =10*horas;
        }
             
        vehiculoAlquiler.imprimir_extendido();
        System.out.println("El coste es "+coste);
    }
    
}
