/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author benja
 */
public class TestColecciones {

    public static void main(String[] args) {

        //LISTA mantiene el orden de insercion - indexada
        //System.out.println("LISTA:");

        List miLista = new ArrayList();
        miLista.add(1);
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add(1);
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");

        /*
        for(Object elem: miLista) {
            System.out.println("elem = " + elem);
        }
        
        //foreach lambda
        miLista.forEach((t) -> {System.out.println(t);
        });
         */
        //imprimir(miLista);

        //System.out.println("SET:");

        //SET no hay repetidos ni se inserta ordenado - sin indices
        Set miSet = new HashSet();
        miSet.add(1);
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add(1);
        miSet.add("Viernes");
        miSet.add("Sabado");
        miSet.add("Jueves");
        miSet.add("Domingo");

        /*
        miSet.forEach((t) -> {System.out.println(t);
        });
         */
        //imprimir(miSet);

        Map miMapa = new HashMap();
        miMapa.put("valor1", "Juan");
        miMapa.put("valor3", "Damian");
        miMapa.put("valor2", "Pedro");
        
        String elem = (String) miMapa.get("valor2");
        System.out.println("elem = " + elem);
       
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
        
        
        
        
        
        
        
    }

    public static void imprimir(Collection coleccion) {
        coleccion.forEach((elem) -> {
            System.out.println(coleccion.getClass().getSimpleName()+ " - " + elem.getClass().getSimpleName() +": " + elem);
        });
    }

}
