/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList;
import java.util.*;
public class SaltadorPrincipal {
    
    public static int randoma(){
        int num =(int)(Math.random()*10);
        return num;
    }
    public static void main(String[] args){
        Saltador Manu = new Saltador("Manu",32);
        Saltador Yoshi = new Saltador("Yoshi",18);
        Saltador MariCarmen = new Saltador("MariCarmen",69);
        
        Manu.registrarSalto(randoma());
        Manu.registrarSalto(randoma());
        Yoshi.registrarSalto(randoma());
        Yoshi.registrarSalto(randoma());
        MariCarmen.registrarSalto(randoma());
        MariCarmen.registrarSalto(randoma());
        
        Manu.mostrar(); 
        
        
        
        
        
    }
}
