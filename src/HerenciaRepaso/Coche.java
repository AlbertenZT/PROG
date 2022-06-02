/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaRepaso;

/**
 *
 * @author alumno
 */
public class Coche extends VehículoTransporte{

    public Coche(int plazas, String matricula, int Duraciondias) {
        super(plazas, matricula, Duraciondias);
    }

    public Coche() {
        plazas=5;
        matricula="";
        Duraciondias=0;
    }
    
    @Override
    public double alquiler() {
        double resultado =(Duraciondias*50)+(1.5*plazas);
        return resultado;
    }
    
    
    
    
    
    
    
    
}
