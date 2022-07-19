/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import enumeracion.Continentes;
import enumeracion.Dias;

/**
 *
 * @author benja
 */
public class TestEnumeraciones {
    
    public static void main(String[] args) {
        
//        System.out.println("DIA 1: "+ Dias.LUNES);
//        System.out.println("DIA 2: "+ Dias.MARTES);
//        System.out.println("DIA 3: "+ Dias.MIERCOLES);
//        System.out.println("DIA 4: "+ Dias.JUEVES);
//        System.out.println("DIA 5: "+ Dias.VIERNES);
//        System.out.println("DIA 6: "+ Dias.SABADO);
//        System.out.println("DIA 7: "+ Dias.DOMINGO);
//        
//        indicarDiaSemana(Dias.SABADO); 

        System.out.println("Continente no.4 " + Continentes.AMERICA);
        System.out.println("Nro. de paises en el 4to. continente: " + Continentes.AMERICA.getClass());
        
        
    }
    
    
    private static void indicarDiaSemana(Dias dias){
        switch (dias) {
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
                break;    
            case JUEVES:
                System.out.println("Cuarto dia de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana");
                break;
            case SABADO:
                System.out.println("Sexto dia de la semana");
                break;                
            case DOMINGO:
                System.out.println("Septimo dia de la semana");
                break;
            
            default:
                throw new AssertionError();
        }
    }
    
    
    
}
