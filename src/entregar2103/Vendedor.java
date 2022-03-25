
package entregar2103;

import java.util.*;

/*

3. Vendedor. Tiene coche de la empresa (identificado por la matricula, marca y
modelo), teléfono móvil (diferente del de contacto) , 
área de venta, lista de clientes y porcentaje que se lleva
de las ventas en concepto de comisiones. 
Incrementa su LiquidoAPercibir un 10% anual respecto al salarioBaseInicial

Tendrá, al menos, las siguientes funciones miembro:
• Constructores (debe rellenar la información personal y los datos principales)
• Imprimir (debe imprimir sus datos personales y su puesto en la empresa).
• Dar de alta un nuevo cliente.
• Dar de baja un cliente.
• Cambiar de coche.

*/
public class Vendedor extends Empleado{
    Coche cocheEmpresa;
    int telefonoOtro;
    int AreaVenta;
    List clientes;

    public Vendedor(Coche cocheEmpresa, int telefonoOtro, int AreaVenta, List clientes) {
        this.cocheEmpresa = cocheEmpresa;
        this.telefonoOtro = telefonoOtro;
        this.AreaVenta = AreaVenta;
        this.clientes = clientes;
    }

    public Vendedor(Coche cocheEmpresa, int telefonoOtro, int AreaVenta, List clientes, String nombre, String apellidos, String DNI, String direccion, int AniosAntiguedad, int telefonoContacto, int Salario) {
        
        super(nombre, apellidos, DNI, direccion, AniosAntiguedad, telefonoContacto, Salario);
        this.cocheEmpresa = cocheEmpresa;
        this.telefonoOtro = telefonoOtro;
        this.AreaVenta = AreaVenta;
        this.clientes = clientes;
        LiquidoAPercibir=(float) (LiquidoAPercibir+(LiquidoAPercibir*0.1));
        
    }
    //Imprimir
    @Override
    void Imprimir(){
        System.out.println("Nombre: "+nombre+""
                + "/nappelido: "+apellidos
                + "/nDNI: "+DNI
                + "/ndireccion: "+direccion
                + "/nAños de antigüedad"+AniosAntiguedad
                + "/ntelefono: "+telefonoContacto
                + "/ntelefono: "+telefonoOtro
                + "/nArea Ventas: "+AreaVenta
                + "/nLista Clientes: "+clientes
                + "/nSalario: "+Salario
                + "/nLiquido: "+LiquidoAPercibir
                + "/ncoche Matricula: "+cocheEmpresa.Matricula
                + "/ncoche Marca: "+cocheEmpresa.Marca
                + "/ncoche Modelo: "+cocheEmpresa.modelo);
    }
    
    //Dar de alta un nuevo cliente.
    void DarDeAlta(String cliente){
        clientes.add(cliente);
        System.out.println("Cliente añadido");
        
        
    }
    //Dar de baja un nuevo cliente.
    void DarDeBaja(String cliente){
        if(clientes.contains(cliente)){
            clientes.remove(cliente);
            System.out.println("Cliente eliminado");
        }else{
            System.out.println("Cliente no encontrado");
        }
    }
    void CambiarCoche(String marca, String model,String matricula){
        cocheEmpresa.Marca = marca;
        cocheEmpresa.modelo = model;
        cocheEmpresa.Matricula=matricula;
    }
    
    
    
    
    
    
    
    
    
}
