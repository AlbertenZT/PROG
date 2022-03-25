
package entregar2103;

import java.util.*;

/**
4. Jefe de zona. Tiene despacho, 
tiene un secretario a su cargo, una lista de
vendedores a su cargo y tiene coche de la empresa (identificado por la matrícula,
marca y modelo). 
Incrementa su LiquidoAPercibir un 20% anual respecto al salarioBaseInicial
Tendrá, al menos, las siguientes funciones miembro:
• Constructores (debe rellenar la información personal y los datos principales)
• Imprimir (debe imprimir sus datos personales y su puesto en la empresa).
• Cambiar de secretario.
• Cambiar de coche.
• Dar de alta y de baja un nuevo vendedor en su zona.


 */
public class JefeDeZona extends Empleado{
    int despacho;
    Secretario secretario;
    List<Vendedor> vendedores;
    Coche brumBrum;

    public JefeDeZona(int despacho, Secretario secretario, List<Vendedor> vendedores, Coche brumBrum) {
        this.despacho = despacho;
        this.secretario = secretario;
        this.vendedores = vendedores;
        this.brumBrum = brumBrum;
    }

    public JefeDeZona(int despacho, Secretario secretario, List<Vendedor> vendedores, Coche brumBrum, String nombre, String apellidos, String DNI, String direccion, int AniosAntiguedad, int telefonoContacto, int Salario) {
        super(nombre, apellidos, DNI, direccion, AniosAntiguedad, telefonoContacto, Salario);
        this.despacho = despacho;
        this.secretario = secretario;
        this.vendedores = vendedores;
        this.brumBrum = brumBrum;
        LiquidoAPercibir = (float) (LiquidoAPercibir+(LiquidoAPercibir*0.2));
    }
    
    @Override
    void Imprimir(){
        System.out.println("Nombre: "+nombre+""
                + "/nappelido: "+apellidos
                + "/nDNI: "+DNI
                + "/ndireccion: "+direccion
                + "/nAños de antigüedad"+AniosAntiguedad
                + "/ntelefono: "+telefonoContacto
                + "/nSecretario: "+secretario
                + "/nDespacho: "+despacho
                + "/nVendedores: "+vendedores
                + "/nSalario: "+Salario
                + "/nLiquido: "+LiquidoAPercibir
                + "/ncoche Matricula: "+brumBrum.Matricula
                + "/ncoche Marca: "+brumBrum.Marca
                + "/ncoche Modelo: "+brumBrum.modelo);
    }
    void cambiarSecretario(Secretario secret){
        secretario = secret;
    }
    
    void CambiarCoche(String marca, String model,String matricula){
        brumBrum.Marca = marca;
        brumBrum.modelo = model;
        brumBrum.Matricula=matricula;
    }
    
    //Dar de alta y de baja un nuevo vendedor en su zona.
    
    void DarDeAlta(Vendedor cliente){
        vendedores.add(cliente);
        System.out.println("vendedor añadido");
        
        
    }
    
    void DarDeBaja(Vendedor cliente){
        if(vendedores.contains(cliente)){
            vendedores.remove(cliente);
            System.out.println("vendedor eliminado");
        }else{
            System.out.println("vendedor no encontrado");
        }
    }
    
}
