/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenEj2;
import java.util.*;
public class Recomendada implements Comparable<Recomendada>{
    static List <Visionado>  ListaVisionadas = new LinkedList();
    Pelicula pelicula;

    public Recomendada(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
    
    
    int puntuación(){
        int rating=0;
        
        for(int i = 0;i<ListaVisionadas.size();i++){
            if(ListaVisionadas.get(i).haGustado() && ListaVisionadas.get(i).getPeliculaVista().getDirector().equals(pelicula.getDirector())){
                rating +=3;
            }
            if(!(ListaVisionadas.get(i).haGustado()) && ListaVisionadas.get(i).getPeliculaVista().getDirector().equals(pelicula.getDirector())){
                rating -=3;
            }
            
                if(ListaVisionadas.get(i).haGustado() && ListaVisionadas.get(i).getPeliculaVista().getActores().contains(pelicula.getActores())){
                    rating +=1;
                }
                if(!(ListaVisionadas.get(i).haGustado()) && ListaVisionadas.get(i).getPeliculaVista().getActores().contains(pelicula.getActores())){
                    rating -=1;
                } 
            
                
        }
        
        return rating;
    }
    
    
    
    
    
    
    public void registrarVisionada(Visionado v){
        
        //Si la lista CONTIENE la Visionada y la visualizaciones mayor
        if(ListaVisionadas.contains(v) && pelicula.getDuración()<v.getTiempo()){
            int indice = ListaVisionadas.indexOf(v);
            
            int nuevoTiempo= v.getTiempo()+v.getPeliculaVista().getDuración();
            
            ListaVisionadas.get(indice).getPeliculaVista().setDuración(nuevoTiempo);
        }else{
            ListaVisionadas.add(v);
        }
    }

    public List<Visionado> getListaVisionadas() {
        return ListaVisionadas;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
    
    
    
    public void mostrarVistas(){
        for(int i = 0;i<ListaVisionadas.size();i++){
            System.out.println("Puntuación: "+puntuación()+" nombre: "+ListaVisionadas.get(i).peliculaVista.getTítulo());
        }
    }
    public void mostrarNoVistas(List <Recomendada> NoVistas){
        for(int i = 0;i<NoVistas.size();i++){
            System.out.println("Puntuación: "+puntuación()+" nombre: "+NoVistas.get(i).getPelicula().getTítulo());
        }
    }

    @Override
    public int compareTo(Recomendada arg0) {
        return this.puntuación()-arg0.puntuación();
    }

    
    
    void borrarPelicualsdeActor(String actor){
        List <Pelicula> ListaNueva = new LinkedList();
        for(int i = 0;i<ListaVisionadas.size();i++){
            if(ListaVisionadas.get(i).getPeliculaVista().getActores().contains(actor)){
                ListaNueva.add(ListaVisionadas.get(i).getPeliculaVista());
            }
        }
        ListaVisionadas.removeAll(ListaNueva);
    }
    
    
}
