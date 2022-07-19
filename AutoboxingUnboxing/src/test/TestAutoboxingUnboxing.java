package test;

public class TestAutoboxingUnboxing {

    public static void main(String[] args) {
        //clases envolventes de tipos primitivos
        
        /*
        int - Integer
        long - Long
        float - Float
        double - Double
        boolean - Boolean
        byte - Byte
        char - Character
        short - Short
        */
        
        //Autoboxing: la literal de tipo primitivo se convierte a tipo Object
        Integer entero = 1130;
        System.out.println("entero = " + entero);
        System.out.println("entero = " + entero.byteValue());
        
        //Unboxing: inversa se conviernte de Objeto a primitivo
        
        int entero2 = entero;
        System.out.println("tipo primitivo entero2 = " + entero2);
    }
    
}
