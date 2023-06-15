/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielgonzalez.pooejercicio04.Servicios;

import com.danielgonzalez.pooejercicio04.Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author danielgonzalez
 */
public class RectanguloServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Rectangulo crearRectangulo() {

        Rectangulo rectangulo = new Rectangulo();

        System.out.println("Ingrese la base del Rectangulo: ");
        rectangulo.setBase(leer.nextDouble());

        System.out.println("Ingrese la altura del Rectangulo: ");
        rectangulo.setAltura(leer.nextDouble());

        return rectangulo;
    }

    public void superficie(Rectangulo rectangulo) {

        double superficie = rectangulo.getBase() * rectangulo.getAltura();

        System.out.println("Superficie del Rectangulo: " + superficie);
    }

    public void perimetro(Rectangulo rectangulo) {

        double perimetro = (rectangulo.getBase() + rectangulo.getAltura()) * 2;

        System.out.println("Perimetro del Rectangulo: " + perimetro);
    }

    public void dibujarRectangulo(Rectangulo rectangulo) {

        int base = (int) rectangulo.getBase();
        int altura = (int) rectangulo.getAltura();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura - 1 || j == 0 || j == base - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
