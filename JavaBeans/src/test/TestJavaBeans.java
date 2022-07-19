/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import domain.Persona;

/**
 *
 * @author benja
 */
public class TestJavaBeans {
    
    public static void main(String[] args) {
        
        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Morruca");
        
        System.out.println("persona = " + persona);
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
           
    }
}
