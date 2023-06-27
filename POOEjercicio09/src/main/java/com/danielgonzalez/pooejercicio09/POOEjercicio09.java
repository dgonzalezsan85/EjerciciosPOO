/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.danielgonzalez.pooejercicio09;

import com.danielgonzalez.pooejercicio09.Servicios.MatematicaServicio;

/**
 *
 * @author danielgonzalez
 */
public class POOEjercicio09 {

    public static void main(String[] args) {

        MatematicaServicio ms = new MatematicaServicio();

        double num1 = (Math.random() * (15 - 1 + 1) + 1);
        System.out.println("El numero aleatorio uno es: " + num1);

        double num2 = (Math.random() * (15 - 1 + 1) + 1);
        System.out.println("El numero aleatorio dos es: " + num2);

        ms.crear(num1, num2);

        System.out.println();

        ms.devolverMayor();

        System.out.println();

        ms.calcularPotencia();

        System.out.println();

        ms.calcularRaiz();

    }
}
