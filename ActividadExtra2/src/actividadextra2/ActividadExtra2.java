package actividadextra2;

import actividadextra2.entidades.Figura;
import actividadextra2.servicios.FiguraServicio;
import java.util.Scanner;

public class ActividadExtra2 {
  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        FiguraServicio fs = new FiguraServicio();
        
        System.out.println("Ingrese la figura deseada");
        String figura = leer.next();
        
        switch (figura) {
            case "cuadrado":
                Figura cuadrado = fs.crearCuadrado();
                fs.areaPeriCuadrado(cuadrado);
                break;
            case "rectangulo":
                Figura rectangulo = fs.crearRectangulo();
                fs.areaPeriRectangulo(rectangulo);
                break;
            case "triangulo":
                Figura triangulo = fs.crearTriangulo();
                fs.areaPeriTriangulo(triangulo);
                break;
            case "circulo":
                Figura circulo = fs.crearCirculo();
                fs.areaPeriCirculo(circulo);
                break;
            case "hexagono":
                Figura hexagono = fs.crearHexagono();
                fs.areaPeriHexagono(hexagono);
                break;
            case "pentagono":
                Figura pentagono = fs.crearPentagono();
                fs.areaPeriPentagono(pentagono);
                break;
            case "rombo":
                Figura rombo = fs.crearRombo();
                fs.areaPeriRombo(rombo);
                break;
            default:
                System.out.println("La figura ingresada no es valida.");
        }
        
    }
    
}
