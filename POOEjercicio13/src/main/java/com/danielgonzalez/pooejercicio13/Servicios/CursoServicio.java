/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielgonzalez.pooejercicio13.Servicios;

import java.util.Scanner;

import com.danielgonzalez.pooejercicio13.Entidades.Curso;

/**
 *
 * @author danielgonzalez
 */
public class CursoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Curso curso = new Curso();

    public void cargarAlumnos() {
        String[] alumnos = new String[5];

        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Por favor ingrese el nombre del alumno No. " + (i + 1));
            alumnos[i] = leer.next();
        }

        curso.setAlumnos(alumnos);
    }

    public void crearCurso() {

        System.out.println("Ingrese el nombre del curso: ");
        curso.setNombreCurso(leer.next());
        System.out.println();
        System.out.println("Ingrese la cantidad de horas por día: ");
        curso.setCantidadHorasPorDia(leer.nextInt());
        System.out.println();
        System.out.println("Ingrese la cantidad de días por semana: ");
        curso.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println();
        System.out.println("Ingrese el turno del curos (mañana o tarde): ");
        curso.setTurno(leer.next());
        System.out.println();
        System.out.println("Ingrese el precio por hora: ");
        curso.setPrecioPorHora(leer.nextDouble());
        System.out.println();
        cargarAlumnos();
    }

    public void calcularGanaciaSemanal() {
        double ganancias = ((curso.getCantidadHorasPorDia() * curso.getPrecioPorHora()) * curso.getAlumnos().length)
                * curso.getCantidadDiasPorSemana();

        System.out.println("Las ganancias de la semana fueron iguales a: $" + ganancias);
    }
}
