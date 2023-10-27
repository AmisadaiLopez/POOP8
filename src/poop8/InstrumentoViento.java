/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author López Hernández Miriam Amisadai y Martínez Cano Tania
 * Clase instrumento de viento con extencion a object (ya lo tiene incluido Java) y se implementa otra extencion a la clase Instrumento Musical
 */
public class InstrumentoViento extends Object implements InstrumentoMusical {
/**
 * constructor vacio
 */
    public InstrumentoViento() {
    }
/**
 * 
 * @return retorna intrumento de viento
 */    
    @Override
    public String tipoInstrumento(){
       return "instrumentoViento" ;
    }
/**
 * metodo que describe que se esta tocando un instrumento de viento
 */   
    @Override
    public void tocar(){
        System.out.println("Tocar instrumento de viento");
    }
/**
 * metodo que describe que se esta afinando un instrumento
 */
    @Override
    public void afinar(){
        System.out.println("Afinando isntrumento"); 
    }
/**
 * 
 * @return retorna los atributos, pero como esta vacio no retorna nada
 */
    @Override
    public String toString() {
        return "InstrumentoViento{" + '}';
    }
}
