/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.danielgonzalez.pooejercicioextra01;

import com.danielgonzalez.pooejercicioextra01.Entidades.Cancion;
import com.danielgonzalez.pooejercicioextra01.Servicios.CancionServicio;

/**
 *
 * @author danielgonzalez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CancionServicio cs = new CancionServicio();
        
        Cancion cancion = cs.crearCancion();
        
        System.out.println(cancion.toString());
    }
    
}
