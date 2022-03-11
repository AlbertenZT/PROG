
package ArrayList;
import java.util.*;
public class prueba {
    public static void main(String[] args){
        List lista = new ArrayList();
        lista.add("pedro");
        lista.add("Jaime");
        lista.add("Chalie");
        lista.add("Helena");
        lista.add("Laura");
        lista.add("Ponce");
        lista.add("Roman");
        lista.add("Oscar");
        
        lista.add(2,"Alberto");
        lista.remove(0);
        lista.indexOf("Laura");
        lista.set(0, "Carlitos");
        

        /*for( Object m : lista){
            System.out.println(m);
        }*/
        
        Iterator it = lista.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        
    }
}
