/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testing;

//import ar.com.benjamd.*;
//import ar.com.benjamd.Utileria;

//importa el metodo estatico de la clase, se puede usar directamente llamando
//al mismo (sin invocar previamente la clase)
// Utileria.imprimir() ==> imprimir()
//import static ar.com.benjamd.Utileria.imprimir; 


/**
 *
 * @author benja
 */
public class Test {
    
    public static void main(String[] args) {
        //Utileria.imprimir("Hola! Saludos de prueba");
        
        //llamada del metodo si fue importado estaticamente
        // import static <paquete.Clase.metodo>;
        //imprimir("Hola! Saludos de prueba");
        
       //llamada del metodo cuando no es importado
       //se pone toda la ruta: <paquete.Clase.metodo()>; 
       //se conoce como nombre completamente calificado
       ar.com.benjamd.Utileria.imprimir("Hola! Saludos de prueba");
        
        
    }
    
}
