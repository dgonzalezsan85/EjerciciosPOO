/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.danielgonzalez.pooejercicioextra04;

import com.danielgonzalez.pooejercicioextra04.Servicios.NIFServicio;

/**
 *
 * @author danielgonzalez
 */
public class POOEjercicioExtra04 {

    public static void main(String[] args) {

        NIFServicio ns = new NIFServicio();

        ns.crearNIF();

        ns.mostrar();
    }
}
