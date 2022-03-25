
package ArrayList;

import java.util.*;

public class ArrayListEjemplo {
    
    public static void main(String[] args){
        //ArrayList o linkedlist normal
        
        //Pila
        
        Stack<String> pila = new Stack<>();
        pila.push("Alfredo");//empujo /añado
        pila.push("Lucas");
        pila.push("Manuel");
        pila.push("Pedro");
        pila.push("Andrea");
        
        while(!pila.isEmpty()){
            System.out.println(pila.pop()); //Muestro y elimino
        }
        
        
        //Cola
        Queue<Object> cola = new LinkedList();
        cola.offer("Roman");
        cola.offer("Ariel");
        cola.offer("Laura");
        cola.offer("Carolina");
        cola.offer("Ivan");
        cola.offer("Ponce");
        for(Object m:cola){
            System.out.println(cola.peek());
        }
        System.out.println("peek: "+cola);
        while(!cola.isEmpty()){
            System.out.println(cola.poll());
        }
        System.out.println("poll: "+cola);
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
