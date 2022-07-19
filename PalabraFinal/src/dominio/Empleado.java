/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author benja
 */
public class Empleado extends Persona {
    
    @Override    
    public void imprimir(String cadena){
        System.out.println("metodo imprimir clase hija  : cadena = " + cadena);
    }
}
