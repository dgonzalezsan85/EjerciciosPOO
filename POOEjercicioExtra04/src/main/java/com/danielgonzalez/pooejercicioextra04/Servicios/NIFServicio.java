/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielgonzalez.pooejercicioextra04.Servicios;

import java.lang.reflect.Array;
import java.util.Scanner;

import com.danielgonzalez.pooejercicioextra04.Entidades.NIF;

/**
 *
 * @author danielgonzalez
 */
public class NIFServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    NIF nif = new NIF();

    public void crearNIF() {

        char[] letras = { 'R', 'T', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
                'L', 'C', 'K', 'E' };

        System.out.println("Ingrese el DNI de hasta 8 digitos:");
        nif.setDNI(leer.nextLong());
        System.out.println();

        long residuo = nif.getDNI() % 23;
        System.out.println(residuo);

        for (int i = 0; i < letras.length; i++) {
            if (residuo == i) {
                nif.setLetra(letras[i]);
            }
        }
    }

    public void mostrar() {

        String dni = Long.toString(nif.getDNI());

        StringBuilder dniPadded = new StringBuilder(dni);
        while (dniPadded.length() < 8) {
            dniPadded.insert(0, "0");
        }

        String dniCompleto = dniPadded + "-" + nif.getLetra();

        System.out.println(dniCompleto);
    }

}
