/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielgonzalez.pooejercicio02.Servicios;

import com.danielgonzalez.pooejercicio02.Entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author danielgonzalez
 */
public class CircunferenciaServicio {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Circunferencia crearCircunferencia() {
                
        Circunferencia circunferencia = new Circunferencia();
        
        System.out.println("Ingrese el radio de la circunferencia: ");
        circunferencia.setRadio(leer.nextDouble());
        
        return circunferencia;
    }
    
    public void area(Circunferencia circunferencia){
        
        double pi = Math.PI;
        double area = pi * Math.pow(circunferencia.getRadio(), 2);
        
        System.out.println("Area: " + area);
    }
    
    public void perimetro(Circunferencia circunferencia){
        
        double pi = Math.PI;
        double perimetro = 2 * pi * circunferencia.getRadio();
        
        System.out.println("Perimetro: " + perimetro);
    }
      
}
