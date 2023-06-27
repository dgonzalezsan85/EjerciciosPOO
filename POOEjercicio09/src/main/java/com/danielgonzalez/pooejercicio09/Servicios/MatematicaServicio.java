/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielgonzalez.pooejercicio09.Servicios;

import java.util.Scanner;

import com.danielgonzalez.pooejercicio09.Entidades.Matematica;

/**
 *
 * @author danielgonzalez
 */
public class MatematicaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    Matematica mat = new Matematica();

    public void crear(double num1, double num2) {
        mat.setNum1(num1);
        System.out.println();
        mat.setNum2(num2);
    }

    public void devolverMayor() {

        System.out.println("El número mayor es: " + Math.max(mat.getNum1(), mat.getNum2()));
        ;
    }

    public void calcularPotencia() {

        double mayorNumero = Math.round(Math.max(mat.getNum1(), mat.getNum2()));
        double menorNumero = Math.round(Math.min(mat.getNum1(), mat.getNum2()));

        double potencia = Math.pow(mayorNumero, menorNumero);

        System.out.println(
                "La potencia del número mayor " + mayorNumero + " elevado al número menor " + menorNumero + " \n"
                        + "es igual a: " + potencia);

    }

    public void calcularRaiz() {

        double menorNumero = Math.abs(Math.min(mat.getNum1(), mat.getNum2()));

        double raiz = Math.sqrt(menorNumero);

        System.out.println("La raiz cuadrada del número menor " + menorNumero + " \n" +
                "es igual a: " + raiz);
    }

}
