/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielgonzalez.pooejercicio01.Servicios;

import com.danielgonzalez.pooejercicio01.Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author danielgonzalez
 */
public class LibroServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Libro crearLibro() {

        Libro libro = new Libro();

        System.out.println("Ingrese el ISBN del libro: ");
        libro.setISBN(leer.nextInt());

        System.out.println("Ingrese el Título del libro: ");
        libro.setTitulo(leer.next());

        System.out.println("Ingrese el Autor del libro: ");
        libro.setAutor(leer.next());

        System.out.println("Ingrese la cantidad de páginas del libro: ");
        libro.setCantidadPaginas(leer.nextInt());

        return libro;

    }

    public void mostrarlibro(Libro libro) {

        System.out.println("ISBN: " + libro.getISBN());
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Número de páginas: " + libro.getCantidadPaginas());

    }
}
