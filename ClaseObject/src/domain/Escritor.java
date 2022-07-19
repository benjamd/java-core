/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author benja
 */
public class Escritor extends Empleado {
    
    private final TipoEscritura tipoEscritura;
    
    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura) {
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }
    
    
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles() + ", TipoEscritura: " + this.tipoEscritura.getDescripcion();
    }

    @Override
    public String toString() {
        return "Escritor{" + "tipoEscritura=" + tipoEscritura + ", "+ super.toString() + '}';
    }

    public TipoEscritura getTipoEscritura() {
        return this.tipoEscritura;
    }
    
    
    
}
