
package EjercicioKbron;
import java.util.*;
public class TresEnRaya {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<Integer,Character>Tablero = new TreeMap<>();
        boolean Partida=true;
        int ganador=0;
        Tablero.put(1, '1');
        Tablero.put(2, '2');
        Tablero.put(3, '3');
        Tablero.put(4, '4');
        Tablero.put(5, '5');
        Tablero.put(6, '6');
        Tablero.put(7, '7');
        Tablero.put(8, '8');
        Tablero.put(9, '9');
        do{
            System.out.println(Tablero.get(1)+" "+Tablero.get(2)+" "+Tablero.get(3));
            System.out.println(Tablero.get(4)+" "+Tablero.get(5)+" "+Tablero.get(6));
            System.out.println(Tablero.get(7)+" "+Tablero.get(8)+" "+Tablero.get(9));
            
            System.out.println("--------------");
            System.out.println("Turno de X! en que casilla desea colocar su X");
            int num = sc.nextInt();
            Tablero.put(num,'X');
            if(
               Tablero.get(1).equals('X')&&Tablero.get(2).equals('X')&&Tablero.get(3).equals('X')||
               Tablero.get(1).equals('X')&&Tablero.get(4).equals('X')&&Tablero.get(7).equals('X')||
               Tablero.get(2).equals('X')&&Tablero.get(5).equals('X')&&Tablero.get(8).equals('X')||
               Tablero.get(3).equals('X')&&Tablero.get(6).equals('X')&&Tablero.get(9).equals('X')||
               Tablero.get(4).equals('X')&&Tablero.get(5).equals('X')&&Tablero.get(6).equals('X')||
               Tablero.get(7).equals('X')&&Tablero.get(8).equals('X')&&Tablero.get(9).equals('X')||
               Tablero.get(1).equals('X')&&Tablero.get(5).equals('X')&&Tablero.get(9).equals('X')||
               Tablero.get(7).equals('X')&&Tablero.get(5).equals('X')&&Tablero.get(3).equals('X')
               ){
                Partida=false;
                break;
            }
            System.out.println(Tablero.get(1)+" "+Tablero.get(2)+" "+Tablero.get(3));
            System.out.println(Tablero.get(4)+" "+Tablero.get(5)+" "+Tablero.get(6));
            System.out.println(Tablero.get(7)+" "+Tablero.get(8)+" "+Tablero.get(9));
            
            System.out.println("--------------");
            
            System.out.println("Turno de O! en que casilla desea colocar su O");
            int num2 = sc.nextInt();
            Tablero.put(num2,'O');
            
            
            if(
               Tablero.get(1).equals('O')&&Tablero.get(2).equals('O')&&Tablero.get(3).equals('O')||
               Tablero.get(1).equals('O')&&Tablero.get(4).equals('O')&&Tablero.get(7).equals('O')||
               Tablero.get(2).equals('O')&&Tablero.get(5).equals('O')&&Tablero.get(8).equals('O')||
               Tablero.get(3).equals('O')&&Tablero.get(6).equals('O')&&Tablero.get(9).equals('O')||
               Tablero.get(4).equals('O')&&Tablero.get(5).equals('O')&&Tablero.get(6).equals('O')||
               Tablero.get(7).equals('O')&&Tablero.get(8).equals('O')&&Tablero.get(9).equals('O')||
               Tablero.get(1).equals('O')&&Tablero.get(5).equals('O')&&Tablero.get(9).equals('O')||
               Tablero.get(7).equals('O')&&Tablero.get(5).equals('O')&&Tablero.get(3).equals('O')
               ){
                Partida=false;
                ganador =1;
                break;
            }
        }while(Partida=true);
        
        if(ganador==0){
            System.out.println("EL GANADOR ES X!");
        }else{
            System.out.println("El ganador es O!");
        }
        
        
    }
}
