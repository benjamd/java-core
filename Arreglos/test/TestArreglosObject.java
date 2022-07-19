
import domain.Persona;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author benja
 */
public class TestArreglosObject {
    
    public static void main(String[] args) {
        
        Persona personas[] = new Persona[2];
        
        personas[0] = new Persona("Benja");
        personas[1] = new Persona("Pepe");
       
        for(int i = 0 ; i < personas.length ; i++) {
            System.out.println("personas[" + i + "]= " + personas[i].getNombre());
            System.out.println("personas[" + i + "]= " + personas[i].toString());
        
        }
        
    }
    
}
