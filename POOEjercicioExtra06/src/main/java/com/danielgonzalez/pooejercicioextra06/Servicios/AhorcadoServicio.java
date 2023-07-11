/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielgonzalez.pooejercicioextra06.Servicios;

import java.util.Scanner;

import com.danielgonzalez.pooejercicioextra06.Entidades.Ahorcado;

/**
 *
 * @author danielgonzalez
 */
public class AhorcadoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    Ahorcado ahorcado = new Ahorcado();

    public void crearJuego() {
        System.out.println("Bienvenido al juego del ahorcado!");
        System.out.println();
        System.out.println("Ingrese la palabra que será adivinada: ");
        String palabra = leer.next();
        System.out.println();
        String[] letraString = new String[palabra.length()];
        System.out.println("Ingrese la cantidad de jugadas máximas");
        ahorcado.setMaxJugadas(leer.nextInt());
        System.out.println();
        ahorcado.setLetrasEncontradas(0);

        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);

            letraString[i] = String.valueOf(letra);

        }

        ahorcado.setPalabra(letraString);
    }

    public void longitudPalabra() {

        System.out.println("Longitud de la palabra: " + ahorcado.getPalabra().length);

    }

    public boolean buscarLet(String letra) {

        int encontrada = 0;
        for (int i = 0; i < ahorcado.getPalabra().length; i++) {

            if (letra.equals(ahorcado.getPalabra()[i])) {
                encontrada++;
            }
        }

        if (encontrada > 0) {
            System.out.println("La letra pertenece a la palabra");
            return true;
        } else {
            System.out.println("La letra no pertenece a la palabra");
            return false;
        }
    }

    public void letrasEncontradas(String letra) {

        int encontrada = 0;
        for (int i = 0; i < ahorcado.getPalabra().length; i++) {

            if (letra.equals(ahorcado.getPalabra()[i])) {
                encontrada++;
            }
        }

        if (encontrada > 0) {
            ahorcado.setLetrasEncontradas(ahorcado.getLetrasEncontradas() + encontrada);

        } else {
            ahorcado.setMaxJugadas(ahorcado.getMaxJugadas() - 1);
        }

        System.out.println("Numero de letras (encontradas, faltantes): (" + ahorcado.getLetrasEncontradas() + ", "
                + (ahorcado.getPalabra().length - ahorcado.getLetrasEncontradas()) + ")");
    }

    public void intentos() {

        System.out.println("Número de oportunidades restantes: " + ahorcado.getMaxJugadas());

    }

    public void juego() {
        System.out.println();

        do {

            if (ahorcado.getMaxJugadas() >= 1) {
                System.out.println("Ingrese una letra: ");
                String letra = leer.next();
                System.out.println();
                longitudPalabra();
                System.out.println();
                buscarLet(letra);
                System.out.println();
                letrasEncontradas(letra);
                System.out.println();
                intentos();
            } else {
                System.out.println("Ingrese una letra: ");
                String letra = leer.next();
                System.out.println();
                longitudPalabra();
                System.out.println();
                if (!buscarLet(letra)) {
                    break;
                }
                letrasEncontradas(letra);
                System.out.println();
                intentos();

            }

        } while (true);

        System.out.println();
        System.out.println("Lo sentimos, no hay más oportunidades");
    }

}
