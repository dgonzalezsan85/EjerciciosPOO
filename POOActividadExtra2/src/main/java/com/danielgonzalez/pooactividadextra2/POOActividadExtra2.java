/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.danielgonzalez.pooactividadextra2;

import java.util.Scanner;

import com.danielgonzalez.pooactividadextra2.Entidades.Pelicula;
import com.danielgonzalez.pooactividadextra2.Servicios.PeliculaServicio;

/**
 *
 * @author danielgonzalez
 */
public class POOActividadExtra2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        PeliculaServicio ps = new PeliculaServicio();

        String titulo = "";

        System.out.println("Cuantas peliculas desea ingresar: ");
        int cantidad_pelis = leer.nextInt();

        for (int i = 0; i < cantidad_pelis; i++) {
            ps.crearPelicula();
        }

        ps.listarPeliculas();

        System.out.println("Ingrese el titulo de la pelicula a buscar: ");
        titulo = leer.next();
        System.out.println();

        ps.buscarPeliculaPorTitulo(titulo);
        System.out.println();

        System.out.println("Ingrese el genero a buscar: ");
        String genero = leer.next();
        ps.buscarPeliculaPorGenero(genero);

    }
}
