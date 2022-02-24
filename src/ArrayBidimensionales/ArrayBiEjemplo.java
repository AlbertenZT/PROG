/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayBidimensionales;

public class ArrayBiEjemplo {
    public static void main(String[] args){
        
        int[][] arrayBi = new int[2][3];//crea una Array Bidimensional (Matriz) de 2 x 3
        
        //Recorrer el array bidimensional
        for(int i = 0;i<arrayBi.length;i++){//Recorre primero las filas, por eso el length
            for(int j = 0;j<arrayBi[i].length;j++){//Por cada fila, recorre todas las columnas y añade valor aleatorio
                arrayBi[i][j] = (int)(Math.random()*10);
            }
            
        }
        
        for(int i = 0;i<arrayBi.length;i++){
            for(int j = 0;j<arrayBi[i].length;j++){
                System.out.print(arrayBi[i][j]+" ");//Muestra por pantalla
            }
            System.out.println();
            
        }
        
    }
}
