/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.danielgonzalez.pooejercicio02;

import com.danielgonzalez.pooejercicio02.Servicios.CircunferenciaServicio;
import com.danielgonzalez.pooejercicio02.Entidades.Circunferencia;

/**
 *
 * @author danielgonzalez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CircunferenciaServicio cs = new CircunferenciaServicio();
        
        Circunferencia cir1 = new Circunferencia();
        
        Circunferencia cir2 = cs.crearCircunferencia();
        
        cs.area(cir2);
        
        cs.perimetro(cir2);
              
    }
    
}
