package Array;

import java.util.*;

public class Cadena {

    String[] Array;
    Scanner sc = new Scanner(System.in);

    Cadena() {
        Array = new String[9];
        Array[0] = "Más";
        Array[1] = " ";
        Array[2] = "frio";
        Array[3] = " ";
        Array[4] = "tienen";
        Array[5] = " ";
        Array[6] = "los";
        Array[7] = " ";
        Array[8] = "Vecinos";
    }

    public void Reemplazar(String reemplazar, String reemplazado) {
        for (int i = 0;; i++) {
            if (Array[i].equals(reemplazado)) {
                Array[i] = reemplazar;
                break;
            }
        }
    }

    public void ELIMINAR(int posicion) {
        Array[posicion] = "";
    }

    public void ELIMINAR(String ELIMINAR) {
        int contador = 0;
        while(1==1) {
            
            if (Array[contador].equals(ELIMINAR)) {
                ELIMINAR(contador);
                

            }
            contador++;
            if (contador >= Array.length) {
                System.out.println("ESA PALABRA NO ESTÁ");
                break;
            }
        }

    }

    public void MOSTRAR() {
        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);

        }
    }

}
