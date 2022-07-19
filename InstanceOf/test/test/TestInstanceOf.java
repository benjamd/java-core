/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;


import domain.*;

/**
 *
 * @author benja
 */
public class TestInstanceOf {
    public static void main(String[] args) {
        //Ejercicio Sobreescritura
        //Gerente gerente = new Gerente("Juan", 500000, "Ventas");
        //System.out.println("gerente = " + gerente);
        //System.out.println("gerente = " + gerente.obtenerDetalles());
        
        
        Empleado empleado = new Empleado("Juan", 34000);
        determinarTipo(empleado);
        empleado = new Gerente("Karla", 60000, "Sistemas");
        determinarTipo(empleado);
     
        //Object empleado2 = new Object();
        //determinarTipo(empleado2); //cambiar argumento a tipo mas generico Object
    
    }
    
    
    public static void determinarTipo(Object empleado){
        if(empleado instanceof Gerente){
            System.out.println("Es de tipo Gerente");
            //Conversion Cast clase hijo a padre para ejecutar metodos propios del hijo
            //((Gerente) empleado).getDepartamento();
            Gerente gerente = (Gerente) empleado;
            System.out.println("gerente = " + gerente.getDepartamento());
            
        } 
        else if(empleado instanceof Empleado) {
            System.out.println("Es de tipo Empleado:" + empleado);
            //ERROR EN EJECUCION cast clase padre a hijo
            //Gerente gerente = (Gerente) empleado;
            //System.out.println("gerente = " + gerente.getDepartamento());
            
        }  
        else if (empleado instanceof Object) {
            System.out.println("Es de tipo Object " + empleado.toString());
            
        } 
        
    }
    
}
