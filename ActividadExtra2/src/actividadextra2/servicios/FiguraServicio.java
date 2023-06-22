package actividadextra2.servicios;

import actividadextra2.entidades.Figura;
import java.util.Scanner;

public class FiguraServicio {

    Scanner leer = new Scanner(System.in);

    public Figura crearCuadrado() {
        Figura cuadrado = new Figura();
        System.out.println("Ingrese el lado del  cuadrado en cm");
        cuadrado.setLado(leer.nextInt());
        return cuadrado;
    }

    public Figura crearRectangulo() {
        Figura rectangulo = new Figura();
        System.out.println("Ingrese la base del rectangulo en cm");
        rectangulo.setBase(leer.nextInt());
        System.out.println("Ingrese la altura del rectangulo en cm");
        rectangulo.setAltura(leer.nextInt());
        return rectangulo;
    }

    public Figura crearTriangulo() {
        Figura triangulo = new Figura();
        System.out.println("Ingrese la base del triangulo en cm");
        triangulo.setBase(leer.nextInt());
        System.out.println("Ingrese la altura del triangulo en cm");
        triangulo.setAltura(leer.nextInt());
        return triangulo;
    }

    public Figura crearCirculo() {
        Figura circulo = new Figura();
        System.out.println("Ingrese el radio del circulo en cm");
        circulo.setRadio(leer.nextInt());
        return circulo;
    }

    public Figura crearHexagono() {
        Figura hexagono = new Figura();
        System.out.println("Ingrese el lado del hexagono en cm");
        hexagono.setLado(leer.nextInt());
        System.out.println("Ingrese el apotema del hexagono en cm");
        hexagono.setApotema(leer.nextInt());
        return hexagono;
    }
    
    public Figura crearPentagono() {
        Figura pentagono = new Figura();
        System.out.println("Ingrese el lado del pentagonoen cm");
        pentagono.setLado(leer.nextInt());
        System.out.println("Ingrese el apotema del pentagono en cm");
        pentagono.setApotema(leer.nextInt());
        return pentagono;
    }
    public Figura crearRombo() {
        Figura rombo = new Figura();
        System.out.println("Ingrese la diagonal mayor  del rombo en cm");
        rombo.setDiagMay(leer.nextInt());
        System.out.println("Ingrese la diagonal menor del rombo en cm");
        rombo.setDiagMen(leer.nextInt());
        System.out.println("Ingrese el lado del rombo en cm");
        rombo.setLado(leer.nextInt());
        return rombo;
    }
    
    public void areaPeriCuadrado(Figura cuadrado){
        int area = cuadrado.getLado()*cuadrado.getLado();
        System.out.println("El area del cuadrado es: " + area + " cm2.");
        int perimetro = cuadrado.getLado()*4;
        System.out.println("El perimetro del cuadrado es: " + perimetro + "cm.");
    }
    
    public void areaPeriRectangulo(Figura rectangulo){
        int area = rectangulo.getBase()*rectangulo.getAltura();
        System.out.println("El area del rectangulo es: " + area + " cm2.");
        int perimetro = (rectangulo.getBase()+ rectangulo.getAltura())*2;
        System.out.println("El perimetro del rectangulo es: " + perimetro + " cm.");
    }
    
    public void areaPeriTriangulo(Figura triangulo){
        int area = (triangulo.getBase()*triangulo.getAltura())/2;
        System.out.println("El area del triangulo es: " + area + " cm2.");
        int perimetro = triangulo.getBase()*3;
        System.out.println("El perimetro del triangulo es: " + perimetro + " cm.");
    }
    
    public void areaPeriCirculo(Figura circulo){
        double area = Math.PI * (circulo.getRadio()*circulo.getRadio());
        System.out.println("El area del circulo es: " + area + " cm2.");
        double perimetro = 2* Math.PI * circulo.getRadio();
        System.out.println("El perimetro del circulo es: " + perimetro + " cm.");
    }
    
    public void areaPeriHexagono(Figura hexagono){
        int  perimetro = 6* hexagono.getLado();
        System.out.println("El perimetro del hexagono es: " + perimetro + " cm.");
        int area = (perimetro * hexagono.getApotema())/2;
        System.out.println("El area del hexagono es: " + area + " cm2.");
        
    }
    
    public void areaPeriPentagono(Figura pentagono){
        int  perimetro = 5* pentagono.getLado();
        System.out.println("El perimetro del pentagono es: " + perimetro + " cm.");
        int area = (perimetro * pentagono.getApotema())/2;
        System.out.println("El area del pentagono es: " + area + " cm2.");
        
    }
    public void areaPeriRombo(Figura rombo){
        int  perimetro = 4* rombo.getLado();
        System.out.println("El perimetro del rombo es: " + perimetro + " cm.");
        int area = (rombo.getDiagMay()*rombo.getDiagMen())/2;
        System.out.println("El area del rombo es: " + area + " cm2.");
        
    }
}
