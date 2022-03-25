/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entregar2103;

public abstract class Empleado {
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
    
    public Empleado(String nombre, String apellidos, String DNI,
            String direccion, int AniosAntiguedad, int telefonoContacto, int Salario,Empleado supervisor) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.direccion = direccion;
        this.AniosAntiguedad = AniosAntiguedad;
        this.telefonoContacto = telefonoContacto;
        this.Salario = Salario;
        this.Supervisor = supervisor;
        LiquidoAPercibir=this.Salario;
    }
    abstract void  Imprimir();
    
    void cambiarSupervisor(Empleado sup){
        Supervisor = sup;
    }
    void IncrementarSalario(int NumeroASumar){
        Salario +=NumeroASumar;
    }
    void setLiquidoAPercibir(int ih){
        LiquidoAPercibir = ih;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAniosAntiguedad() {
        return AniosAntiguedad;
    }

    public void setAniosAntiguedad(int AniosAntiguedad) {
        this.AniosAntiguedad = AniosAntiguedad;
    }

    public int getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(int telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float Salario) {
        this.Salario = Salario;
    }

    public Empleado getSupervisor() {
        return Supervisor;
    }

    public void setSupervisor(Empleado Supervisor) {
        this.Supervisor = Supervisor;
    }

    public float getLiquidoAPercibir() {
        return LiquidoAPercibir;
    }

    public void setLiquidoAPercibir(float LiquidoAPercibir) {
        this.LiquidoAPercibir = LiquidoAPercibir;
    }

    
    
    
    
    
}
