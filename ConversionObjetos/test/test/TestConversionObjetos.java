/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import domain.Empleado;
import domain.Escritor;
import domain.TipoEscritura;

/**
 *
 * @author benja
 */
public class TestConversionObjetos {
    public static void main(String[] args) {
        
        Empleado empleado;
        
        empleado = new Escritor("Juan", 10000, TipoEscritura.CLASICO);
        //System.out.println("empleado = " + empleado);
        
        //System.out.println("empleado = " + empleado.obtenerDetalles());
        
        //No se puede acceder al metodo de la clase hija Escritor, porque no esta
        //definido en la clase padre Empleado, la cual es el tipo Objeto de la variable 'empleado'
        //empleado.getTipoEscritura();
        //SOLUCION: Realizar una conversion Downcasting (clase padre a hijo)
        ((Escritor)empleado).getTipoEscritura();
        
        //Se hace un casteo Upcasting automaticamente sin conversion explicita usando parentesis (clase hijo a padre)
        Empleado empleado2 = empleado;
        System.out.println("empleado2 = " + empleado2.obtenerDetalles());
        
        
    }
}
