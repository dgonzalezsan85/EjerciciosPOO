/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.danielgonzalez.pooejercicio01;

import com.danielgonzalez.pooejercicio01.Entidades.Libro;
import com.danielgonzalez.pooejercicio01.Servicios.LibroServicio;

/**
 *
 * @author danielgonzalez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LibroServicio ls = new LibroServicio();
        
        Libro libro1 = ls.crearLibro();
        
        ls.mostrarlibro(libro1);
        
        
    }
    
}
