/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.danielgonzalez.pooejercicio12;

import java.util.Scanner;

import com.danielgonzalez.pooejercicio12.Servicios.ServicioPersona;

/**
 *
 * @author danielgonzalez
 */
public class POOEjercicio12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ServicioPersona persona = new ServicioPersona();

        persona.crearPersona();

        persona.calcularEdad();

        System.out.println("Ingrese la edad de la persona a comparar: ");
        int edad = leer.nextInt();
        System.out.println();
        System.out.println("La persona creada es menor a la persona a comparar?: ");
        System.out.println();
        if (persona.menorQue(edad)) {
            System.out.println("Si es menor");
        } else {
            System.out.println("No es menor");
        }

        System.out.println();
        persona.mostrarPersona();

    }
}
