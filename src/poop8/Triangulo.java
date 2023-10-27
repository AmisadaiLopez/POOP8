/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author López Hernández Miriam Amisadai y Martínez Cano Tania
 * Traingulo, figura geometrica con angulos alpha, bheta, gama, lados a,b y c y una base y altura
 */
public class Triangulo extends Poligono {
    private int alpha, bheta, gama; 
    private float a,b,c, base, alt;
/**
 * constructor vacio
 */
    public Triangulo() {
    }
/**
 * 
 * @param alpha recibe el valor del angulo alpha
 * @param bheta recibe el valor del angulo bheta
 * @param gama recibe el valor del angulo gama
 * @param a recibe el valor del lado a
 * @param b recibe el valor del lado b
 * @param c recibe el valor del lado c
 * @param base recibe el valor de la base
 * @param alt recibe el valolr de la altura
 */
    public Triangulo(int alpha, int bheta, int gama, float a, float b, float c, float base, float alt) {
        this.alpha = alpha;
        this.bheta = bheta;
        this.gama = gama;
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.alt = alt;
    }
/**
 * 
 * @return retorna el valor de alpha
 */
    public int getAlpha() {
        return alpha;
    }
/**
 * 
 * @param alpha recibe el valor de alpha
 */
    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }
/**
 * 
 * @return retorna el valor de bheta
 */
    public int getBheta() {
        return bheta;
    }
/**
 * 
 * @param bheta recibe el valor de bheta
 */
    public void setBheta(int bheta) {
        this.bheta = bheta;
    }
/**
 * 
 * @return retorna el valor de gama
 */
    public int getGama() {
        return gama;
    }
/**
 * 
 * @param gama recibe el valor de gama
 */
    public void setGama(int gama) {
        this.gama = gama;
    }
/**
 * 
 * @return retorna el valor de a 
 */
    public float getA() {
        return a;
    }
/**
 * 
 * @param a recibe el valor de a
 */
    public void setA(float a) {
        this.a = a;
    }
/**
 * 
 * @return retorna el valor de b
 */
    public float getB() {
        return b;
    }
/**
 * 
 * @param b recibe el vallor de b
 */
    public void setB(float b) {
        this.b = b;
    }
/**
 * 
 * @return retorna el valor de c
 */
    public float getC() {
        return c;
    }
/**
 * 
 * @param c recibe el valor de c
 */
    public void setC(float c) {
        this.c = c;
    }
/**
 * 
 * @return retorna el valor de la base
 */
    public float getBase() {
        return base;
    }
/**
 * 
 * @param base recibe el valor base
 */
    public void setBase(float base) {
        this.base = base;
    }
/**
 * 
 * @return retorna el valor de la altura
 */
    public float getAlt() {
        return alt;
    }
/**
 * 
 * @param alt recibe el valor de altura
 */
    public void setAlt(float alt) {
        this.alt = alt;
    }
/**
 * sobreescribir metodo del area y perimetro del triangulo
 * @return retorna formula para calcular el area del triangulo
 */
    @Override
    public int area(){
        return (int)((base*alt)/2);//casteo
    }
/**
 * 
 * @return retorna formula para calcular el perimetro del triangulo
 */    
    @Override
    public int perimetro(){
        return (int)(a+b+c);
    }
/**
 * 
 * @return retorna los atributos de la clase Traingulo mas los de la extencion Poligono
 */
    @Override
    public String toString() {
        return super.toString()+"Triangulo{" + "alpha=" + alpha + ", bheta=" + bheta + ", gama=" + gama + ", a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", alt=" + alt + '}';
    }   
}
