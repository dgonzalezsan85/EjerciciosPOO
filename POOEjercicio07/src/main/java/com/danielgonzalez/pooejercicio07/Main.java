package com.danielgonzalez.pooejercicio07;

import java.net.SocketTimeoutException;

import com.danielgonzalez.pooejercicio07.Entidades.Persona;
import com.danielgonzalez.pooejercicio07.Servicios.PersonaServicio;

/**
 *
 * @author danielgonzalez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PersonaServicio ps = new PersonaServicio();

        Persona[] personas = new Persona[4];

        int pesoNormal = 0;
        int sobrePeso = 0;
        int bajoPeso = 0;
        int mayorE = 0;
        int menorE = 0;

        for (Persona persona : personas) {
            persona = ps.crearPersona();
            double imc = ps.calcularIMC(persona);
            boolean mayorEdad = ps.esMayorDeEdad(persona);

            if (imc == 0) {
                System.out.println(persona.getNombre() + " tiene un peso normal.");
                pesoNormal += 1;
            } else if (imc == -1) {
                System.out.println(persona.getNombre() + " está debajo del peso");
                bajoPeso += 1;
            } else if (imc == 1) {
                System.out.println(persona.getNombre() + " tiene sobrepeso.");
                sobrePeso += 1;
            }

            if (mayorEdad) {
                System.out.println(persona.getNombre() + " es mayor de edad");
                mayorE += 1;
            } else {
                System.out.println(persona.getNombre() + " no es mayor de edad");
                menorE += 1;
            }
        }

        System.out.println("De las cuatro personas " + (pesoNormal * 100) / 4 + " % tienen peso normal.");
        System.out.println("De las cuatro personas " + (bajoPeso * 100) / 4 + " % tienen bajo peso.");
        System.out.println("De las cuatro personas " + (sobrePeso * 100) / 4 + " % tienen sobrepeso.");
        System.out.println();
        System.out.println("De las cuatro personas " + (mayorE * 100) / 4 + " % son mayores de edad.");
        System.out.println("De las cuatro personas " + (menorE * 100) / 4 + " % son menores de edad.");

    }

}
