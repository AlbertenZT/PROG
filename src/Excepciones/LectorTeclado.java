/*
Realiza una clase con nombre LectorTeclado que
tenga como atributo un objeto de la clase Scanner que
permita leer datos en el teclado. El constructor de la
clase crea el objeto Scanner.
La clase tiene los métodos: leeTexto, leeEntero, leeDouble,
leeCaracter y leeBoolean, que solicitan al usuario un dato de sus
correspondientes tipos. Si se produce un error en la lectura de datos
leídos por teclado (nextLine, nextInt, nextDouble,
nextLine().charAt(0) y nextDouble), se debe solicitar de nuevo la
lectura. Una vez leído, si no hay error, se retorna el dato leído.
 */
package Excepciones;
import java.util.*;
public class LectorTeclado {
    static Scanner sc = new Scanner(System.in);
    public static void leeTexto(){
        
    }
    public static void leeEntero(){
        
    }
    //NO VA
    public static double leeDouble(){
        double num=0;
        try{
            System.out.println("Numero double");
            num = sc.nextDouble();
            return num;
            
            
        }catch(InputMismatchException ex){
            ex.getMessage();
            System.err.println("Error, InputMismatchException");
            sc.nextLine();
            leeDouble();
        }
        finally{
            
            return num;
        }

    }
    public static void leeCaracter(){
        
    }
    public static void leeBoolean(){
        
    }
    
    public static void main(String[] args){
        
        
        leeDouble();

        
        
        
    }
    
}
