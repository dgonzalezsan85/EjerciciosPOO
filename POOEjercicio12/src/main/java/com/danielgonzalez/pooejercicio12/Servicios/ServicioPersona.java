/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielgonzalez.pooejercicio12.Servicios;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

import com.danielgonzalez.pooejercicio12.Entidades.Persona;

/**
 *
 * @author danielgonzalez
 */
public class ServicioPersona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    Persona persona = new Persona();

    public void crearPersona() {
        System.out.println("Ingrese el nombre: ");
        persona.setNombre(leer.next());

        System.out.println("Ingrese su fecha de nacimiento");
        System.out.println("Ingrese el año en formato numérico (ejem. 2023): ");
        int anio = leer.nextInt();
        System.out.println();
        System.out.println("Ingrese el mes en formato numérico (ejem. 10): ");
        int mes = leer.nextInt();
        System.out.println();
        System.out.println("Ingrese el dia en formato numérico (ejem. 25): ");
        int dia = leer.nextInt();

        persona.setFechaNacimiento(LocalDate.of(anio, mes, dia));
    }

    public void calcularEdad() {
        LocalDate hoy = LocalDate.now();
        LocalDate fechaNacimiento = persona.getFechaNacimiento();

        Period periodo = Period.between(fechaNacimiento, hoy);

        System.out.println("La persona tiene " + periodo.getYears() + " años " + periodo.getMonths() + " meses y \n"
                + periodo.getDays() + "dias");
    }

    public boolean menorQue(int edad) {
        LocalDate hoy = LocalDate.now();
        LocalDate fechaNacimiento = persona.getFechaNacimiento();

        Period periodo = Period.between(fechaNacimiento, hoy);

        int anios = periodo.getYears();

        if (anios < edad) {
            return true;
        } else {
            return false;
        }

    }

    public void mostrarPersona() {
        System.out.printf("%s\n", persona.toString());
    }
}
