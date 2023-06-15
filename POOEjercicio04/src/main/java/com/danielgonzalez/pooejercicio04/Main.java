/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.danielgonzalez.pooejercicio04;

import com.danielgonzalez.pooejercicio04.Entidades.Rectangulo;
import com.danielgonzalez.pooejercicio04.Servicios.RectanguloServicio;

/**
 *
 * @author danielgonzalez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        RectanguloServicio rs = new RectanguloServicio();
        
        Rectangulo rect = rs.crearRectangulo();
        
        rs.superficie(rect);
        
        rs.perimetro(rect);
        
        rs.dibujarRectangulo(rect);
    }
    
}
