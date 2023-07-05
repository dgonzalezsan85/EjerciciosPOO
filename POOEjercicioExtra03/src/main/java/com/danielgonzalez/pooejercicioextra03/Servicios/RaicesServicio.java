/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielgonzalez.pooejercicioextra03.Servicios;

import java.util.Scanner;

import com.danielgonzalez.pooejercicioextra03.Entidades.Raices;

/**
 *
 * @author danielgonzalez
 */
public class RaicesServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Raices raices = new Raices();

    public void crearRaices() {
        System.out.println("Ingrese el valor del coeficiente a: ");
        raices.setA(leer.nextDouble());
        System.out.println("Ingrese el valor del coeficiente b: ");
        raices.setB(leer.nextDouble());
        System.out.println("Ingrese el valor del coeficiente c: ");
        raices.setC(leer.nextDouble());
    }

    public double getDiscriminante() {
        double discriminante = Math.pow((raices.getB()), 2) - (4 * raices.getA() * raices.getC());

        return discriminante;
    }

    public boolean tieneRaices() {

        if (getDiscriminante() >= 0) {
            // tiene dos soluciones
            return true;
        } else {
            // no tiene solucion real o compleja
            return false;
        }
    }

    public boolean tieneRaiz() {

        if (getDiscriminante() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void obtenerRaices() {
        if (tieneRaices()) {
            double solucion1 = ((-(raices.getB()) + (Math.sqrt(getDiscriminante()))) / (2 * raices.getA()));
            double solucion2 = ((-(raices.getB()) - (Math.sqrt(getDiscriminante()))) / (2 * raices.getA()));
            System.out.println("El discriminante es positivo, asi que tenemos dos soluciones: ");
            System.out.println();
            System.out.println("La primera solución es igual a: " + solucion1);
            System.out.println();
            System.out.println("La segunda solución es igual a: " + solucion2);
        }
    }

    public void obtenerRaiz() {
        if (tieneRaiz()) {
            double solucion = (-raices.getB()) / (2 * raices.getA());
            System.out.println("El discriminante es igual a cero, asi que tenemos una solución: ");
            System.out.println();
            System.out.println("El resultado de la ecuación es: " + solucion);
        }
    }

    public void calcular() {

        if (tieneRaices()) {
            obtenerRaices();
        } else if (tieneRaiz()) {
            obtenerRaiz();
        } else {
            System.out.println("El discriminante es negativo, así esta ecuación no tiene soluciones reales.");
        }
    }

}
