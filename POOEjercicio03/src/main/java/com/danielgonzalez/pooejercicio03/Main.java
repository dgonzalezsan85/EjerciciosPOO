/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.danielgonzalez.pooejercicio03;

import com.danielgonzalez.pooejercicio03.Entidades.Operacion;
import com.danielgonzalez.pooejercicio03.Servicios.OperacionServicio;

/**
 *
 * @author danielgonzalez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        OperacionServicio os = new OperacionServicio();
        
        Operacion op1 = os.crearOperacion();
        
        System.out.println(os.sumar(op1));
        
        System.out.println(os.restar(op1));
        
        System.out.println(os.multiplicar(op1));
        
        System.out.println(os.dividir(op1));
    }
    
}
