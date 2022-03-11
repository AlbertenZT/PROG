
package REPASOMOVIE;
import java.util.*;
import java.lang.*;
public class MovieSort {
    public static void main(String[] args){
        ArrayList<Movie> lista = new ArrayList<>();
        
        lista.add(new Movie("Stars",8.3,2005));
        lista.add(new Movie("Avatar",9.3,2007));
        lista.add(new Movie("Pixels",7.3,2012));
        lista.add(new Movie("Lego",5.3,2021));
        lista.add(new Movie("Qbert",8.3,2015));
        lista.add(new Movie("Death Note",9.3,2014));
        lista.add(new Movie("Sora no otoshimono",3.3,2009));
        lista.add(new Movie("Your name",1.3,2003));
        
        Collections.sort(lista, new Comparator<Movie>(){
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getYear()-o2.getYear();
            }
            
        });
                System.out.println("---------------------------------------------");

        System.out.println("Peliculas tras ordenar por año");
        for(Movie m:lista){
            System.out.println(m.getName()+", "+m.getRating()+", "+m.getYear());
        }
        
        Collections.sort(lista, new Comparator<Movie>(){
            @Override
            public int compare(Movie o1, Movie o2) {
                if(o1.getRating() > o2.getRating()){
                    return 1;
                }else if(o1.getRating() < o2.getRating()){
                    return -1;
                }else return 0;
            }
        });
                System.out.println("---------------------------------------------");

        System.out.println("Peliculas tras ordenar por rating");
        for(Movie m:lista){
            System.out.println(m.getName()+", "+m.getRating()+", "+m.getYear());
        }
        
        Collections.sort(lista, new Comparator<Movie>(){
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
            
        });
                System.out.println("---------------------------------------------");

        System.out.println("Peliculas tras ordenar por nombre");
        for(Movie m:lista){
            System.out.println(m.getName()+", "+m.getRating()+", "+m.getYear());
        }
        
        
        
         
    }
}
