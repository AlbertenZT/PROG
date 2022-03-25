/*
2. Secretario. Tiene despacho, número de fax e incrementa su salario
para calcular su LiquidoAPercibir un 5% anual.
Tendrá, al menos, las siguientes funciones miembro:
• Constructores (debe rellenar la información personal y los datos principales)
• Imprimir (debe imprimir sus datos personales y su puesto en la empresa).

 */
package entregar2103;

/**
 *
 * @author alumno
 */
public class Secretario extends Empleado{
    int Descapacho;
    int numFax;

    public Secretario(int Descapacho, int numFax) {
        this.Descapacho = Descapacho;
        this.numFax = numFax;
    }

    public Secretario(int Descapacho, int numFax, String nombre, String apellidos, String DNI, String direccion, int AniosAntiguedad, int telefonoContacto, int Salario) {
        super(nombre, apellidos, DNI, direccion, AniosAntiguedad, telefonoContacto, Salario);
        this.Descapacho = Descapacho;
        this.numFax = numFax;
    }
    
    @Override
    
    void Imprimir(){
        System.out.println("Nombre: "+nombre+""
                + "/nappelido: "+apellidos
                + "/nDNI: "+DNI
                + "/ndireccion: "+direccion
                + "/nAños de antigüedad"+AniosAntiguedad
                + "/ntelefono: "+telefonoContacto
                + "/nSalario: "+Salario
                + "/nLiquido: "+LiquidoAPercibir
                + "/nFax: "+numFax
                + "/nDespacho: "+Descapacho);
    }
    
    
    
    
    
    
    
}
