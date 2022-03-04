/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CartaGenerica;

import java.util.*;

public class CartaEspaniola extends CartaGenerica {

    @Override
    public void setPalo(String palo) {
        Scanner sc = new Scanner(System.in);
        boolean permitido = false;
        while (permitido = false) {

            if (palo == "Oros") {
                permitido = true;
            } else if (palo == "Bastos") {
                permitido = true;
            } else if (palo == "Espadas") {
                permitido = true;
            } else if (palo == "Copas") {
                permitido = true;
            } else {
                System.out.println("Dime un palo valido");
                palo = sc.nextLine();
            }

        }
        super.setPalo(palo);
    }

    @Override
    public void setNumero(int numero) {
        Scanner sc = new Scanner(System.in);
        boolean permitido = false;
        while (permitido = false) {

            if (numero >= 1 && numero <= 12) {
                permitido = true;
            } else {
                System.out.println("Ponga un numero valido");
                numero = sc.nextInt();
            }
            super.setNumero(numero);
        }
    }

    @Override
    public String toString() {
        String ElNumero ="";
        
        if(getNumero()== 12){
            ElNumero = "REY";
            return "La carta es: "+ElNumero+" de "+getPalo();
        } else if(getNumero()== 11){
            ElNumero = "CABALLO";
            return "La carta es: "+ElNumero+" de "+getPalo();
        }else if(getNumero()== 10){
            ElNumero = "SOTA";
            return "La carta es: "+ElNumero+" de "+getPalo();
        } else{return "La carta es: "+getNumero()+" de "+getPalo();}
    }
    
    
    
    @Override
    public String mostrar(){
        String ElNumero ="";
        
        if(getNumero()== 12){
            ElNumero = "REY";
            return "La carta es: "+ElNumero+" de "+getPalo();
        } else if(getNumero()== 11){
            ElNumero = "CABALLO";
            return "La carta es: "+ElNumero+" de "+getPalo();
        }else if(getNumero()== 10){
            ElNumero = "SOTA";
            return "La carta es: "+ElNumero+" de "+getPalo();
        } else{return "La carta es: "+getNumero()+" de "+getPalo();}
        
    }

}
