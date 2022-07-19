
import operaciones.Operaciones;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author benja
 */
public class TestOperaciones {
    
    public static void main(String[] args) {
        var resultado = Operaciones.sumar(123, 5);
        System.out.println("resultado = " + resultado);
        
        var resultado2 = Operaciones.sumar(123.0, 5);
        System.out.println("resultado2 = " + resultado2);
        
        var resultado3 = Operaciones.sumar(123.0, 5L);
        System.out.println("resultado3 = " + resultado3);
    }
    
}
