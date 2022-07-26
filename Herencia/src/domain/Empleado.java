/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author benja
 */
public class Empleado extends Persona {
    
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;
    
    public Empleado(){
        this.idEmpleado = ++Empleado.contadorEmpleado;        
        
    }

    public Empleado(String nombre, double sueldo) {
        //super(nombre);
        this(); //Otra forma de llamar el constructor vacio Empleado()
        this.nombre = nombre;
        this.sueldo = sueldo;
        
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }


    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    
    //toString() definido con StringBuilder es mas óptimo que concatenar con +
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Empleado{");
//        sb.append("idEmpleado=").append(this.idEmpleado);
//        sb.append(", nombre=").append(this.nombre);
//        sb.append(", sueldo=").append(this.sueldo);
//        sb.append('}');
//        return sb.toString();
//    }

    //toString con StringBuilder agregando al final toString de la clase padre
    //usando el método super.toString()
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(sueldo);
        sb.append(", ").append(super.toString());
        sb.append("}");
        return sb.toString();
    }

 
    
    
    
    
}
