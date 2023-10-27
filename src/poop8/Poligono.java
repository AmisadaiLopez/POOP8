/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author López Hernández Miriam Amisadai y Martínez Cano Tania
 * Clase poligono, es abstracta 
 */
public abstract class Poligono {
    public Poligono(){
    }
    /**
     * 
     * @return  no retorna nada
     */
    public abstract int area();
    public abstract int perimetro();
    /**
     * 
     * @return esta vacio, por lo tanto no retorna nada
     */
    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
}
