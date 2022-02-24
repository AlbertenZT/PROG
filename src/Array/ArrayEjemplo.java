
package Array;


public class ArrayEjemplo {
    
    public static void main(String[] args){
        
        int [] numeros = new int[5];//tamaño 5
    
        for(int i = 0;i<numeros.length;i++){
            numeros[i] = (int)(Math.random()*10);
        }//Asignar un Valor aleatorio a cada valor del Array
        
        
        for(int i = 0;i<numeros.length;i++){
            System.out.println(numeros[i]);
        }//Recorrer el Array y lo imprime
    }
    
    
    
}
