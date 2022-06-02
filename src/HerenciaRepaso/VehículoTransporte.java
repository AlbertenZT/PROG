package HerenciaRepaso;

public abstract class VehículoTransporte extends Vehiculo{
    
    int plazas;

    public VehículoTransporte(int plazas, String matricula, int Duraciondias) {
        super(matricula, Duraciondias);
        this.plazas = plazas;
    }

    public VehículoTransporte() {
        super("", 0);
        plazas = 2;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }
    
    @Override
    public abstract double alquiler();
    
    @Override
    public void recibo(){
        System.out.println("Matricula: "+this.matricula);
        System.out.println("Duracion: "+this.Duraciondias);
        System.out.println("Plazas: "+this.plazas);
        System.out.println("Importe: "+"€");
        
    }
    
}
