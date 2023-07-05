/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielgonzalez.pooejercicioextra02.Servicios;

import java.util.Scanner;

import com.danielgonzalez.pooejercicioextra02.Entidades.Puntos;

/**
 *
 * @author danielgonzalez
 */
public class PuntosServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Puntos puntos = new Puntos();

    public void crearPuntos() {
        System.out.println("Ingrese el valor del punto x1:");
        puntos.setX1(leer.nextDouble());
        System.out.println();
        System.out.println("Ingrese el valor del punto y1:");
        puntos.setY1(leer.nextDouble());
        System.out.println();
        System.out.println("Ingrese el valor del punto x2:");
        puntos.setX2(leer.nextDouble());
        System.out.println();
        System.out.println("Ingrese el valor del punto y2:");
        puntos.setY2(leer.nextDouble());
    }

    public void calcularDistancia() {
        double distancia = Math.sqrt(
                (Math.pow((puntos.getX2() - puntos.getX1()), 2) + Math.pow((puntos.getY2() - puntos.getY1()), 2)));

        System.out.println("La distancia entre los dos puntos es igual a: " + distancia);
        System.out.println();
    }
}
