
package Excepciones;
import java.util.*;
import java.io.*;
public class TyrCatchFinally {
    public static void main(String[] args){
        try{
            System.out.println("Star opf the main logic");
            System.out.println("Try opening a file...");
            Scanner sc = new Scanner(new File("test.in"));
            System.out.println("File found, processing");
            System.out.println("End");
            
            
            
        }catch(FileNotFoundException e){
            System.out.println("File not caught");
        }
        finally{
            System.out.println("finally-blocks runs regardless of the state of Exception");
        }
        System.out.println("After try-catch-finally, life goes oninonionioninonino");
        
        
        
        
        
        
        
        
        
    }
}
