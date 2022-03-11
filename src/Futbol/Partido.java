
package Futbol;
import java.util.*;
public class Partido {
    String Local;
    String Visitante;
    ArrayList<Gol> goles;
    

    public Partido() {
        goles = new ArrayList<Gol>();
        Local = "";
        Visitante="";
        
    }
    public Partido(String Local,String Visitante) {
        goles = new ArrayList<Gol>();
        this.Local = Local;
        this.Visitante=Visitante;
        
    }

    public String getLocal() {
        return Local;
    }

    public void setLocal(String Local) {
        this.Local = Local;
    }

    public String getVisitante() {
        return Visitante;
    }

    public void setVisitante(String Visitante) {
        this.Visitante = Visitante;
    }

    public ArrayList<Gol> getGoles() {
        return goles;
    }

    public void setGoles(int minuto,String jugador,String NombreEquipo) {
        Gol golazo = new Gol();
        golazo.setJugador(jugador);
        golazo.setMinuto(minuto);
        golazo.setNombreEquipo(NombreEquipo);
        goles.add(golazo);  
    }
    
    public void resultado(){
        
        System.out.println("El resultado es: ");
        System.out.println(Local+" - "+Visitante);
        System.out.println(goles);
    }

    public static void main(String[] args){
        Partido p1 = new Partido("IbaiTeam","Beti");
        Partido p2 = new Partido("IbaiTeam","Atleti");
        Partido p3 = new Partido("IbaiTeam","Chiclana");
        Partido p4 = new Partido("Chiclana","Atleti");
        Partido p5 = new Partido("Chiclana","IbaiTeam");
        Partido p6 = new Partido("Chiclana","Beti");
        Partido p7 = new Partido("Atleti","Beti");
        Partido p8 = new Partido("Atleti","IbaiTeam");
        Partido p9 = new Partido("Atleti","Chiclana");
        Partido p10 = new Partido("Beti","Atleti");
        Partido p11 = new Partido("Beti","IbaiTeam");
        Partido p12 = new Partido("Beti","Chiclana");
        
        
        ArrayList<Partido> listaP = new ArrayList();
        listaP.add(p1);
        listaP.add(p2);
        listaP.add(p3);
        listaP.add(p4);
        listaP.add(p5);
        listaP.add(p6);
        listaP.add(p7);
        listaP.add(p8);
        listaP.add(p9);
        listaP.add(p10);
        listaP.add(p11);
        listaP.add(p12);
        
        //Al no especificar que usemos metodos para asignar goles random yo he decidido ponerlos en el codigo
        p1.setGoles(01, "ibai ", "IbaiTeam");
        p2.setGoles(05, "ibai ", "IbaiTeam");
        p3.setGoles(07, "ibai ", "IbaiTeam");
        p4.setGoles(27, "Rafa ", "Chiclana");
        p5.setGoles(29, "Rafa ", "Chiclana");
        p6.setGoles(35, "Rafa ", "Chiclana");
        p7.setGoles(43, "Lucia ", "Atleti");
        p8.setGoles(45, "Lucia ", "Atleti");
        p9.setGoles(47, "Lucia ", "Atleti");
        p10.setGoles(50, "Carlos ", "Beti");
        p11.setGoles(59, "Carlos ", "Beti");
        p12.setGoles(69, "Manu ", "Beti");
        
        for(int i = 0;i< listaP.size();i++){
            listaP.get(i).resultado();
        }
        
        
  
    }   
}
