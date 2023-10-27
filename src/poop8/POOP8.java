/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop8;

/**
 *
 * @author López Hernández Miriam Amisadai y Martínez Cano Tania
 */
public class POOP8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Poligono poligono;
        Triangulo triangulo= new Triangulo();
        Cuadrilatero cuadrilatero= new Cuadrilatero();
        System.out.println(triangulo);
        System.out.println(cuadrilatero);
        
        triangulo.setBase(10);
        triangulo.setAlt(20);
        triangulo.setA(3);
        triangulo.setB(3);
        triangulo.setC(3);
        triangulo.setAlpha(90);
        triangulo.setBheta(45);
        triangulo.setGama(45);
        
        cuadrilatero.setBase(20);
        cuadrilatero.setAlt(3);
        cuadrilatero.setA(5);
        cuadrilatero.setB(10);
        cuadrilatero.setAlpha(15);
        cuadrilatero.setBheta(30);
        cuadrilatero.setGama(45);
        
        System.out.println(triangulo);
        System.out.println(cuadrilatero);
        System.out.println("***Area del triangulo***");
        System.out.println(triangulo.area());
        System.out.println("***Perimetro del triangulo***");
        System.out.println(triangulo.perimetro());
        System.out.println("***Area de cuadrilatero***");
        System.out.println(cuadrilatero.area());
        System.out.println("***Perimetro de cuadrilatero***");
        System.out.println(cuadrilatero.perimetro());
        
        poligono=new Triangulo();
        System.out.println(poligono);
        
        getPoligono(poligono);
        poligono=new Cuadrilatero();
        getPoligono(poligono);
        
        Flauta flauta=new Flauta();
        System.out.println("***Tipo de instrumento musical de viento***");
        System.out.println(flauta.tipoInstrumento());
        
        System.out.println("***Numero PI***");
        System.out.println(Math.PI);
        System.out.println("\t***Meses del Ano***");
        System.out.println(Meses.NOMBRE_MESES[Meses.UNO]);
        System.out.println(Meses.NOMBRE_MESES[Meses.DOS]);
        System.out.println(Meses.NOMBRE_MESES[Meses.TRES]);
        System.out.println(Meses.NOMBRE_MESES[Meses.CUATRO]);
        System.out.println(Meses.NOMBRE_MESES[Meses.CINCO]);
        System.out.println(Meses.NOMBRE_MESES[Meses.SEIS]);
        System.out.println(Meses.NOMBRE_MESES[Meses.SIETE]);
        System.out.println(Meses.NOMBRE_MESES[Meses.OCHO]);
        System.out.println(Meses.NOMBRE_MESES[Meses.NUEVE]);
        System.out.println(Meses.NOMBRE_MESES[Meses.DIEZ]);
        System.out.println(Meses.NOMBRE_MESES[Meses.ONCE]);
        System.out.println(Meses.NOMBRE_MESES[Meses.DOCE]);   
    }

    private static void getPoligono(Poligono poligono) {
        if (poligono instanceof Triangulo) {
            System.out.println("Es un triangulo");
        }
        else if (poligono instanceof Cuadrilatero) {
            System.out.println("Es un cuadrilatero");
        }
        else{
            System.out.println("Es un poligono");
        }        
    }   
}
