/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author benja
 */
public class TestArreglos {
    
    public static void main(String[] args) {
        int edades[] = new int[3];
        System.out.println("edades = " + edades);
        
        edades[0] = 10;
        edades[1] = 11;
        edades[2] = 13;
        System.out.println("edades[0] = " + edades[0]);
        System.out.println("edades[1] = " + edades[1]);
        System.out.println("edades[2] = " + edades[2]);
        
        for(int i = 0; i < edades.length; i++) {
            System.out.println("edades["+ i +"]: " + edades[i]);
        }
        
        //sintaxis resumida
        String frutas[] = {"pera", "manzana","naranja", "uva"};
        
        for(int i = 0; i < frutas.length; i++) {
            System.out.println("frutas["+ i +"]: " + frutas[i]);
        }
    
    }
    
}
