/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author benja
 */

//la clase default o package solo puede ser utilizada dentro del mismo paquete
//en ausencia del modificador de acceso indica default o package
class Clase1 {
//public class Clase1 {
    
    //public String atributoPublico = "Valor Atributo Publico";
    //protected String atributoProtected = "Valor Atributo Protected";
    //String atributoDefault = "Valor Atributo Default";
    private String atributoPrivado = "Valor Atributo Privado";
    
    

//    
//    protected Clase1(){
//        System.out.println("Constructor publico");
//    }
    
    //constructor default
//    Clase1(){
//        System.out.println("Constructor default/package");
//    }

    //El constructor privado solo se puede utilizar dentro de la misma clase
    private  Clase1(){
        
        System.out.println("Constructor privado");
    }
    
    public Clase1(String arg){
        this();
        System.out.println("Constructor publico");
    }    
    
//    public void metodoPublico(){
//        System.out.println("metodo publico");
//    }
    
//    protected void metodoProtected(){
//        System.out.println("metodo protected");
//    }
    
    void metodoDefault(){
        System.out.println("metodo default/package");
    }
    
    //El constructor privado solo se puede utilizar dentro de la misma clase
    private void metodoPrivado(){
        System.out.println("metodo privado");
    }

    public String getAtributoPrivado() {
        return this.atributoPrivado;
    }

    public void setAtributoPrivado(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }
    
    
    
}
