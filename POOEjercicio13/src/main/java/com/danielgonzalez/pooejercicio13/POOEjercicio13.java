/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.danielgonzalez.pooejercicio13;

import com.danielgonzalez.pooejercicio13.Servicios.CursoServicio;

/**
 *
 * @author danielgonzalez
 */
public class POOEjercicio13 {

    public static void main(String[] args) {

        CursoServicio ps = new CursoServicio();

        ps.crearCurso();

        System.out.println();

        ps.calcularGanaciaSemanal();
    }
}
