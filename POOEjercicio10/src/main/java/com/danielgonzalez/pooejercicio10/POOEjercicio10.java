/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.danielgonzalez.pooejercicio10;

import java.util.Arrays;

import com.danielgonzalez.pooejercicio10.Servicios.ArregloServicio;

/**
 * Clase principal que contiene el método main para ejecutar el programa.
 */
public class POOEjercicio10 {

    public static void main(String[] args) {

        // Crear una instancia de ArregloServicio
        ArregloServicio as = new ArregloServicio();

        // Crear un arreglo de tipo double llamado arregloA con longitud 50
        double[] arregloA = new double[50];

        // Crear un arreglo de tipo double llamado arregloB con longitud 20
        double[] arregloB = new double[20];

        // Llenar los arreglos arregloA y arregloB con valores aleatorios
        as.llenarArreglo(arregloA, arregloB);

        // Mostrar los arreglos arregloA y arregloB en la consola
        as.mostrarArreglo(arregloA, arregloB);

        System.out.println();

        // Ordenar el arregloA en orden ascendente
        Arrays.sort(arregloA);

        // Crear un nuevo arreglo llamado arregloAux que contiene los primeros 10
        // elementos de arregloA
        double[] arregloAux = Arrays.copyOf(arregloA, 10);

        // Copiar los elementos de arregloAux al inicio de arregloB
        System.arraycopy(arregloAux, 0, arregloB, 0, 9);

        // Llenar los últimos elementos de arregloB (desde el índice 10 hasta el final)
        // con el valor 0.5
        Arrays.fill(arregloB, 10, arregloB.length, 0.5);

        // Mostrar el contenido de arregloA en la consola
        System.out.println("Arreglo A: " + Arrays.toString(arregloA));

        System.out.println();

        // Mostrar el contenido de arregloB en la consola
        System.out.println("Arreglo B: " + Arrays.toString(arregloB));

    }
}
