package Array;

import java.util.*;

public class main {

    public static void main(String[] args) {
        Cadena acadena = new Cadena();
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.println("1- Mostrar la cadena\n"
                    + "2- Reemplazar\n"
                    + "3- Eliminar por posición\n"
                    + "4- Eliminar por palabra\n");

            num = sc.nextInt();

            switch (num) {
                case 1:
                    acadena.MOSTRAR();
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Que cadena a reemplazar?");
                    String reemplazado=  sc.nextLine();
                    System.out.println("Que cadena a poner en su lugar?");
                    String reemplazar=  sc.nextLine();
                    acadena.Reemplazar(reemplazar, reemplazado);
                    break;
                case 3:
                    System.out.println("dime la posicion a borrar");
                    int nume=  sc.nextInt(); 
                    acadena.ELIMINAR(nume);
                    break;
                case 4 :
                    sc.nextLine(); 
                    System.out.println("dime la cadena a borrar");
                    String numer=  sc.nextLine(); 
                    acadena.ELIMINAR(numer);
                    break;
                default:
                    System.out.println("VALOR INCORRECTO");
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
            }

        } while (num != 0);

    }
}
