/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entregar2103;

public class Empleado {
    /*
    . Empleado. Clase básica que describe a un empleado. Incluye sus datos
personales (nombre, apellidos, DNI, dirección) y algunos datos tales como los
años de antigüedad, teléfono de contacto y su salario.
*/
    
    //Atributos
    String nombre;
    String apellidos;
    String DNI;
    String direccion;
    int AniosAntiguedad;
    int telefonoContacto;
    float Salario;
    Empleado Supervisor;
    float LiquidoAPercibir;
     //metodos
    
    
    
/*
    Incluye también información de quién es el empleado que lo supervisa
(Empleado *). Tendrá, al menos, las siguientes funciones miembro:
• Constructores para definir correctamente un empleado, a partir de su nombre,
apellidos, DNI, dirección, teléfono y salario.
• Imprimir (A través de los operadores de E/S redefinidos)
• Cambiar supervisor
• Incrementar salario

    */    
    public Empleado(){
        nombre = "John";
        apellidos="Wick";
        DNI = "12345678O";
        direccion = "";
        AniosAntiguedad=0;
        telefonoContacto=123456789;
        Salario = 1000;
        LiquidoAPercibir = Salario;
    }
    public Empleado(String nombre, String apellidos, String DNI,
            String direccion, int AniosAntiguedad, int telefonoContacto, int Salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.direccion = direccion;
        this.AniosAntiguedad = AniosAntiguedad;
        this.telefonoContacto = telefonoContacto;
        this.Salario = Salario;
        LiquidoAPercibir=this.Salario;
    }
    void Imprimir(){
        System.out.println("Nombre: "+nombre+""
                + "/nappelido: "+apellidos
                + "/nDNI: "+DNI
                + "/ndireccion: "+direccion
                + "/nAños de antigüedad"+AniosAntiguedad
                + "/ntelefono: "+telefonoContacto
                + "/nSalario: "+Salario);
    }
    void cambiarSupervisor(Empleado sup){
        Supervisor = sup;
    }
    void IncrementarSalario(int NumeroASumar){
        Salario +=NumeroASumar;
    }
    void setLiquidoAPercibir(int ih){
        LiquidoAPercibir = ih;
    }
    /*
    
    */
    
    
    
    
}
