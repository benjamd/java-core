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
public class TestSobreEscritura {
    public static void main(String[] args) {
        //Ejercicio Sobreescritura
        //Gerente gerente = new Gerente("Juan", 500000, "Ventas");
        //System.out.println("gerente = " + gerente);
        //System.out.println("gerente = " + gerente.obtenerDetalles());
        
        
        Empleado empleado1 = new Empleado("Juan", 34000);
        //System.out.println("empleado = " + empleado.obtenerDetalles());
        imprimir(empleado1);
        
        Gerente gerente = new Gerente("Karla", 60000, "Sistemas");
        //System.out.println("gerente = " + gerente.obtenerDetalles());   
        imprimir(gerente);
        
        
        
    }
    
    
    public static void imprimir(Empleado empleado){
        System.out.println("empleado = " + empleado.obtenerDetalles());
        
    }
    
}
