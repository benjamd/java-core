/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundopc;

import ar.com.benjamd.mundopc.*;

/**
 *
 * @author benja
 */
public class MundoPC {
    
    
    public static void main(String[] args) {
        Monitor monitor1 = new Monitor("HP", 22);
        Teclado teclado1 = new Teclado("usb", "HP");
        Raton raton1 = new Raton("usb", "logitech G305");
    
    Computadora computadoraHP = new Computadora("HP", monitor1,
            teclado1, raton1);
    
    Monitor monitor2 = new Monitor("Samsung", 24);
    Teclado teclado2 = new Teclado("usb", "pc105");
    Raton raton2 = new Raton("usb", "generico");
    
    Computadora computadoraClon = new Computadora("Clon", monitor2,
            teclado2, raton2);
    
    
    Orden orden1 = new Orden();
    orden1.agregarComputadora(computadoraHP);
    orden1.agregarComputadora(computadoraClon);
    
    orden1.mostrarOrden();
    
    
    
    }
  
}
