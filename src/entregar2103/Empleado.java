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
    int Salario;
    Empleado Supervisor;
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

    public Empleado(String nombre, String apellidos, String DNI, String direccion, int AniosAntiguedad, int telefonoContacto, int Salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.direccion = direccion;
        this.AniosAntiguedad = AniosAntiguedad;
        this.telefonoContacto = telefonoContacto;
        this.Salario = Salario;
    }
    void Imprimir(){
        System.out.println("Nombre: "+nombre+""
                + " appelido: "+apellidos
                + "DNI: "+DNI
                + "direccion: "+direccion
                + "Años de antigüedad"+AniosAntiguedad
                + "telefono: "+telefonoContacto
                + "Salario: "+Salario);
    }
    void cambiarSupervisor(Empleado sup){
        Supervisor = sup;
    }
    void IncrementarSalario(int NumeroASumar){
        Salario +=NumeroASumar;
    }
    /*
    
    */
    
    
    
    
}
