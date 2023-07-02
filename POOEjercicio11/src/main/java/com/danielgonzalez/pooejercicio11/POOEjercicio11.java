/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.java.com.danielgonzalez.pooejercicio11;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author danielgonzalez
 */
public class POOEjercicio11 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese un año para añadir a la fecha");
        int anio = Integer.parseInt(leer.next());

        System.out.println("Ingrese un mes para añadir a la fecha");
        int mes = Integer.parseInt(leer.next());

        System.out.println("Ingrese un día para añadir a la fecha");
        int dia = Integer.parseInt(leer.next());

        LocalDate fecha = LocalDate.of(anio, mes, dia);

        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada = formatoFecha.format(fecha);

        System.out.println(fechaFormateada);

        LocalDate fechaActual = LocalDate.now();

        String fechaActualFor = fechaActual.format(formatoFecha);

        System.out.println(fechaActualFor);

        double anioIngresado = fecha.getYear();

        double anioActual = LocalDate.now().getYear();

        System.out.println("Han transcurrido " + (anioActual - anioIngresado)
                + " años desde el año ingresado hasta el año actual.");
    }
}
