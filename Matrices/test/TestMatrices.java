
import domain.Persona;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author benja
 */
public class TestMatrices {
    public static void main(String[] args) {
        
        int edades[][] = new int[3][2];
        System.out.println("edades = " + edades);
        
        edades[0][0] = 5;
        edades[0][1] = 7;
        edades[1][0] = 8;
        edades[1][1] = 4;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("edades["+i+"]["+j+"] = " + edades[i][j]);
            }
        }
        
        System.out.println("");
        for (int line = 0; line < edades.length; line++) {
            for (int col = 0; col < edades[line].length; col++) {
                System.out.println("edades["+line+"]["+col+"] = " + edades[line][col]);
            }
        }
        
        System.out.println("");
        String frutas[][] = {{"Naranja","Mandarina"},{"Pomelo","Lima","Limon"}};
        
        for (int line = 0; line < frutas.length; line++) {
            for (int col = 0; col < frutas[line].length; col++) {
                System.out.println("frutas["+line+"]["+col+"] = " + frutas[line][col]);
            }
        }
        
        System.out.println("");
        Persona personas[][] = new Persona[2][3];
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Karla");
        
        for (int line = 0; line < personas.length; line++) {
            for (int col = 0; col < personas[line].length; col++) {
                if(personas[line][col] != null)
                    System.out.println("personas["+line+"]["+col+"].nombre = " + personas[line][col].getNombre());
            }
        }
        
        System.out.println("");
        imprimir(personas);
        System.out.println("");
        imprimir(frutas);
    }
    
    //Tipo Object recibe cualquier tipo, en este caso matrices de 2 dimensiones [X][Y]
    public static void imprimir(Object matriz[][]) {
        for (int line = 0; line < matriz.length; line++) {
            for (int col = 0; col < matriz[line].length; col++) {
                //if(matriz[line][col] != null)
                    System.out.println("personas["+line+"]["+col+"]: " + matriz[line][col]);
            }
        }
    }
    
}
