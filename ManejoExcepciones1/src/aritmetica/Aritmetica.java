/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aritmetica;

import excepciones.OperacionExcepcion;

/**
 *
 * @author benja
 */
public class Aritmetica {

    
    //Version (check) Exception
    //obliga al compilador a checkear que podría ocurrir la excepcion condicionalmente
    //se agrega a la firma "throws <Excepcion.class>"
    /*
    public static int division(int numerador, int denominador) throws OperacionExcepcion {
        if (denominador == 0) {
            throw new OperacionExcepcion("Division por cero");
        }

        return numerador / denominador;
    }
    */
    
    //Version (uncheck) RuntimeExcepcion, la excepcion se arroja en tiempo de ejecucion
    //El codigo es mas limpio (la firma no lleva "throws <Exception.class>"
    public static int division(int numerador, int denominador)  {
        if (denominador == 0) {
            throw new OperacionExcepcion("Division por cero");
        }

        return numerador / denominador;
    }
}
