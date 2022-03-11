/*
3 Implementa una miniaplicación reserva de cine.
En la aplicación tendremos una array bidemensional Sala de tamaño 6x6. En cada posición del array guardaremos el nombre de la
persona que realiza la reserva del asiento, (si una persona reserva 3 asientos aparecerá su nombre 3 veces), en caso de que el asiento no esté reservado el valor será cadena vacía. El sistema buscará asientos consecutivos en la misma fila para reservar y los mostrará al usuario. Posteriormente el usuario elegirá fila y asiento de comienzo (para reservarlo hay que volver a comprobar que cabe porque el usuario podría elegir cualquiera )
Ejemplo:
Introduce tu nombre:
Justin Chang
Introduce el número de asientos a reservar (mínimo 1):
4
Opciones disponibles:
Fila 1 asientos del 1 al 4
Fila 1 asientos del 2 al 5
Fila 1 asientos del 3 al 6
Fila 5 asientos del 2 al 5
Fila 6 asientos del 1 al 4
Fila elegida.
5
Asiento de comienzo:
2
Reserva realizada  Justin Chang4 

 */
package Array;

import java.util.*;

public class Cadena2 {

    String[][] sala;

    Cadena2() {
        sala = new String[6][6];
    }

    void reserva() {
        Scanner sc = new Scanner(System.in);
        System.out.println("cuantos asientos  desea reservar?");
        int numAsientos = sc.nextInt();
        sc.nextLine();
        System.out.println("a nombre de quien");
        String nombre = sc.nextLine();
        if (numAsientos < 6 && numAsientos > 0) {

            if (numAsientos == 1) {
                int contador = 0;
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 6; j++) {
                        if (sala[i][j] == null) {
                            sala[i][j] = nombre;
                            contador++;
                            if (contador == 1) {

                                break;
                            }
                            System.out.println("reserva hecha para 1 persona a nombre de:" + nombre + "\nFila: " + i + " Columna " + j);

                        }
                    }
                }
            }
            if (numAsientos == 2) {
                int contador = 0;
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 6; j++) {
                        if (sala[i][j] == null) {
                            sala[i][j] = nombre;
                            if (contador == 2) {
                                break;
                            }
                            contador++;
                            System.out.println("reserva hecha para 2 persona a nombre de:" + nombre + "\nFila: " + i + " Columna " + j);

                        }
                    }
                }
            }
            if (numAsientos == 3) {
                int contador = 0;
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 6; j++) {
                        if (sala[i][j] == null) {
                            sala[i][j] = nombre;
                            if (contador == 3) {

                                break;
                            }
                            contador++;
                            System.out.println("reserva hecha para 3 persona a nombre de:" + nombre + "\nFila: " + i + " Columna " + j);
                        }
                    }
                }
            }
            if (numAsientos == 4) {
                int contador = 0;
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 6; j++) {
                        if (sala[i][j] == null) {
                            sala[i][j] = nombre;
                            if (contador == 4) {

                                break;
                            }
                            contador++;
                            System.out.println("reserva hecha para 4 persona a nombre de:" + nombre + "\nFila: " + i + " Columna " + j);

                        }
                    }
                }
            }
            if (numAsientos == 5) {
                int contador = 0;
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 6; j++) {
                        if (sala[i][j] == null) {
                            sala[i][j] = nombre;
                            if (contador == 5) {

                                break;
                            }
                            contador++;

                            System.out.println("reserva hecha para 5 persona a nombre de:" + nombre + "\nFila: " + i + " Columna " + j);
                        }
                    }
                }
            }
            if (numAsientos == 6) {
                int contador = 0;
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 6; j++) {
                        if (sala[i][j] == null) {
                            sala[i][j] = nombre;
                            if (contador == 6) {

                                break;
                            }
                            contador++;

                            System.out.println("reserva hecha para 6 persona a nombre de:" + nombre + "\nFila: " + i + " Columna " + j);
                        }
                    }
                }
            }

        } else {
            System.out.println("Error");
        }
    }

    public static void main(String[] args) {
        Cadena2 Persona = new Cadena2();
        Persona.reserva();

    }

}
