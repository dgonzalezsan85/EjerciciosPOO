/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielgonzalez.pooactividadextra2.Servicios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import com.danielgonzalez.pooactividadextra2.Entidades.Alquiler;
import com.danielgonzalez.pooactividadextra2.Entidades.Pelicula;

/**
 *
 * @author danielgonzalez
 */
public class AlquilerServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Alquiler> listaAlquiler = new ArrayList<>();

    public void crearAlquiler() {
        Alquiler alquiler = new Alquiler();
        int cantidadDias = 0;
        System.out.println("Ingrese el titulo de la pelicula a alquilar: ");
        alquiler.setPeliculaAlquilada(leer.next());
        System.out.println();
        alquiler.setFechaInicio(LocalDate.now());
        System.out.println();
        System.out.println("Ingrese la cantidade dias a alquilar la pelicula: ");
        cantidadDias = leer.nextInt();
        alquiler.setFechaFin(alquiler.getFechaInicio().plusDays(cantidadDias));
        agregarAlquiler(alquiler);

    }

    public void agregarAlquiler(Alquiler alquiler) {

        listaAlquiler.add(alquiler);

    }

    public void listarAlquileres() {

        System.out.println("Lista de peliculas alquiladas: ");

        for (int i = 0; i < listaAlquiler.size(); i++) {
            System.out.println(listaAlquiler.get(i));
        }

    }

    public void buscarAlquilerPorFecha(LocalDate fecha) {
        boolean existe = false;

        for (int i = 0; i < listaAlquiler.size(); i++) {
            if (listaAlquiler.get(i).getFechaInicio().equals(fecha)) {
                System.out.println("Si existe la pelicula alquilada");
                System.out.println("Su titulo es; " + listaAlquiler.get(i).getPeliculaAlquilada());
                existe = true;
                break;
            }

        }
        if (existe == false) {
            System.out.println("No existe la pelicula alquilada");
        }
    }

    public void calcularIngreso(int cantidadDias) {

    }
}
