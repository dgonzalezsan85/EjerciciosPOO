/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielgonzalez.pooejercicioextra05.Servicios;

import java.util.Scanner;

import com.danielgonzalez.pooejercicioextra05.Entidades.Meses;

/**
 *
 * @author danielgonzalez
 */
public class MesesServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    Meses meses = new Meses();

    public void adivinar() {

        System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: ");
        String inputMes = leer.next();

        do {
            if (meses.getMesSecreto().equals(inputMes)) {
                System.out.println("¡Ha acertado!");
                break;
            } else {
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes: ");
                inputMes = leer.next();
            }

        } while (true);
    }
}
