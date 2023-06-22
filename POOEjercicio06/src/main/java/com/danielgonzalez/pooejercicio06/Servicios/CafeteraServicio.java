/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielgonzalez.pooejercicio06.Servicios;

import com.danielgonzalez.pooejercicio06.Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author danielgonzalez
 */
public class CafeteraServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cafetera llenarCafetera() {

        Cafetera caf = new Cafetera();

        System.out.println("Se llenara la cafetera con la capcidad máxima que son 10 tazas");
        caf.setCapacidadMaxima(10);

        caf.setCantidadActual(caf.getCapacidadMaxima());

        return caf;
    }

    public void servirTaza(int tamanoTaza, Cafetera caf) {
        int cafeServido = 0;

        if (caf.getCantidadActual() >= tamanoTaza) {
            caf.setCantidadActual(caf.getCantidadActual() - tamanoTaza);
            System.out.println("La taza fue servida satisfactoriamente");
        } else {
            System.out.println("La cantidad de cafe no acanzo a llenar la taza \n"
                    + "por lo cual ser sivio " + (caf.getCantidadActual() * tamanoTaza / 100) + "% de taza");
        }
    }

    public void vaciarCafetera(Cafetera caf) {
        caf.setCantidadActual(0);
    }

    public void agregarCafe(int cantidad, Cafetera caf) {
        if (caf.getCantidadActual() + cantidad <= caf.getCapacidadMaxima()) {
            caf.setCantidadActual(caf.getCantidadActual() + cantidad);
            System.out.println("Se ha agregado " + cantidad + " de café.");
        } else {
            System.out.println("No se puede agregar esa cantidad de café. Se ha llenado la cafetera.");
            caf.setCantidadActual(caf.getCapacidadMaxima());
        }
    }

}
