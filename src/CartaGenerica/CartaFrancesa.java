/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CartaGenerica;

import java.util.Scanner;

public class CartaFrancesa extends CartaGenerica{
    
    @Override
    public void setPalo(String palo) {
        Scanner sc = new Scanner(System.in);
        boolean permitido = false;
        while (permitido = false) {

            if (palo == "Rombos") {
                permitido = true;
            } else if (palo == "Picas") {
                permitido = true;
            } else if (palo == "Corazones") {
                permitido = true;
            } else if (palo == "Treboles") {
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

            if (numero >= 1 && numero <= 13) {
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
        if(getNumero()== 13){
            ElNumero = "K";
            return "La carta es: "+ElNumero+" de "+getPalo();
        } else if(getNumero()== 12){
            ElNumero = "Q";
            return "La carta es: "+ElNumero+" de "+getPalo();
        }else if(getNumero()== 11){
            ElNumero = "J";
            return "La carta es: "+ElNumero+" de "+getPalo();
        } else{return "La carta es: "+getNumero()+" de "+getPalo();}
    }
    
    @Override
    public String mostrar(){
        String ElNumero ="";
        if(getNumero()== 13){
            ElNumero = "K";
            return "La carta es: "+ElNumero+" de "+getPalo();
        } else if(getNumero()== 12){
            ElNumero = "Q";
            return "La carta es: "+ElNumero+" de "+getPalo();
        }else if(getNumero()== 11){
            ElNumero = "J";
            return "La carta es: "+ElNumero+" de "+getPalo();
        } else{return "La carta es: "+getNumero()+" de "+getPalo();}
        
    }
}
