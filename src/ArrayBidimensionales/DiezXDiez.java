/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayBidimensionales;
import java.util.*;
public class DiezXDiez {

    public static void main(String [] args){
        char[][] matriz = new char[10][10];
        Random r = new Random();
        for(int i = 0;i<10;i++){
            for(int j = 0;j<10;j++){
                
                matriz[i][j]=(char)(r.nextInt(26)+'a');// no se poner una letra random
            }
        }
        
        for(int i = 0;i<10;i++){
            for(int j = 0;j<10;j++){
                System.out.print(matriz[i][j]); 
            }System.out.println();
        }
        System.out.println("");
        for(int i = 0;i<10;i++){
            for(int j = 0;j<10;j++){
                System.out.print(matriz[j][i]); 
            }System.out.println();
        }
        
        
        
        
        
    }
    
    
    
    
    
    
}
