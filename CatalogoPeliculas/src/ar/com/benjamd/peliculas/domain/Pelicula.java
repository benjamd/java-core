 
package ar.com.benjamd.peliculas.domain;

/**
 *
 * @author benja
 */
public class Pelicula {
    private String nombre;

    public Pelicula() {
    }
    
    public Pelicula(String pelicula) {
        this.nombre = pelicula;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
