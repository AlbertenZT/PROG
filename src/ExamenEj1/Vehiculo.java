/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenEj1;

/**
 *
 * @author ismae
 */
public class Vehiculo {
    private String tipo;
    //por defecto los vehículos son uniplaza excepto que sean coches o motos
    private int plazas;
Vehiculo(){}
Vehiculo(String Ntipo){
  tipo=Ntipo;
     switch(Ntipo) {
	case "coche":
             plazas=5;
             break;
	case "moto":
            plazas=2;   
            break;
        default:
            plazas=1;
        }
 
   }
public String getTipo() {
    return tipo;
}
public void setTipo(String Ntipo) {
    this.tipo = Ntipo;
   switch(Ntipo) {
	case "coche":
            plazas=5;
            break;
	case "moto":
             plazas=2;   
             break;
        default:
              plazas=1;
        }
}
public int getPlazas() {
return plazas;
}
public void imprimir_Basico(){
System.out.print("TIPO");   
System.out.print(tipo);
System.out.print("PLAZAS");  
System.out.print(plazas);
}
public void imprimir_extendido(){
System.out.print("TIPO");   
System.out.print(tipo);
System.out.print("PLAZAS");  
System.out.print(plazas);
int precio;
     switch(tipo) {
        case "coche":
            precio=60;
             break;
	case "moto":
            precio=15;    
            break;
        default:
            precio=10;
        }

}

    
}
