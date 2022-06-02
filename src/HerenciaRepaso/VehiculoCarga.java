/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaRepaso;

public abstract class VehiculoCarga extends Vehiculo{
    
    int tara;

    public VehiculoCarga() {
        super("", 0);
        this.tara = 0;
    }

    public VehiculoCarga(int tara, String matricula, int Duraciondias) {
        super(matricula, Duraciondias);
        this.tara = tara;
    }

    public int getTara() {
        return tara;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }

    @Override
    public abstract double alquiler();
    
    @Override
    public void recibo(){
        System.out.println("Matricula: "+this.matricula);
        System.out.println("Duracion: "+this.Duraciondias);
        System.out.println("Toneladas: "+this.tara);
        System.out.println("Importe: "+"€");
    }
    
    
    
    
    
}
