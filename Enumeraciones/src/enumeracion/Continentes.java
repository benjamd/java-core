/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enumeracion;

/**
 *
 * @author benja
 */
public enum Continentes {
    AFRICA(53),
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14),
    ANTARTIDA(0);
    
    private final int paises;

    Continentes(int paises) {
        this.paises = paises;
    }
    
    public int getPaises(){
        return this.paises;
    }
    
}
