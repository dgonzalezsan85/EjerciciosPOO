/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.danielgonzalez.pooejercicio11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author danielgonzalez
 */
public class POOEjercicio11 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in).useDelimiter("\n");

        Date fecha = new Date();

        System.out.println("Ingrese un año para añadir a la fecha");
        int anio = Integer.parseInt(read.next());
        fecha.setYear(anio);

        System.out.println("Ingrese un mes para añadir a la fecha");
        int mes = Integer.parseInt(read.next());
        fecha.setMonth(mes);

        System.out.println("Ingrese un día para añadir a la fecha");
        int dia = Integer.parseInt(read.next());
        fecha.setDate(dia);

    }
}
