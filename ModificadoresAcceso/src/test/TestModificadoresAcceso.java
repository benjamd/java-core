/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

//import paquete1.Clase1;
import paquete1.ClaseHija;

/**
 *
 * @author benja
 */
public class TestModificadoresAcceso {
    
    public static void main(String[] args) {
        //Clase1 clase1 = new Clase1("prublico");
        //System.out.println("clase1 = " + clase1.atributoPublico);
        //clase1.metodoPublico();
        
        ClaseHija claseHija1 = new ClaseHija();
        System.out.println("claseHija1 = " + claseHija1);
    }
    
}
