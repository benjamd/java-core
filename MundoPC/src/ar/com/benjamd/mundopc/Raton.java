/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.benjamd.mundopc;

/**
 *
 * @author benja
 */
public class Raton extends DispositivoEntrada {
    private final int idRaton;
    private static int contadorRatones;
    
    
    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRatones; 
    }

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton +", "+ super.toString()  + '}';
    }
    
    
}
