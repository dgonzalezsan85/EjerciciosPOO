/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielgonzalez.pooejercicio07.Servicios;

import java.util.Scanner;

import com.danielgonzalez.pooejercicio07.Entidades.Persona;

/**
 *
 * @author danielgonzalez
 */
public class PersonaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        Persona persona = new Persona();

        System.out.println("Ingrese el nombre: ");
        persona.setNombre(leer.next());
        System.out.println("Ingrese la edad: ");
        persona.setEdad(leer.nextInt());
        System.out.println("Ingrese el sexo, 'H' para hombre, 'M' para mujer u 'O' para otro: ");
        char sexo = Character.toUpperCase(leer.next().charAt(0));

        if (sexo == 'H') {
            persona.setSexo('h');
        } else if (sexo == 'M') {
            persona.setSexo('m');
        } else if (sexo == 'O') {
            persona.setSexo('o');
        } else {
            throw new IllegalArgumentException("El valor ingresado no es valido.");
        }

        System.out.println("Ingrese el peso en kg: ");
        persona.setPeso(leer.nextDouble());
        System.out.println("Ingrese la altura en mts: ");
        persona.setAltura(leer.nextDouble());

        return persona;
    }

    public double calcularIMC(Persona persona) {
        double resultado = 0;
        
        double imc = persona.getPeso() / (Math.pow(persona.getAltura(), 2));

        if (imc < 20) {
            resultado = -1;
        } else if (imc >= 20 && imc <= 25) {
            resultado = 0;
        } else {
            resultado = 1;
        }
        return resultado;
    }

    public boolean esMayorDeEdad(Persona persona) {

        if (persona.getEdad() >= 18) {
            return true;
        } else {
            return false;
        }
    }

}
