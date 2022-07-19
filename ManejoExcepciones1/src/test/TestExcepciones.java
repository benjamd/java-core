/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import aritmetica.Aritmetica;
import excepciones.OperacionExcepcion;

/**
 *
 * @author benja
 */
public class TestExcepciones {

    public static void main(String[] args) {

        int resultado = 0;
        Integer numerador = null;
        //Version (check) Exception
        //Requiere el uso de try/catch
        
        try {
            //resultado = 10 / 0;
            
            //Error titpo OperacionExcepcion
            //resultado = Aritmetica.division(10, 0);
        
            //Error tipo Exception
            //resultado = Aritmetica.division(numerador, 0);
        
        } catch (OperacionExcepcion e) {
        //Se puede usar mas de un bloque catch procesar mas de una excepcion
        //se recomienda en primer lugar la excepciones de menor jerarquia hasta
        //la clase Exception (clase padre de todas las excepciones debe ir al final) 
        
            System.out.println("Ocurrio una excepcion de tipo OperacionExcepcion");
            System.out.println(e.getMessage());
        
        } catch (Exception e) {
            System.out.println("Ocurrio un excepcion de tipo Excepcion");
            e.printStackTrace(System.out); //Pila de Excepciones
            System.out.println("mensaje: "+ e.getMessage()); //mensaje de excepcion
        }
        finally { 
        //se ejecutara este bloque siempre independientemente ocurra o no la excepcion
            System.out.println("Se reviso la division entre cero");
            
        }
        
        System.out.println("resultado = " + resultado);





//Version (uncheck) RuntimeException
        //No requiere try/catch, de igual forma la excepion se captura
        //seguimos con el problema: se interrumpe la ejecucion del programa
        
        //resultado = 10 / 0;
        //resultado = Aritmetica.division(10, 0);
        //System.out.println("resultado = " + resultado);
        
        
        
    }

}
