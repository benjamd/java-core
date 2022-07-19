/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import accesodatos.*;

/**
 *
 * @author benja
 */
public class TestInterfaces {
    
    public static void main(String[] args) {
        
        IAccesoDatos datos = new ImplementacionMySql();
        
        datos.insertar();
        datos.listar();
        datos.actualizar();
        datos.eliminar();
        
        imprimir(datos);
        
        
        datos = new ImplementacionOracle();
        
        datos.insertar();
        datos.listar();
        datos.actualizar();
        datos.eliminar();
        
        imprimir(datos);
        
    }
    
    public static void imprimir(IAccesoDatos datos){
        datos.listar();
    }
}
