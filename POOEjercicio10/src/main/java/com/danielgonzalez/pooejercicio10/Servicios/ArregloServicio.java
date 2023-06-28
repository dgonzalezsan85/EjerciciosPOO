/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielgonzalez.pooejercicio10.Servicios;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

import com.danielgonzalez.pooejercicio10.Entidades.Arreglo;

/**
 *
 * @author danielgonzalez
 */
public class ArregloServicio {

    Arreglo arr = new Arreglo();

    public void llenarArreglo(double[] arregloA, double[] arregloB) {

        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = (Math.random() * (15 - 1 + 1) + 1);
        }

        arr.setArregloA(arregloA);

        for (int i = 0; i < arregloB.length; i++) {
            arregloB[i] = (Math.random() * (15 - 1 + 1) + 1);
        }
        arr.setArregloB(arregloB);
    }

    public void mostrarArreglo(double[] arregloA, double[] arregloB) {

        System.out.println("Arreglo A: " + Arrays.toString(arregloA));
        System.out.println();
        System.out.println("Arreglo B: " + Arrays.toString(arregloB));
    }

}
