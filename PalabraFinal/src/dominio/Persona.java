/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author benja
 */
 public  class Persona {
    
    //Constante en java: combinacion de de final static para no craer instancias
     
    public final static int CONSTANTE_UNO = 1;
    
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
     
     public   void imprimir(String cadena){
            System.out.println("metodo imprimir: cadena = " + cadena);
     }
    
}
