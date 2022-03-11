package Array;

import java.util.*;

public class Entregar {

    /*Crea una matriz de 10 X 10 de letras en minúsculas(caracteres) 
    (con o sin la ñ como elijas),a continuación muestra por pantalla las cadenas
    formadas por sus filas, por sus columnas y por sus diagonales. 
    (puedes entregar la actividad sin mostrar las diagonales ).
     */
    char[][] matriz;

    Entregar() {
        Random r = new Random();
        matriz = new char[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] =(char) (r.nextInt(26)+'a');

            }
        }

    }

    void MostrarFilas() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j]+" ");

            }System.out.println("");
        }
    }
    void MostrarColumnas() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[j][i]+" ");

            }System.out.println("");
        }
    }

    public static void main(String[] args) {
        Entregar matriz = new Entregar();
        System.out.println("Por filas");
        matriz.MostrarFilas();
        System.out.println("--------------------------------------------");
        System.out.println("Por Columnas");
        matriz.MostrarColumnas();
    }

}
