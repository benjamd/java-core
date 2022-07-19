/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.benjamd.test;

import ar.com.benjamd.ventas.Orden;
import ar.com.benjamd.ventas.Producto;

/**
 *
 * @author benja
 */
public class TestVentas {
    
    public static void main(String[] args) {
        Producto producto1 = new Producto("camisa",50.0);
        Producto producto2 = new Producto("pantalon",55.0);
        
        Orden orden1 = new Orden();
        orden1.mostarOrden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto1);
        orden1.mostarOrden();
    }
    
}
