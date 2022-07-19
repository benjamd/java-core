/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author benja
 */
public class TestmodificadorAccesoDefault {
    
        public static void main(String[] args) {
        Clase1 clase1 = new Clase1("Publico");
        clase1.setAtributoPrivado("valor atrib. privado (setter)");
        System.out.println("atrib. privado (getter):" + clase1.getAtributoPrivado());
        

//clase1.atributoDefault = "cambio atrib. default desde la prueba";
        //System.out.println("abributoDefault = " + clase1.atributoDefault);
         
        //ClaseHija claseHija1 = new ClaseHija();
        //System.out.println("claseHija1 = " + claseHija1);
    }
    
}
