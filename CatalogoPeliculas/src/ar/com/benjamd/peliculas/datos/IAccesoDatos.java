 
package ar.com.benjamd.peliculas.datos;

import ar.com.benjamd.peliculas.domain.Pelicula;
import ar.com.benjamd.peliculas.excepciones.AccesoDatosEx;
import ar.com.benjamd.peliculas.excepciones.EscrituraDatosEx;
import ar.com.benjamd.peliculas.excepciones.LecturaDatosEx;
import java.util.List;

/**
 *
 * @author benja
 */
public interface IAccesoDatos {
    
    boolean existe(String nombreRecurso) throws AccesoDatosEx;
    
    List<Pelicula> listar(String nombreRecurso) throws  LecturaDatosEx;
    
    void escribir(Pelicula pelicula, String nombreRecurso, boolean  anexar) throws EscrituraDatosEx;
    
    String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx;

    void crear(String nombreRecurso) throws AccesoDatosEx;
    
    void borrar(String nombreRecurso) throws AccesoDatosEx;
}
