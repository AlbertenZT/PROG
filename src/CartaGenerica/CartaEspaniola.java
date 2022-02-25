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

}
