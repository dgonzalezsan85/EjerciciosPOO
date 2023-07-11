/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.danielgonzalez.pooejercicioextra06;

import java.util.Scanner;

import com.danielgonzalez.pooejercicioextra06.Servicios.AhorcadoServicio;

/**
 *
 * @author danielgonzalez
 */
public class POOEjercicioExtra06 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        AhorcadoServicio as = new AhorcadoServicio();

        as.crearJuego();

        as.juego();

    }
}