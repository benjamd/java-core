/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author benja
 */

//Version Excepcion
/*
public class OperacionExcepcion extends Exception {
    
    public OperacionExcepcion(String mensaje){
        super(mensaje);
    }
    
}
*/

//Version RuntimeExcepcion
public class OperacionExcepcion extends RuntimeException {
    
    public OperacionExcepcion(String mensaje){
        super(mensaje);
    }
    
}
