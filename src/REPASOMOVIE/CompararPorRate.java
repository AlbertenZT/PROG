/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package REPASOMOVIE;

import java.util.Comparator;

public class CompararPorRate implements Comparator<Movie>{

    @Override
    public int compare(Movie o1, Movie o2) {
        if(o1.getRating() > o2.getRating()){
            return -1;
        }else if(o1.getRating() < o2.getRating()){
            return 1;
        }else return 0;
    }
    
}
