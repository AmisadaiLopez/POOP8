/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author López Hernández Miriam Amisadai y Martínez Cano Tania
 * Cuadrilatero poligono de 4 lados con alpha, bheta, gama, lado a y b, con base y altura
 */
public class Cuadrilatero extends Poligono {
    private int alpha, bheta, gama, a,b, base, alt;
/**
 * constructor vacio
 */
    public Cuadrilatero() {
    }
    /**
     *
     * @param alpha recibe los valores de alpha
     * @param bheta recibe los valores de bheta
     * @param gama recibe los valores de gama
     * @param a recibe los valores de a
     * @param b recibe los valores de b
     * @param base recibe los valores de la base
     * @param alt recibe los valores de la altura
     */
    public Cuadrilatero(int alpha, int bheta, int gama, int a, int b, int base, int alt) {
        this.alpha = alpha;
        this.bheta = bheta;
        this.gama = gama;
        this.a = a;
        this.b = b;
        this.base = base;
        this.alt=alt;
    }
/**
 * 
 * @return retorna alpha
 */
    public int getAlpha() {
        return alpha;
    }
/**
 * 
 * @param alpha recibe a alpha
 */
    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }
/**
 * 
 * @return retorna bheta
 */
    public int getBheta() {
        return bheta;
    }
/**
 * 
 * @param bheta recibe bheta
 */
    public void setBheta(int bheta) {
        this.bheta = bheta;
    }
/**
 * 
 * @return retorna gama
 */
    public int getGama() {
        return gama;
    }
/**
 * 
 * @param gama recibe gama
 */
    public void setGama(int gama) {
        this.gama = gama;
    }
/**
 * 
 * @return retorna a
 */
    public int getA() {
        return a;
    }
/**
 * 
 * @param a recibe a
 */
    public void setA(int a) {
        this.a = a;
    }
/**
 * 
 * @return retorna b
 */
    public int getB() {
        return b;
    }
/**
 * 
 * @param b recibe b
 */
    public void setB(int b) {
        this.b = b;
    }
/**
 * 
 * @return retorna base
 */
    public int getBase() {
        return base;
    }
/**
 * 
 * @param base recibe base
 */
    public void setBase(int base) {
        this.base = base;
    }
/**
 * 
 * @return retorna altura
 */
    public int getAlt() {
        return alt;
    }
/**
 * 
 * @param alt recibe altura
 */
    public void setAlt(int alt) {
        this.alt = alt;
    }
/**
 * 
 * @return retorna formula para calcular el area de un cuadrilatero
 */    
    @Override
    public int area(){
        return (int)(base*alt);
    }
/**
*
* @return retorna la formula para calcular el perimetro de un cuadrilatero
*/
    @Override
    public int perimetro(){
        return (int)(2*a+2*b);//casteo (forzar a truncar el valor a la parte entera)
    }
/**
 * 
 * @return retorna los atributos de Cuadrilatero, mas los de la extencion de la clase Poligono
 */
    @Override
    public String toString() {//super.toString manda a llamar al papá
        return super.toString()+"Cuadrilatero{" + "alpha=" + alpha + ", bheta=" + bheta + ", gama=" + gama + ", a=" + a + ", b=" + b + ", base=" + base + ", alt=" + alt + '}';
    }   
}
