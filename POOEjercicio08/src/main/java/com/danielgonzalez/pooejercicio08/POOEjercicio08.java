/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.danielgonzalez.pooejercicio08;

import java.util.Scanner;

import com.danielgonzalez.pooejercicio08.Entidades.Cadena;
import com.danielgonzalez.pooejercicio08.Servicios.CadenaServicio;

/**
 *
 * @author danielgonzalez
 */
public class POOEjercicio08 {

    public static void main(String[] args) {

        char caracter = "";
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        CadenaServicio cs = new CadenaServicio();

        Cadena cadena = cs.crearCadena();

        System.out.println();
        cs.contarVocales(cadena);

        System.out.println();
        cs.invertirFrase(cadena);

        System.out.println();

        System.out.println("Ingrese un caracter para ver cuantas veces esta en la frase o palabra ingresada: ");
        String input = leer.next();
        caracter = input.charAt(0);
        System.out.println();
        cs.vecesRepetido(caracter, cadena);

        System.out.println();
        System.out
                .println("Ingrese una frase para comparar con la longitud la frase o palabra ingresada inicialmente: ");
        String frase = leer.next();
        System.out.println();
        cs.compararLongitud(frase, cadena);

        System.out.println();
        System.out.println("Ingrese una frase para unir con la frase o palabra ingresada inicialmente: ");
        String frase2 = leer.next();
        System.out.println();
        cs.unirFrases(frase2, cadena);

        System.out.println();
        System.out.println(
                "Ingrese un caracter para reemplzar todas las 'a' en la frase o palabra ingresada inicialmente: ");
        String caracter2 = leer.next();
        System.out.println();
        cs.unirFrases(caracter2, cadena);
    }
}
