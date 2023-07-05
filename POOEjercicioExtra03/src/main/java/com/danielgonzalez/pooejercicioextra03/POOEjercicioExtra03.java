/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.danielgonzalez.pooejercicioextra03;

import com.danielgonzalez.pooejercicioextra03.Servicios.RaicesServicio;

/**
 *
 * @author danielgonzalez
 */
public class POOEjercicioExtra03 {

    public static void main(String[] args) {

        RaicesServicio rs = new RaicesServicio();

        rs.crearRaices();
        System.out.println();
        rs.calcular();
    }
}
