/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author benja
 */

import dominio.Persona;

public class TestFinal {
    
    public static void main(String[] args) {
        final int variableFinal = 10;
        System.out.println("variableFinal = " + variableFinal);
        
        System.out.println("CONSTANTE_UNO = " + Persona.CONSTANTE_UNO);
        
        final Persona  persona1 = new Persona();
        //persona1 = new Persona(); no se puede cambiar por ser final
        persona1.setNombre("Juancito");
        System.out.println("nombre de persona1: " + persona1.getNombre());
        persona1.setNombre("Carlitos");
        System.out.println("nombre de persona1: " + persona1.getNombre());
        
    }
    
}
