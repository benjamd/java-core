/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author benja
 */
public class Persona {
    
    private final int idPersona;
    private static int contadorPersonas;
    
    //Bloque de inicializacion estatico que se ejecuta antes del constructor
    //y antes de los bloques de inizializacion no estatico
    //solo se puede inicializar variables static
    //SE EJECUTA UNA UNICA VEZ EN MEMORIA
    static {
        System.out.println("Ejecucion Bloque estatico - contexto estatico");
        //preincremento se realiza por primera y unica vez
        ++Persona.contadorPersonas;
        
    }
    
    //esto es un bloque de inicializacion no-estatico
    //se ejecuta antes del constructor de la clase
    //SE EJECUTA CADA A VEZ QUE SE CREA UN OBJETO
    {
        System.out.println("Ejecucion Bloque NO estatico - contexto dinamico");
        //posincremiento para hacer que la variable sea unica para la 2da. instancia en adelante
        this.idPersona = Persona.contadorPersonas++;
    }
    
    public Persona(){
        System.out.println("Ejecucion del constructor de la clase Persona");
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("idPersona=").append(idPersona);
        sb.append('}');
        return sb.toString();
    }
    
    
}
