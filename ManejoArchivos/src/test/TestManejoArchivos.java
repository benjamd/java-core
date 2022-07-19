/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import static manejoarchivos.ManejoArchivos.*;

/**
 *
 * @author benja
 */
public class TestManejoArchivos {
    
    public static void main(String[] args) {
        
        var nombreArchivo = "prueba.txt";
        //crearArchivo(nombreArchivo);
        
        escribirArchivo(nombreArchivo, "escritura de prueba ");
        escribirArchivo(nombreArchivo, "desde java");
        
        anexarArchivo(nombreArchivo, "append de prueba");
        
        leerArchivo(nombreArchivo);
        
    }
    
}
