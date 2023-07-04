/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielgonzalez.pooactividadextra2.Servicios;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Arrays;
import java.util.Scanner;

import com.danielgonzalez.pooactividadextra2.Entidades.Pelicula;

/**
 *
 * @author danielgonzalez
 */
public class PeliculaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> listaPeliculas = new ArrayList<>();

    public void crearPelicula() {

        Pelicula pelicula = new Pelicula();
        System.out.println("Ingrese el titulo de la pelicula: ");
        pelicula.setTitulo(leer.next());
        System.out.println("Ingrese el genero de la pelicula: ");
        pelicula.setGenero(leer.next());
        System.out.println("Ingrese el año de lanzamiento: ");
        pelicula.setAnio(leer.nextInt());
        System.out.println("Ingrese la duración de la pelicula: ");
        pelicula.setDuracion(leer.nextInt());
        agregarPeliculas(pelicula);
    }

    public void agregarPeliculas(Pelicula peli) {

        listaPeliculas.add(peli);

    }

    public void listarPeliculas() {

        System.out.println("Lista de peliculas: ");

        for (int i = 0; i < listaPeliculas.size(); i++) {
            System.out.println(listaPeliculas.get(i));
        }

    }

    public void buscarPeliculaPorTitulo(String titulo) {
        boolean existe = false;

        for (int i = 0; i < listaPeliculas.size(); i++) {
            if (listaPeliculas.get(i).getTitulo().equals(titulo)) {
                System.out.println("Si existe la pelicula");
                existe = true;
                break;
            }

        }
        if (existe == false) {
            System.out.println("No existe la pelicula");
        }
    }

    public void buscarPeliculaPorGenero(String genero) {

        boolean existe = false;
        for (int i = 0; i < listaPeliculas.size(); i++) {
            if (listaPeliculas.get(i).getGenero().equals(genero)) {

                System.out.println(listaPeliculas.get(i).getTitulo());
                existe = true;

            }

        }
        if (existe == false) {
            System.out.println("No existen peliculas con ese genero");
        }

    }

}
