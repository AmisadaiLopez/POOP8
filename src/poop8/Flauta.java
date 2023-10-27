/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author López Hernández Miriam Amisadai y Martínez Cano Tania
 * Flauta instrumento con una extencion a la clase Instrumento de veinto
 */
public class Flauta extends InstrumentoViento {
/**
 * 
 * @return retorna a flauta
 */
    @Override
    public String tipoInstrumento() {
        return "flauta"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
/**
 * 
 * @return retorna a los atributos de flauta, como esta vacio no retorna nada
 */
    @Override
    public String toString() {
        return "Flauta{" + '}';
    }   
}
