 
package test;

import domain.Persona;

 
public class TestForEach {
    
    public static void main(String[] args) {
        
        int edades[] = {5,4,6,12,45,31,26};
        
        //for tradicional
        for (int i = 0; i < edades.length; i++) {
            System.out.println("edades[" + i + "]: " + edades[i]);
        }
        
        System.out.println("");
        //for simplificado sin contador
        for( int edad: edades) {
            System.out.println("edad = " + edad);
        }
        
        System.out.println("");
       
        Persona personas[] = {new Persona("juan"),new Persona("Mara"),                 
                              new Persona("joe")};
        
       for(Persona p: personas) {
           System.out.println("persona = " + p.getNombre());
           System.out.println("persona = " + p);
           System.out.println("");
       }         
       
       
       
    }
        
        
        
}

