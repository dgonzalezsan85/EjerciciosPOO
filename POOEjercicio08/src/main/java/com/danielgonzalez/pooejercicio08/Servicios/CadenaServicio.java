/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielgonzalez.pooejercicio08.Servicios;

import com.danielgonzalez.pooejercicio08.Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author danielgonzalez
 */
public class CadenaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cadena crearCadena() {
        Cadena cadena = new Cadena();
        System.out.println("Ingrese la palabra o frase separada por espacios: ");
        cadena.setFrase(leer.next());

        int longit = cadena.getFrase().length();

        cadena.setlongitudF(longit);

        return cadena;
    }

    public void contarVocales(Cadena cadena) {
        String vocal = "aeiouAEIOU";
        char[] array = cadena.getFrase().toCharArray();
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            if ((vocal.indexOf((char) array[i]) != -1)) {
                contador++;
            }
        }
        System.out.printf("Se encontraron " + contador + " vocales dentro de la palabra o frase ingresada.");
    }

    public void invertirFrase(Cadena cadena) {

        StringBuilder sb = new StringBuilder(cadena.getFrase());

        sb.reverse();

        String fraseInvertida = sb.toString();

        System.out.println("La frase original es: " + cadena.getFrase());
        System.out.println("Y su inversa es: " + fraseInvertida);

    }

    public void vecesRepetido(char caracter, Cadena cadena) {

        char[] array = cadena.getFrase().toCharArray();
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            if ((caracter == array[i])) {
                contador++;
            }
        }

        System.out.printf("Se encontro el caracter '" + caracter + "', " + contador
                + " veces dentro de la palabra o frase ingresada.");
    }

    public void compararLongitud(String frase, Cadena cadena) {

        if (frase.length() == cadena.getlongitudF()) {
            System.out.println("La palabra o frase ingresada tiene el mismo tamaño que la palabra o frase inicial");
        } else {
            System.out.println("La palabra o frase ingresada NO tiene el mismo tamaño que la palabra o frase inicial");
        }
    }

    public void unirFrases(String frase, Cadena cadena) {

        System.out.println(cadena.getFrase() + " " + frase);
    }

    public void reemplazar(String caracter, Cadena cadena) {

        char[] array = cadena.getFrase().toCharArray();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'a') {
                array[i] = caracter.charAt(0);
            }
        }

        String fraseResultante = new String(array);

        System.out.println("La frase resultante es: \n" + fraseResultante);
    }

    public boolean contiene(String letra, Cadena cadena) {

        char[] array = cadena.getFrase().toCharArray();

        for (int i = 0; i < array.length; i++) {
            if ((letra.charAt(0) == array[i])) {
                return true;
            }
        }
        return false;
    }

}
